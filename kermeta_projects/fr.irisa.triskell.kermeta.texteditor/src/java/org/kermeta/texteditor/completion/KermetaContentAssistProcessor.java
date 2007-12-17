

/*$Id: KermetaContentAssistProcessor.java,v 1.1 2007-12-17 14:05:09 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	TagContentAssistProcessor.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 nov. 07
* Authors : paco
*/

package org.kermeta.texteditor.completion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ContextInformation;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewer;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.printer.KM2KMTPrettyPrinter;
import org.kermeta.model.KermetaModelHelper;
import org.kermeta.texteditor.KermetaTextEditor;

import fr.irisa.triskell.kermeta.language.behavior.Block;
import fr.irisa.triskell.kermeta.language.behavior.Conditional;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.behavior.Loop;
import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Require;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.Using;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.texteditor.completion.CompletionItem;
import fr.irisa.triskell.kermeta.texteditor.completion.NamedElementCompletionItem;
import fr.irisa.triskell.kermeta.texteditor.icons.KermetaSpecialIcons;
import fr.irisa.triskell.kermeta.texteditor.icons.blue.KermetaIconsBlue;
import fr.irisa.triskell.kermeta.texteditor.icons.green.KermetaIconsGreen;
import fr.irisa.triskell.kermeta.texteditor.icons.red.KermetaIconsRed;
import fr.irisa.triskell.kermeta.texteditor.icons.yellow.KermetaIconsYellow;
import fr.irisa.triskell.traceability.ModelReference;
import fr.irisa.triskell.traceability.TextReference;
import fr.irisa.triskell.traceability.helper.Tracer;

public class KermetaContentAssistProcessor implements IContentAssistProcessor {
	
	private KermetaTextEditor editor = null;
	
	private SourceViewer sourceViewer = null;
	
	private Tracer tracer = null;
	
	public KermetaContentAssistProcessor(KermetaTextEditor editor, ISourceViewer viewer) {
		this.editor = editor;
		viewer = sourceViewer;
	}
	
