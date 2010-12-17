package org.kermeta.ki.kompren.view;

public class Question {
	protected String subject;
	
	protected String answer;
	
	protected double time;
	
	protected long nbMouseDistance;
	
	protected long nbMousePress;
	
	protected long nbScrolls;
	
	protected long nbZooms;
	
	
	public Question() {
		super();
		
		subject 		= "";
		answer 			= "";
		time 			= -1.;
		nbMouseDistance = 0l;
		nbMousePress 	= 0l;
		nbScrolls 		= 0l;
		nbZooms 		= 0l;
	}


	public void computeTime(final long startTime, final long endTime) {
		time = (endTime - startTime)/1000.;
	}
	
	
	@Override
	public String toString() {
		return nbMouseDistance + "\t" + nbMousePress + '\t' + nbScrolls + '\t' + nbZooms + '\t' + time + '\n';
		
	}
}
