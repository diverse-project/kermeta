package org.kermeta.compil.runtime.helper.basetypes;

import java.util.ArrayList;

import kermeta.language.structure.Object;
import kermeta.standard.Iterator;

public class IteratorUtil {

	static public boolean hasNext(Iterator self) {
		try {
			return self.getJavaIterator().hasNext();
		} catch (NullPointerException e) {
			if ( self.getKermetaCollection().getValues() == null )
				self.getKermetaCollection().setValues( new ArrayList() );
			self.setJavaIterator( self.getKermetaCollection().getValues().iterator() );
			return self.getJavaIterator().hasNext();
		}
	}
	
	static public Object next(Iterator self) {
		try {
			return (Object) self.getJavaIterator().next();
		} catch (NullPointerException e) {
			if ( self.getKermetaCollection().getValues() == null )
				self.getKermetaCollection().setValues( new ArrayList() );
			self.setJavaIterator( self.getKermetaCollection().getValues().iterator() );
			return (Object) self.getJavaIterator().next();
		}
	}
	
}
