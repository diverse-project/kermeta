package org.kermeta.ki.visual.view;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;


public class OperationView extends EntityElementView {
	protected boolean method;
	
	protected boolean isAbstract;
	
	protected List<ParameterView> parameters;
	
	
	public static RuntimeObject onParameterAdded(RuntimeObject operationRO, RuntimeObject nameRO, RuntimeObject typeNameRO) {
		OperationView operation = (OperationView) operationRO.getUserData();
		String name				= fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(nameRO);
		String typeName			= fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(typeNameRO);
		
		operation.parameters.add(new ParameterView(name, typeName));
		operation.update();
		operation.entity.update();
		
		return operationRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public OperationView(String name, String typeName, boolean isAbstract, EntityView parent) {
		super(name, typeName, parent);
		
		parameters 		= new ArrayList<ParameterView>();
		this.isAbstract = isAbstract;
		
		update();
	}
	
	
	
	@Override
	protected String getFullText() {
		return name + "(" + (parameters.isEmpty() ? "" : "...") + ")" + (typeName.length()==0 ? "" : " : " + typeName);
	}



	@Override
	public Font getFont() {
		return new Font(entity.font.getName(), isAbstract ? Font.ITALIC : Font.PLAIN, (int)(entity.fontSize*0.9));
	}
}
