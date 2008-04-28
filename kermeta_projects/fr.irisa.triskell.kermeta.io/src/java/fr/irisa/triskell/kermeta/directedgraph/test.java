package fr.irisa.triskell.kermeta.directedgraph;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DirectedGraphTest test=new DirectedGraphTest();
		Findcycle find=new Findcycle(test);
		
		
		
		//System.out.println("cycle :" + find.findloop());
		
		System.out.println("le premier cycle est :" + find.findfirstcycle());
		

	}

}
