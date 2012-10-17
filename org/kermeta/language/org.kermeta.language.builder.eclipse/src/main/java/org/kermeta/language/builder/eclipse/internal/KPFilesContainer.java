package org.kermeta.language.builder.eclipse.internal;

import java.net.URL;

import org.kermeta.language.util.ModelingUnit;

public class KPFilesContainer {
	
	public URL filePath;
	public boolean dirtyFile;
	public ModelingUnit modelingUnit;
	
	public KPFilesContainer(URL filePath,boolean dirtyFile, ModelingUnit modelingUnit) {
		super();
		this.filePath = filePath;
		this.dirtyFile = dirtyFile;
		this.modelingUnit = modelingUnit;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof KPFilesContainer) {
			return this.filePath.equals(((KPFilesContainer)obj).filePath); 
		} else {
			return super.equals(obj);
		}
	}

	@Override
	public String toString() {
		return filePath.toString() + " dirty:("+dirtyFile+") mu:("+modelingUnit+")";
	}

}
