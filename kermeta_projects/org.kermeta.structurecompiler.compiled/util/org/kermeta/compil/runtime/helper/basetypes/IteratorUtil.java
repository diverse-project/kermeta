package org.kermeta.compil.runtime.helper.basetypes;

import kermeta.standard.Iterator;

import org.eclipse.emf.common.util.BasicEList;

public class IteratorUtil {

	static public <G> boolean hasNext(Iterator<G> self) {
		if ( self.getJavaIterator() != null ) {
			return self.getJavaIterator().hasNext();
		} else {
			if ( self.getKermetaCollection().getValues() == null ) {
				self.getKermetaCollection().setValues( new BasicEList<G>() );
			}
			
			//safe_iterator_start
			BasicEList<G> forIterator = new BasicEList<G>();
			forIterator.addAll(self.getKermetaCollection().getValues());
			
			self.setJavaIterator( forIterator.iterator() );
			//safe_iterator_end
			
			return self.getJavaIterator().hasNext();
		}
	}
	
	static public <G> java.lang.Object next(Iterator<G> self) {
		if ( self.getJavaIterator() != null ) {
			return (java.lang.Object) self.getJavaIterator().next();
		} else {
			if ( self.getKermetaCollection().getValues() == null ) {
				self.getKermetaCollection().setValues( new BasicEList<G>() );
			}
			
			//safe_iterator_start
			BasicEList<G> forIterator = new BasicEList<G>();
			forIterator.addAll(self.getKermetaCollection().getValues());
			
			self.setJavaIterator( forIterator.iterator() );
			//safe_iterator_end
			
			return (java.lang.Object) self.getJavaIterator().next();
		}
	}
	
}
