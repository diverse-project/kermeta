/*$Id: CompareModel.java,v 1.1 2007-10-16 09:19:02 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.tests
* File : 	CompareModel.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 10 sept. 07
* Authors : cfaucher <cfaucher@irisa.fr>
*/

package fr.irisa.triskell.kermeta.tests.comparison;

import java.io.IOException;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.generic.DiffMaker;
import org.eclipse.emf.compare.diff.metamodel.DiffGroup;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.statistic.DifferencesServices;
import org.eclipse.emf.compare.util.ModelUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.irisa.triskell.kermeta.tests.plugin.TestPlugin;

public class CompareModel {
	
	// Path of the left model
	private String leftModelPath = null;
	// Path of the right model
	private String rightModelPath = null;
	
	private ResourceSet resourceSet = null;
	// URI of the left model
	private URI leftModelURI = null;
	// URI of the right model
	private URI rightModelURI = null;
	
	/**
	 * This class doesn't need to be instantiated.
	 */
	public CompareModel(String leftModelPath, String rightModelPath) {
		
		System.out.println("Model Path l=" + leftModelPath + " r=" + rightModelPath);
		this.leftModelPath = leftModelPath;
		this.rightModelPath = rightModelPath;
		// Creates the resourceSet where we'll load the models
		this.resourceSet = new ResourceSetImpl();
		init();
	}
	
	private void init() {
		TestPlugin.getDefault();
		this.leftModelURI = URI.createFileURI(this.leftModelPath);
		this.rightModelURI = URI.createFileURI(this.rightModelPath);
	}

	
	public boolean compareWithEcoreUtil() {
		Resource leftModelRes = resourceSet.getResource(leftModelURI, true);
		Resource rightModelRes = resourceSet.getResource(rightModelURI, true);
		EcoreUtil.EqualityHelper eQH = new EcoreUtil.EqualityHelper();
		return eQH.equals(leftModelRes.getContents().get(0), rightModelRes.getContents().get(0));
	}

	
	/**
	 * 
	 * @param result_dir
	 * @param result_fileName
	 */
	public boolean compareWithEMFCompare(/*String result_dir, String result_fileName*/) {
		boolean res = false;
		try {
			// Loads the two models passed as arguments
			final EObject model1 = ModelUtils.load(leftModelURI, resourceSet);
			final EObject model2 = ModelUtils.load(rightModelURI, resourceSet);
			// Creates the match then the diff model for those two models
			final MatchModel match = new DifferencesServices().modelMatch(model1, model2, new NullProgressMonitor());
			final DiffModel diff = new DiffMaker().doDiff(match);
			
			if(((DiffGroup)diff.getOwnedElements().get(0)).getSubchanges()> 0) {
				res = false;
			} else {
				res = true;
			}
					
			// Prints the results
			//System.out.println(ModelUtils.serialize(match));
			//System.out.println(ModelUtils.serialize(diff));
			//System.out.println("saving diff as \"result.diff\"");
			//ModelUtils.save(diff, "result.diff");
			//System.out.println("saving match as \"result.match\"");
			//ModelUtils.save(match, "result.match");
					
			// Serializes the result as "result.emfdiff" in the directory this class has been called from.
			//System.out.println("saving emfdiff as " + result_dir + "/" + result_fileName); //$NON-NLS-1$
			//final ModelInputSnapshot snapshot = DiffFactory.eINSTANCE.createModelInputSnapshot();
			//snapshot.setDate(Calendar.getInstance().getTime());
			//snapshot.setMatch(match);
			//snapshot.setDiff(diff);
			//ModelUtils.save(snapshot, result_dir + "/" + result_fileName); //$NON-NLS-1$
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	public String getLeftModel() {
		return leftModelPath;
	}

	public void setLeftModel(String leftModel) {
		this.leftModelPath = leftModel;
	}

	public String getRightModel() {
		return rightModelPath;
	}

	public void setRightModel(String rightModel) {
		this.rightModelPath = rightModel;
	}
	
	/**
	 * 
	 * @param args
	 * 
	 * @unused
	 * You should never use this method, because this one is only used to test the behavior of this class.
	 * 
	 */
	public static void main (String args[]) {
		String l = "test/interpreter/emf_testcases/instances/kmLogo.km";
		String r = "test/interpreter/emf_testcases/instances/ecore.km";
		CompareModel modelComparison = new CompareModel(r, r);
		System.out.println(modelComparison.compareWithEcoreUtil());
		System.out.println(modelComparison.compareWithEMFCompare(/*"test", "ecore.emfdiff"*/));
	}
}


