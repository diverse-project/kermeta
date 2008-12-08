/* $Id: Visitor.java,v 1.5 2008-12-08 14:48:25 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.ket
 * File       : Visitor.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 23 Jul. 2007
 * Authors : 
 *        Olivier Barais <barais@irisa.fr>
 * Description : 
 *   First iteration of a template engine for Kermeta
 */

package fr.irisa.triskell.kermeta.ket.builder;

import java.io.PrintWriter;
import java.util.StringTokenizer;

import org.eclipse.jet.core.parser.ast.Comment;
import org.eclipse.jet.core.parser.ast.JETASTElement;
import org.eclipse.jet.core.parser.ast.JETASTVisitor;
import org.eclipse.jet.core.parser.ast.JETCompilationUnit;
import org.eclipse.jet.core.parser.ast.JETDirective;
import org.eclipse.jet.core.parser.ast.JavaDeclaration;
import org.eclipse.jet.core.parser.ast.JavaExpression;
import org.eclipse.jet.core.parser.ast.JavaScriptlet;
import org.eclipse.jet.core.parser.ast.TextElement;


public class Visitor extends JETASTVisitor {

	
	/*class StringWriter{
		StringBuffer bf;
		public StringWriter(){
			bf = new StringBuffer();
		}
		
		public void print(String s){
			bf.append(s);
		}
		public void println(String s){
			bf.append(s);
			bf.append("\n");
		}
		public String getString(){
			return bf.toString();
		}
	}*/
	
	PrintWriter out;
	/*public String getString(){
		return out.getString();
	}*/
	
	public Visitor(PrintWriter out){
		this.out = out;
		
	}
	
	@Override
	public boolean visit(Comment comment) {
		out.println("//" + comment.getCommentText());
			return super.visit(comment);
	}


	@Override
	public boolean visit(JavaDeclaration declaration) {
		out.println(declaration.getJavaContent());
		return super.visit(declaration);
	}

	@Override
	public boolean visit(JavaExpression expression) {
		out.print("_res.append(");
		out.print(expression.getJavaContent());
		out.println(")");
		return super.visit(expression);
	}

	@Override
	public boolean visit(JavaScriptlet scriptlet) {
		out.println(scriptlet.getJavaContent());
		return super.visit(scriptlet);
	}

	
	
	@Override
	public boolean visit(JETCompilationUnit compilationUnit) {
		// TODO Auto-generated method stub
		for (Object o : compilationUnit.getBodyElements()){
			JETASTElement element = (JETASTElement) o;
			//out.println(o);
			
			element.accept(this);
		}
		out.println("result := _res.toString");
		out.println("end");
		out.println("}");
		
		return false;
		//return super.visit(compilationUnit);
		
	}

	boolean begin =false;
	@Override
	public boolean visit(JETDirective directive) {
		//out.print(directive.getName());
		/*for (Object o : directive.getAttributes().entrySet()){
			out.println(o);
	}*/
		String using = (String) directive.getAttributes().get("using");
		StringTokenizer utk = new StringTokenizer(using, " ");
		String require = (String) directive.getAttributes().get("require");
		StringTokenizer rtk = new StringTokenizer(require, " ");
		
		
		out.println("package " + directive.getAttributes().get("package") +";");
		out.println("require kermeta" );
		while (rtk.hasMoreTokens()){
			out.println("require \"" +  rtk.nextToken()+ "\"");
		}
		
		//out.println("require \"" + directive.getAttributes().get("require") + "\"");
		out.println("using kermeta::standard" );
		out.println("using kermeta::utils");
		while (utk.hasMoreTokens()){
			out.println("using " +  utk.nextToken());
		}
		boolean isAspectClass = false;
		if(directive.getAttributes().get("isAspectClass") != null) {
			if(((String)directive.getAttributes().get("isAspectClass")).equalsIgnoreCase("true")){
				isAspectClass = true;
			}			
		}
		if(isAspectClass) {
			out.print("aspect ");
		}
		out.println("class " +  directive.getAttributes().get("class") + "{");

		String operationName = "generate";
		if(directive.getAttributes().get("operation") != null) {
			operationName = (String) directive.getAttributes().get("operation");
		}
		boolean isMethod = false;
		if(directive.getAttributes().get("isMethod") != null) {
			if(((String)directive.getAttributes().get("isMethod")).equalsIgnoreCase("true")){
				isMethod = true;
			}			
		}
		if(isMethod) {
			out.print("method ");
		}
		else
			out.print("operation ");
		out.println( operationName +"("+directive.getAttributes().get("parameters")  +"):String is do");
		out.println("var _res: StringBuffer init StringBuffer.new");
		begin=true;
		

		
		return super.visit(directive);
	}

	@Override
	public boolean visit(TextElement text) {
		if (begin)
		{
			out.print("_res.append(\"");
			StringBuffer bf = new StringBuffer();
			for (int i= 0 ; i < text.getText().length;i++ ){
				if (text.getText()[i] =='\n')
					bf.append('\\').append('n');
				else if (text.getText()[i] =='"')
					bf.append('\\').append('"');
				else if (text.getText()[i] =='\'')
					bf.append('\\').append('\'');
				else if (text.getText()[i] =='\t')
					bf.append('\\').append('t');
				else if (text.getText()[i] =='\r')
					bf.append('\\').append('r');
				else if (text.getText()[i] =='\b')
					bf.append('\\').append('b');
				else if (text.getText()[i] =='\r')
					bf.append('\\').append('r');
				else if (text.getText()[i] =='\f')
					bf.append('\\').append('f');

				else
					bf.append(text.getText()[i]);

			}
			out.print(bf.toString());
			out.println( "\")");
		}
		return super.visit(text);
	}


}
