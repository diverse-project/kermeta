package fr.irisa.triskell.observation.wildcat;

import org.ow2.wildcat.hierarchy.attribute.POJOAttribute;

import fr.irisa.triskell.observation.Observer;

public class WrapperAttribute extends POJOAttribute {

	private String alias;
	private Observer observer;
	
	public WrapperAttribute(String alias, Observer observer) {
		super(observer.getValue(alias));
		this.alias = alias;
		this.observer = observer;
	}
	
	protected String getAlias() {
		return alias;
	}

	protected void setAlias(String alias) {
		this.alias = alias;
	}

	protected Observer getObserver() {
		return observer;
	}

	protected void setObserver(Observer observer) {
		this.observer = observer;
	}
	
	@Override
	public Object getValue() {
		// TODO TEST and maybe return observer.getValue...
		//return observer.getValue(alias);
		return super.getValue();
	}

	@Override
	public Object setValue(Object value) {
		// TODO utilisation du Pattern Observer
		Object old_value = observer.setValue(alias, value);
		super.setValue(observer.getValue(alias));
		return old_value;
	}

	
	

}