	private void setTracer() {
		KermetaUnit kermetaUnit = editor.getKermetaUnit();
		if ( kermetaUnit != null ) {
			if ( tracer == null )
				tracer = kermetaUnit.getTracer();
			else {
				if ( ! kermetaUnit.isErroneous() )
					tracer = kermetaUnit.getTracer();
			}
		}
	}
	
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		List<KermetaCompletionProposal> proposals = new ArrayList<KermetaCompletionProposal>();
		try {
			KermetaUnit kermetaUnit = editor.getKermetaUnit();
			if (kermetaUnit != null) {
				setTracer();
				if ( tracer != null ) {

					String uri = editor.getKermetaUnit().getUri().replace("_text_editor_", "");
					
					int trueOffset = offset;
					char c;
					boolean goOn = true;
					while ( goOn &&  trueOffset < viewer.getDocument().getLength() ) {
						try {
							c = viewer.getDocument().getChar(trueOffset);
							if ( Character.isWhitespace(c) )
								trueOffset--;
							else
								goOn = false;
						} catch (BadLocationException exception) {}
					}
					
					/*
					 * 
					 * Getting the previous model references.
					 * 
					 */				
					int currentOffset = trueOffset;
					int length = offset - trueOffset;
					Set<ModelReference> previousReferences = new HashSet<ModelReference>();
					while ( previousReferences.size() == 0 && currentOffset > 0 ) {
						//if ( ! Character.isWhitespace(viewer.getDocument().getChar(currentOffset)) ) {
							List<ModelReference> result = tracer.getModelReferences(currentOffset, length++, uri);
							for ( ModelReference ref : result ) {
								if ( ref.getRefObject().eContainer() != null )
									previousReferences.add( ref );
							}
						//}
						currentOffset -= 1;
					}
					
					/*
					 * 
					 * Getting the next model references.
					 * 
					 */
					currentOffset = trueOffset;
					length = offset - trueOffset;
					Set<ModelReference> nextReferences = new HashSet<ModelReference>();
					while ( nextReferences.size() == 0 && currentOffset < viewer.getDocument().getLength() ) {
						//if ( ! Character.isWhitespace(viewer.getDocument().getChar(currentOffset)) ) {
							List<ModelReference> result = tracer.getModelReferences(currentOffset, length++, uri);
							for ( ModelReference ref : result ) {
								if ( ref.getRefObject().eContainer() != null )
									nextReferences.add( ref );
							}
						//}
						currentOffset += 1;
					}
					
					/*
					 * 
					 * Getting the user's input.
					 * 
					 */
					String input = "";
					int index = offset -1;
					c = viewer.getDocument().getChar(index);
					while ( ! Character.isWhitespace(c) ) {
						input = c + input;
						index--;
						c = viewer.getDocument().getChar(index);
					}
					
					if ( (previousReferences.size() == 1) && (nextReferences.size() == 1) ) {
						ModelReference previousReference = previousReferences.iterator().next();
						ModelReference nextReference = nextReferences.iterator().next();
						if ( previousReference == nextReference ) {
					
							if (previousReference.getRefObject() instanceof ClassDefinition)
								proposals = getKermetaCompletionProposalsForClassDefinition(viewer, offset, (ClassDefinition) previousReference.getRefObject(), input );
							else if ( previousReference.getRefObject() instanceof Block ) {
								if ( (input.length() > 1) && input.charAt(input.length()-1) == '.' ) {
									Type type = getType(input, (Block) previousReference.getRefObject());
									if ( type instanceof Class ) {
										ClassDefinition cdef = (ClassDefinition) ((Class) type).getTypeDefinition();
										addCallableFeatures(proposals, offset, cdef, "");
									} else if ( type instanceof PrimitiveType ) {
										PrimitiveType primitiveType = (PrimitiveType) type;
										Type instanceType = primitiveType.getInstanceType();
										if ( instanceType instanceof Class ) {
											ClassDefinition cdef = (ClassDefinition) ((Class) instanceType).getTypeDefinition();
											addCallableFeatures(proposals, offset, cdef, "");
										} else
											System.out.println();
									} else
										System.out.println();
								} else
									proposals = getKermetaCompletionProposalsForBlock(viewer, offset, (Block) previousReference.getRefObject(), input);
							} else if ( previousReference.getRefObject() instanceof Package ) {
								proposals.add( new KermetaCompletionProposal(REQUIRE, offset, 0, REQUIRE.length()) );
							} else if ( previousReference.getRefObject() instanceof Require ) {
								proposals.add( new KermetaCompletionProposal(REQUIRE, offset, 0, REQUIRE.length()) );
							} else if ( previousReference.getRefObject() instanceof Using ) {
								proposals.add( new KermetaCompletionProposal(USING, offset, 0, USING.length()) );
							} else if ( previousReference.getRefObject() instanceof Class ) {
								addTypeDefintionsProposals(proposals, offset, input);
							} else if ( previousReference.getRefObject() instanceof Expression ) {
								if ( (input.length() > 1) && input.charAt(input.length()-1) == '.' ) {
									Type type = getType(input, (Block) previousReference.getRefObject().eContainer());
									if ( type instanceof Class ) {
										ClassDefinition cdef = (ClassDefinition) ((Class) type).getTypeDefinition();
										addCallableFeatures(proposals, offset, cdef, "");
									} else if ( type instanceof PrimitiveType ) {
										PrimitiveType primitiveType = (PrimitiveType) type;
										Type instanceType = primitiveType.getInstanceType();
										if ( instanceType instanceof Class ) {
											ClassDefinition cdef = (ClassDefinition) ((Class) instanceType).getTypeDefinition();
											addCallableFeatures(proposals, offset, cdef, "");
										} else
											System.out.println();
									} else
										System.out.println();
								}
							} else
								System.out.println();
						} else if ( previousReference.getRefObject() instanceof Require && nextReference.getRefObject() instanceof ClassDefinition ) {
							proposals.add( new KermetaCompletionProposal(REQUIRE, offset, 0, REQUIRE.length()) );
							proposals.add( new KermetaCompletionProposal(USING, offset, 0, USING.length()) );
							getClassDefinitionProposal(proposals, offset, input);
							getInheritingClassDefinitionProposal(proposals, offset, input);
							getPackageDefinitionProposal(proposals, offset, input);
						} else if ( previousReference.getRefObject() instanceof Require && nextReference.getRefObject() instanceof Using ) {
							proposals.add( new KermetaCompletionProposal(REQUIRE, offset, 0, REQUIRE.length()) );
							proposals.add( new KermetaCompletionProposal(USING, offset, 0, USING.length()) );
						} else if ( previousReference.getRefObject() instanceof Using && nextReference.getRefObject() instanceof ClassDefinition ) {
							proposals.add( new KermetaCompletionProposal(USING, offset, 0, USING.length()) );
							getClassDefinitionProposal(proposals, offset, input);
							getInheritingClassDefinitionProposal(proposals, offset, input);
							getPackageDefinitionProposal(proposals, offset, input);
						} else if ( previousReference.getRefObject() instanceof Package && nextReference.getRefObject() instanceof Require ) {
							proposals.add( new KermetaCompletionProposal(REQUIRE, offset, 0, REQUIRE.length()) );
						} else if ( previousReference.getRefObject() instanceof ClassDefinition && nextReference.getRefObject() instanceof ClassDefinition ) {
							ClassDefinition cd = (ClassDefinition) previousReference.getRefObject();
							TextReference textReference = tracer.getFirstTextReference( cd );
							if (textReference.getCharEndAt() > offset ) {
								proposals = getKermetaCompletionProposalsForClassDefinition(viewer, offset, cd, input);
							} else {
								getClassDefinitionProposal(proposals, offset, input);
								getInheritingClassDefinitionProposal(proposals, offset, input);
								getPackageDefinitionProposal(proposals, offset, input);
							}
						} else if ( previousReference.getRefObject() instanceof ClassDefinition && nextReference.getRefObject() instanceof Property ) {
							proposals = getKermetaCompletionProposalsForClassDefinition(viewer, offset, (ClassDefinition) previousReference.getRefObject(), input);
						} else if ( previousReference.getRefObject() instanceof Property && nextReference.getRefObject() instanceof ClassDefinition ) {
							proposals = getKermetaCompletionProposalsForClassDefinition(viewer, offset, (ClassDefinition) nextReference.getRefObject(), input);
						} else if ( previousReference.getRefObject() instanceof Type && nextReference.getRefObject() instanceof Property) {
							ClassDefinition cdef = ((Property) nextReference.getRefObject()).getOwningClass();
							proposals = getKermetaCompletionProposalsForClassDefinition(viewer, offset, cdef, input);
						} else if ( previousReference.getRefObject() instanceof ClassDefinition && nextReference.getRefObject() instanceof Operation ) {
							proposals = getKermetaCompletionProposalsForClassDefinition(viewer, offset, (ClassDefinition) previousReference.getRefObject(), input);
						} else if ( previousReference.getRefObject() instanceof Expression ) {
							addProposalsForExpression(viewer, proposals, offset, offset-trueOffset, input, (Expression) previousReference.getRefObject());
						} else {
							System.out.println();
						}
					} else if ( (previousReferences.size() > 0) ){
						ModelReference previousReference = previousReferences.iterator().next();
						if ( previousReference.getRefObject() instanceof ClassDefinition ) {
							getClassDefinitionProposal(proposals, offset, input);
							getInheritingClassDefinitionProposal(proposals, offset, input);
							getPackageDefinitionProposal(proposals, offset, input);
						} else if ( previousReference.getRefObject() instanceof Using ) {
							proposals.add( new KermetaCompletionProposal(USING, offset, 0, USING.length()) );
							getClassDefinitionProposal(proposals, offset, input);
							getInheritingClassDefinitionProposal(proposals, offset, input);
							getPackageDefinitionProposal(proposals, offset, input);
						} else if ( previousReference.getRefObject() instanceof Expression ) {
							addProposalsForExpression(viewer, proposals, offset, offset-trueOffset, input, (Expression) previousReference.getRefObject());
						} else if ( previousReference.getRefObject() instanceof Type ) {
							
						} else {
							System.out.println();
						}
					} else if ( nextReferences.size() > 0 ) {
						ModelReference nextReference = nextReferences.iterator().next();
						if ( nextReference.getRefObject() instanceof Require ) {
							proposals.add( new KermetaCompletionProposal(REQUIRE, offset, 0, REQUIRE.length()) );
						} else if ( nextReference.getRefObject() instanceof ClassDefinition ) {
							getClassDefinitionProposal(proposals, offset, input);
							getInheritingClassDefinitionProposal(proposals, offset, input);
							getPackageDefinitionProposal(proposals, offset, input);
						} else
							System.out.println();
					} else if ( previousReferences.size() == 0 && nextReferences.size() == 0 ) {
						getClassDefinitionProposal(proposals, offset, input);
						getInheritingClassDefinitionProposal(proposals, offset, input);
						getPackageDefinitionProposal(proposals, offset, input);
					}
					
				}
			}
		} catch (BadLocationException e) {
			e.printStackTrace();
		}

