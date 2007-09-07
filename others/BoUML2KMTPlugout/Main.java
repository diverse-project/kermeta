// the program is called with the socket port number in argument


class Main {
	public static StringBuffer s=new StringBuffer("");

	public static void main(String argv[]) {

	  
    if (argv.length == 1) {
      UmlCom.connect(Integer.valueOf(argv[0]).intValue());
//      System.out.println(argv[0]);
      try {
        // does something on the target, here suppose that a virtual
        // operation exist at UmlItem level (and probably sub_level !)
    	  UmlCom.trace("// Kmt Code Generation provided by the Triskell Team");
    	 
    	  UmlItem root =  UmlCom.targetItem();
    	 // while (!(root.parent().equals( root)))
    	  while (root.parent()!=null)
      		  root =  root.parent();
    	  root.accept(new GenerateKmt());
    	  //UmlCom.targetItem().accept(new GenerateKmt());
    	  
    	  UmlCom.trace(s.toString());
    	  
    	  UmlCom.trace("// Generation Ig Finished");
    	  
    	  
    	  
      }
      finally {
        // must be called to cleanly inform that all is done
        UmlCom.bye();
        UmlCom.close();
      }
    }
    System.exit(0);
  }
}
