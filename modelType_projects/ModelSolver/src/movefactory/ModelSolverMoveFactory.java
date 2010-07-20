package movefactory;

import java.util.ArrayList;
import java.util.List;

import org.drools.solver.core.move.Move;
import org.drools.solver.core.solution.Solution;
import org.drools.solver.core.move.factory.CachedMoveFactory;

import org.eclipse.emf.ecore.*;


import domain.EcoreSolution;


/**
 * @author Antonio de Almeida Souza Neto
 */
public class ModelSolverMoveFactory extends CachedMoveFactory{

	public List<Move> createCachedMoveList(Solution solution) {
		EcoreSolution ecoreSolution = (EcoreSolution) solution;
        List<Move> moveList = new ArrayList<Move>();
        EPackage epackage = ecoreSolution.getEpackage();
        
        
        for (EObject obj: epackage.eContents() ) {
        	moveList.add(new EClassRemoveMove(ecoreSolution, obj));
		}
        
     

        return moveList;
	}
	

}