		KermetaCompletionProposal[] proposalsArray = new KermetaCompletionProposal[proposals.size()];
		proposals.toArray(proposalsArray);
		return proposalsArray;
	}

	static private final Comparator<KermetaCompletionProposal> KermetaCompletionProposalComparator = new Comparator<KermetaCompletionProposal>() {
	     public int compare(KermetaCompletionProposal o1, KermetaCompletionProposal o2) {
	         String s1 = o1.getDisplayString();
	         String s2 = o2.getDisplayString();
	         return s1.compareTo(s2);
	     }
	 };
	
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		return null;
	}

	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] { ' ', '.' };
	}

	public char[] getContextInformationAutoActivationCharacters() {
		return new char[] { ' ', '.' };
	}

	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}

	public String getErrorMessage() {
		return null;
	}
	
	/*
	 * 
	 * Attributes.
	 * 
	 */
	final static private String ATTRIBUTE = "attribute";
	
	final static private String ATTRIBUTE_DECLARATION = "attribute - template";
	final static private String ATTRIBUTE_DECLARATION_SUBSTITUTION = "/**\n*\n*/\nattribute attributeName : attributeType";
	
	private void getAttributeProposal(List<KermetaCompletionProposal> proposals, int replacementOffset, String stringToMatch) {
		String regex = stringToMatch + ".+";
		if ( ATTRIBUTE.matches(regex) )
			proposals.add( new KermetaCompletionProposal(ATTRIBUTE, replacementOffset - stringToMatch.length(), stringToMatch.length(), ATTRIBUTE.length(), KermetaIconsGreen.PROPERTY_CONTAINED, ATTRIBUTE + " - keyword", null, null, null) );
	}
	
	private void getAttributeDeclarationProposal(List<KermetaCompletionProposal> proposals, int replacementOffset, String stringToMatch) {
		String regex = stringToMatch + ".+";
		if ( ATTRIBUTE.matches(regex) )
			proposals.add(new KermetaCompletionProposal(ATTRIBUTE_DECLARATION_SUBSTITUTION, replacementOffset - stringToMatch.length(), stringToMatch.length(), ATTRIBUTE_DECLARATION_SUBSTITUTION.length(), KermetaIconsGreen.PROPERTY_CONTAINED, ATTRIBUTE_DECLARATION, null, null, null));
	}
	
	/*
	 * 
	 * References.
	 * 
	 */
	final static private String REFERENCE = "reference";

	final static private String REFERENCE_DECLARATION = "reference - template";
	final static private String REFERENCE_DECLARATION_SUBSTITUTION = "/**\n*\n*/\nreference referenceName : referenceType";
	
	private void getReferenceProposal(List<KermetaCompletionProposal> proposals, int replacementOffset, String stringToMatch) {
		String regex = stringToMatch + ".+";
		if ( REFERENCE.replace("\n", "").matches(regex) )
			proposals.add( new KermetaCompletionProposal(REFERENCE, replacementOffset - stringToMatch.length(), 0, REFERENCE.length(), KermetaIconsGreen.PROPERTY, REFERENCE + " - keyword", null, null, null) );
	}
	
	private void getReferenceDeclarationProposal(List<KermetaCompletionProposal> proposals, int replacementOffset, String stringToMatch) {
		String regex = stringToMatch + ".+";
		if ( REFERENCE_DECLARATION_SUBSTITUTION.replace("\n", "").matches(regex) )
			proposals.add( new KermetaCompletionProposal(REFERENCE_DECLARATION_SUBSTITUTION, replacementOffset - stringToMatch.length(), stringToMatch.length(), REFERENCE_DECLARATION_SUBSTITUTION.length(), KermetaIconsGreen.PROPERTY, REFERENCE_DECLARATION, null, null, null) );
	}
	
	/*
	 * 
	 * Operations.
	 * 
	 */
	final static private String OPERATION = "operation - template";
	final static private String OPERATION_SUBSTITUTION = "/**\n*\n*/\noperation operationName() : Void is do\n\nend\n";
	
	final static private String ABSTRACT_OPERATION = "abstract operation - template";
	final static private String ABSTRACT_OPERATION_SUBSTITUTION = "/**\n*\n*/\noperation operationName() : Void is abstract\n";

	private void getOperationProposal(List<KermetaCompletionProposal> proposals, int replacementOffset, String stringToMatch) {
		String regex = stringToMatch + ".+";
		if ( "operation".matches(regex) )
		//if ( OPERATION_SUBSTITUTION.replace("\n", "").matches(regex) )
			proposals.add( new KermetaCompletionProposal(OPERATION_SUBSTITUTION, replacementOffset - stringToMatch.length(), stringToMatch.length(), OPERATION_SUBSTITUTION.length(), KermetaIconsGreen.OPERATION, OPERATION, null, null, null) );
	}	
	
	private void getAbstractOperationProposal(List<KermetaCompletionProposal> proposals, int replacementOffset, String stringToMatch) {
		String regex = stringToMatch + ".+";
		if ( "abstract".matches(regex) || "operation".matches(regex) )
		//if ( ABSTRACT_OPERATION_SUBSTITUTION.replace("\n", "").matches(regex) )
			proposals.add( new KermetaCompletionProposal(ABSTRACT_OPERATION_SUBSTITUTION, replacementOffset - stringToMatch.length(), stringToMatch.length(), ABSTRACT_OPERATION_SUBSTITUTION.length(), KermetaIconsGreen.OPERATION_ABSTRACT, ABSTRACT_OPERATION, null, null, null) );
	}
	
	
	final static private String REQUIRE = "require \"\"";
	
	final static private String USING = "using ";

	/*
	 * 
	 * Class Definitions.
	 * 
	 */
	final static private String CLASS_DECLARATION = "class definition - template";
	final static private String CLASS_DECLARATION_SUBSTITUTION = "/**\n*\n*/\nclass name {\n}\n";

	final static private String CLASS_DECLARATION_INHERITING = "inheriting class definition - template";
	final static private String CLASS_DECLARATION_INHERITING_SUBSTITUTION = "/**\n*\n*/\nclass name inherits superClassname {\n}\n";
	
	private void getClassDefinitionProposal(List<KermetaCompletionProposal> proposals, int replacementOffset, String stringToMatch) {
		String regex = stringToMatch + ".+";
		if ( CLASS_DECLARATION_SUBSTITUTION.replace("\n", "").matches(regex) )
			proposals.add(new KermetaCompletionProposal(CLASS_DECLARATION_SUBSTITUTION, replacementOffset - stringToMatch.length(), stringToMatch.length(), CLASS_DECLARATION_SUBSTITUTION.length(), KermetaIconsRed.CLASS, CLASS_DECLARATION, null, null, null));
	}	
	
	private void getInheritingClassDefinitionProposal(List<KermetaCompletionProposal> proposals, int replacementOffset, String stringToMatch) {
		String regex = stringToMatch + ".+";
		if ( CLASS_DECLARATION_INHERITING_SUBSTITUTION.replace("\n", "").matches(regex) )
			proposals.add( new KermetaCompletionProposal(CLASS_DECLARATION_INHERITING_SUBSTITUTION, replacementOffset - stringToMatch.length(), stringToMatch.length(), CLASS_DECLARATION_INHERITING_SUBSTITUTION.length(), KermetaIconsRed.CLASS, CLASS_DECLARATION_INHERITING, null, null, null) );
	}
	
	/*
	 * 
	 * Package Definition.
	 * 
	 */
	final static private String PACKAGE_DECLARATION = "package - template";
	final static private String PACKAGE_DECLARATION_SUBSTITUTION = "/**\n*\n*/\npackage packageName {\n}\n";

	private void getPackageDefinitionProposal(List<KermetaCompletionProposal> proposals, int replacementOffset, String stringToMatch) {
		String regex = stringToMatch + ".+";
		if ( PACKAGE_DECLARATION_SUBSTITUTION.replace("\n", "").matches(regex) )
			proposals.add( new KermetaCompletionProposal(PACKAGE_DECLARATION_SUBSTITUTION, replacementOffset-stringToMatch.length(), stringToMatch.length(), PACKAGE_DECLARATION_SUBSTITUTION.length(), KermetaIconsRed.PACKAGE, PACKAGE_DECLARATION, null, null, null) );
	}
	
	/*
	 * 
	 * Variables Declaration.
	 * 
	 */
	final static private String VARIABLE_DECLARATION = "variable declaration - template";
	final static private String VARIABLE_DECLARATION_SUBSTITUTION = "var varName : VarType";

	final static private String VARIABLE_INIT_DECLARATION = "variable declaration with initialization - template";
	final static private String VARIABLE_INIT_DECLARATION_SUBSTITUTION = "var varName : VarType init expression";

	private void getVariableDeclarationProposal(List<KermetaCompletionProposal> proposals, int replacementOffset, String stringToMatch) {
		String regex = stringToMatch + ".+";
		if ( VARIABLE_DECLARATION_SUBSTITUTION.replace("\n", "").matches(regex) )
			proposals.add( new KermetaCompletionProposal(VARIABLE_DECLARATION_SUBSTITUTION, replacementOffset-stringToMatch.length(), stringToMatch.length(), VARIABLE_DECLARATION_SUBSTITUTION.length(), KermetaSpecialIcons.getDefault().VARAIBLE_DECLARATION, VARIABLE_DECLARATION, null, null, null) );
	}
	
	private void getVariableInitDeclarationProposal(List<KermetaCompletionProposal> proposals, int replacementOffset, String stringToMatch) {
		String regex = stringToMatch + ".+";
		if ( VARIABLE_INIT_DECLARATION_SUBSTITUTION.replace("\n", "").matches(regex) )
			proposals.add( new KermetaCompletionProposal(VARIABLE_INIT_DECLARATION_SUBSTITUTION, replacementOffset-stringToMatch.length(), stringToMatch.length(), VARIABLE_INIT_DECLARATION_SUBSTITUTION.length(), KermetaSpecialIcons.getDefault().VARAIBLE_DECLARATION, VARIABLE_INIT_DECLARATION, null, null, null) );
	}
	
	
	private List<KermetaCompletionProposal> getKermetaCompletionProposalsForClassDefinition(ITextViewer viewer, int offset, ClassDefinition cd, String stringToMatch) throws BadLocationException {
		List<KermetaCompletionProposal> proposals = new ArrayList<KermetaCompletionProposal> ();
		
		getAttributeProposal(proposals, offset, stringToMatch);
		getAttributeDeclarationProposal(proposals, offset, stringToMatch);

		getReferenceProposal(proposals, offset, stringToMatch);
		getReferenceDeclarationProposal(proposals, offset, stringToMatch);

		getOperationProposal(proposals, offset, stringToMatch);
		getAbstractOperationProposal(proposals, offset, stringToMatch);
		
		List<KermetaCompletionProposal> methodsProposals = new ArrayList<KermetaCompletionProposal> ();		
		for ( Operation op : ClassDefinitionHelper.getAllOperations(cd) ) {
			if ( ! cd.getOwnedOperation().contains(op) && ! NamedElementHelper.getQualifiedName( (NamedElement) op.eContainer() ).matches("kermeta::reflection.+") ) {
				String regex = stringToMatch + ".+";
				if ( op.getName().matches(regex) ) {
					KM2KMTPrettyPrinter prettyprinter = new KM2KMTPrettyPrinter(true);
					String replacingText = "\nmethod " + op.getName();
					if (op.getTypeParameter().size() > 0) {
						replacingText += "<";
						replacingText += prettyprinter.ppTypeVariableDeclaration(op.getTypeParameter());
						replacingText += ">";
					}
					replacingText += "(";
					replacingText += prettyprinter.ppComaSeparatedNodes(op.getOwnedParameter());
					replacingText += ")";
					if(op.getType() != null) {
						replacingText += " : " + prettyprinter.ppTypeFromMultiplicityElement(op);
					}
					replacingText += " from " + NamedElementHelper.getQualifiedName(op.getOwningClass());
					replacingText += " is do\nend\n";
					
					String displayedText = op.getName();
					displayedText += "(...)";
					if(op.getType() != null) {
						displayedText += " : " + prettyprinter.ppTypeFromMultiplicityElement(op);
					}
					//displayedText += " from " + KermetaModelHelper.NamedElement.qualifiedName(op.getOwningClass());
					displayedText += " - " + op.getOwningClass().getName();
					
					String contextInformationString = "";
					for ( Tag tag : op.getTag() )
						if ( tag.getName() != null )
							contextInformationString += "@" + tag.getName() + " \"" + tag.getValue() + "\"\n";
						else
							contextInformationString += tag.getValue() + "\n";
					ContextInformation contextInformtation = new ContextInformation( contextInformationString, "" );
					
					methodsProposals.add( new KermetaCompletionProposal(replacingText, offset - stringToMatch.length(), stringToMatch.length(), replacingText.length(), KermetaIconsYellow.METHOD, displayedText, contextInformtation, null, op) );
				}
			}
		}
		Collections.sort(methodsProposals, KermetaCompletionProposalComparator);
		proposals.addAll(methodsProposals);
		
		return proposals;
	}
	

	/*
	 * 
	 * Conditional Controls.
	 * 
	 */
	final static private String IF_THEN_DECLARATION = "if structure";
	final static private String IF_THEN_DECLARATION_SUBSTITUTION = "if ( condition ) then\nend\n";

	final static private String IF_THEN_ELSE_DECLARATION = "if else structure";
	final static private String IF_THEN_ELSE_DECLARATION_SUBSTITUTION = "if ( condition ) then\nelse\nend\n";
	
	private void getIfThenProposal(List<KermetaCompletionProposal> proposals, int replacementOffet, String stringToMatch) {
		String regex = stringToMatch + ".+";
		if ( IF_THEN_DECLARATION_SUBSTITUTION.replace("\n", "").matches(regex) )
			proposals.add( new KermetaCompletionProposal(IF_THEN_DECLARATION_SUBSTITUTION, replacementOffet-stringToMatch.length(), stringToMatch.length(), IF_THEN_DECLARATION_SUBSTITUTION.length(), KermetaSpecialIcons.getDefault().CONDITIONAL, IF_THEN_DECLARATION, null, null, null) );
	}
	
	private void getIfThenElseProposal(List<KermetaCompletionProposal> proposals, int replacementOffet, String stringToMatch) {
		String regex = stringToMatch + ".+";
		if ( IF_THEN_ELSE_DECLARATION_SUBSTITUTION.replace("\n", "").matches(regex) )
			proposals.add( new KermetaCompletionProposal(IF_THEN_ELSE_DECLARATION_SUBSTITUTION, replacementOffet-stringToMatch.length(), stringToMatch.length(), IF_THEN_ELSE_DECLARATION_SUBSTITUTION.length(), KermetaSpecialIcons.getDefault().CONDITIONAL, IF_THEN_ELSE_DECLARATION, null, null, null) );
	}
	
	/*
	 * 
	 * Block Controls.
	 * 
	 */
	final static private String BLOCK = "do end block";
	final static private String BLOCK_SUBSTITUTION = "do\nend\n";

	final static private String RESCUE_BLOCK = "do rescue end block";
	final static private String RESCUE_BLOCK_SUBSTITUTION = "do\nrescue (exception : Exception)\nend";
	
	private void getBlockProposal(List<KermetaCompletionProposal> proposals, int replacementOffet, String stringToMatch) {
		String regex = stringToMatch + ".+";
		if ( BLOCK_SUBSTITUTION.replace("\n", "").matches(regex) )
			proposals.add( new KermetaCompletionProposal(BLOCK_SUBSTITUTION, replacementOffet-stringToMatch.length(), stringToMatch.length(), BLOCK_SUBSTITUTION.length(), KermetaSpecialIcons.getDefault().BLOCK, BLOCK, null, null, null) );
	}
	
	private void getRescueBlockProposal(List<KermetaCompletionProposal> proposals, int replacementOffet, String stringToMatch) {
		String regex = stringToMatch + ".+";
		if ( RESCUE_BLOCK_SUBSTITUTION.replace("\n", "").matches(regex) )
			proposals.add( new KermetaCompletionProposal(RESCUE_BLOCK_SUBSTITUTION, replacementOffet-stringToMatch.length(), stringToMatch.length(), RESCUE_BLOCK_SUBSTITUTION.length(), KermetaSpecialIcons.getDefault().BLOCK, RESCUE_BLOCK, null, null, null) );
	}
	
	/*
	 * 
	 * Loop Control
	 * 
	 */
	final static private String LOOP = "loop block";
	final static private String LOOP_SUBSTITUTION = "from var i : Integer init 0\nuntil i == 10\nloop\nend";

	private void getLoopProposal(List<KermetaCompletionProposal> proposals, int replacementOffet, String stringToMatch) {
		String regex = stringToMatch + ".+";
		if ( LOOP_SUBSTITUTION.replace("\n", "").matches(regex) )
			proposals.add( new KermetaCompletionProposal(LOOP_SUBSTITUTION, replacementOffet-stringToMatch.length(), stringToMatch.length(), LOOP_SUBSTITUTION.length(), KermetaSpecialIcons.getDefault().LOOP, LOOP, null, null, null) );
	}
	
	private List<KermetaCompletionProposal> getKermetaCompletionProposalsForBlock(ITextViewer viewer, int offset, Block block, String stringToMatch) {
		List<KermetaCompletionProposal> result = new ArrayList<KermetaCompletionProposal>();
		
		Block currentBlock = block;
		boolean goOn = true;
		while ( goOn ) {
			List<KermetaCompletionProposal> temp = new ArrayList<KermetaCompletionProposal>();
			for ( Expression expression : currentBlock.getStatement() ) {
				if ( expression instanceof VariableDecl ) {
					VariableDecl declaration = (VariableDecl) expression;
					String regex = stringToMatch + ".+";
					if ( declaration.getIdentifier().matches(regex) ) {
						KM2KMTPrettyPrinter prettyprinter = new KM2KMTPrettyPrinter();
						String type = prettyprinter.ppTypeFromMultiplicityElement( declaration.getType() );
						String displayedString = declaration.getIdentifier() + " : " + type;
						KermetaCompletionProposal proposal = new KermetaCompletionProposal(declaration.getIdentifier(), offset-stringToMatch.length(), stringToMatch.length(), declaration.getIdentifier().length(), null, displayedString, null, null, null);
						temp.add(proposal);
					}
				}
			}
			Collections.sort(temp, KermetaCompletionProposalComparator);
			result.addAll(temp);
			if ( currentBlock.eContainer() instanceof Conditional )
				currentBlock = (Block) currentBlock.eContainer().eContainer();
			else if ( currentBlock.eContainer() instanceof Loop ) {
				Loop l = (Loop) currentBlock.eContainer();
				if ( l.getInitialization() instanceof VariableDecl ) {
					VariableDecl declaration = (VariableDecl) l.getInitialization();
					String regex = stringToMatch + ".+";
					if ( declaration.getIdentifier().matches(regex) ) {
						KM2KMTPrettyPrinter prettyprinter = new KM2KMTPrettyPrinter();
						String type = prettyprinter.ppTypeFromMultiplicityElement( declaration.getType() );
						String displayedString = declaration.getIdentifier() + " : " + type;
						KermetaCompletionProposal proposal = new KermetaCompletionProposal(declaration.getIdentifier(), offset-stringToMatch.length(), stringToMatch.length(), declaration.getIdentifier().length(), null, displayedString, null, null, null);
						result.add(proposal);
					}
				}
				currentBlock = (Block)l.eContainer();
			} else if ( ! (currentBlock.eContainer() instanceof Block) )
				goOn = false;
			else
				currentBlock = (Block) currentBlock.eContainer();
		}
		
		/*
		 * 
		 * Controls
		 * 
		 */
		getIfThenProposal(result, offset, stringToMatch);
		getIfThenElseProposal(result, offset, stringToMatch);		
		getBlockProposal(result, offset, stringToMatch);
		getRescueBlockProposal(result, offset, stringToMatch);		
		getLoopProposal(result, offset, stringToMatch);
		getVariableDeclarationProposal(result, offset, stringToMatch);
		getVariableInitDeclarationProposal(result, offset, stringToMatch);

		EObject b = currentBlock;
		while ( ! (b.eContainer() instanceof ClassDefinition) )
			b = b.eContainer();
		ClassDefinition cdef = (ClassDefinition) b.eContainer();
		
		addCallableFeatures(result, offset, cdef, stringToMatch);
		
		return result;
	}

	
	private void addCallableFeatures(List<KermetaCompletionProposal> result, int offset, ClassDefinition cdef, String stringToMatch) {
		/*
		 * 
		 * Properties.
		 * 
		 */
		List<KermetaCompletionProposal> temp = new ArrayList<KermetaCompletionProposal>();
		for ( Property property : ClassDefinitionHelper.getAllProperties(cdef) ) {
			String regex = stringToMatch + ".+";
			if ( property.getName().matches(regex) ) {
				KM2KMTPrettyPrinter prettyprinter = new KM2KMTPrettyPrinter();
				String type = prettyprinter.ppTypeFromMultiplicityElement( property );
				String displayedString = property.getName() + " : " + type + " from " + KermetaModelHelper.NamedElement.qualifiedName( (NamedElement) property.eContainer() ) ;
				if ( property.isIsComposite() ) {
					if ( cdef.getOwnedAttribute().contains(property) )
						temp.add( new KermetaCompletionProposal(property.getName(), offset - stringToMatch.length(), 0, property.getName().length(), KermetaIconsGreen.PROPERTY_CONTAINED, displayedString, null, null, property) );				
					else
						temp.add( new KermetaCompletionProposal(property.getName(), offset - stringToMatch.length(), 0, property.getName().length(), KermetaIconsBlue.PROPERTY_CONTAINED, displayedString, null, null, property) );				
				} else {
					if ( cdef.getOwnedAttribute().contains(property) )
						temp.add( new KermetaCompletionProposal(property.getName(), offset - stringToMatch.length(), 0, property.getName().length(), KermetaIconsGreen.PROPERTY, displayedString, null, null, property) );
					else
						temp.add( new KermetaCompletionProposal(property.getName(), offset - stringToMatch.length(), 0, property.getName().length(), KermetaIconsBlue.PROPERTY, displayedString, null, null, property) );
				}
			}
		}
		Collections.sort(temp, KermetaCompletionProposalComparator);
		result.addAll(temp);
		
		
		/*
		 * 
		 * Operations
		 * 
		 */
		temp = new ArrayList<KermetaCompletionProposal>();
		for ( Operation operation : ClassDefinitionHelper.getAllOperations(cdef) ) {
			String regex = stringToMatch + ".+";
			if ( operation.getName().matches(regex) ) {
				if ( cdef.getOwnedOperation().contains(operation) ) {
					String displayedString = operation.getName() + " from " + NamedElementHelper.getQualifiedName( (NamedElement) operation.eContainer() );
					String replacedString = operation.getName() + "()";
					temp.add( new KermetaCompletionProposal(replacedString, offset - stringToMatch.length(), 0, replacedString.length(), KermetaIconsGreen.OPERATION, displayedString, null, null, operation) );				
				} else {
					if ( ! NamedElementHelper.getQualifiedName( (NamedElement) operation.eContainer() ).matches("kermeta::reflection.+") ) {
						String displayedString = operation.getName() + " from " + NamedElementHelper.getQualifiedName( (NamedElement) operation.eContainer() );
						String replacedString = operation.getName() + "()";
						temp.add( new KermetaCompletionProposal(replacedString, offset - stringToMatch.length(), 0, replacedString.length(), KermetaIconsBlue.OPERATION, displayedString, null, null, operation) );				
					}
				}
			}
		}
		Collections.sort(temp, KermetaCompletionProposalComparator);
		result.addAll(temp);
	}
	
	private Block getBlock(Expression e) {
		Block b = null;
		if ( e instanceof Block )
			b = (Block) e;
		else {
			EObject o = e;
			while ( b == null )
				if ( o.eContainer() instanceof Block )
					b = (Block) o.eContainer();
				else
					o = o.eContainer();
		}
		return b;
	}
	
	private Type getType(String input, Expression e) {
		Block b = getBlock(e);
		return getType(input, b);
	}
	
	private Type getType(String input, Block block) {
		String[] splits = input.split("\\.");
				
		List<VariableDecl> declarations = new ArrayList<VariableDecl>();
		Block currentBlock = block;
		boolean goOn = true;
		while ( goOn ) {
			for ( EObject o : currentBlock.getStatement() )
				if ( o instanceof VariableDecl )
					declarations.add( (VariableDecl) o );
			if ( currentBlock.eContainer() instanceof Block )
				currentBlock = (Block) currentBlock.eContainer();
			else
				goOn = false;
		}
		
		EObject b = currentBlock;
		while ( ! (b.eContainer() instanceof ClassDefinition) )
			b = b.eContainer();
		ClassDefinition cdef = (ClassDefinition) b.eContainer();
		
		Type currentType = null;
		for ( int i=0; i<splits.length; i++) {
			String s = splits[i];
			
			if ( currentType != null ) {
				if ( currentType instanceof Class )
					cdef = (ClassDefinition) ((Class) currentType).getTypeDefinition();
				else
					System.out.println();
			}
			
			/*
			 * 
			 * Look into the variables.
			 * 
			 */
			boolean found = false;
			Iterator<VariableDecl> it = declarations.iterator();
			while ( ! found && it.hasNext() ) {
				VariableDecl currentDeclaration = it.next();
				//String regex = s + ".+";
				//if ( currentDeclaration.getIdentifier().matches(regex) ) {
				if ( currentDeclaration.getIdentifier().equals(s) ) {
					currentType = currentDeclaration.getInitialization().getStaticType();
					found = true;
				}
			}
			
			/*
			 * 
			 * If no type found, look into the properties.
			 * 
			 */
			if ( ! found ) {
				Iterator<Property> iterator = ClassDefinitionHelper.getAllProperties(cdef).iterator();
				while ( ! found && iterator.hasNext() ) {
					Property currentProperty = iterator.next();
					if ( currentProperty.getName().equals(s) ) {
						if ( (currentProperty.getUpper() == -1) || (currentProperty.getUpper() > 1) ) {
							
							Class c = StructureFactory.eINSTANCE.createClass();
							ClassDefinition cd = null;
							KermetaUnit kermetaUnit = editor.getKermetaUnit();
							if ( currentProperty.isIsOrdered() ) {
								if ( currentProperty.isIsUnique() ) {
									cd = (ClassDefinition) kermetaUnit.getTypeDefinitionByQualifiedName("kermeta::standard::OrderedSet");
								} else {
									cd = (ClassDefinition) kermetaUnit.getTypeDefinitionByQualifiedName("kermeta::standard::Sequence");
								}
							} else {
								if ( currentProperty.isIsUnique() ) {
									cd = (ClassDefinition) kermetaUnit.getTypeDefinitionByQualifiedName("kermeta::standard::Set");
								} else {
									cd = (ClassDefinition) kermetaUnit.getTypeDefinitionByName("kermeta::standard::Bag");
								}
							}
							c.setTypeDefinition(cd);
							currentType = c;
						} else
							currentType = currentProperty.getType();
						found = true;
					}
				}
			}
			
			/*
			 * 
			 * If no type found, look into the operations.
			 * 
			 */
			if ( ! found ) {
				Iterator<Operation> iterator = ClassDefinitionHelper.getAllOperations(cdef).iterator();
				while ( ! found && iterator.hasNext() ) {
					Operation currentOperation = iterator.next();
					if ( currentOperation.getName().equals(s) ) {
						currentType = currentOperation.getType();
						found = true;
					}
				}
			}
		}
				
		return currentType;
	}
	
	
	private void addTypeDefintionsProposals(List<KermetaCompletionProposal> result, int offset, String stringToMatch) {
		KermetaUnit kermetaUnit = editor.getKermetaUnit();
		List<KermetaCompletionProposal> proposals = new ArrayList<KermetaCompletionProposal>();
		List<String> qualifiedNames = new ArrayList<String> ();
		for ( Package p : kermetaUnit.getPackages() ) {
            for (TypeDefinition td: p.getOwnedTypeDefinition()) {
            	String qualifiedName = NamedElementHelper.getQualifiedName(td);
            	if ( ! qualifiedNames.contains(qualifiedName) ) {
                	qualifiedNames.add(qualifiedName);
                	String regex = ".+" + stringToMatch + ".+";
                	if ( qualifiedName.matches(regex) )
                		proposals.add( new KermetaCompletionProposal(qualifiedName, offset, qualifiedName.length(), qualifiedName.length()) );
                }
            }
            String qualifiedName = NamedElementHelper.getQualifiedName(p);
            if ( ! qualifiedNames.contains(qualifiedName) ) {
            	qualifiedNames.add(qualifiedName);
            	String regex = ".+" + stringToMatch + ".+";
            	if ( qualifiedName.matches(regex) )
            		proposals.add( new KermetaCompletionProposal(qualifiedName, offset, qualifiedName.length(), qualifiedName.length()) );
            }
        }
		Collections.sort(proposals, KermetaCompletionProposalComparator);
		result.addAll( proposals );
	}
	
	
	private void addProposalsForExpression(ITextViewer viewer, List<KermetaCompletionProposal> result, int offset, int lengthBlank, String stringToMatch, Expression e) {
		Type type = null;
		if ( e instanceof Conditional ) {
			Conditional conditional = (Conditional) e;
			TextReference thenReference = editor.getKermetaUnit().getTracer().getFirstTextReference( conditional.getThenBody() );
			TextReference elseReference = editor.getKermetaUnit().getTracer().getFirstTextReference( conditional.getElseBody() );
			if ( (thenReference.getCharBeginAt() < offset-lengthBlank) && (thenReference.getCharEndAt() > offset-lengthBlank) )
				e = conditional.getThenBody();
			else if ( (elseReference != null) && (elseReference.getCharBeginAt() < offset-lengthBlank) && (elseReference.getCharEndAt() > offset-lengthBlank) )
				e = conditional.getElseBody();
		} else if ( e instanceof Loop ) {
			e = ((Loop) e).getBody();
		} else
			type = getType(stringToMatch, (Expression) e);
		
		if ( type instanceof Class ) {
			ClassDefinition cdef = (ClassDefinition) ((Class) type).getTypeDefinition();
			addCallableFeatures(result, offset, cdef, "");
		} else if ( type instanceof PrimitiveType ) {
			PrimitiveType primitiveType = (PrimitiveType) type;
			Type instanceType = primitiveType.getInstanceType();
			if ( instanceType instanceof Class ) {
				ClassDefinition cdef = (ClassDefinition) ((Class) instanceType).getTypeDefinition();
				addCallableFeatures(result, offset, cdef, "");
			} else
				System.out.println();
		} else if ( type == null ) {
			Block b = getBlock(e);
			result.addAll( getKermetaCompletionProposalsForBlock(viewer, offset, b, stringToMatch) );
		}
	}
}


