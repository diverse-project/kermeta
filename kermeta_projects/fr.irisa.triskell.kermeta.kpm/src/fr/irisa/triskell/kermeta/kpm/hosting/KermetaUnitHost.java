package fr.irisa.triskell.kermeta.kpm.hosting;

import fr.irisa.triskell.kermeta.extension.Interest;
import fr.irisa.triskell.kermeta.kpm.Unit;
import fr.irisa.triskell.kermeta.kpm.interest.InterestFactory;
import fr.irisa.triskell.kermeta.kpm.interest.InterestHost;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

public class KermetaUnitHost {

	private InterestHost host = InterestFactory.eINSTANCE.createInterestHost();
	
	private KermetaUnitHost() {}
	
	static private KermetaUnitHost instance = null;
	
	static public KermetaUnitHost getInstance() {
		if ( instance == null )
			instance = new KermetaUnitHost();
		return instance;
	}
	
	public void declareInterest(Interest declaringObject, Unit key, Object value) {
		host.declareInterest(declaringObject, key, value);
	}
	
	public void declareInterest(Interest declaringObject, Unit key) {
		host.declareInterest(declaringObject, key);
	}

	public void update(Unit key, Object newValue) {
		host.update(key, newValue);
	}
	
	public void undeclareInterest(Interest declaringObject, Unit key) {
		host.undeclareInterest(declaringObject, key);
	}
	
	public KermetaUnit getValue(Unit key) {
		return (KermetaUnit) host.getValue(key);
	}
}
