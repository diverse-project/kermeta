

/*$Id: Ecore2KMPass1.java,v 1.16 2007-10-04 07:22:52 ftanguy Exp $
* Project : org.kermeta.io
* File : 	Ecore2KMpass1.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.loader.ecore;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.modelhelper.StringHelper;

/**
 * 
 * 
 * Collecting the requires and the usings.
 * 
 * @author paco
 *
 */
public class Ecore2KMPass1 extends Ecore2KMPass {

	private Resource resource = null; 
	
	public Ecore2KMPass1(KermetaUnit kermetaUnit, Ecore2KMDatas datas, boolean isQuickFixEnabled, Resource resource, IProgressMonitor monitor) {
		super(kermetaUnit, datas, isQuickFixEnabled, monitor);
		this.resource = resource;
	}
	
	
	@Override
	public Object visit(EAnnotation node) {

		String result = "";
		
		/*
		 * 
		 * The annotation is the compilation unit.
		 * 
		 */
		if ( node.getSource().equals("CompilationUnit") ) {
			
			if ( node.getDetails().containsKey( "require" ) ) {
				String s = (String) node.getDetails().get("require");
				String splits[] = s.split("\\|");
				for ( int i = 0; i < splits.length; i++ ) {
					kermetaUnit.addRequire( splits[i], null );
					String fileURI = "";
					if ( splits[i].equals("kermeta") )
						fileURI = IOPlugin.FRAMEWORK_KM_URI;
					else if ( splits[i].matches("http://.+") )
						fileURI = splits[i];
					else if ( splits[i].matches("platform:/plugin.+") || splits[i].matches("platform:/resource.+") )
						fileURI = splits[i];
					else {
						int index = kermetaUnit.getUri().lastIndexOf("/");
						String path = kermetaUnit.getUri().substring(0, index);
						String relativeURI = path + "/" + splits[i];
						relativeURI = StringHelper.replaceExtension(relativeURI, ".ecore");
						URI uri = URI.createURI( relativeURI );
						URIConverter converter = new URIConverterImpl();
						uri = converter.normalize(uri);
						uri = EcoreHelper.getCanonicalURI(uri);
						fileURI = uri.toString();
					}
					
					try {
						KermetaUnit importedUnit = IOPlugin.getDefault().getKermetaUnit( fileURI );
						kermetaUnit.getImportedKermetaUnits().add( importedUnit );
					} catch ( URIMalformedException exception ) {
						kermetaUnit.error( exception.getMessage() );
					}
				}
			}
			
			if ( node.getDetails().containsKey( "using" ) ) {
				String s = (String) node.getDetails().get("using");
				String splits[] = s.split("\\|");
				for ( int i = 0; i < splits.length; i++ )
					kermetaUnit.addUsing( splits[i] );
			}
						
		}
		
		return result;
		
	}
	
	@Override
	public Object visit(EDataType node) {
		return super.visit(node);
	}
	
	@Override
	public Object visit(EGenericType node) {
		if ( (node.getEClassifier() != null) && node.getEClassifier().eResource() != resource ) {
			KermetaUnit unitToImport;
			try {
				unitToImport = IOPlugin.getDefault().getKermetaUnit( node.getEClassifier().eResource().getURI().toString() );
				kermetaUnit.importKermetaUnit(unitToImport, false);
			} catch (URIMalformedException e) {
				e.printStackTrace();
			}
		}
		return super.visit(node);
	}
	
}


