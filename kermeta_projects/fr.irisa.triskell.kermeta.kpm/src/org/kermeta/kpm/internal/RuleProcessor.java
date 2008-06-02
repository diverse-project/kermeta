

/*$Id: RuleProcessor.java,v 1.2 2008-06-02 09:12:14 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	RuleProcessor.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 27 mai 08
* Authors : paco
*/

package org.kermeta.kpm.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;

import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Rule;
import fr.irisa.triskell.kermeta.kpm.Unit;

public class RuleProcessor {

	/**
	 * 
	 * @param unit
	 * @param rule
	 * @param args
	 * @param monitor
	 */
	static public void process(Unit unit, Rule rule, Map<String, Object> args, IProgressMonitor monitor) {
		new RuleProcessor(unit, rule, args, monitor).doIt();
	}
	
	/**
	 * 
	 */
	private Unit _unit;
	
	/**
	 * 
	 */
	private Rule _rule;
	
	/**
	 * 
	 */
	private Map<String, Object> _arguments;
	
	/**
	 * 
	 */
	private IProgressMonitor _monitor;
	
	/**
	 * 
	 * @param unit
	 * @param rule
	 * @param args
	 * @param monitor
	 */
	private RuleProcessor(Unit unit, Rule rule, Map<String, Object> args, IProgressMonitor monitor) {
		_unit = unit;
		_rule = rule;
		_arguments = args;
		if ( _arguments == null )
			_arguments = new HashMap<String, Object>();
		_monitor = monitor;
		if ( _monitor == null )
			_monitor = new NullProgressMonitor();
	}
	
	/**
	 * 
	 */
	private void doIt() {
		try {
			if ( _rule.getPrecondition().evaluateIn(_unit) ) {
			
				SubMonitor progress = SubMonitor.convert(_monitor, getTaskName(), getWork() );
			
				for ( Out currentOut : _rule.getOuts() ) {
	
					if ( _monitor.isCanceled() )
						return;
				
					if ( ! currentOut.isIndependant() ) {
						OutProcessor.process(_unit, currentOut, _arguments, progress.newChild(1));
					} else {
						/*
						 * Job subJob = new Job("Processing Independant Out") {
						 * 
						 * 
						 * public IStatus run(IProgressMonitor monitor) {
						 * out.process(monitor); return Status.OK_STATUS; }
						 * 
						 *  }; subJob.schedule();
						 */
					}
				}
				
			}
		} finally {
			_monitor.done();
		}

	}
	
	/**
	 * 
	 * @return
	 */
	private String getTaskName() {
		return "Processing Rule " + _rule.getName() + " on " + _unit.getName() + " : ";
	}
	
	/**
	 * 
	 * @return
	 */
	private int getWork() {
		return _rule.getOuts().size();
	}
}


