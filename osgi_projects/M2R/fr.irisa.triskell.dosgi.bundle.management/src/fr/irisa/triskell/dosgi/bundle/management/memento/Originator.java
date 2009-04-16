package fr.irisa.triskell.dosgi.bundle.management.memento;

/**
 * This interface define the basis functions for OSGi service which can save it state and reload it
 * @author Erwan Daubert
 * @version 1.0
 *
 */
public interface Originator {

	/**
	 * This function is use to load the state of the service define by <code>this</code>
	 * @param memento The object which contains all datas to load the state of the service
	 * @return true if the memento Object is valid and the state have been load, false else
	 */
	public boolean setMemento(Object memento);
	
	/**
	 * This function is used to get the state of the service define by <code>this</code>
	 * @return an Object which contains all datas to describe the state of the service
	 */
	public Object getMemento();
}
