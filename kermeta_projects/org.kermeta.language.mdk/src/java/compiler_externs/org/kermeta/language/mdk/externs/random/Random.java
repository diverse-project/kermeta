package org.kermeta.language.mdk.externs.random;


public class Random {

	/**
	 * 
	 * @param self
	 * @param param0
	 * @return
	 */
	public static java.lang.Integer nextId(kermeta.language.structure.Object self, java.lang.Integer param0) {
    	return RandomSingleton.getInstance().getRandomJava().nextInt(param0);
	}
	
	/**
	 * 
	 * @param self
	 * @param param0
	 * @return
	 */
	public static kermeta.standard.Sequence<java.lang.Integer> getIntegerSequenceRandomly(kermeta.language.structure.Object self, java.lang.Integer param0) {
		
		kermeta.standard.Sequence<java.lang.Integer> result = kermeta.standard.StandardFactory.eINSTANCE.createSequence();
		
	    java.util.Random rdm = RandomSingleton.getInstance().getRandomJava();
		
	    for(int i = param0 ; i>0 ; i--) {
			result.add(rdm.nextInt(i));
		}

	    return result;
		
	}
}
