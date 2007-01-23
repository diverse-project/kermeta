/* $Id: KMT2KMPass7.java,v 1.1 2007-01-23 15:04:12 dvojtise Exp $
 * Project : Kermeta (First iteration)
 * File : KMT2KMPrettyPrinter.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 25, 2005
 * Author : zdrey
 * Description :
 *  The 7th pass to convert a KMT to KM, which consist to adding the commments 
 * in the code as annotation of the kermeta model elements
 * 
 * History :
 * 		06/06/05 Removed almost everything.
 * 		Now only @ and "/**" prefixed annotations are stored as tags.
 * 		TODO : now, visit all the annotable elements :
 * 		subPackageDecl, classDecl, enumDecl, parameters (?), enumLiteral, 
 * 		fAssignment (i.e any Expression?), blocks (when empty), require/using?
 */
package fr.irisa.triskell.kermeta.migrationv032_v040.loader.kmt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

//import fr.irisa.triskell.kermeta.ast.Annotableassertion;
//import fr.irisa.triskell.kermeta.ast.Assertion;
import fr.irisa.triskell.kermeta.language.behavior.Expression;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.AnnotableClassMemberDecl;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.AnnotableElement;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.Annotation;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.Annotations;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.ClassMemberDecl;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.ContextMultiLineComment;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.EnumLiteral;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.FAssignement;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.FBlock;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.Invariant;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.Operation;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.OperationExpressionBody;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.PackageDecl;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.Param;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.Postcondition;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.Precondition;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.Property;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.Tag;
import fr.irisa.triskell.kermeta.migrationv032_v040.ast.TopLevelDecl;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.modelhelper.OperationHelper;


/**
 * Pass that adds the comments (annotations) as tags of a model element (class, assignment,
 * operation).
 * How does it work :
 * 	- each grammar rule (see kermeta.ast) that is a sequence containing a annotationLst list 
 * corresponds to a model element that is "allowed" to contain Tags (Tag kermeta elements). So, for 
 * such model elements, we implement a specific visit() method. 
 */
public class KMT2KMPass7 extends KMT2KMPass {

    protected String fileData =  null;
    protected static Pattern pattern = Pattern.compile("[\t\\s]*[\r\n][\r\n\t\\s]*");
    public final static String KERMETA_DOCUMENTATION = "documentation";
    
	/**
	 * 
	 */
	public KMT2KMPass7(KermetaUnit builder) {
		super(builder);
		fileData = getFileContentFromBuilder();
	}


