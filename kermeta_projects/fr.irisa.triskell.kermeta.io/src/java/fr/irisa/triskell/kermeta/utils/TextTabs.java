/* $Id: TextTabs.java,v 1.2 2005-07-13 10:02:08 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : TextTabs.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 11 juil. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        This class is used to simplify the use of tabs in a hierachical structure 
 */
package fr.irisa.triskell.kermeta.utils;

/**
 * This class is used to simplify the use of tabs in a hierachical structure 
 */
public class TextTabs {
	protected String tabStringIncrement = "   ";
	protected int currentTabLevel = 0;
	protected String currentTabString = "";
	protected String initialString = "";
	
	/**
	 * Create new TextTabs using default increment (3 blanks)
	 */
	public TextTabs(){
		
	}

	/**
	 * Create new TextTabs setting the increment
	 */
	public TextTabs(String newTabStringIncrement){
		tabStringIncrement = newTabStringIncrement;
	}

	/**
	 * Create new TextTabs setting the increment
	 * the initString allows to create a tabstring prefixed with this string. This is usefull 
	 * with log4j that strip the leading spaces
	 */
	public TextTabs(String newTabStringIncrement, String initString){
		tabStringIncrement = newTabStringIncrement;
		initialString = initString;
	}
	public String getTab() 
	{
		return currentTabString;
	}
	
	/**
	 * increments by 1 the current level
	 * @return the new tab
	 */
	public String increment()
	{
		String newTab=initialString;
		currentTabLevel++;
		for (int i = 0; i < currentTabLevel; i++) newTab = newTab + tabStringIncrement;
		currentTabString = newTab;
		return currentTabString;
	}
	
	/**
	 * decrements by 1 the current level
	 * This method is safe. ie. it stops at level 0 no matter how many time you call it. 
	 * @return the new tab
	 */
	public String decrement()
	{
		if (currentTabLevel > 0) {
			String newTab="";
			currentTabLevel--;
			for (int i = 0; i < currentTabLevel; i++) newTab = newTab + tabStringIncrement;
			currentTabString = newTab;
		}
		return currentTabString;
	}
	
	public String toString() {
		return currentTabString;
	}
}
