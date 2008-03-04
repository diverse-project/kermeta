/*$Id: CompareModel.java,v 1.6 2008-03-04 09:18:28 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.tests
* File : 	CompareModel.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 10 sept. 07
* Authors : cfaucher <cfaucher@irisa.fr>
*/

package fr.irisa.triskell.kermeta.tests.comparison;

import org.eclipse.emf.common.util.URI;
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
	
	/**
	 * 
	 */
	private void init() {
		TestPlugin.getDefault();
		this.leftModelURI = URI.createFileURI(this.leftModelPath);
		this.rightModelURI = URI.createFileURI(this.rightModelPath);
	}

	/**
	 * 
	 * @return
	 */
	public boolean compareWithEcoreUtil() {
		Resource leftModelRes = resourceSet.getResource(leftModelURI, true);
		Resource rightModelRes = resourceSet.getResource(rightModelURI, true);
		EcoreUtil.EqualityHelper eQH = new EcoreUtil.EqualityHelper();
		return eQH.equals(leftModelRes.getContents().get(0), rightModelRes.getContents().get(0));
	}

	
	/**
	 * 
	 * @return
	 */
	public boolean compareWithEMFCompare() {
		return EMFCompareModelHelper.isSimilar(leftModelPath, rightModelPath);
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
	 * DVK : we should rewrite this as a junit test !?
	 */
	public static void main (String args[]) {
		String l = "test/interpreter/emf_testcases/instances/060_loadSaveEcoreEnum.ecore";
		String r = "test/interpreter/emf_testcases/instances/060_loadSaveEcoreEnum.ecore";
		CompareModel modelComparison = new CompareModel(r, r);
		System.out.println(modelComparison.compareWithEcoreUtil());
		System.out.println(modelComparison.compareWithEMFCompare());
	}
}


