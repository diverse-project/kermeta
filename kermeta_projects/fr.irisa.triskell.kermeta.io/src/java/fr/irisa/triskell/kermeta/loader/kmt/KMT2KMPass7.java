/* $Id: KMT2KMPass7.java,v 1.3 2005-03-02 16:55:10 zdrey Exp $
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
 * We assume, until I don't know when, that the following rules :
 * ----------------------
 * 	class someclass1
 *  n1*whitespace
 *  c1
 *  n2*whitespace
 *  c2
 *  n3*whitespace
 *  class someclass2
 *  -----------------------
 *  n1 > n3 : // c2 C "someclass1" ;	n1 < n3 : //c1 C "someclass1"
 *  the above rules dominate the below ones :
	n1 > n3 and n2 > n1 : // c1 C "someclass1, n1 > n3 and n1 > n2 : // c1 C "someclass2"
	n1 < n3 and n2 < n3 : // c2 C "someclass1", n1 < n3 and n2 > n3 : // c2 C "someclass2"
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
import com.sun.rsasign.t;

import fr.irisa.triskell.kermeta.ast.*;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FTag;

/**
 * Pass that adds the comments (annotations) as tags of a model element (class, assignment,
 * operation).
 * How does it work :
 * 	- each grammar rule (see kermeta.ast) that is a sequence containing a annotationLst list 
 * corresponds to a model element that is "allowed" to contain Tags (FTag kermeta elements). So, for 
 * such model elements, we implement a specific visit() method. 
 */
public class KMT2KMPass7 extends KMT2KMPass {

    protected Stack tagStack;
    protected Annotations preceding_annLst = null; // we need it to "position" it as a pre-tag for preceding class or a post tag for next class (current class)
    protected FClassDefinition preceding_class;
    protected String fileData =  null;
	/**
	 * 
	 */
	public KMT2KMPass7(KermetaUnit builder) {
		super(builder);
		tagStack = new Stack();
		fileData = getFileContentFromBuilder();
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
	    
	    /* If preAnnLst is too far away from classDecl
	     * we need to get preceding classDecl and attach it to this preceding one
	     */
	    System.out.print("Classe:"+builder.current_class.getFName());

	    // If preceding_annLst is null, it means that our parser won't find a preAnnLst (null as well so) 
	    preAnnLst = (preceding_annLst!=null)?preceding_annLst:preAnnLst;
	    this.processAnnotations(preAnnLst, PRE_TAGNAME, (ASTNode)classDecl);
	    
	    // if space between post-annotation and this class end is not one or more new
	    java.util.regex.Pattern p = java.util.regex.Pattern.compile("\n[\n\r]+");
	   // java.util.regex.Matcher m = p.matcher("aaaaab");
	   // boolean b = m.matches();
	    // Get the chars between current class and its post annotation
	     
	    int class_end = classDecl.getChild(getBeforeLastChildPosition(classDecl)).getRangeEnd();
	    int posta_start = postAnnLst.getRangeStart();
	    // TODO : find out what the chars betwxeen class_end and posta_start are.
	    //System.out.println("class end:"+class_end-1+" - post start:"+posta_start-1);
	    System.out.println("post_dfsdf:"+postAnnLst.getFirstChild().getFirstChild().getText());
	    System.out.println(fileData.charAt(class_end));
	    String spacelines = fileData.substring(class_end, posta_start);
	    
	    // If there is at least one new line between post annotation and its class
	    // then we do not consider it as a post annotation
	    if (p.matcher(spacelines).matches())
	    {
	        preceding_annLst = postAnnLst; 
	    }
	    else
	    {
	        preceding_annLst = null;
		    this.processAnnotations(postAnnLst, POST_TAGNAME, (ASTNode)classDecl);
	    }
	    
	    return super.beginVisit(classDecl);
	}

	/**
	 * Get the before-lastchild position for the given file
	 * TODO : extend it to any ASTNode
	 * @param node
	 * @return the before-lastchild position
	 */
	public int getBeforeLastChildPosition(ClassDecl classDecl)
	{
	    int count = 0;
	    if (classDecl.getChildCount() > 1 ) //&& classDecl.getLastChild() != null)
	        count = classDecl.getChildCount()-2;
	    else if ((classDecl.getChildCount() > 1 && classDecl.getLastChild()!=null)||classDecl.getChildCount()==1)
	        count = classDecl.getChildCount()-1;
	    else 
	        count = 0;
	    return count;
	}
	
	/**
	 * As skipped tokens are not accessible through ANTLR generated parser, we load the entire
	 * file (this is a patchy method...) and get the chars at the given position
	 * @return fileData filled (it is an attribute of this class)
	 */
	public String getFileContentFromBuilder() {
	    
	    String str_uri = builder.getUri();
	    String result = "";
	    try {
	      //  BufferedReader r = new BufferedReader(new FileReader(uri));
	        			
	         URIConverter converter = new URIConverterImpl();
	         BufferedReader r = new BufferedReader(
	         new InputStreamReader(converter.createInputStream(URI.createURI(str_uri))));
	        
	        while (r.ready()) {
	            result += r.readLine() + "\n";
	        }
	        r.close();
	    } catch (FileNotFoundException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	 
		return result;
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
	    Annotation prec_a = null; // the preceding annotation
	    String tag_value = "";
	    String tag_name =name;
        ASTNode[] children = annLst.getChildren();
        
        // annLst.getChildCount TODO->unseparate <annotation> eleemnts only are added.
        // "unseparate" means that the number of separating emtpy-lines is < to the number
        // of lines after the postAnnotationList of the preceding class
        for (int i=0; i< annLst.getChildCount(); i++) // children.length
        {
            if (i>0) prec_a = (Annotation)children[i-1];
            Annotation a = (Annotation)children[i];
            /*if (a!=null) System.out.println(
                    "offset:"+a.getRangeLength()+"=="+"text:"+a.getTextLength()+
                    ".   beg:"+a.getRangeStart()+"-cur_beg:"+a.getRangeEnd());
                    */
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
        System.out.println("list start : "+annLst.getRangeStart());
        
        System.out.println("content : ["+tag_value+"]");
        FTag tag = builder.struct_factory.createFTag();
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
	protected FTag processAnnotations(Annotations annLst, String annType, ASTNode refnode)
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
