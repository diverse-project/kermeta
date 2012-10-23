grammar Kp;

options {
	superClass = KpANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.kermeta.kp.editor.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>();
	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
	
	public void reportError(org.antlr.runtime3_3_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_3_0.ANTLRStringStream) input).index());
	}
}
@header{
	package org.kermeta.kp.editor.mopp;
}

@members{
	private org.kermeta.kp.editor.IKpTokenResolverFactory tokenResolverFactory = new org.kermeta.kp.editor.mopp.KpTokenResolverFactory();
	
	/**
	 * the index of the last token that was handled by collectHiddenTokens()
	 */
	private int lastPosition;
	
	/**
	 * A flag that indicates whether the parser should remember all expected elements.
	 * This flag is set to true when using the parse for code completion. Otherwise it
	 * is set to false.
	 */
	private boolean rememberExpectedElements = false;
	
	private Object parseToIndexTypeObject;
	private int lastTokenIndex = 0;
	
	/**
	 * A list of expected elements the were collected while parsing the input stream.
	 * This list is only filled if <code>rememberExpectedElements</code> is set to
	 * true.
	 */
	private java.util.List<org.kermeta.kp.editor.mopp.KpExpectedTerminal> expectedElements = new java.util.ArrayList<org.kermeta.kp.editor.mopp.KpExpectedTerminal>();
	
	private int mismatchedTokenRecoveryTries = 0;
	/**
	 * A helper list to allow a lexer to pass errors to its parser
	 */
	protected java.util.List<org.antlr.runtime3_3_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_3_0.RecognitionException>());
	
	/**
	 * Another helper list to allow a lexer to pass positions of errors to its parser
	 */
	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
	
	/**
	 * A stack for incomplete objects. This stack is used filled when the parser is
	 * used for code completion. Whenever the parser starts to read an object it is
	 * pushed on the stack. Once the element was parser completely it is popped from
	 * the stack.
	 */
	protected java.util.Stack<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	
	private int stopIncludingHiddenTokens;
	private int stopExcludingHiddenTokens;
	private int tokenIndexOfLastCompleteElement;
	
	private int expectedElementsIndexOfLastCompleteElement;
	
	/**
	 * The offset indicating the cursor position when the parser is used for code
	 * completion by calling parseToExpectedElements().
	 */
	private int cursorOffset;
	
	/**
	 * The offset of the first hidden token of the last expected element. This offset
	 * is used to discard expected elements, which are not needed for code completion.
	 */
	private int lastStartIncludingHidden;
	
	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
		postParseCommands.add(new org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource>() {
			public boolean execute(org.kermeta.kp.editor.IKpTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new org.kermeta.kp.editor.IKpProblem() {
					public org.kermeta.kp.editor.KpEProblemSeverity getSeverity() {
						return org.kermeta.kp.editor.KpEProblemSeverity.ERROR;
					}
					public org.kermeta.kp.editor.KpEProblemType getType() {
						return org.kermeta.kp.editor.KpEProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public java.util.Collection<org.kermeta.kp.editor.IKpQuickFix> getQuickFixes() {
						return null;
					}
				}, column, line, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	public void addExpectedElement(org.kermeta.kp.editor.IKpExpectedElement terminal, int followSetID, org.eclipse.emf.ecore.EStructuralFeature... containmentTrace) {
		if (!this.rememberExpectedElements) {
			return;
		}
		org.kermeta.kp.editor.mopp.KpExpectedTerminal expectedElement = new org.kermeta.kp.editor.mopp.KpExpectedTerminal(terminal, followSetID, containmentTrace);
		setPosition(expectedElement, input.index());
		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
			// clear list of expected elements
			this.expectedElements.clear();
		}
		lastStartIncludingHidden = startIncludingHiddenTokens;
		this.expectedElements.add(expectedElement);
	}
	
	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
	}
	
	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
		postParseCommands.add(new org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource>() {
			public boolean execute(org.kermeta.kp.editor.IKpTextResource resource) {
				org.kermeta.kp.editor.IKpLocationMap locationMap = resource.getLocationMap();
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
	
	protected void copyLocalizationInfos(final org.antlr.runtime3_3_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
		postParseCommands.add(new org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource>() {
			public boolean execute(org.kermeta.kp.editor.IKpTextResource resource) {
				org.kermeta.kp.editor.IKpLocationMap locationMap = resource.getLocationMap();
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
	protected void setLocalizationEnd(java.util.Collection<org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
		postParseCommands.add(new org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource>() {
			public boolean execute(org.kermeta.kp.editor.IKpTextResource resource) {
				org.kermeta.kp.editor.IKpLocationMap locationMap = resource.getLocationMap();
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
	
	public org.kermeta.kp.editor.IKpTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new KpParser(new org.antlr.runtime3_3_0.CommonTokenStream(new KpLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream))));
			} else {
				return new KpParser(new org.antlr.runtime3_3_0.CommonTokenStream(new KpLexer(new org.antlr.runtime3_3_0.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			org.kermeta.kp.editor.mopp.KpPlugin.logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public KpParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_3_0.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((KpLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((KpLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == org.kermeta.kp.KermetaProject.class) {
				return parse_org_kermeta_kp_KermetaProject();
			}
			if (type.getInstanceClass() == org.kermeta.kp.PackageEquivalence.class) {
				return parse_org_kermeta_kp_PackageEquivalence();
			}
			if (type.getInstanceClass() == org.kermeta.kp.ImportFile.class) {
				return parse_org_kermeta_kp_ImportFile();
			}
			if (type.getInstanceClass() == org.kermeta.kp.ImportProjectJar.class) {
				return parse_org_kermeta_kp_ImportProjectJar();
			}
			if (type.getInstanceClass() == org.kermeta.kp.ImportProjectSources.class) {
				return parse_org_kermeta_kp_ImportProjectSources();
			}
			if (type.getInstanceClass() == org.kermeta.kp.ImportBytecodeJar.class) {
				return parse_org_kermeta_kp_ImportBytecodeJar();
			}
			if (type.getInstanceClass() == org.kermeta.kp.ReusableResource.class) {
				return parse_org_kermeta_kp_ReusableResource();
			}
		}
		throw new org.kermeta.kp.editor.mopp.KpUnexpectedContentTypeException(typeObject);
	}
	
	public int getMismatchedTokenRecoveryTries() {
		return mismatchedTokenRecoveryTries;
	}
	
	public Object getMissingSymbol(org.antlr.runtime3_3_0.IntStream arg0, org.antlr.runtime3_3_0.RecognitionException arg1, int arg2, org.antlr.runtime3_3_0.BitSet arg3) {
		mismatchedTokenRecoveryTries++;
		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
	}
	
	public Object getParseToIndexTypeObject() {
		return parseToIndexTypeObject;
	}
	
	protected Object getTypeObject() {
		Object typeObject = getParseToIndexTypeObject();
		if (typeObject != null) {
			return typeObject;
		}
		java.util.Map<?,?> options = getOptions();
		if (options != null) {
			typeObject = options.get(org.kermeta.kp.editor.IKpOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public org.kermeta.kp.editor.IKpParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource>>();
		org.kermeta.kp.editor.mopp.KpParseResult parseResult = new org.kermeta.kp.editor.mopp.KpParseResult();
		try {
			org.eclipse.emf.ecore.EObject result =  doParse();
			if (lexerExceptions.isEmpty()) {
				parseResult.setRoot(result);
			}
		} catch (org.antlr.runtime3_3_0.RecognitionException re) {
			reportError(re);
		} catch (java.lang.IllegalArgumentException iae) {
			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
				// can be caused if a null is set on EMF models where not allowed. this will just
				// happen if other errors occurred before
			} else {
				iae.printStackTrace();
			}
		}
		for (org.antlr.runtime3_3_0.RecognitionException re : lexerExceptions) {
			reportLexicalError(re);
		}
		parseResult.getPostParseCommands().addAll(postParseCommands);
		return parseResult;
	}
	
	public java.util.List<org.kermeta.kp.editor.mopp.KpExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.kermeta.kp.editor.IKpTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final org.antlr.runtime3_3_0.CommonTokenStream tokenStream = (org.antlr.runtime3_3_0.CommonTokenStream) getTokenStream();
		org.kermeta.kp.editor.IKpParseResult result = parse();
		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
			org.antlr.runtime3_3_0.Lexer lexer = (org.antlr.runtime3_3_0.Lexer) tokenStream.getTokenSource();
			int endChar = lexer.getCharIndex();
			int endLine = lexer.getLine();
			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
		}
		if (result != null) {
			org.eclipse.emf.ecore.EObject root = result.getRoot();
			if (root != null) {
				dummyResource.getContentsInternal().add(root);
			}
			for (org.kermeta.kp.editor.IKpCommand<org.kermeta.kp.editor.IKpTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<org.kermeta.kp.editor.mopp.KpExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.kermeta.kp.editor.mopp.KpExpectedTerminal>();
		java.util.List<org.kermeta.kp.editor.mopp.KpExpectedTerminal> newFollowSet = new java.util.ArrayList<org.kermeta.kp.editor.mopp.KpExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			org.kermeta.kp.editor.mopp.KpExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 50;
		int i;
		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
			org.antlr.runtime3_3_0.CommonToken nextToken = (org.antlr.runtime3_3_0.CommonToken) tokenStream.get(i);
			if (nextToken.getType() < 0) {
				break;
			}
			if (nextToken.getChannel() == 99) {
				// hidden tokens do not reduce the follow set
			} else {
				// now that we have found the next visible token the position for that expected
				// terminals can be set
				for (org.kermeta.kp.editor.mopp.KpExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (org.kermeta.kp.editor.mopp.KpExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<org.kermeta.kp.editor.util.KpPair<org.kermeta.kp.editor.IKpExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (org.kermeta.kp.editor.util.KpPair<org.kermeta.kp.editor.IKpExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
							org.kermeta.kp.editor.IKpExpectedElement newFollower = newFollowerPair.getLeft();
							org.kermeta.kp.editor.mopp.KpExpectedTerminal newFollowTerminal = new org.kermeta.kp.editor.mopp.KpExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
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
		for (org.kermeta.kp.editor.mopp.KpExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(org.kermeta.kp.editor.mopp.KpExpectedTerminal expectedElement, int tokenIndex) {
		int currentIndex = Math.max(0, tokenIndex);
		for (int index = lastTokenIndex; index < currentIndex; index++) {
			if (index >= input.size()) {
				break;
			}
			org.antlr.runtime3_3_0.CommonToken tokenAtIndex = (org.antlr.runtime3_3_0.CommonToken) input.get(index);
			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			if (tokenAtIndex.getChannel() != 99) {
				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			}
		}
		lastTokenIndex = Math.max(0, currentIndex);
		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
	}
	
	public Object recoverFromMismatchedToken(org.antlr.runtime3_3_0.IntStream input, int ttype, org.antlr.runtime3_3_0.BitSet follow) throws org.antlr.runtime3_3_0.RecognitionException {
		if (!rememberExpectedElements) {
			return super.recoverFromMismatchedToken(input, ttype, follow);
		} else {
			return null;
		}
	}
	
	/**
	 * Translates errors thrown by the parser into human readable messages.
	 */
	public void reportError(final org.antlr.runtime3_3_0.RecognitionException e)  {
		String message = e.getMessage();
		if (e instanceof org.antlr.runtime3_3_0.MismatchedTokenException) {
			org.antlr.runtime3_3_0.MismatchedTokenException mte = (org.antlr.runtime3_3_0.MismatchedTokenException) e;
			String expectedTokenName = formatTokenName(mte.expecting);
			String actualTokenName = formatTokenName(e.token.getType());
			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedTreeNodeException) {
			org.antlr.runtime3_3_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_3_0.MismatchedTreeNodeException) e;
			String expectedTokenName = formatTokenName(mtne.expecting);
			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
		} else if (e instanceof org.antlr.runtime3_3_0.NoViableAltException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
		} else if (e instanceof org.antlr.runtime3_3_0.EarlyExitException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedSetException) {
			org.antlr.runtime3_3_0.MismatchedSetException mse = (org.antlr.runtime3_3_0.MismatchedSetException) e;
			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedNotSetException) {
			org.antlr.runtime3_3_0.MismatchedNotSetException mse = (org.antlr.runtime3_3_0.MismatchedNotSetException) e;
			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_3_0.FailedPredicateException) {
			org.antlr.runtime3_3_0.FailedPredicateException fpe = (org.antlr.runtime3_3_0.FailedPredicateException) e;
			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
		}
		// the resource may be null if the parser is used for code completion
		final String finalMessage = message;
		if (e.token instanceof org.antlr.runtime3_3_0.CommonToken) {
			final org.antlr.runtime3_3_0.CommonToken ct = (org.antlr.runtime3_3_0.CommonToken) e.token;
			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
		} else {
			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
		}
	}
	
	/**
	 * Translates errors thrown by the lexer into human readable messages.
	 */
	public void reportLexicalError(final org.antlr.runtime3_3_0.RecognitionException e)  {
		String message = "";
		if (e instanceof org.antlr.runtime3_3_0.MismatchedTokenException) {
			org.antlr.runtime3_3_0.MismatchedTokenException mte = (org.antlr.runtime3_3_0.MismatchedTokenException) e;
			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
		} else if (e instanceof org.antlr.runtime3_3_0.NoViableAltException) {
			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
		} else if (e instanceof org.antlr.runtime3_3_0.EarlyExitException) {
			org.antlr.runtime3_3_0.EarlyExitException eee = (org.antlr.runtime3_3_0.EarlyExitException) e;
			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedSetException) {
			org.antlr.runtime3_3_0.MismatchedSetException mse = (org.antlr.runtime3_3_0.MismatchedSetException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedNotSetException) {
			org.antlr.runtime3_3_0.MismatchedNotSetException mse = (org.antlr.runtime3_3_0.MismatchedNotSetException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_3_0.MismatchedRangeException) {
			org.antlr.runtime3_3_0.MismatchedRangeException mre = (org.antlr.runtime3_3_0.MismatchedRangeException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
		} else if (e instanceof org.antlr.runtime3_3_0.FailedPredicateException) {
			org.antlr.runtime3_3_0.FailedPredicateException fpe = (org.antlr.runtime3_3_0.FailedPredicateException) e;
			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
		}
		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
	}
	
	protected void completedElement(Object object, boolean isContainment) {
		if (isContainment && !this.incompleteObjects.isEmpty()) {
			this.incompleteObjects.pop();
		}
		if (object instanceof org.eclipse.emf.ecore.EObject) {
			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
		}
	}
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_0, 0);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_org_kermeta_kp_KermetaProject{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
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
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_1, 1);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__METAMODEL_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__METAMODEL_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_2, 2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 2, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 2, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 2, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 2, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 2, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
	}
	
	(
		(
			a2 = 'defaultMainClass' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_3_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_10, 3);
			}
			
			(
				a3 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
						incompleteObjects.push(element);
					}
					if (a3 != null) {
						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_CLASS), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_3_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 4);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 4);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 4, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 4, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 4, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 4, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 4, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_3, 5);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 5);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 5, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 5, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 5, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 5, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 5, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
	}
	
	(
		(
			a4 = 'defaultMainOperation' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_11, 6);
			}
			
			(
				a5 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
						incompleteObjects.push(element);
					}
					if (a5 != null) {
						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a5).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__DEFAULT_MAIN_OPERATION), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_4_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a5, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 7);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 7, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 7, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 7, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 7, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 7, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_4, 8);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 8, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 8, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 8, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 8, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 8, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
	}
	
	(
		(
			a6 = 'javaBasePackage' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_12, 9);
			}
			
			(
				a7 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
						incompleteObjects.push(element);
					}
					if (a7 != null) {
						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__JAVA_BASE_PACKAGE), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.KERMETA_PROJECT__JAVA_BASE_PACKAGE), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_5_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 10, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 10, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 10, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 10, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 10, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 11, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 11, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 11, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 11, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 11, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
	}
	
	(
		(
			(
				(
					a8_0 = parse_org_kermeta_kp_ImportFile					{
						if (terminateParsing) {
							throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
						}
						if (element == null) {
							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
							incompleteObjects.push(element);
						}
						if (a8_0 != null) {
							if (a8_0 != null) {
								Object value = a8_0;
								addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_FILES, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_6_0_0_0_0_0_0, a8_0, true);
							copyLocalizationInfos(a8_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 12, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 13, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
			}
			
			
			|			(
				(
					a9_0 = parse_org_kermeta_kp_ImportProjectJar					{
						if (terminateParsing) {
							throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
						}
						if (element == null) {
							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
							incompleteObjects.push(element);
						}
						if (a9_0 != null) {
							if (a9_0 != null) {
								Object value = a9_0;
								addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_JARS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_6_0_1_0_0_0_0, a9_0, true);
							copyLocalizationInfos(a9_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 14, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 15, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
			}
			
			
			|			(
				(
					a10_0 = parse_org_kermeta_kp_ImportProjectSources					{
						if (terminateParsing) {
							throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
						}
						if (element == null) {
							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
							incompleteObjects.push(element);
						}
						if (a10_0 != null) {
							if (a10_0 != null) {
								Object value = a10_0;
								addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_PROJECT_SOURCES, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_6_0_2_0_0_0_0, a10_0, true);
							copyLocalizationInfos(a10_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 16, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 17, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
			}
			
			
			|			(
				(
					a11_0 = parse_org_kermeta_kp_ImportBytecodeJar					{
						if (terminateParsing) {
							throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
						}
						if (element == null) {
							element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
							incompleteObjects.push(element);
						}
						if (a11_0 != null) {
							if (a11_0 != null) {
								Object value = a11_0;
								addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__IMPORTED_BYTECODE_JARS, value);
								completedElement(value, true);
							}
							collectHiddenTokens(element);
							retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_6_0_3_0_0_0_0, a11_0, true);
							copyLocalizationInfos(a11_0, element);
						}
					}
				)
				{
					// expected elements (follow set)
					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 18, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 18, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 18, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 18, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
					addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 18, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
				}
				
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 19, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 19, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 19, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 19, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 19, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
			}
			
			
			|			(
				a12_0 = parse_org_kermeta_kp_ReusableResource				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createKermetaProject();
						incompleteObjects.push(element);
					}
					if (a12_0 != null) {
						if (a12_0 != null) {
							Object value = a12_0;
							addObjectToList(element, org.kermeta.kp.KpPackage.KERMETA_PROJECT__REUSABLE_RESOURCES, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_0_0_0_6_0_4_0, a12_0, true);
						copyLocalizationInfos(a12_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 20, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 20, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 20, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 20, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 20, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 21, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 21, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 21, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 21, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 21, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
	}
	
;

parse_org_kermeta_kp_PackageEquivalence returns [org.kermeta.kp.PackageEquivalence element = null]
@init{
}
:
	a0 = 'packageEquivalence' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createPackageEquivalence();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_14, 22);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createPackageEquivalence();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.PACKAGE_EQUIVALENCE__ECORE_PACKAGE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.PACKAGE_EQUIVALENCE__ECORE_PACKAGE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_15, 23);
	}
	
	(
		a2 = '=' {
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createPackageEquivalence();
				incompleteObjects.push(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_3_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 24);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_16, 25);
	}
	
	(
		a3 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createPackageEquivalence();
				incompleteObjects.push(element);
			}
			if (a3 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.PACKAGE_EQUIVALENCE__JAVA_PACKAGE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.PACKAGE_EQUIVALENCE__JAVA_PACKAGE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_1_0_0_4, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 26, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
	}
	
;

parse_org_kermeta_kp_ImportFile returns [org.kermeta.kp.ImportFile element = null]
@init{
}
:
	a0 = 'importFile' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createImportFile();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_17, 27);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createImportFile();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__URL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__URL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_18, 28);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 28, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 28, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 28, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 28, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 28, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
	}
	
	(
		(
			a2 = 'withBytecodeFrom' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createImportFile();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_3_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_19, 29);
			}
			
			(
				a3 = TEXT				
				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createImportFile();
						incompleteObjects.push(element);
					}
					if (a3 != null) {
						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
						tokenResolver.setOptions(getOptions());
						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__BYTECODE_FROM), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
						}
						String resolved = (String) resolvedObject;
						org.kermeta.kp.ReusableResource proxy = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
						collectHiddenTokens(element);
						registerContextDependentProxy(new org.kermeta.kp.editor.mopp.KpContextDependentURIFragmentFactory<org.kermeta.kp.ImportFile, org.kermeta.kp.ReusableResource>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getImportFileBytecodeFromReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__BYTECODE_FROM), resolved, proxy);
						if (proxy != null) {
							Object value = proxy;
							element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_FILE__BYTECODE_FROM), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_3_0_0_1, proxy, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, proxy);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 30, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
			}
			
			(
				(
					(
						a4_0 = parse_org_kermeta_kp_PackageEquivalence						{
							if (terminateParsing) {
								throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
							}
							if (element == null) {
								element = org.kermeta.kp.KpFactory.eINSTANCE.createImportFile();
								incompleteObjects.push(element);
							}
							if (a4_0 != null) {
								if (a4_0 != null) {
									Object value = a4_0;
									addObjectToList(element, org.kermeta.kp.KpPackage.IMPORT_FILE__PACKAGE_EQUIVALENCES, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_2_0_0_3_0_0_2_0_0_0, a4_0, true);
								copyLocalizationInfos(a4_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 31, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_13, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_5);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 32, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 33, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 33, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 33, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 33, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 33, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
	}
	
;

parse_org_kermeta_kp_ImportProjectJar returns [org.kermeta.kp.ImportProjectJar element = null]
@init{
}
:
	a0 = 'importProjectJar' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createImportProjectJar();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_20, 34);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createImportProjectJar();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT_JAR__URL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT_JAR__URL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_3_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 35, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
	}
	
;

parse_org_kermeta_kp_ImportProjectSources returns [org.kermeta.kp.ImportProjectSources element = null]
@init{
}
:
	a0 = 'importProjectSource' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createImportProjectSources();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_21, 36);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createImportProjectSources();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT_SOURCES__URL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_PROJECT_SOURCES__URL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_4_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 37, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
	}
	
;

parse_org_kermeta_kp_ImportBytecodeJar returns [org.kermeta.kp.ImportBytecodeJar element = null]
@init{
}
:
	a0 = 'importBytecodeJar' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createImportBytecodeJar();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_22, 38);
	}
	
	(
		a1 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createImportBytecodeJar();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_BYTECODE_JAR__URL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.IMPORT_BYTECODE_JAR__URL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_5_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 39, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
	}
	
;

parse_org_kermeta_kp_ReusableResource returns [org.kermeta.kp.ReusableResource element = null]
@init{
}
:
	a0 = 'resource' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_23, 40);
	}
	
	(
		a1 = TEXT		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
				incompleteObjects.push(element);
			}
			if (a1 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__REUSABLE_RESOURCE_NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__REUSABLE_RESOURCE_NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_2, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_24, 41);
	}
	
	a2 = '=' {
		if (element == null) {
			element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
			incompleteObjects.push(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_25, 42);
	}
	
	(
		a3 = QUOTED_34_34		
		{
			if (terminateParsing) {
				throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
			}
			if (element == null) {
				element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
				incompleteObjects.push(element);
			}
			if (a3 != null) {
				org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				tokenResolver.setOptions(getOptions());
				org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__URL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__URL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_4, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_26, 43);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 43, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
	}
	
	(
		(
			a4 = 'alternative' {
				if (element == null) {
					element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
					incompleteObjects.push(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_5_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_27, 44);
			}
			
			(
				a5 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
					}
					if (element == null) {
						element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
						incompleteObjects.push(element);
					}
					if (a5 != null) {
						org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a5).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							addObjectToList(element, org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS, value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_5_0_0_2, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a5, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_28, 45);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 45, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
			}
			
			(
				(
					a6 = ',' {
						if (element == null) {
							element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
							incompleteObjects.push(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_5_0_0_3_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken)a6, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_29, 46);
					}
					
					(
						a7 = QUOTED_34_34						
						{
							if (terminateParsing) {
								throw new org.kermeta.kp.editor.mopp.KpTerminateParsingException();
							}
							if (element == null) {
								element = org.kermeta.kp.KpFactory.eINSTANCE.createReusableResource();
								incompleteObjects.push(element);
							}
							if (a7 != null) {
								org.kermeta.kp.editor.IKpTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
								tokenResolver.setOptions(getOptions());
								org.kermeta.kp.editor.IKpTokenResolveResult result = getFreshTokenResolveResult();
								tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS), result);
								Object resolvedObject = result.getResolvedToken();
								if (resolvedObject == null) {
									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_3_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_3_0.CommonToken) a7).getStopIndex());
								}
								java.lang.String resolved = (java.lang.String) resolvedObject;
								if (resolved != null) {
									Object value = resolved;
									addObjectToList(element, org.kermeta.kp.KpPackage.REUSABLE_RESOURCE__ALTERNATE_URLS, value);
									completedElement(value, false);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, org.kermeta.kp.editor.grammar.KpGrammarInformationProvider.KP_6_0_0_5_0_0_3_0_0_1, resolved, true);
								copyLocalizationInfos((org.antlr.runtime3_3_0.CommonToken) a7, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_28, 47);
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
						addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 47, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_28, 48);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
				addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 48, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_5, 49, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_0);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_6, 49, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_1);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_7, 49, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_2);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_8, 49, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_3);
		addExpectedElement(org.kermeta.kp.editor.grammar.KpFollowSetProvider.TERMINAL_9, 49, org.kermeta.kp.editor.grammar.KpFollowSetProvider.FEATURE_4);
	}
	
;

SL_COMMENT:
	('//'(~('\n'|'\r'))*)
	{ _channel = 99; }
;
ML_COMMENT:
	('/*'.*'*/')
	{ _channel = 99; }
;
TEXT:
	(('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)
;
WHITESPACE:
	((' ' | '\t' | '\f'))
	{ _channel = 99; }
;
LINEBREAK:
	(('\r\n' | '\r' | '\n'))
	{ _channel = 99; }
;
QUOTED_34_34:
	(('"')(~('"'))*('"'))
;

