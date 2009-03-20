package fr.irisa.triskell.observation.exceptions;


public class ObserverUnavailableException extends Exception {

	public ObserverUnavailableException(String alias) {
		super(" The Observer linked by " + alias + "is no more available.");
	}
}
