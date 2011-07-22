package org.kermeta.language.builder.api;

import org.eclipse.core.resources.IResource;

public abstract class Builder {
	
	protected Builder(){
		super();
	}

	public final static String LOG_MESSAGE_GROUP = "org.kermeta.language.builder";
	
	public abstract void parseSpecificFile(IResource toParse, String content);
	public abstract void buildFromKP(String kpIdentifier,boolean andRun);
	public abstract void buildFromKP(String kpIdentifier);
	public abstract void compileFromKP(String kpIdentifier);
	public abstract String findKPidentifierFromKMT(IResource kmt);
	public abstract void setDirty(IResource kmt, boolean dirty);
	
	public abstract String generateIdentifier(IResource element);

}
