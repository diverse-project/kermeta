package fr.irisa.triskell.kermeta.kpm.helpers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IProject;

import sun.tools.tree.AndExpression;

import fr.irisa.triskell.kermeta.kpm.ANDExpression;
import fr.irisa.triskell.kermeta.kpm.Action;
import fr.irisa.triskell.kermeta.kpm.Dependency;
import fr.irisa.triskell.kermeta.kpm.Event;
import fr.irisa.triskell.kermeta.kpm.ExistFilter;
import fr.irisa.triskell.kermeta.kpm.Filter;
import fr.irisa.triskell.kermeta.kpm.FilterExpression;
import fr.irisa.triskell.kermeta.kpm.In;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.NameFilter;
import fr.irisa.triskell.kermeta.kpm.NullExpression;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.SimpleExpression;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.resources.KermetaProject;

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
		
		kpm.getDependencyType("require");
		kpm.getDependencyType("normal");
		
		kpm.createNameFilter("*.kmt");
		kpm.createNameFilter("*.km");
		kpm.createNameFilter("*.ecore");
		
		
		/* project */
		In in = InOutHelper.createIn();
		Out out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.openProject");
		Dependency openDependency = DependencyHelper.createDependency(kpm, "Open Project", "normal", "open", in, out);
		
		/*in = InOutHelper.createIn();
		out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.closeProject");
		Dependency closeDependency = DependencyHelper.createDependency(kpm, "Close Project", "normal", "close", in, out);*/
			
		Unit unit = KpmFactory.eINSTANCE.createUnit();
		unit.setValue( project.getFullPath().toString() );
		unit.getDependencies().add(openDependency);
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
		
		Dependency dependency = DependencyHelper.createDependency(kpm, "Open Project", "normal", "open", in, out);
		
		unit.getDependencies().add(dependency);
		
		kpm.getUnits().add(unit);
	}
	
	static public void addUpdateDependencyForKMTFile(KPM kpm) {
		In in = InOutHelper.createInWithNameFilter(kpm, "*.kmt");
		Out out1 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.typecheck");
		
		//Out out2 = InOutHelper.createOutWithNameFilter(kpm, "fr.irisa.triskell.kermeta.kpm.actions.kmt2km", "*.km");
		
		
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
		
		Out out4 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.removeDependentDependencies");
		
		Out out5 = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.addMarkers");

		Out out6 = InOutHelper.createOutWithNameFilter(kpm, "fr.irisa.triskell.kermeta.kpm.actions.kmt2km", "*.km");
		
		
		ArrayList<Out> outs = new ArrayList<Out> ();
		outs.add(out1);
		//outs.add(out2);
		outs.add(out3);
		outs.add(out4);
		outs.add(out5);
		outs.add(out6);
		
		DependencyHelper.createDependency(kpm, "Update KMT File", "normal", "update", in, outs);
	}
	
	static public void addCloseKMTFileDependency(KPM kpm) {
		In in = InOutHelper.createInWithNameFilter(kpm, "*.kmt");
		Out out = InOutHelper.createOut(kpm, "fr.irisa.triskell.kermeta.kpm.actions.addMarkers");
		DependencyHelper.createDependency(kpm, "Close KMT File", "normal", "close", in, out);
	}
	
	
	
	
	
	
	
	
	
	
	
	static public Unit getOrCreateUnit(KPM kpm, String value) {
		for ( Unit currentUnit : (List<Unit>) kpm.getUnits() ) {
			if ( currentUnit.getValue().equals(value) )
				return currentUnit;
		}
		Unit newUnit = KpmFactory.eINSTANCE.createUnit();
		newUnit.setValue(value);
		kpm.getUnits().add(newUnit);
		return newUnit;
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
	
	static public void addDependency(KPM kpm, Unit unit, String dependencyName) {
		Iterator <Dependency> iterator = (Iterator<Dependency>) kpm.getDependencies().iterator();
		while ( iterator.hasNext() ) {
			Dependency currentDependency = iterator.next();
			if ( currentDependency.getName().equals(dependencyName) && ! unit.hasDependencyNamed(dependencyName) )
				unit.getDependencies().add(currentDependency);
		}
	}
}
