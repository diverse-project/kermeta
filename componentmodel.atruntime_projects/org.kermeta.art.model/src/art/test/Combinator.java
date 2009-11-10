package art.test;

import java.util.ArrayList;

public class Combinator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] states = {"S1", "S2", "S3", "S4", "S5", "S6"};
		ArrayList<String> sequence = new ArrayList<String>();
		
		getForIndex(0, states, sequence);
		
		for(String s : sequence) {
			System.out.print(s + "; ");
		}
		
		System.out.println("");
		System.out.println("Number of transitions : " + sequence.size());

	}
	
	public static void getForIndex(int i, String[] states, ArrayList<String> sequence) {
		
		for (int j = 0; j < i-1; j++) {
			sequence.add(states[i] + "->" + states[j]);
			sequence.add(states[j] + "->" + states[i]);
		}
		
		if (i < states.length -1) {
			sequence.add(states[i] + "->" + states[i+1]);
			getForIndex(i+1, states, sequence);
		}
		
		sequence.add(states[i] + "->" + states[i]);
		if (i > 0) sequence.add(states[i] + "->" + states[i-1]);
	}

}
