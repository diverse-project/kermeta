/*
 * @(#)PnutsConsole.java 1.1 04/07/13
 *
 * Copyright (c) 2004 Sun Microsystems, Inc. All Rights Reserved.
 *
 * See the file "LICENSE.txt" for information on usage and redistribution
 * of this file, and for a DISCLAIMER OF ALL WARRANTIES.
 */
package fr.irisa.triskell.kermeta.standalone.console;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.StringTokenizer;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

import fr.irisa.triskell.kermeta.interpreter.ExpressionCallFrame;
import fr.irisa.triskell.kermeta.interpreter.ExpressionInterpreter;
import fr.irisa.triskell.kermeta.interpreter.Variable;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.loader.message.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.expression.DynamicExpressionUnit;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;

public class KermetaConsole extends Console implements KermetaIOStream {

	protected VariablePanel vars;
	
	protected BufferedReader reader;
	
	ExpressionInterpreter exp_interpreter;
	DynamicExpressionUnit unit;
	ClassDefinition v;
	ExpressionCallFrame f;
	
	public KermetaConsole() {
		super();
		vars = new VariablePanel();
		//getPanel().add(vars, BorderLayout.EAST);
		reader = new BufferedReader(getReader());
		initialize();
	}
	
	
	
	/**
	 * @see fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream#print(java.lang.Object)
	 */
	public void print(Object outputString) {
		write(outputString.toString());
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.runtime.io.KermetaIOStream#read(java.lang.String)
	 */
	public Object read(String prompt) {
		return null;
	}
	
	
	public JPanel getVarsPanel() {
		return vars;
	}
	
	public void initialize() {
		KermetaUnit.STD_LIB_URI = "lib/framework.km";
		KermetaUnit std = KermetaUnit.getStdLib();
		KermetaInterpreter i = new KermetaInterpreter(std);
		exp_interpreter = new ExpressionInterpreter(i.getMemory());
		
		i.setKStream(this);
		
		unit = new DynamicExpressionUnit(std.packages);
		v = (ClassDefinition)std.typeDefinitionLookup("kermeta::standard::Void");
	    f =  new ExpressionCallFrame(exp_interpreter.getInterpreterContext(), unit, i.getMemory().voidINSTANCE);
	    addUsing("kermeta::standard");
	    prompt();
	}
	
	public ArrayList getVariables() {
		ArrayList result = new ArrayList();
		for (Object o_var : f.getVariables()) { result.add((Variable)o_var); }
		return result;
	}
	
	public void loadUnit(String uri) {
		write("\n loading " + uri + "...\n");
		try {
		KermetaUnit u = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(uri, unit.packages);
		u.load();
		u.typeCheckAllUnits();
		exp_interpreter.getMemory().freeJavaMemory();
		write("done.\n");
		}
		catch(Throwable e) {
			write("ERROR : " + e.getMessage() + "\n");
		}
	}
	
	public void addUsing(String pkg) {
		if (unit.packages.get(pkg) != null) {
			unit.usings.add(pkg);
		}
		else write("ERROR : package " + pkg + " not found\n");
	}
	
	public ArrayList getUsings() {
		return unit.usings;
	}
	
	protected void prompt() {
		write("kermeta>");
		vars.setVariables(getVariables());
	}
	
	protected void execute(String exp) {
		
		if (exp.equals("")) return;
		
		try {
			unit.resetMessages();
			unit.parse(exp, v, new Hashtable());
		}
		catch (Throwable e) {
			//write("Parse error\n");
			//e.printStackTrace();
			//continue;
		}
		
			if (!unit.messages.hasError()) unit.typeCheck(null);
		    if (unit.messages.hasError()) {
		       write("ERROR : " + ((KMUnitError)unit.messages.getErrors().get(0)).getMessage() + "\n");
		      
		    }
	    else {
	    	try {
	    		RuntimeObject res = f.eval(exp_interpreter);
	    		write(" -> " + res.toUserString() + "\n");
	    	}
	    	catch(Throwable t) {
	    		write("BUG : " + t.getMessage() + "\n");
	    	}

	    }
	}
	
	synchronized void enter() {
		super.enter();
		try {
			
			String t1;
			String exp = reader.readLine();
			StringTokenizer tok = new StringTokenizer(exp);
			
			if (tok.hasMoreTokens()) {
				t1 = tok.nextToken();
				if (t1.equals("require") && tok.hasMoreTokens()) {
					String uri = tok.nextToken();
					if (uri.length() > 3) {
						uri = uri.substring(1);
						uri = uri.substring(0, uri.length()-1);
						loadUnit(uri);
					}
					else {
						write("USAGE : require \"<uri>\"\n");
					}
					
				}
				else if (t1.equals("using") && tok.hasMoreTokens()) {
					addUsing(tok.nextToken());
				}
				else {			
					execute(exp);
				}
			}
			prompt();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    public static void main(String[] args) {
    	//Console c = new KermetaConsole();
    	JFrame f = new JFrame();
    	f.getContentPane().add(new ConsolePanel());
    	f.pack();
    	f.show();
    }



	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}
