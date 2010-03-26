package org.kermeta.ki.visual.view;

import java.util.HashMap;
import java.util.Map;

import edu.uci.ics.jung.algorithms.shortestpath.Distance;

public class DistanceVisu implements Distance<EntityView> {

	protected MetamodelView mmView;
	
	public DistanceVisu(MetamodelView mm) {
		super();
		
		mmView = mm;
	}
	
	
	public Number getDistance(EntityView e1, EntityView e2) {
		return e1.getCentre().distance(e2.getCentre())*10;
	}

	public Map<EntityView, Number> getDistanceMap(EntityView arg0) {
		Map<EntityView, Number> map = new HashMap<EntityView, Number>();
		
		for(EntityView entity : mmView.entities)
			map.put(entity, getDistance(arg0, entity));
		
		return map;
	}
}
