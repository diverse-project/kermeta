package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


import movefactory.MergeEClassMove;

import org.drools.solver.config.XmlSolverConfigurer;
import org.drools.solver.core.Solver;
import org.drools.solver.core.solution.Solution;
import org.drools.solver.examples.common.app.LoggingMain;
import org.drools.solver.examples.common.persistence.SolutionDao;
import org.drools.solver.examples.common.persistence.XstreamSolutionDaoImpl;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.impl.EReferenceImpl;

import org.eclipse.emf.compare.util.ModelUtils;

import persistence.RulesFile;

import domain.Decomposer;
import domain.EcoreSolution;
import domain.FillResourceEPackage;

/**
 * @author Antonio de Almeida Souza Neto
 */
public class ModelSolverApp extends LoggingMain {

	public static final String SOLVER_CONFIG = "/config/ModelSolverConfig.xml";

	public static final String FILE_INPUT = System.getProperty("user.dir")
			+ "/src/input/modelRules.drl";

	public static final String FILE_OUTPUT = System.getProperty("user.dir")
			+ "/src/output/model.ecore";
	
	public static void main(String[] args) {
		new ModelSolverApp();
	}

	protected Solver createSolver() {
		XmlSolverConfigurer configurer = new XmlSolverConfigurer();
		configurer.configure(SOLVER_CONFIG);
		return configurer.buildSolver();
	}

	protected String getExampleDirName() {
		return "modelSolver";
	}

	public ModelSolverApp() {
		Solver solver = createSolutionBusiness();

		solver.solve();

		Solution bestSolution = solver.getBestSolution();

		doMerge((EcoreSolution)bestSolution);
		
		EPackage modelSolved = ((EcoreSolution) bestSolution).getEpackage();
		
		FillResourceEPackage fillResourceEPackage = new FillResourceEPackage();
		
		modelSolved = (EPackage)fillResourceEPackage.doSwitch(modelSolved);
		
		saveModel(modelSolved);

		System.out.println("End solution with "
				+ bestSolution.getFacts().size() + " facts");

	}
	
	private void doMerge(EcoreSolution ecoreSolution){
		MergeEClassMove mergeEClassMove;
		ArrayList<EReference> listRefAction = new ArrayList<EReference>();
		ArrayList<EClass> listClassAction = new ArrayList<EClass>();
		
		Random rand = new Random();
		int indexClass;

		
		//case 1: Classes with the same name
		for (EObject obj: ecoreSolution.getFacts() ) {
    		if(obj.getClass() == EClassImpl.class
    				&& obj.getClass() == EClassImpl.class
    				&&((ENamedElement)obj).getName() != null 
    				&& ((ENamedElement)obj).getName() != null  
    				){
    			
    			listClassAction.add((EClass)obj);
        	}
        }
		for (EClass leftObj: listClassAction ) {
        	for (EClass rightObj: listClassAction ) {
        		if( ((EClass)leftObj).getClassifierID() > ((EClass)rightObj).getClassifierID() 
	        			&& ((EClass)leftObj).getName().equals(((EClass)rightObj).getName())
	        			&& ecoreSolution.getFacts().contains(leftObj)
	        			&& ecoreSolution.getFacts().contains(rightObj)){
        			
		        	mergeEClassMove = new MergeEClassMove(ecoreSolution);
		        	mergeEClassMove.mergeEClass( (EClass)leftObj, (EClass)rightObj);
		        	
		        	System.out.println("Merge of 2 EClasses '" + ((EClass)leftObj).getName() + "'");
       	
		        	ecoreSolution.getEpackage().getEClassifiers().remove(leftObj);
		        	ecoreSolution.getFacts().remove(leftObj);
	        	}
        	}
        }

		
		listClassAction.clear();
		
		//case 2: Reference to the class without name
		for (EObject leftObj: ecoreSolution.getFacts() ) {
			if (leftObj.getClass() == EReferenceImpl.class){
				if (((EReference)leftObj).getEReferenceType() != null) {
					if (((EReference)leftObj).getEReferenceType().getName() == null) {
						if(!existClassCompatible(ecoreSolution, listRefAction,listClassAction, leftObj)){
							//Case 2.2: The Class don't have another with same name
							
							listRefAction.add((EReference)leftObj);
							
							indexClass = rand.nextInt(ecoreSolution.getEpackage().getEClassifiers().size());
							
							listClassAction.add( (EClass)ecoreSolution.getEpackage().getEClassifiers().get(indexClass) );

						}
					}
				}
			}
			
        }
		
		for (int i = 0; i < listClassAction.size(); i++) {
			mergeEClassMove = new MergeEClassMove(ecoreSolution, listRefAction.get(i), listClassAction.get(i));
			mergeEClassMove.doMove();
		}
		
	}

	private boolean existClassCompatible(EcoreSolution ecoreSolution,
			ArrayList<EReference> listRefAction,
			ArrayList<EClass> listClassAction, EObject leftObj) {
		
		for (EObject rightObj: ecoreSolution.getEpackage().getEClassifiers() ) {
			if (rightObj.getClass() == EClassImpl.class) {
				if(refOrAtrWithSameName( ((EReference)leftObj).getEReferenceType(), (EClass)rightObj)){
					//Case 2.1: The two classes have reference or attribute with the same name
					listRefAction.add((EReference)leftObj);
					listClassAction.add((EClass)rightObj);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean refOrAtrWithSameName(EClass leftClass, EClass rightClass){
		if(leftClass == null){
			return false;
		}
		if(rightClass == null){
			return false;
		}
		if (leftClass.getName() != null) {
			return false;
		}
		
		if (leftClass.getClassifierID() != rightClass.getClassifierID() ) {
		
			for (EReference eReferenceLeft : leftClass.getEAllReferences()) {
				for (EReference eReferenceRight : rightClass.getEAllReferences()) {
					if (eReferenceLeft.getName().equals(eReferenceRight.getName())) {
						return true;
					}
				}
				for (EAttribute eAttributeRight : rightClass.getEAllAttributes()) {
					if (eReferenceLeft.getName().equals(eAttributeRight.getName())) {
						return true;
					}
				}
			}
			
			for (EAttribute eAttributeLeft : leftClass.getEAllAttributes()) {
				for (EAttribute eAttributeRight : rightClass.getEAllAttributes()) {
					if (eAttributeLeft.getName().equals(eAttributeRight.getName())) {
						return true;
					}
				}
				for (EReference eReferenceRight : rightClass.getEAllReferences()) {
					if (eAttributeLeft.getName().equals(eReferenceRight.getName())) {
						return true;
					}
				}
			}
		
		}
		return false;
	}

	private void saveModel(EPackage modelSolved) {

		try {
			ModelUtils.save(modelSolved, FILE_OUTPUT);
			
			System.out.println("Model saved in " + FILE_OUTPUT);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	protected Solver createSolutionBusiness() {

		Solver solver = createSolver();

		EcoreSolution ecoreSolution = new EcoreSolution();
		RulesFile rulesFile = new RulesFile();
		Decomposer decomposer = new Decomposer();
		EPackage epackage = EcoreFactory.eINSTANCE.createEPackage();

		epackage = rulesFile.createInitialSolution(FILE_INPUT);

		ecoreSolution.setEpackage(epackage);

		ecoreSolution.getFacts().addAll(decomposer.doSwitch(epackage));


		solver.setStartingSolution(ecoreSolution);

		return solver;
	}

	protected SolutionDao createSolutionDao() {
		return new XstreamSolutionDaoImpl();
	}

}
