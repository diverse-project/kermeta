package org.kermeta.ki.visual.view;

public class ParameterView {
	protected String name;
	
	protected String typeName;
	
	
	public ParameterView(String name, String typeName) {
		super();
		
		this.name 		= name;
		this.typeName 	= typeName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTypeName() {
		return typeName;
	}


	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
}
