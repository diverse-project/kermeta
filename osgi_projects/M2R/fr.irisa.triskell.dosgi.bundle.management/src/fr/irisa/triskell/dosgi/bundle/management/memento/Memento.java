package fr.irisa.triskell.dosgi.bundle.management.memento;

public interface Memento {

	public boolean setMemento(Object memento);
	
	public Object getMemento();
}
