/*$Id: KPMHelper.java,v 1.13 2007-05-25 15:04:39 ftanguy Exp $
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
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IProject;

import fr.irisa.triskell.kermeta.kpm.FilterExpression;
import fr.irisa.triskell.kermeta.kpm.In;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.NameFilter;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Rule;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.properties.KPMConstants;

public class KPMHelper {

	
	static public KPM getDefaultKPM(IProject project) {
		KPM kpm = KpmFactory.eINSTANCE.createKPM();
		kpm.createAction("fr.irisa.triskell.kermeta.kpm.actions.openProject");
		kpm.createAction("fr.irisa.triskell.kermeta.kpm.actions.addMarkers");
		kpm.createAction("fr.irisa.triskell.kermeta.kpm.actions.typecheck");
		kpm.createAction("fr.irisa.triskell.kermeta.kpm.actions.createDependentDependencies");
		kpm.createAction("fr.irisa.triskell.kermeta.kpm.actions.removeDependentDependencies");
		kpm.createAction("fr.irisa.triskell.kermeta.kpm.actions.kmt2km");
		
		
		kpm.getEvent("open");
		kpm.getEvent("update");
		kpm.getEvent("close");
		
		kpm.getRuleType("require");
		kpm.getRuleType("normal");
		
		kpm.createNameFilter("*.kmt");
		kpm.createNameFilter("*.km");
		kpm.createNameFilter("*.ecore");
		
		
		/* project */
		In in = InOutHelper.createIn();
		Out out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.openProject");
		Rule rule = RuleHelper.createRule(kpm, "Open Project", "normal", "open", in, out);
		
		/*in = InOutHelper.createIn();
		out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.closeProject");
		Dependency closeDependency = DependencyHelper.createDependency(kpm, "Close Project", "normal", "close", in, out);*/
			
		Unit unit = KpmFactory.eINSTANCE.createUnit();
		unit.setValue( project.getFullPath().toString() );
		unit.getRules().add(rule);
		//unit.getDependencies().add(closeDependency);
		
		kpm.getUnits().add(unit);
		
		
		
		
		/* km and kmt */
		FilterExpression inExpression = KpmFactory.eINSTANCE.createFilterExpression();
		NameFilter kmtFilter = kpm.findNameFilter("*.kmt");
		inExpression.setFilter(kmtFilter);
		in = KpmFactory.eINSTANCE.createIn();
		in.setExpression(inExpression);

		/*NullExpression nullExpression1 = KpmFactory.eINSTANCE.createNullExpression();
		Out out1 = KpmFactory.eINSTANCE.createOut();
		out1.setExpression(nullExpression1);
		out1.setAction( kpm.findAction("fr.irisa.triskell.kermeta.kpm.actions.openKMTFile") );*/
		
		/*NullExpression nullExpression2 = KpmFactory.eINSTANCE.createNullExpression();
		Out out2 = KpmFactory.eINSTANCE.createOut();
		out2.setExpression(nullExpression2);
		out2.setAction( kpm.findAction("fr.irisa.triskell.kermeta.kpm.actions.addMarkers") );*/
		
		
		/*Dependency dependency = KpmFactory.eINSTANCE.createDependency();
		kpm.getDependencies().add(dependency);
		in.setDependency(dependency);
		out1.setDependency(dependency);
		out2.setDependency(dependency);
		dependency.setName("Open KMT File");
		dependency.setEvent( kpm.findEvent("open") );
		dependency.setType("normal");
		dependency.setIn(in);
		dependency.getOuts().add(out1);
		dependency.getOuts().add(out2);*/
		
		addUpdateDependencyForKMTFile(kpm);
		addCloseKMTFileDependency(kpm);
		
		return kpm;
	}
	
	static private void addOpenDependencyOnProject(KPM kpm, Unit unit) {
		/* project */
		In in = InOutHelper.createIn();
		Out out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.openProject");
		
		Rule rule = RuleHelper.createRule(kpm, "Open Project", "normal", "open", in, out);
		
		unit.getRules().add(rule);
		
		kpm.getUnits().add(unit);
	}
	
	static public void addUpdateDependencyForKMTFile(KPM kpm) {
		
		ArrayList<Out> outs = new ArrayList<Out> ();
		
		In in = InOutHelper.createInWithNameFilter(kpm, "*.kmt");
		Out out1 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.typecheck");
		outs.add(out1);
		
		Out out2 = InOutHelper.createOutWithNameFilter(kpm, "fr.irisa.triskell.kermeta.kpm.actions.kmt2km", "*.km");
		outs.add(out2);
		
		
		/*FilterExpression outExpression = KpmFactory.eINSTANCE.createFilterExpression();
		NameFilter ecoreFilter = kpm.findNameFilter("*.ecore");
		outExpression.setFilter(ecoreFilter);

		FilterExpression filterExpression = KpmFactory.eINSTANCE.createFilterExpression();
		filterExpression.setFilter(kpm.getExistFilter());
		ANDExpression and = KpmFactory.eINSTANCE.createANDExpression();
		and.setExpression(filterExpression);
		outExpression.setSubExpression(and);
		
		Out out3 = KpmFactory.eINSTANCE.createOut();
		out3.setExpression(outExpression);
		out3.setAction( kpm.findAction("fr.irisa.triskell.kermeta.kpm.actions.kmt2ecore") );*/

		Out out3 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.createDependentDependencies");
		outs.add(out3);
		
		Out out4 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.removeDependentDependencies");
		outs.add(out4);
		
		Out out5 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.addMarkers");
		outs.add(out5);
		
		if(KPMConstants.GENERATEKM_DEFAULTVALUE){ // depending on default configuration
			Out out6 = InOutHelper.createOutWithNameFilter(kpm, "fr.irisa.triskell.kermeta.kpm.actions.kmt2km", "*.km");
			outs.add(out6);
		}
		
		RuleHelper.createRule(kpm, "Update KMT File", "normal", "update", in, outs);
	}
	
	static public void addCloseKMTFileDependency(KPM kpm) {
		In in = InOutHelper.createInWithNameFilter(kpm, "*.kmt");
		Out out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.addMarkers");
		RuleHelper.createRule(kpm, "Close KMT File", "normal", "close", in, out);
	}
	
	
	
	
	
	
	
	
	
	
	
	static public Unit getOrCreateUnit(KPM kpm, String value) {
		Unit unit = getUnit(kpm, value);
		if (unit == null) {
			unit = KpmFactory.eINSTANCE.createUnit();
			unit.setValue(value);
			unit.setLastTimeModified( new Date(0) );
			kpm.getUnits().add(unit);
		}
		return unit;
	}
	
	static public Unit getUnit(KPM kpm, String value) {
		for ( Unit currentUnit : (List<Unit>) kpm.getUnits() ) {
			if ( currentUnit.getValue().equals(value) )
				return currentUnit;
		}
		return null;
	}
	
	static public void addOpenDependencyOnKMTFile(KPM kpm, Unit unit) {
		addDependency(kpm, unit, "Open KMT File");
	}
	
	static public void addUpdateDependencyOnKMTFile(KPM kpm, Unit unit) {
		addDependency(kpm, unit, "Update KMT File");
	}
	
	
	static public void addCloseDependencyOnKMTFile(KPM kpm, Unit unit) {
		addDependency(kpm, unit, "Close KMT File");
	}
	
	static public void addDependency(KPM kpm, Unit unit, String ruleName) {
		Iterator <Rule> iterator = (Iterator<Rule>) kpm.getRules().iterator();
		while ( iterator.hasNext() ) {
			Rule currentRule = iterator.next();
			if ( currentRule.getName().equals(ruleName) && ! unit.hasRuleNamed(ruleName) )
				unit.getRules().add(currentRule);
		}
	}
}
