/* $Id: AddAnnotations.java,v 1.5 2008-12-22 09:30:07 cfaucher Exp $
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
package org.kermeta.io.loader.kmt;


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.ILoadingDatas;
import org.kermeta.io.loader.action.IKMTLoadingAction;
import org.kermeta.io.loader.action.ILoadingAction;
import org.kermeta.io.loader.datas.KMTLoadingDatas;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.ast.helper.KermetaASTHelper;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Object;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.ModelingUnitHelper;
import fr.irisa.triskell.kermeta.parser.gen.ast.ContextMultiLineComment;
import fr.irisa.triskell.kermeta.parser.gen.ast.KermetaASTNode;
import fr.irisa.triskell.kermeta.parser.gen.ast.KermetaASTNodeVisitor;
import fr.irisa.triskell.kermeta.parser.gen.ast.PackageDecl;
import fr.irisa.triskell.kermeta.parser.gen.ast.Tag;


/**
 * Pass that adds the comments (annotations) as tags of a model element (class, assignment,
 * operation).
 * How does it work :
 * 	- each grammar rule (see kermeta.ast) that is a sequence containing a annotationLst list 
 * corresponds to a model element that is "allowed" to contain Tags (Tag kermeta elements). So, for 
 * such model elements, we implement a specific visit() method. 
 */
public class AddAnnotations extends KermetaASTNodeVisitor implements ILoadingAction, IKMTLoadingAction  {

	private List<fr.irisa.triskell.kermeta.language.structure.Tag> currentTags = new ArrayList<fr.irisa.triskell.kermeta.language.structure.Tag> ();
	
    protected String fileData =  null;
    protected static Pattern pattern = Pattern.compile("[\t\\s]*[\r\n][\r\n\t\\s]*");
    public final static String KERMETA_DOCUMENTATION = "documentation";
    
    private Hashtable <fr.irisa.triskell.kermeta.language.structure.Tag, Tag> km2ecore = new Hashtable <fr.irisa.triskell.kermeta.language.structure.Tag, Tag> ();
    
    private KermetaUnit kermetaUnit;
    
	public void performAction(ILoadingDatas datas, Map<?, ?> options) {
		performAction( (KMTLoadingDatas) datas, options );
	}

	public void performAction(KMTLoadingDatas datas, Map<?, ?> options) {
		kermetaUnit = datas.getKermetaUnit();
		//context = datas.context;
		datas.ast.accept(this);
	}


	private void processAnnotations(Object object) {
		for ( fr.irisa.triskell.kermeta.language.structure.Tag tag : currentTags ) {
			if ( isEntrypoint(tag) ) {
				// entryPoint tag should go to the modeling unit
				kermetaUnit.getModelingUnit().getOwnedTags().add( tag ); // tag is owned by this object
				kermetaUnit.getModelingUnit().getTag().add( tag ); // this object is tagged
				fr.irisa.triskell.kermeta.language.structure.Tag mainClassTag = ModelingUnitHelper.getMainClass(kermetaUnit);
				if ( mainClassTag != null ) {
					TypeDefinition mainClass = kermetaUnit.getTypeDefinitionByName( mainClassTag.getValue(), null );
					if ( mainClass == null )
						kermetaUnit.warning("Main Class nof found.", km2ecore.get( mainClassTag));
					else {
						fr.irisa.triskell.kermeta.language.structure.Tag mainOperationTag = ModelingUnitHelper.getMainOperation(kermetaUnit);
						if ( mainOperationTag != null ) {
							Operation op = KermetaModelHelper.ClassDefinition.getOperationByName( (ClassDefinition) mainClass, mainOperationTag.getValue() );
							if ( op == null )
								kermetaUnit.warning("Main Operation not found.", km2ecore.get(mainOperationTag));
						}
					}
				}
			} else if ( tag.getName() != null ) {
				
				if ( object instanceof Package && tag.getName().equals(KermetaASTHelper.TAGNAME_URI) ) {
					((Package) object).setUri(tag.getValue());
				} else {//if ( KermetaModelHelper.Tag.getTag(object, tag.getName()) == null ){
						object.getOwnedTags().add( tag ); // tag is owned by this object
						object.getTag().add( tag ); // this object is tagged
				}
			} else {
				object.getOwnedTags().add( tag ); // tag is owned by this object
				object.getTag().add( tag ); // this object is tagged
			}
		}
	}
	
	
	@Override
	public boolean beginVisit(KermetaASTNode node) {
		
		Object object = kermetaUnit.getModelElementByNode(node);
		if ( object instanceof ClassDefinition && ((ClassDefinition)object).getName().equals("Iterator"))
			System.out.println();
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

		Object object = kermetaUnit.getModelElementByNode(packageDecl);
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
		
		String name = KermetaASTHelper.unprotectedIDAsString(tag.getName());
		//String name = qualifiedIDAsString(tag.getName());
		
		// Tags that concern uri are not written in km, but there are stored into the attribute uri of the ClassDefinition associated to a package
		fr.irisa.triskell.kermeta.language.structure.Tag t = StructureFactory.eINSTANCE.createTag();

		t.setName( name );
		
		String value = tag.getVal().getText().replace("\"", "");
		t.setValue( value );

		currentTags.add( t );
		km2ecore.put( t, tag );
		
		return false;
	}
	
	@Override
	public boolean beginVisit(ContextMultiLineComment contextMultiLineComment) {
		
		fr.irisa.triskell.kermeta.language.structure.Tag tag = StructureFactory.eINSTANCE.createTag();
		String text = contextMultiLineComment.getContext_multi_line_comment().getText();
		tag.setValue( text );
		currentTags.add( tag );
		return false;
	}
	
}
