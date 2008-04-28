package fr.irisa.triskell.kermeta.directedgraph;

import java.util.ArrayList;

/**
 * @author ssaudrai
 *
 * Class who search if in a DirectedGraph, there is cycle
 * findcycle return true if a cycle is found
 * findfirstcycle return the firt cycle found if he exists
 * findallcycles return all the cycles of the graph
 */
public class Findcycle {
	ArrayList nodelist;
	DirectedGraphInterface GI;
	
	public Findcycle(DirectedGraphInterface GI){
		this.GI=GI;
		// Construction de l'ensemble S des noeuds sans parents	
		nodelist=GI.getAllNodes();
	}
	// retourne le premier cycle trouv�
	public ArrayList findfirstcycle(){
//		 Pour chaque s de S on v�rifie si il y un cycle
		// appel de cycle : chemin courant et retourne bool�en
		while(!nodelist.isEmpty()){
			Object current=nodelist.get(0);
			ArrayList chemin=new ArrayList();
			chemin.add(current);
			ArrayList retour=returnchemin(chemin);
			if (retour!=null)return retour;
			nodelist.remove(0);
		}
		return null;
	}
	
	// retourne vrai si il existe un cycle
	public boolean findcycle(){	
		
		// Pour chaque s de S on v�rifie si il y un cycle
		// appel de cycle : chemin courant et retourne bool�en
		while(!nodelist.isEmpty()){
			//System.out.println("liste des noeuds restants:"+nodelist.toString());
			Object current=nodelist.get(0);
			ArrayList chemin=new ArrayList();
			chemin.add(current);
			if (chemin(chemin)){
				return true;
			}
			nodelist.remove(0);
		}
		return false;
	}
	
	public ArrayList findallcycle(){
		//		 Pour chaque s de S on v�rifie si il y un cycle
		// appel de cycle : chemin courant et retourne bool�en
		ArrayList result=new ArrayList();
		while(!nodelist.isEmpty()){
			Object current=nodelist.get(0);
			ArrayList chemin=new ArrayList();
			chemin.add(current);
			ArrayList retour=returnchemin(chemin);
			if (retour!=null) result.add(retour);
			nodelist.remove(0);
		}
		return result;
	}
	
	// retourne vrai si un cycle existe
	public boolean chemin(ArrayList chemin){
		// R�cup�ration de l'ensemble des parents
		ArrayList parents=GI.getTargetsforNode(chemin.get(chemin.size()-1));
		// si l'ensemble des parents est non vide
		if(!parents.isEmpty()){
			//pour chaque parent on recherche la pr�sence de cycle
			while (!parents.isEmpty()){
				// si le parent choisi appartient � l'ensemble --> cycle
				Object parent=parents.get(0);
				if(chemin.contains(parent)){
					return true;
				} else {
					// ajout du noeud courant au chemin
					chemin.add(parent);
					// appel de chemin
					if (chemin(chemin)){
						return true;
					} else {
						parents.remove(parent);
					}
				}
			}
		} else {
			// si il est vide pas de cycle pr�sent
			return false;
		}
		return false;
	}
	
	public ArrayList returnchemin(ArrayList chemin){
		// R�cup�ration de l'ensemble des parents
		ArrayList parents=GI.getTargetsforNode(chemin.get(chemin.size()-1));
		// si l'ensemble des parents est non vide
		if(!parents.isEmpty()){
			//pour chaque parent on recherche la pr�sence de cycle
			while (!parents.isEmpty()){
				// si le parent choisi appartient � l'ensemble --> cycle
				Object parent=parents.get(0);
				if(chemin.contains(parent)){
					chemin.add(parent);
					return cycle(chemin);
				} else {
					// ajout du noeud courant au chemin
					chemin.add(parent);
					// appel de chemin
					return returnchemin(chemin);
				}		
			}
		} else {
			// si il est vide pas de cycle pr�sent
			return null;
		}
		return null;
	}
	
	public ArrayList cycle(ArrayList chemin){
		Object dernier=chemin.get(chemin.size()-1);
		
		while ((chemin.get(0).equals(dernier))){
			chemin.remove(chemin.size()-1);
			dernier=chemin.get(chemin.size()-1);
		}
		return chemin;
	}
}
