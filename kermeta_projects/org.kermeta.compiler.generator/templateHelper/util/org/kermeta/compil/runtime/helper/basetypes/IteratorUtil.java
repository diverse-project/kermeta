package org.kermeta.compil.runtime.helper.basetypes;

import java.util.ArrayList;

import kermeta.language.structure.Object;
import kermeta.standard.Iterator;

public class IteratorUtil {

	static public <G> boolean hasNext(Iterator<G> self) {
		try {
			return self.getJavaIterator().hasNext();
		} catch (NullPointerException e) {
			if ( self.getKermetaCollection().getValues() == null )
				self.getKermetaCollection().setValues( new ArrayList<G>() );
			self.setJavaIterator( self.getKermetaCollection().getValues().iterator() );
			return self.getJavaIterator().hasNext();
		}
	}
	
	static public <G> Object next(Iterator<G> self) {
		try {
			return (Object) self.getJavaIterator().next();
		} catch (NullPointerException e) {
			if ( self.getKermetaCollection().getValues() == null )
				self.getKermetaCollection().setValues( new ArrayList<G>() );
			self.setJavaIterator( self.getKermetaCollection().getValues().iterator() );
			return (Object) self.getJavaIterator().next();
		}
	}
	
}
