/*
 * Created on 26 janv. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.main;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public abstract class PrettyPrinterAbstract implements IPrettyPrinter {

	public PrettyPrinterAbstract(PrintStream output) {
		super();
		this.output = output;
		this.level = 0;
		this.nl=true;
		this.stack = new LinkedList<Object> ();
	}

	private int level;
	public void increase () { ++level; }
    public void decrease () { --level; }
	private boolean nl;
	public void println () {
		output.println();
		nl=true;
	}
	public void print (String text) {
		if (nl) {
			insertIndent();
			nl=false;
		}
		output.print (text);
	}
	public void println (String text) {
		if (nl) {
			insertIndent();
		}
		output.println (text);
		nl=true;
	}
	private void insertIndent () {
		for (int i=0; i< level*3; ++i) {
			output.print(' ');
		}
	}

	/* (non-Javadoc)
	 * @see subject.IPrettyPrinter#print(java.lang.Object)
	 */
	public void print (Object o) {
		if (recurse(o))						{ printRecursion(o); }
		else if (o instanceof List) 		{ push (o); print ((List) o); pop(); }
        else if (o == null)					{ println ("(null)"); }
        else println ("***** Unknown Object *****");
	}
	
	/* (non-Javadoc)
	 * @see subject.IPrettyPrinter#print(java.util.List)
	 */
	public void print (List l) {
		if (!nl) println ();
		if (l == null) {
			println ("null");
		} else if (l.isEmpty()){
			println ("empty");
		} else {
			Iterator i = l.iterator();
			int j=0;
			while (i.hasNext()) {
				Object o = i.next();
//				print ("["+j+"]=@"+Integer.toHexString(o.hashCode())+" ");
				print ("["+j+"]= ");
				print (o);
				++j;
			}
		}
	}

	protected void printRecursion (Object e) {
		println ("Warning recursion with object @"+Integer.toHexString(e.hashCode())+" ");
	}

	protected boolean recurse (Object o) {
		return stack.contains(o);
	}

	protected void push (Object o) {
		stack.add(0, o);
	}

	protected void pop () {
		stack.remove(0);
	}

	private PrintStream output;
	private List<Object> stack;

}
