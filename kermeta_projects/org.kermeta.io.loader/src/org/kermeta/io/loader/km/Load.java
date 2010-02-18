

/*$Id: Load.java,v 1.5 2008-07-18 07:15:27 dvojtise Exp $
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

	@SuppressWarnings("unchecked")
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
			StringBuffer s = new StringBuffer();
			for ( int i=1; i<resource.getURI().segmentCount()-1; i++ )
				s.append(resource.getURI().segment(i) + "/");
			s.append(resource.getURI().lastSegment().replaceAll("\\..+", ".traceability"));
			return URI.createPlatformPluginURI(s.toString(), false);
		} else if ( resourceURI.isPlatformResource() ) {
			StringBuffer s = new StringBuffer();
			for ( int i=1; i<resource.getURI().segmentCount()-1; i++ )
				s.append(resource.getURI().segment(i) + "/");
			s.append(resource.getURI().lastSegment().replaceAll("\\..+", ".traceability"));
			return URI.createPlatformResourceURI(s.toString(), false);
		}
		return null;
	}
	
}


