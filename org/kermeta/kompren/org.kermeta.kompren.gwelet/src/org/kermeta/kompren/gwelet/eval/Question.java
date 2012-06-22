package org.kermeta.kompren.gwelet.eval;

public class Question {
	protected static int cpt = 0;
	
	protected String subject;
	
	protected String answer;
	
	protected String helper;
	
	protected double time;
	
	protected long nbMouseDistance;
	
	protected long nbMousePress;
	
	protected long nbScrolls;
	
	protected long nbZooms;
	
	protected int id;
	
	
	public Question() {
		super();
		
		id 				= cpt++;
		subject 		= "";
		answer 			= "";
		helper			= "";
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
		return id + "\t" + nbMouseDistance + "\t" + nbMousePress + "\t" + nbScrolls + "\t" + nbZooms + "\t" + time + "\t\"" + answer + "\"\n";
	}


	public void setAnswer(final String answer) {
		this.answer = answer;
	}
}
