package org.kermeta.ki.diagram.view.impl;

public class Number {
	public static final Number NUMBER = new Number();
	
	private Number() {
		super();
	}
	
	
	
	public boolean equals(final double a, final double b){
		return Math.abs(a - b) <= 0.00001;
	}
}
