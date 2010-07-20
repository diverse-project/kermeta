package domain;

import java.util.ArrayList;
import java.util.Collection;

import org.drools.solver.core.score.DefaultSimpleScore;
import org.drools.solver.core.score.Score;
import org.drools.solver.core.solution.Solution;
import org.drools.solver.examples.common.domain.AbstractPersistable;
import org.eclipse.emf.ecore.*;


/**
 * @author Antonio de Almeida Souza Neto
 */
public class EcoreSolution extends AbstractPersistable implements Solution{

	private EPackage epackage;
	
	private Collection<EObject> facts = new ArrayList<EObject>();
	
	public EPackage getEpackage() {
		return epackage;
	}

	public void setEpackage(EPackage epackage) {
		this.epackage = epackage;
	}

	@Override
	public Solution cloneSolution() {
		// TODO Auto-generated method stub
		CloneEPackage cloneEPackage = new CloneEPackage();
		EPackage epackageCloned = (EPackage)cloneEPackage.doSwitch( epackage );
		Decomposer decomposer = new Decomposer();

			
		EcoreSolution solClone = new EcoreSolution();
		solClone.id = id;
		solClone.setFacts(decomposer.doSwitch(epackageCloned));
		solClone.setEpackage(epackageCloned);
		solClone.score = score;
		
		return solClone;
	}
	
	public void setFacts(Collection<EObject> facts) {
		this.facts = facts;
	}

	public Collection<EObject> getFacts() {
		return facts;
	}

	
    private DefaultSimpleScore score;
	public Score getScore() {
		return score;
	}

	@Override
	public void setScore(Score arg0) {
		this.score = (DefaultSimpleScore) arg0;
		
	}

}