	/**
	 * Check the comments defined from the following kermeta.ast rules :
	 *
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ClassDecl)
	 */
	public boolean beginVisit(PackageDecl packageDecl) {
	    Annotations annLst = packageDecl.getAnnotations();
	    NamedElement element = (NamedElement)builder.getModelElementByNode(packageDecl);
	    processAnnotations(annLst, element);
	    return super.beginVisit(packageDecl);
	        
	}
	
	
    /**
     * @see fr.irisa.triskell.kermeta.migrationv032_v040.ast.KermetaASTNodeVisitor#beginVisit(fr.irisa.triskell.kermeta.migrationv032_v040.ast.Operation)
     */
    public boolean beginVisit(AnnotableClassMemberDecl node) {
        
   	
        Annotations annLst = node.getAnnotations();
        KermetaASTNode annNode = node.getClassMemberDecl();
        fr.irisa.triskell.kermeta.language.structure.Object e = null;
        String name = "";
        if (annNode instanceof Operation)
        {   
            name = ((Operation)annNode).getName().getText();
            e = ClassDefinitionHelper.findOperationByName(builder.current_class, name);
            builder.current_operation = (fr.irisa.triskell.kermeta.language.structure.Operation) e;
//            Annotableassertion annotableassertionNode = (Annotableassertion) ((Operation)annNode).getAssertions().getFirstChild();
//            if (annotableassertionNode != null) {
//				Assertion assertionNode = annotableassertionNode.getAssertion();
//
//				fr.irisa.triskell.kermeta.language.structure.Constraint c = null;
//				String nameAssertion = "";
//				if (assertionNode instanceof Precondition) {
//					nameAssertion = ((Precondition) assertionNode).getName()
//							.getText();
//					c = OperationHelper.findPreConditionByName(
//							builder.current_operation, nameAssertion);
//					builder.current_constraint = c;
//				} else if (assertionNode instanceof Postcondition) {
//					nameAssertion = ((Postcondition) assertionNode).getName()
//							.getText();
//					c = OperationHelper.findPostConditionByName(
//							builder.current_operation, nameAssertion);
//					builder.current_constraint = c;
//				}
//
//				if (c != null) { // we should have found the object
//									// however...
//					processAnnotations(annLst, c);
//					annLst = ((Operation) annNode).getAnnotations();
//				}
//			} 
            
        }
        else if (annNode instanceof Property)
        {	
       	    name = ((Property)annNode).getName().getText();
            e = ClassDefinitionHelper.findPropertyByName(builder.current_class, name);
            builder.current_property = (fr.irisa.triskell.kermeta.language.structure.Property) e;
        }
        else if (annNode instanceof Invariant) {
        	name = ((Invariant)annNode).getName().getText();
        	e = ClassDefinitionHelper.findInvariantByName(builder.current_class, name);
        	builder.current_constraint = (fr.irisa.triskell.kermeta.language.structure.Constraint) e;
        }
        
        if (e != null) // we should have found the object however...
            processAnnotations(annLst, e);
        return super.beginVisit(node);
        
        
//      modif JMM 	
    	
//    	Annotations annLst = null;
//        KermetaASTNode annNode = node;
//        fr.irisa.triskell.kermeta.language.structure.Object e = null;
//        String name = "";
//        if (annNode instanceof Operation)
//        {   
//            name = ((Operation)annNode).getName().getText();
//            e = ClassDefinitionHelper.findOperationByName(builder.current_class, name);
//            builder.current_operation = (fr.irisa.triskell.kermeta.language.structure.Operation) e;
//            annLst = ((Operation)annNode).getAnnotations();
//        }
//        else if (annNode instanceof Property)
//        {	
//       	    name = ((Property)annNode).getName().getText();
//            e = ClassDefinitionHelper.findPropertyByName(builder.current_class, name);
//            builder.current_property = (fr.irisa.triskell.kermeta.language.structure.Property) e;
//            annLst = ((Property)annNode).getAnnotations();
//        }
//        else if (annNode instanceof Invariant) {
//        	name = ((Invariant)annNode).getName().getText();
//        	e = ClassDefinitionHelper.findInvariantByName(builder.current_class, name);
//        	builder.current_constraint = (fr.irisa.triskell.kermeta.language.structure.Constraint) e;
//        	annLst = ((Invariant)annNode).getAnnotations();
//        }
//        
//        if (e != null) // we should have found the object however...
//            processAnnotations(annLst, e);
//        return super.beginVisit(node);
    }
    
    /**
     * @see fr.irisa.triskell.kermeta.ast.KermetaASTNodeVisitor#beginVisit(fr.irisa.triskell.kermeta.ast.Annotableassertion)
     */
/* DVK: removed because doesn't exist in v0.3.x
     public boolean beginVisit(Annotableassertion node) {
        
   	
        Annotations annLst = node.getAnnotations();
        KermetaASTNode annNode = node.getAssertion();
        fr.irisa.triskell.kermeta.language.structure.Constraint c = null;
        String name = "";
        if (annNode instanceof Precondition)
        {   
            name = ((Precondition)annNode).getName().getText();
            c = OperationHelper.findPreConditionByName(builder.current_operation, name);
            builder.current_constraint = c;
        }
        else if (annNode instanceof Postcondition)
        {	
       	    name = ((Postcondition)annNode).getName().getText();
            c = OperationHelper.findPostConditionByName(builder.current_operation, name);
            builder.current_constraint = c;
        }
        
        if (c != null) // we should have found the object however...
            processAnnotations(annLst, c);
        return super.beginVisit(node);
    }
   */ 
    
    
    /** 
     * @see fr.irisa.triskell.kermeta.migrationv032_v040.ast.KermetaASTNodeVisitor#beginVisit(fr.irisa.triskell.kermeta.migrationv032_v040.ast.FAssignement)
     */
    public boolean beginVisit(FAssignement fAssignment) {
        
        Annotations annLst = fAssignment.getAnnotations();
        processAnnotationsForExpression(annLst, null);
        return super.beginVisit(fAssignment);
    }
    
