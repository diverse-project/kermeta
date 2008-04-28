/* $Id: CycleDetector.java,v 1.3 2008-04-28 11:50:12 ftanguy Exp $
 * Project : Kermeta IO
 * File : KermetaConstraintChecker.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 28 Nov. 2005
 * Authors : 
 * 	Didier Vojtisek <dvojtise@irisa.fr>
 */ 

/* Algorithme de Tiernan */
/* pour detecter les cycles elementaires */
package fr.irisa.triskell.kermeta.directedgraph;
import java.util.Enumeration;
import java.util.Vector;
import java.util.Stack;
import javax.swing.JTextArea;





public class CycleDetector {
	
	/**
	 *
	 * @uml.property name="goals"
	 * @uml.associationEnd
	 * @uml.property name="goals" multiplicity="(0 1)"
	 */
	Vector goals[]; /* liste les successeurs pour chaque sommet */
	
	/**
	 *
	 * @uml.property name="h"
	 * @uml.associationEnd
	 * @uml.property name="h" multiplicity="(0 1)"
	 */
	Vector explorerTransition[]; /* list of explored transition for one vertex */
	
	int nbnodes; /* number of nodes in the graph */
	
	
	public CycleDetector(int nb, Vector edges) {
		
		
		Enumeration e;
		Edge one_edge;
		
		goals=new Vector[nb];
		explorerTransition=new Vector[nb];
		nbnodes=nb;
		for(int i=0;i<nbnodes;i++) {
			goals[i]=new Vector();
			explorerTransition[i]=new Vector();
		}
		
		
		e=edges.elements();
		while (e.hasMoreElements()) {
			
			one_edge=(Edge) e.nextElement();
			goals[one_edge.fromID].addElement(new Integer(one_edge.toId));
			
		}
		
	} /* end of constructor */
	
	
	
	/***************************************************/
	/*              print_cycles                       */
	/***************************************************/
	
	public Vector find_cycles() {
		
		
		Vector cy=new Vector();
		Vector result=new Vector();
		
		boolean endloop=false;
		int v,sv,k;
		int x=0;
		Stack P;
		boolean vfound;
		Integer i,j;
		
		int top; /* vertex number at the top of the stack */
		
		v = 0; /* start with the first vertex */
		sv = v; /* start vertex */
		v=v+1;
		P=new Stack(); P.push(new Integer(sv));
		k=0;
		
		while (endloop==false) {
			
			
			/* find x in succ(top(P)) */
			vfound=false;
			top=((Integer)P.peek()).intValue();
			Enumeration e=goals[top].elements();
			
			while (!vfound && e.hasMoreElements() ) {
				x = ((Integer) e.nextElement()).intValue();
				if( x > sv && !In_List(x,P) &&
						!In_List(x,explorerTransition[top]) ) {
					
					vfound=true;
				}
			}
			
			if (vfound) { /* if a successor was found */
				P.push(new Integer(x));
				k=k+1;
			}
			
			else {
				if ( In_List(sv,goals[top]) ) {
					/* if the start vertex */
					/* is included in the successors of current vertex */
					
					/*  print_path(P) ; */
					
					result.addElement(copy_path(P));
					
				}
				if (k != 0 ) {
					
					explorerTransition[top ]=new Vector();
					j=(Integer)P.elementAt(k-1);
					explorerTransition[j.intValue()].addElement(new Integer(top));
					P.pop();
					k=k-1;
					
				} else {
					
					
					if (v==nbnodes) { /* if all nodes have been explored */
						endloop=true;
					} else {
						sv=v;
						P=new Stack(); P.push(new Integer(sv));
						v=v+1;
						k=0;
					}
					
				}
				
			}
		}
		
		return(result);
	} /* end of find_cycles */
	
	/************************************************/
	/*               copy path                      */
	/************************************************/
	
	static Vector copy_path(Stack s) {
		
		int i;
		int x;
		Vector result=new Vector();
		
		for(i=0;i<s.size();i++) {
			x= ((Integer) s.elementAt(i)).intValue();
			result.addElement(new Integer(x));
			
		}
		
		return(result);
		
	}
	
	
	/***********************************************/
	/*           print_path                        */
	/***********************************************/
	
	
	static void print_path(Vector s) {
		
		int i;
		Integer x;
		
		System.out.println("Cycle :");
		
		for(i=0;i<s.size();i++) {
			x= (Integer) s.elementAt(i);
			System.out.print( x.intValue() + " ");
			
		}
				
	}
	
	
	static void output_path(JTextArea out,Vector s) {
		
		int i;
		Integer x;
		
		out.append("Cycle :\n");
		
		for(i=0;i<s.size();i++) {
			x= (Integer) s.elementAt(i);
			out.append( x.intValue() + " ");
			
		}
		
		out.append("\n");
		
	}
	
	
	
	/************************************************/
	/*                   In_List                    */
	/************************************************/
	
	static boolean In_List(int x, Vector v) {
		
		Integer n;
		boolean    found=false;
		Enumeration e;
		
		
		e=v.elements();
		while (e.hasMoreElements() && found == false) {
			
			n=(Integer) e.nextElement();
			if ( n.intValue() == x) { found = true;}
			
		}
		
		return(found);
		
	}
	
	
	
	
} /* end of class cycles */