package movefactory;



import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.drools.FactHandle;
import org.drools.WorkingMemory;
import org.drools.solver.core.move.Move;
import org.eclipse.emf.ecore.*;

import domain.Decomposer;
import domain.EcoreSolution;

/**
 * @author Antonio de Almeida Souza Neto
 */
public class EClassRemoveMove implements Move{

	private EPackage epackage;
	
	private EcoreSolution ecoreSolution;
	
	private EObject obj;
	
	
	
	public EClassRemoveMove(EcoreSolution ecoreSolution, EObject obj){
		this.ecoreSolution = ecoreSolution;
		this.obj = obj;
		this.epackage = ecoreSolution.getEpackage();
	}
	
	@Override
	public Move createUndoMove(WorkingMemory workingMemory) {
		// TODO Auto-generated method stub
	   return  new EClassAddMove(ecoreSolution, obj);
	}

	@Override
	public void doMove(WorkingMemory workingMemory) {
		FactHandle classHandle = workingMemory.getFactHandle(epackage);
		Decomposer decomposer = new Decomposer();
		
		//workingMemory.retract(classHandle);
       	
        //workingMemory.modifyRetract(classHandle);
        //lesson.setTimeslot(toTimeslot);
//        workingMemory.mod(lessonHandle, lesson);
		
		workingMemory.modifyRetract(classHandle); // before changes are made
       
        epackage.getEClassifiers().remove(obj);
        
        ecoreSolution.setFacts(decomposer.doSwitch(epackage));

        
        workingMemory.modifyInsert(classHandle, epackage); // after changes are made
        
	}

	@Override
	public boolean isMoveDoable(WorkingMemory workingMemory) {
		if( epackage.getEClassifiers().contains(obj) && ecoreSolution.getFacts().contains(obj)){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (this == o) {
            return true;
        } else if (o instanceof EClassRemoveMove) {
        	EClassRemoveMove other = (EClassRemoveMove) o;
            return new EqualsBuilder()
                    .append(epackage, other.epackage)
                    .append(obj, other.obj)
                    .isEquals();
        } else {
            return false;
        }

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return new HashCodeBuilder()
        .append(epackage)
        .append(obj)
        .toHashCode();

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Remove a instance Class of " + ((EClass)obj).getName() + " of the package ";
	}
	
	

}
