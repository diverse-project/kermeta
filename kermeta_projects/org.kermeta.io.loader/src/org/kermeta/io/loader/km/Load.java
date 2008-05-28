

/*$Id: Load.java,v 1.4 2008-05-28 13:39:06 dvojtise Exp $
* Project : org.kermeta.io.loader
* File : 	Load.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 21 déc. 07
* Authors : paco
*/

package org.kermeta.io.loader.km;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.kermeta.io.loader.action.KMLoadingAction;
import org.kermeta.io.loader.datas.KMLoadingDatas;

import fr.irisa.triskell.kermeta.loader.km.KMUnitLoader;
import fr.irisa.triskell.traceability.helper.Tracer;

public class Load extends KMLoadingAction {

	public void performAction(KMLoadingDatas datas, Map<?, ?> options) {

		// load the model
		KMUnitLoader l = new KMUnitLoader( (Map<Object, Object>) options, null);
		l.load( datas.getKermetaUnit().getUri() );
		
		// load the trace model if any
		Resource r = datas.getKermetaUnit().getModelingUnit().eResource();
		if ( r !=null ) {
			URI uri = getTraceURI( r );
			if(uri != null){
				ResourceSet rs = r.getResourceSet();
				try {
					Resource traceResource = rs.getResource(uri, true);
					Tracer tracer = new Tracer(traceResource);
					datas.getKermetaUnit().setTracer( tracer );
				} catch (RuntimeException e) {}
			}
			else {
				// No traceURI for this resource			
			}
		}
		
		
	}

	/**
	 * Calculate the uri for the trace model.
	 * @param resource
	 * @return
	 */
	private URI getTraceURI(Resource resource) {
		URI resourceURI = resource.getURI();
		if ( resourceURI.isPlatformPlugin() ) {
			String s = "";
			for ( int i=1; i<resource.getURI().segmentCount()-1; i++ )
				s += resource.getURI().segment(i) + "/";
			s += resource.getURI().lastSegment().replaceAll("\\..+", ".traceability");
			return URI.createPlatformPluginURI(s, false);
		} else if ( resourceURI.isPlatformResource() ) {
			String s = "";
			for ( int i=1; i<resource.getURI().segmentCount()-1; i++ )
				s += resource.getURI().segment(i) + "/";
			s += resource.getURI().lastSegment().replaceAll("\\..+", ".traceability");
			return URI.createPlatformResourceURI(s, false);
		}
		return null;
	}
	
}


