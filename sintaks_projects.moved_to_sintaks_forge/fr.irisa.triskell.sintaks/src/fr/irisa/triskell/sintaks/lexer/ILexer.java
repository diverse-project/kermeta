/*
 * Created on 18 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.lexer;

public interface ILexer {

	public abstract void begin();

	public abstract boolean atEnd();

	public abstract long getPosition();

	public abstract void back (long position);

	public abstract String get();

	public abstract void next();
	
	public abstract void close();

}