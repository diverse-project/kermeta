package movefactory;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.drools.FactHandle;
import org.drools.WorkingMemory;
import org.drools.solver.core.move.Move;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import domain.Decomposer;
import domain.EcoreSolution;

/**
 * @author Antonio de Almeida Souza Neto
 */
public class EClassAddMove implements Move{
	
	private EPackage epackage;
	
	private EcoreSolution ecoreSolution;
	
	private EObject obj;
	
	public EClassAddMove(EcoreSolution ecoreSolution, EObject obj){
		this.ecoreSolution = ecoreSolution;
		this.obj = obj;
		this.epackage = ecoreSolution.getEpackage();
	}

	@Override
	public Move createUndoMove(WorkingMemory arg0) {
		// TODO Auto-generated method stub
		return  new EClassRemoveMove(ecoreSolution, obj);
	}

	@Override
	public void doMove(WorkingMemory workingMemory) {
		// TODO Auto-generated method stub
        FactHandle classHandle = workingMemory.getFactHandle(epackage);
        Decomposer decomposer = new Decomposer();
       	//workingMemory.retract(classHandle);
        //workingMemory.modifyRetract(classHandle);
        //lesson.setTimeslot(toTimeslot);
//        workingMemory.mod(lessonHandle, lesson);
        
        workingMemory.modifyRetract(classHandle); // before changes are made
       
        epackage.getEClassifiers().add((EClass)obj);
        ecoreSolution.setFacts(decomposer.doSwitch(epackage));
        

        workingMemory.modifyInsert(classHandle, epackage); // after changes are made
	}

	@Override
	public boolean isMoveDoable(WorkingMemory arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (this == o) {
            return true;
        } else if (o instanceof EClassRemoveMove) {
        	EClassAddMove other = (EClassAddMove) o;
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
		return "Add a instance Class of " + ((EClass)obj).getName() + " of the package ";
	}
}
