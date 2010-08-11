package control;

import view.TabView;

public class Main {
	public static void main(String[] args)
    {
    	Ctrl controller=new Ctrl();
    	TabView view=new TabView(controller);
    	controller.addView(view);
    }
}
