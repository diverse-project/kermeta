/* $Id: KMT2KMPass7.java,v 1.2 2005-03-01 17:17:54 zdrey Exp $
 * Project : Kermeta (First iteration)
 * File : KMT2KMPass7.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Feb 25, 2005
 * Author : zdrey
 * Description :
 *  The 7th pass to convert a KMT to KM, which consist to adding the commments 
 * in the code as annotation of the kermeta model elements
 * 
 * TODO :
 * 	1. Get the annotations associated to each operation and print it
 *  2. Get the annotations juxtaposed (no space)
 * 
 * We assume, until I don't know when, that the following rules :
 * ----------------------
 * 	class someclass1
 *  n1* whitespace
 *  c1
 *  n2* whitespace
 *  c2
 *  n3* whitespace
 *  class someclass2
 *  -----------------------
 *  n1 > n3 : // c2 belongs to the element "someclass1"
	n1 < n3 : //c1 belongs to the element "someclass1"
	
the above rules dominate the below ones :
	n1 > n3 and n2 > n1 : // c1 belongs to "someclass1"
	n1 > n3 and n1 > n2 : // c1 belongs to "someclass2"
	n1 < n3 and n2 < n3 : // c2 belongs to "someclass1"
	n1 < n3 and n2 > n3 : // c2 belongs to "someclass2"
 * 
 * 
 * NOTE :
 *   - there is a main problem that I m unable to resolve yet : 
 * I don't know where some annotations have disappeared, thought I implemented the visitor for Annotation...
 * A reason : the annotation is stored as another object than "annotation" object itself
 * 
 * FIXME (?) :
 * 	- getText(), which is supposed to be the method to access the textual representation of something
 * (so, we expect that we can use it one any annotation, because this is finally only a text),
 * is not "applicable" to any ASTnode...
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import java.util.Iterator;
import java.util.Stack;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import com.sun.rsasign.t;

import fr.irisa.triskell.kermeta.ast.Annotation;
import fr.irisa.triskell.kermeta.ast.Annotations;
import fr.irisa.triskell.kermeta.ast.AsingleExpression;
import fr.irisa.triskell.kermeta.ast.ClassDecl;
import fr.irisa.triskell.kermeta.ast.ClassMemberDecl;
import fr.irisa.triskell.kermeta.ast.DataTypeDecl;
import fr.irisa.triskell.kermeta.ast.EnumDecl;
import fr.irisa.triskell.kermeta.ast.EnumLiteral;
import fr.irisa.triskell.kermeta.ast.FAssignement;
import fr.irisa.triskell.kermeta.ast.FBlock;
import fr.irisa.triskell.kermeta.ast.FExpression;
import fr.irisa.triskell.kermeta.ast.GetterBody;
import fr.irisa.triskell.kermeta.ast.MultiLineComment;
import fr.irisa.triskell.kermeta.ast.Operation;
import fr.irisa.triskell.kermeta.ast.OperationAnnotationBody;
import fr.irisa.triskell.kermeta.ast.OperationEmptyBody;
import fr.irisa.triskell.kermeta.ast.OperationExpressionBody;
import fr.irisa.triskell.kermeta.ast.PackageDecl;
import fr.irisa.triskell.kermeta.ast.Param;
import fr.irisa.triskell.kermeta.ast.ScompUnit;
import fr.irisa.triskell.kermeta.ast.SetterBody;
import fr.irisa.triskell.kermeta.ast.SingleLineComment;
import fr.irisa.triskell.kermeta.ast.SubPackageDecl;
import fr.irisa.triskell.kermeta.ast.Tag;
import fr.irisa.triskell.kermeta.ast.TopLevelDecl;
import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.expression.ExpressionParser;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FParameter;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTag;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;


/**
 * Pass that adds the comments (annotations) as tags of a model element (class, assignment,
 * operation)  
 * 
 */
public class KMT2KMPass7 extends KMT2KMPass {

    protected Stack tagStack;
	/**
	 * 
	 */
	public KMT2KMPass7(KermetaUnit builder) {
		super(builder);
		tagStack = new Stack();
	}


