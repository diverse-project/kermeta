/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public class LogoPrinter2 implements org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextPrinter {
	
	private class PrintToken {
		
		private String text;
		private String tokenName;
		
		public PrintToken(String text, String tokenName) {
			this.text = text;
			this.tokenName = tokenName;
		}
		
		public String getText() {
			return text;
		}
		
		public String getTokenName() {
			return tokenName;
		}
		
	}
	
	public final static String NEW_LINE = java.lang.System.getProperties().getProperty("line.separator");
	
	/**
	 * Holds the resource that is associated with this printer. May be null if the
	 * printer is used stand alone.
	 */
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource resource;
	
	private java.util.Map<?, ?> options;
	private java.io.OutputStream outputStream;
	private java.util.List<PrintToken> tokenOutputStream;
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolverFactory tokenResolverFactory = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenResolverFactory();
	private boolean handleTokenSpaceAutomatically = true;
	private int tokenSpace = 1;
	/**
	 * A flag that indicates whether token have already been printed for the some
	 * object. The flag is set to false whenever printing of an EObject tree is
	 * started. The status of the flag is used to avoid printing default token space
	 * in front of the root object.
	 */
	private boolean startedPrintingObject = false;
	/**
	 * The number of tab characters that were printed before the current line. This
	 * number is used to calculate the relative indentation when printing contained
	 * objects, because all contained objects must start with this indentation
	 * (tabsBeforeCurrentObject + currentTabs).
	 */
	private int currentTabs;
	/**
	 * The number of tab characters that must be printed before the current object.
	 * This number is used to calculate the indentation of new lines, when line breaks
	 * are printed within one object.
	 */
	private int tabsBeforeCurrentObject;
	private int newTabsBeforeCurrentObject;
	
	public LogoPrinter2(java.io.OutputStream outputStream, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		tokenOutputStream = new java.util.ArrayList<PrintToken>();
		currentTabs = 0;
		tabsBeforeCurrentObject = 0;
		startedPrintingObject = true;
		doPrint(element, new java.util.ArrayList<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoFormattingElement>());
		java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		if (handleTokenSpaceAutomatically) {
			printSmart(writer);
		} else {
			printBasic(writer);
		}
		writer.flush();
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoFormattingElement> foundFormattingElements) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (outputStream == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.LogoProgram) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_0, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Back) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_1, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Forward) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_2, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Left) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_3, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Right) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_4, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenDown) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_5, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenUp) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_6, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Clear) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_7, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Constant) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_8, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_9, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_10, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Block) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_11, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_12, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Repeat) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_14, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.While) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_15, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_16, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_17, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Plus) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_18, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Minus) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_19, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Mult) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_20, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Div) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_21, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Equals) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_22, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Greater) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_23, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Lower) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_24, foundFormattingElements);
			return;
		}
		if (element instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ControlStructure) {
			printInternal(element, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.LOGO_13, foundFormattingElements);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	public void printInternal(org.eclipse.emf.ecore.EObject eObject, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoSyntaxElement ruleElement, java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoFormattingElement> foundFormattingElements) {
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(eObject);
		java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation> originalLayoutInformations = layoutInformationAdapter.getLayoutInformations();
		// create a copy of the original list of layout information object in order to be
		// able to remove used informations during printing
		java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation> layoutInformations = new java.util.ArrayList<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation>(originalLayoutInformations.size());
		layoutInformations.addAll(originalLayoutInformations);
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator decoratorTree = getDecoratorTree(ruleElement);
		decorateTree(decoratorTree, eObject);
		printTree(decoratorTree, eObject, foundFormattingElements, layoutInformations);
	}
	
	/**
	 * creates a tree of decorator objects which reflects the syntax tree that is
	 * attached to the given syntax element
	 */
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator getDecoratorTree(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoSyntaxElement syntaxElement) {
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoSyntaxElement[] children = syntaxElement.getChildren();
		int childCount = children.length;
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator[] childDecorators = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator[childCount];
		for (int i = 0; i < childCount; i++) {
			childDecorators[i] = getDecoratorTree(children[i]);
		}
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator decorator = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator(syntaxElement, childDecorators);
		return decorator;
	}
	
	public void decorateTree(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject) {
		java.util.Map<String, Integer> printCountingMap = initializePrintCountingMap(eObject);
		java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator> keywordsToPrint = new java.util.ArrayList<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator>();
		decorateTreeBasic(decorator, eObject, printCountingMap, keywordsToPrint);
		for (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator keywordToPrint : keywordsToPrint) {
			// for keywords the concrete index does not matter, but we must add one to
			// indicate that the keyword needs to be printed here. Thus, we use 0 as index.
			keywordToPrint.addIndexToPrint(0);
		}
	}
	
	/**
	 * Tries to decorate the decorator with an attribute value, or reference holded by
	 * eObject. Returns true if an attribute value or reference was found.
	 */
	public boolean decorateTreeBasic(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.Map<String, Integer> printCountingMap, java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator> keywordsToPrint) {
		boolean foundFeatureToPrint = false;
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoSyntaxElement syntaxElement = decorator.getDecoratedElement();
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality cardinality = syntaxElement.getCardinality();
		boolean isFirstIteration = true;
		while (true) {
			java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator> subKeywordsToPrint = new java.util.ArrayList<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator>();
			boolean keepDecorating = false;
			if (syntaxElement instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoKeyword) {
				subKeywordsToPrint.add(decorator);
			} else if (syntaxElement instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoTerminal) {
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoTerminal terminal = (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoTerminal) syntaxElement;
				org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
				if (feature == org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.ANONYMOUS_FEATURE) {
					return false;
				}
				int countLeft = printCountingMap.get(feature.getName());
				if (countLeft > terminal.getMandatoryOccurencesAfter()) {
					decorator.addIndexToPrint(countLeft);
					printCountingMap.put(feature.getName(), countLeft - 1);
					keepDecorating = true;
				}
			}
			if (syntaxElement instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoChoice) {
				// for choices we do print only the choice which does print at least one feature
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator childToPrint = null;
				for (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					// pick first choice as default, will be overridden if a choice that prints a
					// feature is found
					if (childToPrint == null) {
						childToPrint = childDecorator;
					}
					if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
						childToPrint = childDecorator;
						break;
					}
				}
				keepDecorating |= decorateTreeBasic(childToPrint, eObject, printCountingMap, subKeywordsToPrint);
			} else {
				// for all other syntax element we do print all children
				for (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					keepDecorating |= decorateTreeBasic(childDecorator, eObject, printCountingMap, subKeywordsToPrint);
				}
			}
			foundFeatureToPrint |= keepDecorating;
			// only print keywords if a feature was printed or the syntax element is mandatory
			if (cardinality == org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality.ONE) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			} else if (cardinality == org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality.PLUS) {
				if (isFirstIteration) {
					keywordsToPrint.addAll(subKeywordsToPrint);
				} else {
					if (keepDecorating) {
						keywordsToPrint.addAll(subKeywordsToPrint);
					}
				}
			} else if (keepDecorating && (cardinality == org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality.STAR || cardinality == org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality.QUESTIONMARK)) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			}
			if (cardinality == org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality.ONE || cardinality == org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality.QUESTIONMARK) {
				break;
			} else if (!keepDecorating) {
				break;
			}
			isFirstIteration = false;
		}
		return foundFeatureToPrint;
	}
	
	/**
	 * Checks whether decorating the given node will use at least one attribute value,
	 * or reference holded by eObject. Returns true if a printable attribute value or
	 * reference was found. This method is used to decide which choice to pick, when
	 * multiple choices are available. We pick the choice that prints at least one
	 * attribute or reference.
	 */
	public boolean doesPrintFeature(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.Map<String, Integer> printCountingMap) {
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoSyntaxElement syntaxElement = decorator.getDecoratedElement();
		if (syntaxElement instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoTerminal) {
			org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoTerminal terminal = (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoTerminal) syntaxElement;
			org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
			if (feature == org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoGrammarInformationProvider.ANONYMOUS_FEATURE) {
				return false;
			}
			int countLeft = printCountingMap.get(feature.getName());
			if (countLeft > terminal.getMandatoryOccurencesAfter()) {
				// found a feature to print
				return true;
			}
		}
		for (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
			if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean printTree(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoFormattingElement> foundFormattingElements, java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation> layoutInformations) {
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoSyntaxElement printElement = decorator.getDecoratedElement();
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality cardinality = printElement.getCardinality();
		java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoFormattingElement> cloned = new java.util.ArrayList<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoFormattingElement>();
		cloned.addAll(foundFormattingElements);
		boolean foundSomethingAtAll = false;
		boolean foundSomethingToPrint;
		while (true) {
			foundSomethingToPrint = false;
			Integer indexToPrint = decorator.getNextIndexToPrint();
			if (indexToPrint != null) {
				if (printElement instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoKeyword) {
					printKeyword(eObject, (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoKeyword) printElement, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoPlaceholder) {
					org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoPlaceholder placeholder = (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoPlaceholder) printElement;
					printFeature(eObject, placeholder, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoContainment) {
					org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoContainment containment = (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoContainment) printElement;
					printContainedObject(eObject, containment, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoBooleanTerminal) {
					org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoBooleanTerminal booleanTerminal = (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoBooleanTerminal) printElement;
					printBooleanTerminal(eObject, booleanTerminal, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				}
			}
			if (foundSomethingToPrint) {
				foundSomethingAtAll = true;
			}
			if (printElement instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoWhiteSpace) {
				foundFormattingElements.add((org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoWhiteSpace) printElement);
			}
			if (printElement instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoLineBreak) {
				foundFormattingElements.add((org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoLineBreak) printElement);
			}
			for (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
				foundSomethingToPrint |= printTree(childDecorator, eObject, foundFormattingElements, layoutInformations);
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoSyntaxElement decoratedElement = decorator.getDecoratedElement();
				if (foundSomethingToPrint && decoratedElement instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoChoice) {
					break;
				}
			}
			if (cardinality == org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality.ONE || cardinality == org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality.QUESTIONMARK) {
				break;
			} else if (!foundSomethingToPrint) {
				break;
			}
		}
		// only print formatting elements if a feature was printed or the syntax element
		// is mandatory
		if (!foundSomethingAtAll && (cardinality == org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality.STAR || cardinality == org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoCardinality.QUESTIONMARK)) {
			foundFormattingElements.clear();
			foundFormattingElements.addAll(cloned);
		}
		return foundSomethingToPrint;
	}
	
	public void printKeyword(org.eclipse.emf.ecore.EObject eObject, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoKeyword keyword, java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoFormattingElement> foundFormattingElements, java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation> layoutInformations) {
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, keyword, null, eObject);
		printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		String value = keyword.getValue();
		tokenOutputStream.add(new PrintToken(value, "'" + org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.util.LogoStringUtil.escapeToANTLRKeyword(value) + "'"));
	}
	
	public void printFeature(org.eclipse.emf.ecore.EObject eObject, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoPlaceholder placeholder, int count, java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoFormattingElement> foundFormattingElements, java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EStructuralFeature feature = placeholder.getFeature();
		if (feature instanceof org.eclipse.emf.ecore.EAttribute) {
			printAttribute(eObject, (org.eclipse.emf.ecore.EAttribute) feature, placeholder, count, foundFormattingElements, layoutInformations);
		} else {
			printReference(eObject, (org.eclipse.emf.ecore.EReference) feature, placeholder, count, foundFormattingElements, layoutInformations);
		}
	}
	
	public void printAttribute(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EAttribute attribute, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoPlaceholder placeholder, int count, java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoFormattingElement> foundFormattingElements, java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation> layoutInformations) {
		String result;
		Object attributeValue = getValue(eObject, attribute, count);
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, placeholder, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(layoutInformation);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		} else {
			// if no text is available, the attribute is deresolved to obtain its textual
			// representation
			org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(placeholder.getTokenName());
			tokenResolver.setOptions(getOptions());
			String deResolvedValue = tokenResolver.deResolve(attributeValue, attribute, eObject);
			result = deResolvedValue;
		}
		if (result != null && !"".equals(result)) {
			printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		}
		// write result to the output stream
		tokenOutputStream.add(new PrintToken(result, placeholder.getTokenName()));
	}
	
	public void printBooleanTerminal(org.eclipse.emf.ecore.EObject eObject, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoBooleanTerminal booleanTerminal, int count, java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoFormattingElement> foundFormattingElements, java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EAttribute attribute = booleanTerminal.getAttribute();
		String result;
		Object attributeValue = getValue(eObject, attribute, count);
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, booleanTerminal, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(layoutInformation);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		} else {
			// if no text is available, the boolean attribute is converted to its textual
			// representation using the literals of the boolean terminal
			if (Boolean.TRUE.equals(attributeValue)) {
				result = booleanTerminal.getTrueLiteral();
			} else {
				result = booleanTerminal.getFalseLiteral();
			}
		}
		if (result != null && !"".equals(result)) {
			printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, "'" + org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.util.LogoStringUtil.escapeToANTLRKeyword(result) + "'"));
		}
	}
	
	public void printContainedObject(org.eclipse.emf.ecore.EObject eObject, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoContainment containment, int count, java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoFormattingElement> foundFormattingElements, java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EStructuralFeature reference = containment.getFeature();
		Object o = getValue(eObject, reference, count);
		// save current number of tabs to restore them after printing the contained object
		int oldTabsBeforeCurrentObject = tabsBeforeCurrentObject;
		int oldCurrentTabs = currentTabs;
		// use current number of tabs to indent contained object. we do not directly set
		// 'tabsBeforeCurrentObject' because the first element of the new object must be
		// printed with the old number of tabs.
		newTabsBeforeCurrentObject = tabsBeforeCurrentObject + currentTabs;
		currentTabs = 0;
		doPrint((org.eclipse.emf.ecore.EObject) o, foundFormattingElements);
		// restore number of tabs after printing the contained object
		tabsBeforeCurrentObject = oldTabsBeforeCurrentObject;
		newTabsBeforeCurrentObject = tabsBeforeCurrentObject;
		currentTabs = oldCurrentTabs;
	}
	
	public void printFormattingElements(java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoFormattingElement> foundFormattingElements, java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation> layoutInformations, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation layoutInformation) {
		String hiddenTokenText = getHiddenTokenText(layoutInformation);
		if (hiddenTokenText != null) {
			// removed used information
			layoutInformations.remove(layoutInformation);
			tokenOutputStream.add(new PrintToken(hiddenTokenText, null));
			foundFormattingElements.clear();
			startedPrintingObject = false;
			tabsBeforeCurrentObject = newTabsBeforeCurrentObject;
			return;
		}
		if (foundFormattingElements.size() > 0) {
			for (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoFormattingElement foundFormattingElement : foundFormattingElements) {
				if (foundFormattingElement instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoWhiteSpace) {
					int amount = ((org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoWhiteSpace) foundFormattingElement).getAmount();
					for (int i = 0; i < amount; i++) {
						tokenOutputStream.add(new PrintToken(" ", null));
					}
				}
				if (foundFormattingElement instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoLineBreak) {
					currentTabs = ((org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoLineBreak) foundFormattingElement).getTabs();
					tokenOutputStream.add(new PrintToken(NEW_LINE, null));
					for (int i = 0; i < tabsBeforeCurrentObject + currentTabs; i++) {
						tokenOutputStream.add(new PrintToken("\t", null));
					}
				}
			}
			foundFormattingElements.clear();
			startedPrintingObject = false;
		} else {
			if (startedPrintingObject) {
				// if no elements have been printed yet, we do not add the default token space,
				// because spaces before the first element are not desired.
				startedPrintingObject = false;
			} else {
				if (!handleTokenSpaceAutomatically) {
					tokenOutputStream.add(new PrintToken(getWhiteSpaceString(tokenSpace), null));
				}
			}
		}
		// after printing the first element, we can use the new number of tabs.
		tabsBeforeCurrentObject = newTabsBeforeCurrentObject;
	}
	
	private Object getValue(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EStructuralFeature feature, int count) {
		// get value of feature
		Object o = eObject.eGet(feature);
		if (o instanceof java.util.List<?>) {
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			o = list.get(index);
		}
		return o;
	}
	
	@SuppressWarnings("unchecked")	
	public void printReference(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EReference reference, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoPlaceholder placeholder, int count, java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoFormattingElement> foundFormattingElements, java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation> layoutInformations) {
		Object referencedObject = getValue(eObject, reference, count);
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, placeholder, referencedObject, eObject);
		printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		// NC-References must always be printed by deresolving the reference. We cannot
		// use the visible token information, because deresolving usually depends on
		// attribute values of the referenced object instead of the object itself.
		String tokenName = placeholder.getTokenName();
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(tokenName);
		tokenResolver.setOptions(getOptions());
		@SuppressWarnings("rawtypes")		
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoReferenceResolver referenceResolver = getReferenceResolverSwitch().getResolver(reference);
		referenceResolver.setOptions(getOptions());
		String deresolvedReference = referenceResolver.deResolve((org.eclipse.emf.ecore.EObject) referencedObject, eObject, reference);
		String deresolvedToken = tokenResolver.deResolve(deresolvedReference, reference, eObject);
		// write result to output stream
		tokenOutputStream.add(new PrintToken(deresolvedToken, tokenName));
	}
	
	public java.util.Map<String, Integer> initializePrintCountingMap(org.eclipse.emf.ecore.EObject eObject) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>();
		java.util.List<org.eclipse.emf.ecore.EStructuralFeature> features = eObject.eClass().getEAllStructuralFeatures();
		for (org.eclipse.emf.ecore.EStructuralFeature feature : features) {
			int count = 0;
			Object featureValue = eObject.eGet(feature);
			if (featureValue != null) {
				if (featureValue instanceof java.util.List<?>) {
					count = ((java.util.List<?>) featureValue).size();
				} else {
					count = 1;
				}
			}
			printCountingMap.put(feature.getName(), count);
		}
		return printCountingMap;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource getResource() {
		return resource;
	}
	
	protected org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoReferenceResolverSwitch) new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoProblem(errorMessage, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.LogoEProblemType.ERROR), cause);
	}
	
	protected org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformationAdapter getLayoutInformationAdapter(org.eclipse.emf.ecore.EObject element) {
		for (org.eclipse.emf.common.notify.Adapter adapter : element.eAdapters()) {
			if (adapter instanceof org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformationAdapter) {
				return (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformationAdapter) adapter;
			}
		}
		org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformationAdapter newAdapter = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformationAdapter();
		element.eAdapters().add(newAdapter);
		return newAdapter;
	}
	
	private org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation getLayoutInformation(java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation> layoutInformations, org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.grammar.LogoSyntaxElement syntaxElement, Object object, org.eclipse.emf.ecore.EObject container) {
		for (org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation layoutInformation : layoutInformations) {
			if (syntaxElement == layoutInformation.getSyntaxElement()) {
				if (object == null) {
					return layoutInformation;
				} else if (object == layoutInformation.getObject(container)) {
					return layoutInformation;
				}
			}
		}
		return null;
	}
	
	private String getHiddenTokenText(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getHiddenTokenText();
		} else {
			return null;
		}
	}
	
	private String getVisibleTokenText(org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getVisibleTokenText();
		} else {
			return null;
		}
	}
	
	protected String getWhiteSpaceString(int count) {
		return getRepeatingString(count, ' ');
	}
	
	private String getRepeatingString(int count, char character) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < count; i++) {
			result.append(character);
		}
		return result.toString();
	}
	
	public void setHandleTokenSpaceAutomatically(boolean handleTokenSpaceAutomatically) {
		this.handleTokenSpaceAutomatically = handleTokenSpaceAutomatically;
	}
	
	public void setTokenSpace(int tokenSpace) {
		this.tokenSpace = tokenSpace;
	}
	
	/**
	 * Prints the current tokenOutputStream to the given writer (as it is).
	 */
	public void printBasic(java.io.PrintWriter writer) throws java.io.IOException {
		for (PrintToken nextToken : tokenOutputStream) {
			writer.write(nextToken.getText());
		}
	}
	
	/**
	 * Prints the current tokenOutputStream to the given writer.
	 * 
	 * This methods implements smart whitespace printing. It does so by writing output
	 * to a token stream instead of printing the raw token text to a PrintWriter.
	 * Tokens in this stream hold both the text and the type of the token (i.e., its
	 * name).
	 * 
	 * To decide where whitespace is needed, sequences of successive tokens are
	 * searched that can be printed without separating whitespace. To determine such
	 * groups we start with two successive non-whitespace tokens, concatenate their
	 * text and use the generated ANTLR lexer to split the text. If the resulting
	 * token sequence of the concatenated text is exactly the same as the one that is
	 * to be printed, no whitespace is needed. The tokens in the sequence are checked
	 * both regarding their type and their text. If two tokens successfully form a
	 * group a third one is added and so on.
	 */
	public void printSmart(java.io.PrintWriter writer) throws java.io.IOException {
		// stores the text of the current group of tokens. this text is given to the lexer
		// to check whether it can be correctly scanned.
		StringBuilder currentBlock = new StringBuilder();
		// stores the index of the first token of the current group.
		int currentBlockStart = 0;
		// stores the text that was already successfully checked (i.e., is can be scanned
		// correctly and can thus be printed).
		String validBlock = "";
		for (int i = 0; i < tokenOutputStream.size(); i++) {
			PrintToken tokenI = tokenOutputStream.get(i);
			currentBlock.append(tokenI.getText());
			// if declared or preserved whitespace is found - print block
			if (tokenI.getTokenName() == null) {
				writer.write(currentBlock.toString());
				// reset all values
				currentBlock = new StringBuilder();
				currentBlockStart = i + 1;
				validBlock = "";
				continue;
			}
			// now check whether the current block can be scanned
			org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextScanner scanner = new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoMetaInformation().createLexer();
			scanner.setText(currentBlock.toString());
			// retrieve all tokens from scanner and add them to list 'tempTokens'
			java.util.List<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextToken> tempTokens = new java.util.ArrayList<org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextToken>();
			org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextToken nextToken = scanner.getNextToken();
			while (nextToken != null && nextToken.getText() != null) {
				tempTokens.add(nextToken);
				nextToken = scanner.getNextToken();
			}
			boolean sequenceIsValid = true;
			// check whether the current block was scanned to the same token sequence
			for (int t = 0; t < tempTokens.size(); t++) {
				PrintToken printTokenT = tokenOutputStream.get(currentBlockStart + t);
				org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTextToken tempToken = tempTokens.get(t);
				if (!tempToken.getText().equals(printTokenT.getText())) {
					sequenceIsValid = false;
					break;
				}
				String commonTokenName = tempToken.getName();
				String printTokenName = printTokenT.getTokenName();
				if (printTokenName.length() > 2 && printTokenName.startsWith("'") && printTokenName.endsWith("'")) {
					printTokenName = printTokenName.substring(1, printTokenName.length() - 1);
				}
				if (!commonTokenName.equals(printTokenName)) {
					sequenceIsValid = false;
					break;
				}
			}
			if (sequenceIsValid) {
				// sequence is still valid, try adding one more token in the next iteration of the
				// loop
				validBlock += tokenI.getText();
			} else {
				// sequence is not valid, must print whitespace to separate tokens
				// print text that is valid so far
				writer.write(validBlock);
				// print separating whitespace
				writer.write(" ");
				// add current token as initial value for next iteration
				currentBlock = new StringBuilder(tokenI.getText());
				currentBlockStart = i;
				validBlock = tokenI.getText();
			}
		}
		// flush remaining valid text to writer
		writer.write(validBlock);
	}
	
}
