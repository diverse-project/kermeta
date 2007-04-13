/*$Id: DependencyHelper.java,v 1.7 2007-04-13 14:44:56 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	sdfg.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : Feb 20, 2007
* Authors : ftanguy
*/
package fr.irisa.triskell.kermeta.kpm.helpers;

import java.util.ArrayList;
import java.util.List;

import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.In;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.Out;

public class DependencyHelper {

	
	/**
	 * 
	 * Create a dependency. If a dependency with the same name exists, this one is returned.
	 * 
	 * @param kpm
	 * @param dependencyName
	 * @param typeName
	 */
	public static Dependency createDependency(KPM kpm, String dependencyName, String typeName, String eventName, In in, List<Out> outs) {
		
		// Check if a dependency with the same name exist
		Dependency dependency = kpm.findDependency(dependencyName);
		if ( dependency == null ) {
			dependency = KpmFactory.eINSTANCE.createDependency();
			kpm.getDependencies().add(dependency);
			
			dependency.setName(dependencyName);
			dependency.setEvent(eventName);
			dependency.setType(typeName);
			
			in.setDependency(dependency);
			dependency.setIn(in);
			
			for ( Out out : outs)
				out.setDependency(dependency);
			dependency.getOuts().addAll(outs);
	
		}
	
		return dependency;
		
	}
	
	
	public static Dependency createDependency(KPM kpm, String dependencyName, String typeName, String eventName, In in, Out out) {
		ArrayList<Out> outs = new ArrayList<Out>();
		outs.add(out);
		return createDependency(kpm, dependencyName, typeName, eventName, in, outs);
	}
}
