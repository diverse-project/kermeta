/* $Id: KMT2KMPass7.java,v 1.9 2005-03-31 15:24:56 zdrey Exp $
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
	
	
	In a first time we will consider the following more simple rules:
	
	* a space between a post annotation list and its class -> post is a pre
	* a space inside a post annotation list -> cut it into 2 sets of annotations.
 */
package fr.irisa.triskell.kermeta.loader.kmt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import com.ibm.eclipse.ldt.core.ast.ASTNode;
//import com.sun.rsasign.t;

import fr.irisa.triskell.kermeta.ast.*;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FTag;
import fr.irisa.triskell.kermeta.utils.UserDirURI;

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
    /* The annotationsList of precding_annLst as an array of FTags*/
    protected ArrayList preceding_annArrayList = new ArrayList();
    protected FClassDefinition preceding_class;
    protected String fileData =  null;
    protected static Pattern pattern = Pattern.compile("[\t\\s]*[\r\n][\r\n\t\\s]*"); 
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
	    /* left annotations, and right annotations 
	     * FIXME FIXME : this code does not work as we want anymore!
	     * */
	    Annotations preAnnLst  = null ;
	    Annotations postAnnLst = classDecl.getPostAnnotations();
	    
	    /* If preAnnLst is too far away from classDecl
	     * we need to get preceding classDecl and attach it to this preceding one
	     */
	    //System.out.print("Classe:"+builder.current_class.getFName());

	    // If preceding_annLst is null, it means that our parser won't find a preAnnLst (null as well so) 
	    if (preceding_annArrayList.size()>0)
	    {
	        processFTagArrayList(preceding_annArrayList);
	        preceding_annArrayList.clear();
	    }
	    
	    /* ------------ process the pre-annotations */
	    processAnnotations(preAnnLst, PRE_TAGNAME, null);

	    /* ------------ process the post annotations */
	    // Get the chars between current class and its post annotation
	    int class_end = classDecl.getChild(getBeforeLastChildPosition(classDecl)).getRangeEnd();
	    
	    int posta_start = -1;
	    if (postAnnLst.getChildCount()>0 && class_end < fileData.length())
	    {
	        posta_start = postAnnLst.getRangeStart();
	        // Do we have any separating char between post annotation and class end?
	        if (posta_start-class_end>0)
	        {
	            String spacelines = fileData.substring(class_end, posta_start-1);
	            // If there is at least one new line between post annotation and its class
	            // then we do not consider it as a post annotation
	            if (pattern.matcher(spacelines).matches())
	            {
	                preceding_annLst = postAnnLst; 
	            }
	            else
	            {
	                // Do we have spacelines *inside* this postAnnList (between two Annotation objects)
	                
	                ArrayList[] annArrayList = createFTagFromAnnotationLst(postAnnLst);
	                preceding_annArrayList = annArrayList[1];
	                this.processFTagArrayList(annArrayList[0]);
	            }
	        }
	    }
	    return super.beginVisit(classDecl);
	        
	}
	
	public Annotations[] cutAnnotationLst(Annotations annLst)
	{
	    Annotations[] annArray = new Annotations[2];
	    
	    return annArray;
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
	    if (classDecl.getChildCount() > 1 && classDecl.getLastChild() != null)
	        count = classDecl.getChildCount()-2;
	    	
	    else if ((classDecl.getChildCount() > 1 && classDecl.getLastChild()==null)||classDecl.getChildCount()==1)
	        count = classDecl.getChildCount()-1;
	    else 
	        count = 0;
	    //System.out.println("count vaut :"+ count+ classDecl.getChild(count).getText());
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
			URI _uri = UserDirURI.createURI(str_uri,null,false);
	         BufferedReader r = new BufferedReader(
	   	         new InputStreamReader(new FileInputStream(new File(_uri.toFileString()))));
	        
	        while (r.ready()) {
	            char[] c = {(char)r.read()};
	            String sc = (c[0]=='\t')?" ":new String(c);
	            result += sc;
	            //result += r.readLine() + "\r\n"; // FIXME : new line are not same according to the filetype..
	            //System.getProperty("line.separator").length(); 
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
	 * @return an Array that contains 2 lists, one for the tags that belong
	 * If there is one or more lines separating the annotation list (Annotations), we consider
	 * that we have 2 list of tags : one list for the current class (if there is one), as "post" tags,
	 * and one for the next class, as "pre" tags;
	 */
	public ArrayList[] createFTagFromAnnotationLst(Annotations annLst)
	{
	    boolean isDouble = false;
	    ArrayList ftagLstPre = new ArrayList(); // list of post tags
	    ArrayList ftagLstPost = new ArrayList();// list of pre tags (for following class)
	    ArrayList[] ftagLstArray = new ArrayList[2];
	    Annotation prec_a = null; // the preceding annotation
	    String tag_value = "";
	    //String tag_name = name;
	    String tag_name = "";
	    String spacelines = "";
	    String tag_value1 = ""; String tag_value2 = "";
        ASTNode[] children = annLst.getChildren();
        FTag tag;
        
        // Get each single annotation
        for (int i=0; i< annLst.getChildCount(); i++) // children.length
        {
            if (i>0) prec_a = (Annotation)children[i-1];
            Annotation a = (Annotation)children[i];
            // Space between Annotation elements
            int sep = (prec_a!=null)?(prec_a.getRangeEnd() - a.getRangeStart()):0;
            spacelines = (sep>0)?fileData.substring(a.getRangeStart()-prec_a.getRangeEnd()):"";
            
            // The first separator found inside the annotationLst is enough to decide that
            // its preceding part is a postTag for current Class and its following one is a preTag
            // for the following class
            if (pattern.matcher(spacelines).matches() || isDouble == true)
            {
                if (isDouble == false)
                {
                    tag_value = "";
                }
                isDouble = true;
                if (Tag.class.isInstance(a))
                {
                    tag_name  = ((Tag)a).getName().getFirstChild().getText();
                    tag_value = ((Tag)a).getVal().getText();
                    tag = builder.struct_factory.createFTag();
                    tag.setFName(tag_name); tag.setFValue(tag_value);
                    // add the tag the second list of tags
                    ftagLstPre.add(tag);
                    
                }
                // A multiline comment? [tested] FIXME : many juxt. single lines are 1 tag
                // We assume that user commented in a tidy way. We reassemble here all
                // comments that are not @tags in a unique tag. This is one of the many
                // choices that we could make.
                else
                {
                    
                    tag_value2 += a.getFirstChild().getText() + "\n";
                }
            }
            else
            {
      //          System.out.println("No double annotation");
                if (Tag.class.isInstance(a))
                {
                    tag_name  = ((Tag)a).getName().getFirstChild().getText();
                    tag_value = ((Tag)a).getVal().getText();
                    tag = builder.struct_factory.createFTag();
                    tag.setFName(tag_name); tag.setFValue(tag_value);
                    // add the tag the first list of tags
                    ftagLstPost.add(tag);
                }
                // A multiline comment? [tested]
                else
                {
                    tag_value2 += a.getFirstChild().getText();
                }
            }
        }
        // Create one FTag for each assembled tag_value
        if (tag_value1 != "")
        {
            tag = builder.struct_factory.createFTag();
            tag.setFName(POST_TAGNAME); tag.setFValue(tag_value1);
            ftagLstPost.add(tag);
        }
        if (tag_value2 != "")
        {
            tag = builder.struct_factory.createFTag();
            tag.setFName(PRE_TAGNAME); tag.setFValue(tag_value2);
            ftagLstPre.add(tag);
        }
        // remember : post tags for current class, pre tags for next class
        ftagLstArray[0] = ftagLstPost; ftagLstArray[1] = ftagLstPre;
        
        return ftagLstArray;
	}
	
	
	public FTag createFTagFromAnnotation(Annotation a)
	{
	    String tag_value = "";
        String tag_name = "ann";
	//    System.out.println("COMMENTAIRES :"+a.getFirstChild().getText());
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
	    {/*
	        ArrayList[] tagListArray = this.createFTagFromAnnotationLst(annLst, annType);
            builder.current_class.getFTag().add(tag);
	        map_put(tagListArray[0]);// FIXME : tag.toStirng() is not a relevant key...
	        map_put(tagListArray[1]);*/
	    }
	    
	    
	    
	    return tag;
	}
	
	/**
	 * Add the tags to current visited class
	 * @param annALst
	 * @param refnode
	 */
	protected void processFTagArrayList(ArrayList annALst)
	{
	    map_put(annALst);
	}
	
	protected void map_put(ArrayList tagLst)
	{
	    Iterator it = tagLst.iterator();
	    while (it.hasNext())
	    {
	        FTag tag = (FTag)it.next();
	        builder.current_class.getFTag().add(tag);
	        builder.tags.put(tag.toString(), tag);
	    }
	}
	

}