	/**
	 * Check the comments defined from the following kermeta.ast rules :
	 *
	 * @see kermeta.ast.MetacoreASTNodeVisitor#beginVisit(metacore.ast.ClassDecl)
	 */
	public boolean beginVisit(ClassDecl classDecl) {
	    
	    /* Get the corresponding kermeta object */
	    builder.current_class = (FClassDefinition)builder.getModelElementByNode(classDecl);
	    /* left annotations, and right annotations*/
	    Annotations preAnnLst  = classDecl.getPreAnnotations();
	    Annotations postAnnLst = classDecl.getPostAnnotations();

	    System.out.println("Class is : "+ builder.current_class.getFName());
	    System.out.println(builder.current_class.getFName()+ ":"+ preAnnLst.getChildCount());
	    
	    /* If preAnnLst is too far away from classDecl
	     * we need to get preceding classDecl and attach it to this preceding one
	     */
	    this.processAnnotations(preAnnLst, PRE_TAGNAME);
	    this.processAnnotations(postAnnLst, POST_TAGNAME);
	    
        return super.beginVisit(classDecl);
	}


/*
    
	public boolean beginVisit(Annotations annLst)
	{
        if (annLst!=null && annLst.getChildCount()>0)
        {
            FTag tag = this.createFTagFromAnnotationLst(annLst, "orphan");
            if (!builder.tags.containsKey(tag.toString())) {
                builder.tags.put(tag.toString(), tag);
            }
            else System.err.println("oups, duplicate tag..");
        }    
		return super.beginVisit(annLst);
	}
*/	
	/*public boolean beginVisit(Annotation annotation)
	{
        if (annotation!=null)
        {
    	    FTag tag = createFTagFromAnnotation(annotation);
    	    // Define an Id for tag, so that we can find it easilier?.
    	    String tagkey = tag.toString();
    		if (!builder.tags.containsKey(tagkey)) {
    			builder.tags.put(tagkey, tag);
    		}
    		else System.out.println("oups, duplicate tag..");
        }    
		return super.beginVisit(annotation);
	}
	*/
	
	/**
	 * 
	 * @param annLst The annotation list from which we get the Tag value
	 * @param name the name of the tag 
	 * @return a FTag KMElement
	 * TODO :
	 *    - annLst can contain the post Annotations of the preceding classDeclaration.
	 * We have to manage it correctly later.
	 * Idea : get the end-range of preceding class : 
	 *  n1 = end-range postAnnLst minus begin-range this preAnnLst
	 * OR
	 *  n1bis = end-range of preceding classDecl minus begin-range of this preAnnLst
	 * 
	 * ???? n2 = greatest(number-of-empty-lines inside this preAnnLst??)  
	 */
	public FTag createFTagFromAnnotationLst(Annotations annLst, String name)
	{
	    String tag_value = "";
	    String tag_name =name;
        ASTNode[] children = annLst.getChildren();
        
        // annLst.getChildCount TODO->unseparate <annotation> eleemnts only are added.
        // "unseparate" means that the number of separating emtpy-lines is < to the number
        // of lines after the postAnnotationList of the preceding class
        for (int i=0; i< annLst.getChildCount(); i++) // children.length
        {
            Annotation a = (Annotation)children[i];
            if (Tag.class.isInstance(a))
            {
                tag_name  = ((Tag)a).getName().getFirstChild().getText();
                tag_value += ((Tag)a).getVal().getText();
            }
            // A multiline comment? [tested]
            else
            {
                tag_value += a.getFirstChild().getText();
            }
            
            
        }
        FTag tag = builder.struct_factory.createFTag();
        System.out.println("VALUE {"+ tag_name + "}:"+tag_value);
        tag.setFName(name);
        tag.setFValue(tag_value);
	    return tag;
	}
	
	public FTag createFTagFromAnnotation(Annotation a)
	{
	    String tag_value = "";
        String tag_name = "ann";
	    System.out.println("COMMENTAIRES :"+a.getFirstChild().getText());
        // Is it a Tag? [tested]
        if (Tag.class.isInstance(a))
        {
            tag_name  = ((Tag)a).getName().getFirstChild().getText();
            tag_value = ((Tag)a).getVal().getText();
        }
        // A multi/singleline comment? [tested]
        else
        {
            tag_value = a.getFirstChild().getText();
        }
	    FTag tag = builder.struct_factory.createFTag();
	    tag.setFName(tag_name);
        tag.setFValue(tag_value);
	    return tag;
	}

	/**
	 * Create a Tag from annLst, add it to the current_class tags and
     * to the builder tag list.
	 * @param annLst the list of annotations
	 * @param annType the name of the tag that will be defined with annotations text 
	 * (like "pre", "post", "orphan")
	 */
	protected FTag processAnnotations(Annotations annLst, String annType)
	{
	    FTag tag = null;
	    // tagStack.push(tag)? // 
	    if (annLst!=null && annLst.hasChildren())
	    {
	        tag = this.createFTagFromAnnotationLst(annLst, annType);
            builder.current_class.getFTag().add(tag);
	        builder.tags.put(tag.toString(), tag);// FIXME : tag.toStirng() is not a relevant key...
	    }
	    return tag;
	}

}
