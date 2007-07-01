/* $Id: EditorCompletion.java,v 1.19 2007-07-01 09:27:46 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : EditorCompletion.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 jan. 2005
* Author : Franck Fleurey (ffleurey@irisa.fr)
*/

package fr.irisa.triskell.kermeta.texteditor.completion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

import fr.irisa.triskell.kermeta.language.behavior.Block;
import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.texteditor.TexteditorPlugin;
import fr.irisa.triskell.kermeta.texteditor.editors.CathegorizedKWList;
import fr.irisa.triskell.kermeta.typechecker.CallableOperation;
import fr.irisa.triskell.kermeta.typechecker.CallableProperty;
import fr.irisa.triskell.kermeta.typechecker.Type;
import fr.irisa.triskell.traceability.ModelReference;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 * 
 * Manages the automatic completion that assists the user.
 */
public class EditorCompletion implements IContentAssistProcessor {
	
	/**
	 * This field is an indicator for extern objects that want to know if the completion is active in order to
	 * execute some actions.
	 * See for instance ParsingStrategy.
	 */
	private boolean isCompleting = false;
	
	public boolean isCompleting() {
		return isCompleting;
	}
	
	public void setIsCompleting(boolean value) {
		isCompleting = value;
	}
	
	private KermetaUnit kermetaUnit = null;
	
	public synchronized void setkermetaUnit(KermetaUnit value) {
		kermetaUnit = value;
	}
	
	protected boolean doubleColon;
	
	public EditorCompletion() {
		super();
	}

	/**
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeCompletionProposals(org.eclipse.jface.text.ITextViewer, int)
	 * Find completions proposals according to the cursor position.
	 */
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		
		proposals.clear();
		
		IDocument doc = viewer.getDocument();
		
		if (kermetaUnit == null) return null;
		
		synchronized (kermetaUnit) {
			// Get the token between the cursor and last character reliable for completion
			// "." -> should be followed by call feature
			// ":" -> should be followed by class definition
			// "::" -> should be followed by package or class definition
			String qualifier = getQualifier(doc, offset);
			
			TexteditorPlugin.pluginLog.info(" * Completion -> qualifier = " + qualifier);
			
			// "::" -> should be followed by package or type definition 
			if (doubleColon == true)
				addProposalsForPackages(doc, offset, qualifier);

			//else if (qualifier.startsWith(":") || qualifier.startsWith("<") ) {
			
			/*else if (qualifier.startsWith(":") || qualifier.startsWith("<"))
			    addProposalsForTypes(doc, offset, propList, qualifier.substring(1));
	*/
			// "." -> should be followed by call feature
			else {
				
				int index = offset - 1;
				String uri = kermetaUnit.getUri();
				
				try {
					/*
					 * 
					 * Getting the text.
					 * 
					 */
					while ( ! Character.isWhitespace( doc.getChar(index) ) && (doc.getChar(index) != '<') && (doc.getChar(index) != ':') )
						index--;
					int trueOffset = index+1;
					int length = offset - index -1;
					String text = doc.get(trueOffset, length);
				
					if (qualifier.startsWith(".")) {
			    	
						/*
						 * 
						 * Removing the . character at the end.
						 * 
						 */
						text = text.substring(0, text.length()-1);
						
						Set <ModelReference> references = kermetaUnit.getTracer().getModelReferences(trueOffset, length, uri);  
						for ( ModelReference reference : references ) {
							boolean stop = false;
							EObject container = reference.getRefObject();
							while ( ! stop && (container != null) ) {
								stop = addCompletionProposalsForCalls(container, text, offset);
								container = container.eContainer();
							}
						}
					
					} else if ( kermetaUnit.getTracer() != null ){
												
						Set <ModelReference> references = kermetaUnit.getTracer().getModelReferences(trueOffset, length, uri);  
						for ( ModelReference reference : references ) {
							EObject container = reference.getRefObject();
							while ( container != null ) {
								addCompletionProposalsForIdentifiers(container, text, trueOffset);
								container = container.eContainer();
							}
						}
						
				        for ( Package p : kermetaUnit.packages.values()) {
				            for (Object next: p.getOwnedTypeDefinition()) {
				                TypeDefinition td = (TypeDefinition)next;
				                CompletionItem ci = new NamedElementCompletionItem(td);
				                System.out.println(td.getName());
				                if (ci.getCompletionText().toLowerCase().startsWith( text.toLowerCase()) )
				                    proposals.add(ci.getCompletionProposal(trueOffset, text.length() ));
				            }
				            CompletionItem ci = new NamedElementCompletionItem(p);
				            if (ci.getCompletionText().toLowerCase().startsWith(text.toLowerCase()))
				                 proposals.add(ci.getCompletionProposal(trueOffset, text.length() ));
				        }
				    	Collections.sort(proposals, cpCmp);
						
				    	Iterator <String> iterator = CathegorizedKWList.getInstance().keywords.iterator();
				    	while ( iterator.hasNext() ) {
				    		String keyword = iterator.next();
				    		String regex = getRegularExpression( text.toLowerCase() );
				    		if ( keyword.toLowerCase().matches(regex) ) {
				    			CompletionProposal proposal = new CompletionProposal(keyword, trueOffset, text.length(), keyword.length());
				    			proposals.add( proposal );
				    		}
				    	}
				    	
					}
				} catch (BadLocationException e) {
					e.printStackTrace();
				}
			
			}			
		}
				
