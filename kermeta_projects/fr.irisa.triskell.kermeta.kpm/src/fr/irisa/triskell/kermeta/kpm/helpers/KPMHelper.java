/*$Id: KPMHelper.java,v 1.18 2008-02-14 07:13:24 uid21732 Exp $
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

public class KPMHelper {

	
	static public KPM getDefaultKPM(IProject project) {
		KPM kpm = KpmFactory.eINSTANCE.createKPM();
		
		// Updating file actions
		kpm.createAction("fr.irisa.triskell.kermeta.kpm.actions.unloadContext");
		kpm.createAction("fr.irisa.triskell.kermeta.kpm.actions.loadContext");
		kpm.createAction("fr.irisa.triskell.kermeta.kpm.actions.typecheck");
		kpm.createAction("fr.irisa.triskell.kermeta.kpm.actions.constraintcheck");
		//kpm.createAction("fr.irisa.triskell.kermeta.kpm.actions.addMarkers");
		kpm.createAction("fr.irisa.triskell.kermeta.kpm.actions.removeDependentDependencies");
		kpm.createAction("fr.irisa.triskell.kermeta.kpm.actions.createDependentDependencies");
		kpm.createAction("fr.irisa.triskell.kermeta.kpm.actions.finalizeUpdate");
		// Other actions
		kpm.createAction("fr.irisa.triskell.kermeta.kpm.actions.openProject");
		kpm.createAction("fr.irisa.triskell.kermeta.kpm.actions.kmt2km");
		kpm.createAction("fr.irisa.triskell.kermeta.kpm.actions.ecore2kmt");
		
		
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

		addUpdateDependencyForKMTFile(kpm);
		addUpdateDependencyForKMFile(kpm);
		addUpdateDependencyForEcoreFile(kpm);
		//addCloseKMTFileDependency(kpm);
		
		return kpm;
	}
	
	static public void addUpdateDependencyForKMTFile(KPM kpm) {
		
		ArrayList<Out> outs = new ArrayList<Out> ();
		
		In in = InOutHelper.createInWithNameFilter(kpm, "*.kmt");

		Out out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.unloadContext");
		outs.add(out);
		
		out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.loadContext");
		outs.add(out);
		
		out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.typecheck");
		outs.add(out);
		
		out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.constraintcheck");
		outs.add(out);
		
		//out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.addMarkers");
		//outs.add(out);
		
		out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.removeDependentDependencies");
		outs.add(out);
		
		out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.createDependentDependencies");
		outs.add(out);
		
		out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.finalizeUpdate");
		outs.add(out);
		
		
	/*	In in = InOutHelper.createInWithNameFilter(kpm, "*.kmt");
		Out out1 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.typecheck");
		outs.add(out1);

		Out out2 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.constraintCheck");
		outs.add(out2);
		
		Out out3 = InOutHelper.createOutWithNameFilter(kpm, "fr.irisa.triskell.kermeta.kpm.actions.kmt2km", "*.km");
		outs.add(out3);

		Out out4 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.createDependentDependencies");
		outs.add(out4);
		
		Out out5 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.removeDependentDependencies");
		outs.add(out5);
		
		Out out6 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.addMarkers");
		outs.add(out6);
		
		if(KPMConstants.GENERATEKM_DEFAULTVALUE){ // depending on default configuration
			Out out7 = InOutHelper.createOutWithNameFilter(kpm, "fr.irisa.triskell.kermeta.kpm.actions.kmt2km", "*.km");
			outs.add(out7);
		}*/
		
		RuleHelper.createRule(kpm, "Update KMT File", "normal", "update", in, outs);
	}
	
	static public void addUpdateDependencyForKMFile(KPM kpm) {
		
		ArrayList<Out> outs = new ArrayList<Out> ();
		
		In in = InOutHelper.createInWithNameFilter(kpm, "*.km");
	
		Out out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.unloadContext");
		outs.add(out);
		
		out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.loadContext");
		outs.add(out);
		
		out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.typecheck");
		outs.add(out);
		
		out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.constraintcheck");
		outs.add(out);
		
		//out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.addMarkers");
		//outs.add(out);
		
		out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.removeDependentDependencies");
		outs.add(out);
		
		out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.createDependentDependencies");
		outs.add(out);
		
		out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.finalizeUpdate");
		outs.add(out);
		
		
		/*Out out1 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.typecheck");
		outs.add(out1);

		Out out2 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.constraintCheck");
		outs.add(out2);
		
		Out out6 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.addMarkers");
		outs.add(out6);*/
		
		RuleHelper.createRule(kpm, "Update KM File", "normal", "update", in, outs);
	}
	
	static public void addUpdateDependencyForEcoreFile(KPM kpm) {
		
		ArrayList<Out> outs = new ArrayList<Out> ();
		
		In in = InOutHelper.createInWithNameFilter(kpm, "*.ecore");
		
		Out out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.unloadContext");
		outs.add(out);
		
		out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.loadContext");
		outs.add(out);
		
		out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.typecheck");
		outs.add(out);
		
		out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.constraintcheck");
		outs.add(out);
		
		//out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.addMarkers");
		//outs.add(out);
		
		out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.removeDependentDependencies");
		outs.add(out);
		
		out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.createDependentDependencies");
		outs.add(out);
		
		out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.finalizeUpdate");
		outs.add(out);
		
		/*Out out1 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.typecheck");
		outs.add(out1);

		Out out2 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.constraintCheck");
		outs.add(out2);
		
		Out out6 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.addMarkers");
		outs.add(out6);*/
		
		RuleHelper.createRule(kpm, "Update Ecore File", "normal", "update", in, outs);
	}
	
	/*static public void addCloseKMTFileDependency(KPM kpm) {
		In in = InOutHelper.createInWithNameFilter(kpm, "*.kmt");
		Out out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.addMarkers");
		RuleHelper.createRule(kpm, "Close KMT File", "normal", "close", in, out);
	}*/	
	
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

	static public void addRules(KPM kpm, Unit unit) {
		
		Iterator <Rule> iterator = kpm.getRules().iterator();
		
		while ( iterator.hasNext() ) {
			
			Rule currentRule = iterator.next();
			if ( currentRule.getIn().getExpression().evaluateIn(unit) )
				unit.getRules().add( currentRule );
			
		}
		
	}


	static public void addRulesForAll(KPM kpm) {
		Iterator <Unit> iterator = kpm.getUnits().iterator();
		while ( iterator.hasNext() ) {
			addRules(kpm, iterator.next() );
		}
	}

}
