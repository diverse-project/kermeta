/* $Id: KMT2KMPass7.java,v 1.12 2005-06-06 10:29:52 zdrey Exp $
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
package fr.irisa.triskell.kermeta.loader.kmt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

//import com.sun.rsasign.t;

import fr.irisa.triskell.kermeta.ast.*;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FNamedElement;
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
	public boolean beginVisit(PackageDecl packageDecl) {
	    Annotations annLst = packageDecl.getAnnotations();
	    FNamedElement pkg = (FNamedElement)builder.getModelElementByNode(packageDecl);
	    processAnnotations(annLst, pkg);
	    return super.beginVisit(packageDecl);
	        
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
			//URI _uri = UserDirURI.createURI(str_uri,null,false);
	         //BufferedReader r = new BufferedReader(
	   	     //    new InputStreamReader(new FileInputStream(new File(_uri.toFileString()))));
	        
	       
	         URI _uri = URI.createURI(str_uri);
	 		 URIConverter converter = new URIConverterImpl();
	         
	 		 BufferedReader r = new BufferedReader(
	 		        new InputStreamReader(converter.createInputStream(_uri)));
	 		 
	         
	         while (r.ready()) {
	            char[] c = {(char)r.read()};
	            String sc = (c[0]=='\t')?"    ":new String(c);
	            result += sc;
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
		return result;
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
	 * Create a list of FTags from annLst, add it to the current_class tags and
     * to the builder tag list.
	 * @param annLst the list of annotations to process
	 * @param annType the name of the tag that will be defined with annotations text 
	 * (in @annType annotation)
	 * @param refnode
	 */
	protected void processAnnotations(Annotations annLst, FNamedElement element)
	{
	    String tag_name = null;
	    String tag_value = null;
	    FTag tag = null;
	    int i = 0;
	    // tagStack.push(tag)? // 
	    if (annLst!=null && annLst.hasChildren())
	    {
	    	for (i=0; i<annLst.getChildCount();i++)
	    	{
	    		Annotation a = (Annotation)annLst.getChild(i);
	    		if (Tag.class.isInstance(a))
	    		{
	    			tag_name  = ((Tag)a).getName().getFirstChild().getText();
	    			tag_value = ((Tag)a).getVal().getText();
	    			// Create the FTag in kcore repr.
	    			tag = builder.struct_factory.createFTag();
	    			tag.setFName(tag_name);
	    			tag.setFValue(tag_value);
	    			element.getFTag().add(tag);
	    		}
	    	}
	    }
	}
	


}
