

/*$Id: RandomSingleton.java,v 1.1 2008-12-12 15:39:48 cfaucher Exp $
* Project : org.kermeta.language.mdk
* File : 	Random.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 8 déc. 2008
* Authors : cfaucher
*/

package org.kermeta.language.mdk.externs.random;


public class RandomSingleton {

	private static RandomSingleton _instance;
	
	private static java.util.Random _randomJava;
	
	private RandomSingleton() {
		_randomJava = new java.util.Random(12345678);
	}
	
	public static RandomSingleton getInstance() {
		if(_instance == null) {
			_instance = new RandomSingleton();
		}
		return _instance;
	}

	public java.util.Random getRandomJava() {
		return _randomJava;
	}
		
}