		ICompletionProposal[] proposalsArray = new ICompletionProposal[proposals.size()];
		proposals.toArray(proposalsArray);
		
		return proposalsArray;
		
	}
	
	private String getRegularExpression(String s) {
		String regex = s.replaceAll("\\{", "\\\\{");
		regex = regex.replaceAll("\\}", "\\\\}");
		regex += ".+";
		return regex;
	}
	
	private List <ICompletionProposal> proposals = new ArrayList <ICompletionProposal> ();
	
	private void addCompletionProposalsForIdentifiers(EObject object, String text, int offset) {
		
		if ( object instanceof Block )	
			addCompletionProposalsForIdentifiers( (Block) object, text, offset);
		else if ( object instanceof Operation )
			addCompletionProposalsForIdentifiers( (Operation) object, text, offset);
		else if ( object instanceof ClassDefinition )
			addCompletionProposalsForIdentifiers( (ClassDefinition) object, text, offset);
		
	}
	
	private boolean addCompletionProposalsForCalls(EObject object, String text, int offset) {
		
		boolean result = false;
		
		if ( object instanceof Block ) {
			
			addCompletionProposalsForCalls( (Block) object, text, offset);
			result = ! proposals.isEmpty();
		
		} else if ( object instanceof Operation ) {
		
			Operation operation = (Operation) object;
			fr.irisa.triskell.kermeta.language.structure.Type type = getParameterType(text, operation);	
			if ( type instanceof Class ) {
				addCompletionProposalsForCalls( 
						(ClassDefinition) ((Class) type).getTypeDefinition(),
						offset
				);
				result = true;
			}

		} else if ( object instanceof ClassDefinition ) {
		
			ClassDefinition definition = (ClassDefinition) object;
			fr.irisa.triskell.kermeta.language.structure.Type type = getAttributeType(text, definition);	
			if ( type instanceof Class ) {
				addCompletionProposalsForCalls( 
						(ClassDefinition) ((Class) type).getTypeDefinition(),
						offset
				);
				return true;
			}
			
		}
		
		return result;
	}
	
	
	private void addCompletionProposalsForCalls(ClassDefinition definition, int offset) {
		
		/*
		 * 
		 * Properties
		 * 
		 */
		Iterator <Property> iterator = definition.getOwnedAttribute().iterator();
		while ( iterator.hasNext() ) {
			NamedElementCompletionItem item = new NamedElementCompletionItem( iterator.next() );
			proposals.add( item.getCompletionProposal(offset, 0) );
		}
		
		/*
		 * 
		 * Operations
		 * 
		 */
		Iterator <Operation> itOnOperations = definition.getOwnedOperation().iterator();
		while ( itOnOperations.hasNext() ) {
			NamedElementCompletionItem item = new NamedElementCompletionItem( itOnOperations.next() );
			proposals.add( item.getCompletionProposal(offset, 0) );
		}
		
	}
	
	
	private void addCompletionProposalsForCalls( Block block, String name, int offset ) {
		
		List <VariableDecl> declarations = getVariableDeclarations( block );
		Iterator <VariableDecl> iterator = declarations.iterator();
		while ( iterator.hasNext() ) {
			VariableDecl declaration = iterator.next();
			if ( declaration.getIdentifier().equals(name) ) {
				
				Object type = declaration.getType().getType();
				
				if ( type instanceof Class )
					addCompletionProposalsForCalls(
						(ClassDefinition) ((Class) type).getTypeDefinition(), 
						offset);
			}
		}
		
	}
	
	private void addCompletionProposalsForIdentifiers( Block block, String name, int offset ) {
		String regex = getRegularExpression( name.toLowerCase() );
		List <VariableDecl> declarations = getVariableDeclarations( block );
		Iterator <VariableDecl> iterator = declarations.iterator();
		while ( iterator.hasNext() ) {
			VariableDecl declaration = iterator.next();
			if ( declaration.getIdentifier().toLowerCase().matches(regex) ) {
				CompletionProposal proposal = new CompletionProposal(declaration.getIdentifier(), offset, name.length(), declaration.getIdentifier().length());
				proposals.add( proposal );
			}
		}
		
	}
	
	private void addCompletionProposalsForIdentifiers( Operation operation, String name, int offset ) {
		String regex = getRegularExpression( name.toLowerCase() );
		Iterator <Parameter> iterator = operation.getOwnedParameter().iterator();	
		while ( iterator.hasNext() ) {
			Parameter parameter = iterator.next();
			if ( parameter.getName().toLowerCase().matches(regex) ) {
				CompletionProposal proposal = new CompletionProposal(parameter.getName(), offset, name.length(), parameter.getName().length());
				proposals.add( proposal );
			}
		}
		
	}
	
	private void addCompletionProposalsForIdentifiers( ClassDefinition definition, String name, int offset ) {
		
		Iterator <Property> iterator = ClassDefinitionHelper.getAllProperties(definition).iterator();
		String regex = getRegularExpression( name.toLowerCase() );
		while ( iterator.hasNext() ) {
			Property property = iterator.next();
			if ( property.getName().toLowerCase().matches(regex) ) {
				CompletionProposal proposal = new CompletionProposal(property.getName(), offset, name.length(), property.getName().length());
				proposals.add( proposal );
			}
		}
		
		Iterator <Operation> it = ClassDefinitionHelper.getAllOperations(definition).iterator();
		while ( it.hasNext() ) {
			Operation operation = it.next();
			if ( operation.getName().toLowerCase().matches(regex) ) {
				CompletionProposal proposal = new CompletionProposal(operation.getName(), offset, name.length(), operation.getName().length());
				proposals.add( proposal );
			}
		}
		
	}
	
	
	private List <VariableDecl> getVariableDeclarations( Block block ) {
		List <VariableDecl> result = new ArrayList <VariableDecl> ();
		Iterator iterator = block.eContents().iterator();
		while ( iterator.hasNext() ) {
			Object o = iterator.next();
			if ( o instanceof VariableDecl )
				result.add( (VariableDecl) o );
		}
		return result;
	}
	
	
	private fr.irisa.triskell.kermeta.language.structure.Type getParameterType(String parameterName, Operation operation) {
		
		Iterator <Parameter> iterator = operation.getOwnedParameter().iterator();
		while ( iterator.hasNext() ) {
			
			Parameter parameter = iterator.next();
			if ( parameter.getName().equals( parameterName ) )
				return parameter.getType();
			
		}
		
		return null;
		
	}

	
	private fr.irisa.triskell.kermeta.language.structure.Type getAttributeType(String attributeName, ClassDefinition definition) {
		Iterator <Property> iterator = definition.getOwnedAttribute().iterator();
		while ( iterator.hasNext() ) {
			Property property = iterator.next();
			if ( property.getName().equals(attributeName) )
				return property.getType();
		}
		return null;
	}
	
	private List <Property> getAttributes(String attributeName, ClassDefinition definition) {
		List <Property> properties = new ArrayList <Property> ();
		Iterator <Property> iterator = definition.getOwnedAttribute().iterator();
		String regex = getRegularExpression( attributeName.toLowerCase() );
		while ( iterator.hasNext() ) {
			Property property = iterator.next();
			if ( property.getName().matches(regex) )
				properties.add( property );
		}
		return properties;
	}
	
	/**
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeContextInformation(org.eclipse.jface.text.ITextViewer, int)
	 */
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		return null;
	}

	/**
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getCompletionProposalAutoActivationCharacters()
	 */
	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] { '.', ':', '<' };
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getContextInformationAutoActivationCharacters()
	 */
	public char[] getContextInformationAutoActivationCharacters() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getErrorMessage()
	 */
	public String getErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getContextInformationValidator()
	 */
	public IContextInformationValidator getContextInformationValidator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Get, from the position of the cursor given by documentOffset, 
	 * the last token between the place where the cursor is located, and 
	 * the first "special" character (i.e ".", ":") that was found
	 * */
    private String getQualifier(IDocument doc, int documentOffset)
    {
       // Use string buffer to collect characters
       StringBuffer buf = new StringBuffer();
       boolean white = false;
       doubleColon = false;
       while (true)
       {
          try
          {
            // Read character backwards
            char c;
			c = doc.getChar(--documentOffset);
			// This was not the start of a tag...but I don't care!
             if (Character.isWhitespace(c))
             {
                // no open tag was found.
                //return buf.reverse().toString();
                white = true;
                continue;
             }
             
             // Start of tag or attribute value. Return qualifier
             if (c == ':' || c == '.' || c == '<')
             {
                buf.append(c);
                if (c == ':')
                {
                	c = doc.getChar(--documentOffset);
                	// Handle the case where we have a '::' so that we can
                	// do a "qualified_name-related completion".
                	if (c == ':')
                	{
                		doubleColon = true;
                		buf.append(c);
                		// '<' refers to type parameters
                		while ( !Character.isWhitespace(c) && c != '<') 
                		{
                			c = doc.getChar(--documentOffset);
                			buf.append(c);
                		}
                	}
                }
                if (doubleColon == false || Character.isWhitespace(c) || c != '<')
                	return buf.reverse().toString();
             }
             
             if (white) return "";
             
             // Collect character
             buf.append(c);
          }
          catch (org.eclipse.jface.text.BadLocationException e)
          {
             // Document start reached, no tag found
             return "";
          }
       }
    }
    
    private void addProposalsForFeatureCalls(IDocument doc, int offset, ArrayList props, String begining, Type type) {
        for (Object next : type.callableProperties())
        {
            CallableProperty cp = (CallableProperty)next;
            CompletionItem ci = new CallPropertyCompletionItem(cp);
            if (ci.getCompletionText().toLowerCase().startsWith(begining.toLowerCase())) {
                props.add(ci.getCompletionProposal(offset - begining.length(), begining.length()));
            }
        }
        
        for (Object next : type.callableOperations())
        {
            CallableOperation cp = (CallableOperation)next;
            CompletionItem ci = new CallOperationCompletionItem(cp);
            if (ci.getCompletionText().toLowerCase().startsWith(begining.toLowerCase())) {
                props.add(ci.getCompletionProposal(offset - begining.length(), begining.length()));
            }
        }
        Collections.sort(props, cpCmp);
    }
    
  /*  private void addProposalsForTypes(IDocument doc, int offset, ArrayList props, String begining) {
        for ( Package p : editor.getMcunit().packages.values())
        {
            for (Object next: p.getOwnedTypeDefinition()) {
                TypeDefinition td = (TypeDefinition)next;
                CompletionItem ci = new NamedElementCompletionItem(td);
                if (ci.getCompletionText().toLowerCase().startsWith(begining.toLowerCase()))
                    props.add(ci.getCompletionProposal(offset - begining.length(), begining.length()));
            }
            CompletionItem ci = new NamedElementCompletionItem(p);
            if (ci.getCompletionText().toLowerCase().startsWith(begining.toLowerCase()))
                 props.add(ci.getCompletionProposal(offset - begining.length(), begining.length()));
        }
    	Collections.sort(props, cpCmp);
    }*/
    
    /***
     * Proposes the nested packages and owned type definitions for the package given
     * by <code>begining</code> string
     * @param doc the document contained by the text editor
     * @param offset the position of the cursor
     * @param props A list of proposals, initialized to empty list
     * @param begining The string to complete (should contain at least "::" substring)
     */
    private void addProposalsForPackages(IDocument doc, int offset, String begining) {
    	// Get the name of package
    	String pkg_name = begining.substring(1, begining.lastIndexOf("::"));
    	String short_name = ""; // can be class name or package name
    	if (begining.length() > begining.lastIndexOf("::") + 2) 
    		short_name = begining.substring(begining.lastIndexOf("::")+2);
    	
    	Package pkg = kermetaUnit.packageLookup(pkg_name);
    	// Get classdefinitions inside pkg
    	for (Object next : pkg.getOwnedTypeDefinition())
    	{
    		 TypeDefinition t = (TypeDefinition)next;
    		 CompletionItem ci = new NamedElementCompletionItem(t);
             if (short_name.length() == 0 ) 
            	 proposals.add(ci.getCompletionProposal(offset, 0));
    		 else if (ci.getCompletionText().toLowerCase().startsWith(short_name.toLowerCase())) {
                 proposals.add(ci.getCompletionProposal(offset - short_name.length(), short_name.length()));
             }
            	 
    	}
    	
    	// Get sub packages of this pkg
        for (Object next : pkg.getNestedPackage()) {
        	Package p = (Package)next;
        	CompletionItem ci = new NamedElementCompletionItem(p);
        	if (short_name.length() == 0) 
        		proposals.add(ci.getCompletionProposal(offset,0));
        	else if (ci.getCompletionText().toLowerCase().startsWith(short_name.toLowerCase()))
        		proposals.add(ci.getCompletionProposal(offset - short_name.length(), short_name.length()));
        }
        Collections.sort(proposals, cpCmp);
    }

	/** Comparator for CompletionProposals sorting. */
	static final Comparator cpCmp = new Comparator() {
	     public int compare(Object o1, Object o2) {
	         String s1 = ((CompletionProposal)o1).getDisplayString();
	         String s2 = ((CompletionProposal)o2).getDisplayString();
	         int len1 = s1.length();
	         int len2 = s2.length();
	         for (int i=0, n=Math.min(len1, len2); i<n; i++) {
	        	 char c1 = s1.charAt(i);
	        	 char c2 = s2.charAt(i);
	        	 if (c1 != c2)
	        		 return c1 - c2;
	         }
	          return len1 - len2;
	     }
	 };
    
}
