/* $Id: KermetaUnitCache.java,v 1.1.2.1 2008-12-31 15:15:00 dvojtise Exp $
* Project : IO
* File : KeyTuple.java
* License : EPL
* Copyright : IRISA / INRIA
* ----------------------------------------------------------------------------
* Creation date : 25/05/2010
* Author : Didier vojtisek
*/

package fr.irisa.triskell.cache.utilities;


/**
 * This convenient class is used to quickly create complex key using 2 internal objects
 * 2 KeyTuple are equals if their internal keys are equals too 
 * Internal keys should not be null
 * @param <FirstKey>
 * @param <SecondKey>
 */
public class KeyTuple<FirstInternalKey,SecondInternalKey> {
	protected FirstInternalKey firstKey;
	protected SecondInternalKey secondKey;
	
	public KeyTuple(FirstInternalKey firstKey, SecondInternalKey secondKey) {
		super();
		this.firstKey = firstKey;
		this.secondKey = secondKey;
	}
	
	@Override
	public boolean equals(Object other) {
		// Not strictly necessary, but often a good optimization
	    if (this == other)
	      return true;
		if(other instanceof KeyTuple<?,?>){
			KeyTuple<?,?> comparedObj = (KeyTuple<?,?>)other;
			return comparedObj.firstKey.equals(firstKey) && comparedObj.secondKey.equals(secondKey);
		}
		else
			return false;
	}
	@Override
	public int hashCode() {
		// see http://www.ibm.com/developerworks/java/library/j-jtp05273.html
		int hash = 1;
	    hash = hash * 31 + firstKey.hashCode();
	    hash = hash * 31 
	                + (secondKey == null ? 0 : secondKey.hashCode());
	    return hash;
	}
	
	public FirstInternalKey getFirstKey() {
		return firstKey;
	}
	public void setFirstKey(FirstInternalKey firstKey) {
		this.firstKey = firstKey;
	}
	public SecondInternalKey getSecondKey() {
		return secondKey;
	}
	public void setSecondKey(SecondInternalKey secondKey) {
		this.secondKey = secondKey;
	}
	
}
