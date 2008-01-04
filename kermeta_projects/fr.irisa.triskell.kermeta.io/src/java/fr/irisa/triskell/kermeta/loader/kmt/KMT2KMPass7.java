/* $Id: KMT2KMPass7.java,v 1.39 2008-01-04 14:17:24 dvojtise Exp $
 * Project : Kermeta (First iteration)
 * File : KMT2KMPrettyPrinter.java
 * License : EPL
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


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.loader.LoadingContext;

import fr.irisa.triskell.kermeta.parser.gen.ast.ContextMultiLineComment;
import fr.irisa.triskell.kermeta.parser.gen.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.parser.gen.ast.PackageDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.Tag;
import fr.irisa.triskell.kermeta.parser.helper.KermetaASTHelper;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Object;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.modelhelper.ModelingUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.TagHelper;


/**
 * Pass that adds the comments (annotations) as tags of a model element (class, assignment,
 * operation).
 * How does it work :
 * 	- each grammar rule (see kermeta.ast) that is a sequence containing a annotationLst list 
 * corresponds to a model element that is "allowed" to contain Tags (Tag kermeta elements). So, for 
 * such model elements, we implement a specific visit() method. 
 */
public class KMT2KMPass7 extends KMT2KMPass {

	private List<fr.irisa.triskell.kermeta.language.structure.Tag> currentTags = new ArrayList<fr.irisa.triskell.kermeta.language.structure.Tag> ();
	
    protected String fileData =  null;
    protected static Pattern pattern = Pattern.compile("[\t\\s]*[\r\n][\r\n\t\\s]*");
    public final static String KERMETA_DOCUMENTATION = "documentation";
    
    private Hashtable <fr.irisa.triskell.kermeta.language.structure.Tag, Tag> km2ecore = new Hashtable <fr.irisa.triskell.kermeta.language.structure.Tag, Tag> ();
    
	/**
	 * 
	 */
	public KMT2KMPass7(KermetaUnit builder, LoadingContext context, IProgressMonitor monitor) {
		super(builder, context, monitor);
	}


	private void processAnnotations(Object object) {
		for ( fr.irisa.triskell.kermeta.language.structure.Tag tag : currentTags ) {
			if ( isEntrypoint(tag) ) {
				// entryPoint tag should go to the modeling unit
				builder.getModelingUnit().getOwnedTags().add( tag );
				fr.irisa.triskell.kermeta.language.structure.Tag mainClassTag = ModelingUnitHelper.getMainClass(builder);
				if ( mainClassTag != null ) {
					TypeDefinition mainClass = builder.getTypeDefinitionByName( mainClassTag.getValue(), monitor );
					if ( mainClass == null )
						builder.warning("Main Class nof found.", km2ecore.get( mainClassTag));
					else {
						fr.irisa.triskell.kermeta.language.structure.Tag mainOperationTag = ModelingUnitHelper.getMainOperation(builder);
						if ( mainOperationTag != null ) {
							Operation op = ClassDefinitionHelper.findOperationByName( (ClassDefinition) mainClass, mainOperationTag.getValue() );
							if ( op == null )
								builder.warning("Main Operation not found.", km2ecore.get(mainOperationTag));
						}
					}
				}
			} else if ( tag.getName() != null ) {
				if ( TagHelper.findTagFromName(object, tag.getName()) == null ){
						object.getOwnedTag().add( tag ); // tag is owned by this object
						object.getTag().add( tag ); // this object is tagged
				}
			} else{
				object.getOwnedTag().add( tag ); // tag is owned by this object
				object.getTag().add( tag ); // this object is tagged
			}
		}
	}
	
	
	@Override
	public boolean beginVisit(KermetaASTNode node) {
		
		if ( monitor.isCanceled() )
			return false;
		
		Object object = builder.getModelElementByNode(node);
		if ( (object != null) && ! currentTags.isEmpty() ) {
			processAnnotations(object);
			currentTags.clear();
			km2ecore.clear();
			return true;
		}
		else {	
			return super.beginVisit(node);
		}
	}
	

	private boolean isEntrypoint(fr.irisa.triskell.kermeta.language.structure.Tag tag) {
		if ( (tag.getName() != null) 
				&& (
					tag.getName().equals("mainOperation") 
					|| tag.getName().equals("mainClass") )
				)
				return true;
		return false;
	}
	
	public boolean beginVisit(PackageDecl packageDecl) {
		
		if ( monitor.isCanceled() )
			return false;
		
		Object object = builder.getModelElementByNode(packageDecl);
		// force to read the annotation and fill the "currentTags" property
		packageDecl.getAnnotations().accept(this);
		processAnnotations(object);
		currentTags.clear();
		km2ecore.clear();
		// let's go and add this to the packagedecl  ie. go to beginVisit(KermetaASTNode node) {
	    
		//return super.beginVisit(packageDecl);
	    return false;  
		
	}
	
	@Override
	public boolean beginVisit(Tag tag) {
		
		if ( monitor.isCanceled() )
			return false;
		
		String name = unprotectedIDAsString(tag.getName());
		//String name = qualifiedIDAsString(tag.getName());
		
		// Tags that concern uri are not written in km, but there are stored into the attribute uri of the ClassDefinition associated to a package
		if( !name.equals(KermetaASTHelper.TAGNAME_URI) ) {
			fr.irisa.triskell.kermeta.language.structure.Tag t = StructureFactory.eINSTANCE.createTag();

			t.setName( name );
		
			String value = tag.getVal().getText().replace("\"", "");
			t.setValue( value );

			currentTags.add( t );
			km2ecore.put( t, tag );
		}
		
		return false;
	}
	
	@Override
	public boolean beginVisit(ContextMultiLineComment contextMultiLineComment) {
		
		if ( monitor.isCanceled() )
			return false;
		
		fr.irisa.triskell.kermeta.language.structure.Tag tag = StructureFactory.eINSTANCE.createTag();
		String text = contextMultiLineComment.getContext_multi_line_comment().getText();
		tag.setValue( text );
		currentTags.add( tag );
		return false;
	}
	
}
