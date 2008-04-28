/* $Id: Edge.java,v 1.4 2008-04-28 11:50:12 ftanguy Exp $
 * Project : fr.irisa.triskell.kermeta.io
 * File : Edge.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 28 nov. 2005
 * Authors : 
 * 	   Didier Vojtisek <dvojtise@irisa.fr>
 */ 

package fr.irisa.triskell.kermeta.directedgraph;

import java.util.Enumeration;
import java.util.Vector;


public class Edge {
	public int fromID;		// origin of the edge
	public int toId;		// destination of the edge
	public Edge(int o,int g) { fromID =o; toId=g;}
	public Edge copy() {
		Edge e;
		e=new Edge(fromID,toId);
		return(e);
	}
	/************************************************/
	/*                  Edge_in_List                */
	/************************************************/
	public static boolean Edge_in_list( Edge e, Vector ev) {
		boolean result=false;
		Edge one_edge;
		Enumeration enumeration;
		enumeration = ev.elements();
		while ( enumeration.hasMoreElements() && result==false) {
			one_edge =(Edge) enumeration.nextElement();
			if (one_edge.fromID == e.fromID && one_edge.toId == e.toId) {
				result = true;
			}
		}
		return(result);
	}
	/*********************************************/
	/*        copy_edge_list                     */
	/*********************************************/
	/* returns a copy of a list of edges         */
	/*********************************************/
	public static Vector copy_edge_list(Vector edl) {
		Vector v;
		Enumeration e;
		Edge one_edge;
		v=new Vector();
		e=edl.elements();
		while ( e.hasMoreElements() ){
			one_edge = (Edge) e.nextElement();
			v.addElement(one_edge.copy());
		}
		return(v);
	}
	/***************************************************/
	/*                      IN_List                    */
	/* returns true if num is contained in the integer */
	/* list l                                          */
	/***************************************************/
	public static boolean In_List(int num, Vector l) {
		boolean result;
		Integer i;
		Enumeration e=l.elements();
		result=false;
		while (e.hasMoreElements() && result==false ){
			i=(Integer)e.nextElement();
			if (i.intValue()==num) {result=true;}
		}
		return(result);
	}
	/**********************************************/
	/*           successorlist                    */
	/**********************************************/
	public static Vector successorlist(Vector numevents, Vector ledges) {
		Enumeration e;
		Edge one_edge;
		Vector result;
		result=new Vector();
		e=ledges.elements();
		while(e.hasMoreElements()) {
			one_edge=(Edge)e.nextElement();
			if ( In_List(one_edge.fromID,numevents)==true &&
					In_List(one_edge.toId,numevents)==false){
				result.addElement(new Integer(one_edge.toId));
			}
		}
		return(result);
	}
	public static Vector successorlist(int numevent, Vector ledges) {
		Enumeration e;
		Edge one_edge;
		Vector result;
		result=new Vector();
		e=ledges.elements();
		while(e.hasMoreElements()) {
			one_edge=(Edge)e.nextElement();
			if ( one_edge.fromID==numevent){
				result.addElement(new Integer(one_edge.toId));
			}
		}
		return(result);
	}
	/**********************************************/
	/*           predecessorlist                  */
	/**********************************************/
	public static Vector predecessorlist(Vector numevents, Vector ledges) {
		Enumeration e;
		Edge one_edge;
		Vector result;
		result=new Vector();
		e=ledges.elements();
		while(e.hasMoreElements()) {
			one_edge=(Edge)e.nextElement();
			if ( In_List(one_edge.toId,numevents)==true &&
					In_List(one_edge.fromID,numevents)==false){
				result.addElement(new Integer(one_edge.fromID));
			}
		}
		return(result);
	}
	public static Vector predecessorlist(int numevent, Vector ledges) {
		Enumeration e;
		Edge one_edge;
		Vector result;
		result=new Vector();
		e=ledges.elements();
		while(e.hasMoreElements()) {
			one_edge=(Edge)e.nextElement();
			if ( one_edge.toId==numevent){
				result.addElement(new Integer(one_edge.fromID));
			}
		}
		return(result);
	}
	public static boolean Inter_Not_Empty(Vector l1,Vector l2) {
		boolean notempty;
		Enumeration e;
		Integer i;
		e=l1.elements();
		notempty=false;
		while (e.hasMoreElements() && notempty==false) {
			i=(Integer)e.nextElement();
			if (In_List(i.intValue(),l2)==true ){
				notempty = true;
			}
		}
		return(notempty);
	}
	public void concat(Vector v1,Vector v2) {
		Integer i;
		Enumeration e = v2.elements();
		while (e.hasMoreElements() ){
			i=(Integer)e.nextElement();
			v1.addElement(i);
		}
	}
	/******************************************************/
	/*               is_Transitive                        */
	/******************************************************/
	public boolean is_transitive(Vector cl) {
		boolean result;
		Vector suc;
		Vector imsuc;
		Vector pred;
		Vector impred;
		Vector l_tempo;
		/* compute predecessors of current*/
		/* find_successors of x in cl */
		suc = new Vector();
		imsuc=new Vector();
		imsuc.addElement(new Integer(fromID));
		l_tempo = successorlist(imsuc,cl);
		while (l_tempo.size() >0) {
			concat(suc,l_tempo);
			l_tempo = successorlist(suc,cl);
		}
		/* fin predecessors of toId in cl */
		pred =new Vector();
		impred=new Vector();
		impred.addElement(new Integer(toId));
		l_tempo = predecessorlist(impred,cl);
		while (l_tempo.size() >0 ) {
			concat(pred,l_tempo);
			l_tempo = predecessorlist(pred,cl);
		}
		/* if the set of successors of fromID and predecessors of toId */
		/* is not disjoint, then there is a path from fromID to toId and  */
		/* (fromID,toId) can be obtained by transitive closure         */
		result=Inter_Not_Empty(pred,suc);
		return(result);
	}
	/************************************************/
	/*                   Coverage                   */
	/************************************************/
	/* give the minimal covering relation for a     */
	/* list of causality edges                      */
	/************************************************/
	public static Vector coverage(Vector el ) {
		Enumeration enumeration;
		Edge e;
		Vector result;
		result=new Vector();
		enumeration=el.elements();
		while (enumeration.hasMoreElements()) {
			e=(Edge)enumeration.nextElement();
			if (e.is_transitive(el)==false) {
				result.addElement(new Edge(e.fromID,e.toId));
			}
		}
		return(result);
	}
	/************************************************/
	/*               DROP                           */
	/************************************************/
	/* prints an edge to screen in textual format   */
	/************************************************/
	public void drop() { System.out.println(fromID + "->" + toId);}
	/****************************************/
	/*             Drop_dot                 */
	/****************************************/
	/* drops an edge for the DOT tool       */
	/* shape describes the color, weight,   */
	/* style, etc.                          */
	/****************************************/
	public void drop_dot(String shape) {
		System.out.println(fromID + "->" + toId + shape);}
	public String toString(){
		return "("+fromID+";"+toId+")";
	}
}