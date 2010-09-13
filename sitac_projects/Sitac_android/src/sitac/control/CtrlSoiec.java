package sitac.control;

import java.util.ArrayList;

import sitac.model.Goal;
import sitac.model.Situation;
import sitac.model.Soiec;
import sitac.model.Technique;

public class CtrlSoiec {
	
	private Soiec soiec;
	private static CtrlSoiec instance;

	private CtrlSoiec()
	{
		soiec=new Soiec("Intervention");
	}
	
	public static CtrlSoiec getInstance()
	{
		if(instance==null)
			instance=new CtrlSoiec();
		return instance;
	}
	
	public void addSituation(String s)
	{
		Situation situation=new Situation(s);
		soiec.addSituation(situation);
	}
	
	public int getNrOfSituations()
	{
		return soiec.getNrSituations();
	}
	
	public ArrayList<String> getSituationsDesc()
	{
		ArrayList<String> situations=new ArrayList<String>();
		int size=soiec.getNrSituations();
		for(int i=0;i<size;i++)
			situations.add(soiec.getSituation(i).getDescripton());
		return situations;
	}
	
	public String getSituationDesc(int sitindex)
	{
		return soiec.getSituation(sitindex).getDescripton();
	}
	
	public void setSituationDesc(int sitindex, String desc)
	{
		soiec.getSituation(sitindex).setDescription(desc);
	}
	
	public void addGoalToSituation(int sitindex,String g)
	{
		Goal goal=new Goal(g);
		soiec.getSituation(sitindex).addGoal(goal);
	}
	
	public int getNrOfGoals(int sitindex)
	{
		return soiec.getSituation(sitindex).getNrGoals();
	}
	
	public ArrayList<String> getGoalsDesc(int sitindex)
	{
		ArrayList<String> goals=new ArrayList<String>();
		int size=soiec.getSituation(sitindex).getNrGoals();
		for(int i=0;i<size;i++)
			goals.add(soiec.getSituation(sitindex).getGoal(i).getDescripton());
		return goals;
	}
	
	public String getGoalDesc(int sitindex, int objindex)
	{
		return soiec.getSituation(sitindex).getGoal(objindex).getDescripton();
	}
	
	public void setGoalDesc(int sitindex, int objindex, String desc)
	{
		soiec.getSituation(sitindex).getGoal(objindex).setDescription(desc);
	}
	
	public void addTechniqueToGoal(int sitindex,int objindex,String t)
	{
		Technique technique=new Technique(t);
		soiec.getSituation(sitindex).getGoal(objindex).addTechnique(technique);
	}
	
	public int getNrOfTechniques(int sitindex,int objindex)
	{
		return soiec.getSituation(sitindex).getGoal(objindex).getNumberTechniques();
	}
	
	public ArrayList<String> getTechniquesDesc(int sitindex,int objindex)
	{
		ArrayList<String> techniques=new ArrayList<String>();
		int size=soiec.getSituation(sitindex).getGoal(objindex).getNumberTechniques();
		for(int i=0;i<size;i++)
			techniques.add(soiec.getSituation(sitindex).getGoal(objindex).getTechnique(i).getDescription());
		return techniques;
	}
	
	public String getTechniqueDesc(int sitindex,int objindex,int techindex)
	{
		return soiec.getSituation(sitindex).getGoal(objindex).getTechnique(techindex).getDescription();
	}
	
	public void setTechniqueDesc(int sitindex, int objindex, int techindex, String desc)
	{
		soiec.getSituation(sitindex).getGoal(objindex).getTechnique(techindex).setDescription(desc);
	}
	
	public void addMoyenToTechnique(int sitindex,int objindex,int techindex, int moyen)
	{
		soiec.getSituation(sitindex).getGoal(objindex).getTechnique(techindex).addMoyen(moyen);
	}
	
	public ArrayList<Integer> getTechniqueMoyens(int sitindex, int objindex, int techindex)
	{
		return soiec.getSituation(sitindex).getGoal(objindex).getTechnique(techindex).getMoyens();
	}
}
