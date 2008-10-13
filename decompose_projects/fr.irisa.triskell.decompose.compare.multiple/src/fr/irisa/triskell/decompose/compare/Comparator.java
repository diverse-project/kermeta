package fr.irisa.triskell.decompose.compare;

import java.io.IOException;

import ocompare.Compare;
import ocompare.CompareElement;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.compare.diff.api.IDiffEngine;
import org.eclipse.emf.compare.diff.engine.GenericDiffEngine;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.match.api.IMatchEngine;
import org.eclipse.emf.compare.match.engine.GenericMatchEngine;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.ecore.EObject;


public class Comparator {
	private MatchModel matchModel;
	private DiffModel diffModel;
	private EObject updateModel;
	
	private IDiffEngine diffEngine;
	private IMatchEngine matchEngine;
	
	private String lastURI="";
	private Compare compare;
	
	private EObject lastModel;
	
	public Comparator(String path){
		try {
			this.compare=(Compare)Helper.load(path,null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Comparator(IPath location) {
		try {
			this.compare=(Compare)Helper.load(null,location);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void doCompare() throws IOException, InterruptedException{
		for(CompareElement element:compare.getToCompare()){
			this.diffEngine=new GenericDiffEngine();
			this.matchEngine=new GenericMatchEngine();
			EObject model1;
			if(this.lastURI!=element.getOriginalURI()){
				model1 = Helper.load(element.getOriginalURI(),null);
				this.lastURI = element.getOriginalURI();
				this.lastModel = model1;
			}
			else{
				model1=this.lastModel;
			}
			EObject model2 = Helper.load(element.getResultURI(),null);
			final MatchModel match = MatchService.doMatch(model1, model2, null);
			final DiffModel diff = diffEngine.doDiff(match);
			Helper.save(match,element.getMatchURI(),null);
			Helper.save(diff,element.getDiffURI(),null);
			//
		}
	}
}