    public boolean beginVisit(FBlock block)
    {
     //   Annotations annLst = block.getBlockAnnotations();
      //  System.err.println("a block : "+annLst.getChildCount());
      //  processAnnotationsForExpression(annLst, null);
        return super.beginVisit(block);
    }
    
    
    /**
     * To be deprecated
     */
    public boolean beginVisit(Param node)
    {
        Annotations annLst = node.getAnnotations();
        processAnnotationsForExpression(annLst, null);
        return false;
    }
    
    /** To be depr. */
    public boolean beginVisit(EnumLiteral node)
    {        Annotations annLst = node.getAnnotations();
            processAnnotationsForExpression(annLst, null);
            return false;
     
    }
    
	/**
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.OperationExpressionBody)
	 */
	public boolean beginVisit(OperationExpressionBody operationExpressionBody) {
		//String qname = builder.getQualifiedName(builder.current_operation);
		return false;
	}

	
/* for test purpose
    public boolean beginVisit(ContextMultiLineComment node)
    {
        System.err.println("comment:"+node.getLastChild().getText());
        return false;
    }
	
	public boolean beginVisit(Tag tag)
	{
	    System.err.println("tags : "+tag.getLastChild().getText());
	    return false;
	}
*/    
    
  /**
	 * 
	 * Rules :
	 * 
	 * sequence topLevelDecl : annotations annotableElement ;
	 * abstract annotableElement : subPackageDecl | classDecl | enumDecl | dataTypeDecl;
	 *  
	 * 	- classDecl contains classMemberDecls
	 *  - classMemberDecls : classMemberDecl* 
	 *  - classMemberDecl : annotation | property | operation
	 * This last rule allows a class to contain an annotation whereas it has
	 * no operation nor class 
	 * */
    public boolean beginVisit(TopLevelDecl topLevelDecl)
    {
        
        Annotations annLst = topLevelDecl.getAnnotations();
        // Get the annotable element associated
        AnnotableElement annElt = topLevelDecl.getAnnotableElement();
        NamedElement e = (NamedElement)builder.getModelElementByNode(annElt);
	    // Add the found annotations to this element
        if (e instanceof ClassDefinition)
        {
            builder.current_class = (ClassDefinition)e;
            processAnnotations(annLst, e);
        }
        else if (e instanceof Package)
        {
            builder.current_package = (Package)e;
            processAnnotations(annLst, e);
        }
        else if (e instanceof PrimitiveType)
        {
            PrimitiveType ptype = (PrimitiveType)builder.getModelElementByNode(annElt);
            processAnnotations(annLst, ptype);
        }
	    
        return super.beginVisit(topLevelDecl);
    }
    
    
	/**
	 * As skipped tokens are not accessible through ANTLR generated parser, we load the entire
	 * file (this is a patchy method...) and get the chars at the given position
	 * @return fileData filled (it is an attribute of this class)
	 */
	public String getFileContentFromBuilder() {
	    
	    String str_uri = builder.getUri();
	    StringBuffer result = new StringBuffer();
	    
	    try 
	    {
	         URI _uri = URI.createURI(str_uri);
	 		 URIConverter converter = new URIConverterImpl();
	         
	 		 BufferedReader r = new BufferedReader(
	 		        new InputStreamReader(converter.createInputStream(_uri)));
	 		 
	         while (r.ready()) {
	            char[] c = {(char)r.read()};
	            String sc = (c[0]=='\t')?"    ":new String(c);
	            result.append(sc);
	            //result += r.readLine() + "\r\n"; // FIXME : new line character is OS dependant.
	        }
	        r.close();
	    } catch (FileNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
		return result.toString();
	}
	
	/**
	 * Create a tag from a single annotation
	 * @param a
	 * @return
	 */
	public fr.irisa.triskell.kermeta.language.structure.Tag createFTagFromAnnotation(Annotation a)
	{
	    String tag_value = "";
        String tag_name = KERMETA_DOCUMENTATION;
        if (Tag.class.isInstance(a))
        {
            tag_name  = ((Tag)a).getName().getFirstChild().getText();
            tag_value = ((Tag)a).getVal().getText();
        }
        else
        {
            tag_value = a.getFirstChild().getText();
        }
        fr.irisa.triskell.kermeta.language.structure.Tag tag = builder.struct_factory.createTag();
	    tag.setName(tag_name);
        tag.setValue(tag_value);
	    return tag;
	}
	
	/**
	 * Create a list of Tags from annLst, add it to the current_class tags and
     * to the builder tag list.
	 * @param annLst the list of annotations to process
	 * @param annType the name of the tag that will be defined with annotations text 
	 * (in @annType annotation)
	 * @param refnode
	 */
	protected void processAnnotations(Annotations annLst, fr.irisa.triskell.kermeta.language.structure.Object element)
	{
	    String tag_name = KERMETA_DOCUMENTATION;
	    String tag_value = null;
	        
	   // Resource resource;
	    fr.irisa.triskell.kermeta.language.structure.Tag tag = null;
	    int i = 0;
	    // tagStack.push(tag)? // 
	    if (annLst!=null && annLst.hasChildren())
	    {
	    	for (i=0; i<annLst.getChildCount();i++)
	    	{
	    		Annotation a = (Annotation)annLst.getChild(i);
	    		
	    		boolean foundSpecialTag = false;
	    		if (a instanceof Tag) {
	    			String tagName = ((Tag)a).getName().getFirstToken().getText();
	    		
	    			// check if the tag is @mainOperation or @mainClass
	    			if (	tagName.equals("mainClass") ||
	    					tagName.equals("mainOperation") ) {
	    				// check if the element already contains the tag.
	    				// if yes, then we do not add the tag
	    				EList elementTag = element.getTag();
	    				Iterator it = elementTag.iterator();
	    			
	    				while ( !foundSpecialTag && it.hasNext()) {
	    					fr.irisa.triskell.kermeta.language.structure.Tag  existingTag = (fr.irisa.triskell.kermeta.language.structure.Tag) it.next();
	    					if (existingTag.getName().equals(tagName)) foundSpecialTag = true;
	    				}
	    			}
	    		}
	    		
	    		if ( ! foundSpecialTag ) {
	    			// Create the Tag in kcore repr.
	    			tag = builder.struct_factory.createTag();
	    			if (Tag.class.isInstance(a))
	    			{
	    				tag_name  = ((Tag)a).getName().getFirstChild().getText();
	    				String str = ((Tag)a).getVal().getText();
	    				tag_value = str.substring(1, str.length()-1);
	    			}
	    			else
	    			{	// note : the concrete syntax -- /** */ -- is kept
	    				tag_name = KERMETA_DOCUMENTATION;
	    				tag_value  = ((ContextMultiLineComment)a).getFirstChild().getText();
	    			}
	    		
	    			tag.setName(tag_name);
	    			tag.setValue(tag_value);
	    			element.getTag().add(tag);
	    		}
	    	}
	    }
	}
	
	
	/**
	 * Create a list of Tags from annLst, add it to the current_class tags and
     * to the builder tag list.
	 * @param annLst the list of annotations to process
	 * @param annType the name of the tag that will be defined with annotations text 
	 * (in @annType annotation)
	 * @param refnode
	 */
	protected void processAnnotationsForExpression(Annotations annLst, Expression element)
	{
	    String tag_name = KERMETA_DOCUMENTATION;
	    String tag_value = null;
	    
	   // Resource resource;
	    fr.irisa.triskell.kermeta.language.structure.Tag tag = null;
	    int i = 0;
	    // tagStack.push(tag)? // 
	    if (annLst!=null && annLst.hasChildren())
	    {
	    	for (i=0; i<annLst.getChildCount();i++)
	    	{
	    		Annotation a = (Annotation)annLst.getChild(i);
	    		// Create the Tag in kcore repr.
    			tag = builder.struct_factory.createTag();
	    		if (Tag.class.isInstance(a))
	    		{
	    			tag_name  = ((Tag)a).getName().getFirstChild().getText();
	    			String str = ((Tag)a).getVal().getText();
	    			tag_value = str.substring(1, str.length()-1);
	    		}
	    		else
	    		{	// note : the concrete syntax -- /** */ -- is kept
	    		    tag_name = KERMETA_DOCUMENTATION;
	    			tag_value  = ((ContextMultiLineComment)a).getFirstChild().getText();
	    		}
	    		tag.setName(tag_name);
    			tag.setValue(tag_value);
	    		//element.getTag().add(tag);
	    	}
	    }
	}

}
