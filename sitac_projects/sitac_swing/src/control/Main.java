package control;

import view.TabView;

public class Main {
	public static void main(String[] args)
    {
    	Ctrl controller = new Ctrl();
    	SoiecControl soiecCtrl = new SoiecControl();
    	MoyenControl moyenCtrl = new MoyenControl();
    	TabView view = new TabView(controller, soiecCtrl, moyenCtrl);
    	controller.addView(view);
    }
}
