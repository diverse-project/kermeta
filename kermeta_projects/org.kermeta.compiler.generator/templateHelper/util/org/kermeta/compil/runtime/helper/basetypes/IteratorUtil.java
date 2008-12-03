package org.kermeta.compil.runtime.helper.basetypes;

import kermeta.standard.Iterator;

import org.eclipse.emf.common.util.BasicEList;

public class IteratorUtil {

	static public <G> boolean hasNext(Iterator<G> self) {
		try {
			return self.getJavaIterator().hasNext();
		} catch (NullPointerException e) {
			if ( self.getKermetaCollection().getValues() == null ) {
				self.getKermetaCollection().setValues( new BasicEList<G>() );
			}
			
			BasicEList<G> forIterator = new BasicEList<G>();
			forIterator.addAll(self.getKermetaCollection().getValues());
			
			self.setJavaIterator( forIterator.iterator() );
			return self.getJavaIterator().hasNext();
		}
	}
	
	static public <G> java.lang.Object next(Iterator<G> self) {
		try {
			return (java.lang.Object) self.getJavaIterator().next();
		} catch (NullPointerException e) {
			if ( self.getKermetaCollection().getValues() == null ) {
				self.getKermetaCollection().setValues( new BasicEList<G>() );
			}
			
			BasicEList<G> forIterator = new BasicEList<G>();
			forIterator.addAll(self.getKermetaCollection().getValues());
			
			self.setJavaIterator( forIterator.iterator() );
			return (java.lang.Object) self.getJavaIterator().next();
		}
	}
	
}
