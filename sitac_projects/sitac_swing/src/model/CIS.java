package model;

import java.util.ArrayList;
import java.util.List;

public class CIS {
	private List<Moyen> moyens = new ArrayList<Moyen>();
	
	public CIS()
	{
		Moyen m1 = new Moyen(new MoyenType(1), "FPT", 1);
		Moyen m2 = new Moyen(new MoyenType(2), "VSAV", 1);
		Moyen m3 = new Moyen(new MoyenType(1), "FPT", 2);
		moyens.add(m1);
		moyens.add(m2);
		moyens.add(m3);
		Moyen m4 = new Moyen(new MoyenType(1), "FPT", 3);
		Moyen m5 = new Moyen(new MoyenType(2), "VSAV", 2);
		m1.getChildren().add(m4);
		m1.getChildren().add(m5);
	}
	
	public List<Moyen> getMoyens()
	{
		return moyens;
	}
}
