package factory.weaver;

import org.kermeta.smartadapters.drools.SmartAdaptersDrools;

import eu.diva.divastudio.services.runtime.IWeaver;

public class Factory implements eu.diva.factoryinstdiva.Factory<IWeaver>{

	private static Factory fact = new Factory();

	public static Factory getFact() {
		return fact;
	}

	public static void setFact(Factory fact) {
		Factory.fact = fact;
	}

	public static IWeaver getComponent() {
		return new SmartAdaptersDrools();
	}


	public IWeaver createComponent() {
		return getComponent();

	}	


	public IWeaver createComponent(String implementingClass) {
		return createComponent();
	}

	public boolean check(String implementingClass) {
		return false;
	}
}
