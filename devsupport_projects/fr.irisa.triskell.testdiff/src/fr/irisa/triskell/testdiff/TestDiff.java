/*$Id: $
* Project : org.openembedd.tests
* File : 	Main.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 oct. 2009
* Authors : dvojtise
*/

package fr.irisa.triskell.testdiff;

import java.io.File;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import fr.irisa.triskell.testdiff.utils.MapUtil;

public class TestDiff implements Constants{

	private String resultFilesPattern;
	private String mapFileName = null;
	private String oldResultsDir;
	private String currentResultsDir;
	Map<String,String> testSuiteNameMap;
	private Boolean isVerbose = true;
	private String outputDir;
	private String outputFileName;
	private HashSet<Node> oldSuites;
	private HashSet<Node> currentSuites;
	private Document diffResult;
	private Element root;
	
	// to know if some changes have occurred and give this global info to user
	private int regressionsNum = 0;
	private int testsNum = 0;
	private int enhancementsNum = 0;
	private int addedSuitesNum = 0;
	private int removedSuitesNum = 0;
	
	public TestDiff(String[] args) throws Exception {
		processArgs(args);
		if(isVerbose){
			System.out.println("TestDiff:");
			System.out.println("Parameters received : \n\t" + resultFilesPattern + "\n\t" + oldResultsDir + "\n\t" + 
					currentResultsDir + "\n\t" + outputDir + "\n\t" + 
					outputFileName);
		}
	}




	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestDiff td;
		try {
			td = new TestDiff(args);
			td.run();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	private void run() throws Exception {
		
		loadMap(mapFileName);
		oldSuites = DOMUtils.buildMultiFilesDOMTree(resultFilesPattern, oldResultsDir);
		currentSuites = DOMUtils.buildMultiFilesDOMTree(resultFilesPattern, currentResultsDir);
		
		// building the DOM tree of the tests results
		try {
			diffResult = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			
			/////// compatible with Ant/JUnit standard ///////
			root = diffResult.createElement(DIFF_ROOT);
			root.setAttribute(ATTR_NAME, "Differences between two test executions");
			
			// record the old and current dirs
			root.setAttribute(ATTR_OLD_DIR, oldResultsDir);
			root.setAttribute(ATTR_CURRENT_DIR, currentResultsDir);
			DateFormat df = DateFormat.getDateTimeInstance();//.getDateInstance(DateFormat.LONG, Locale.FRANCE);
			
			root.setAttribute(ATTR_DIFF_DATE, df.format(Calendar.getInstance().getTime()));
			
			
			diffResult.appendChild(root);
			
		} catch (ParserConfigurationException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
		
		suitesDiff();
		File dir = new File(outputDir);
		if(!dir.exists()) dir.mkdir();
		saveXML(outputDir, outputFileName+".xml");
		
		Diff2HTML diff2html = new Diff2HTML();
		diff2html.result2HTML(diffResult, outputDir, outputFileName + ".html");
		
	}

	/* we procede first on OLD tree, compare the suites with CURRENT tree
	   and remove them from CURRENT tree when found
	   then we examine "new" suites which rest in CURRENT tree */
	private void suitesDiff() {
		
		for (Iterator<Node> iter = oldSuites.iterator(); iter.hasNext();) {
			Node oldSuite = (Node) iter.next();
			Boolean found = false;
			List<Element> testsDiffResult = new ArrayList<Element>();
			Iterator<Node> iterator = currentSuites.iterator();
			while (iterator.hasNext() && !found) {
				Node currentSuite = (Node) iterator.next();
				if (DOMUtils.getAttribute(oldSuite, "name") != ""
				  && DOMUtils.getAttribute(currentSuite, "name").equals(
						  MapUtil.getMappedValue(testSuiteNameMap, 
								  				 DOMUtils.getAttribute(oldSuite, "name")))) {
					testsDiffResult = testsDiff(oldSuite, currentSuite);
					found = true;
					currentSuites.remove(currentSuite);
				}
			}
			if (found) {
				addSuiteElement(oldSuite, ATTR_CHANGE_UNCHANGED, testsDiffResult);
			} else {
				addSuiteElement(oldSuite, ATTR_CHANGE_REMOVED, testsDiff(oldSuite, null));
			}
		}
		// once old suites have been cleaned up from current suites, we have only added suites 
		for (Iterator<Node> iter = currentSuites.iterator(); iter.hasNext();) {
			Node currentSuite = (Node) iter.next();
			addSuiteElement(currentSuite, ATTR_CHANGE_ADDED, testsDiff(null, currentSuite));
		}
		
		// record the global status of the tests
		String noRegressionStatus;
		if (regressionsNum == 0) {
			noRegressionStatus = "GOOD: no regression found in current tests compared to old tests";
		} else {
			noRegressionStatus = "REGRESSION ALERT: " + regressionsNum + " regression" + (regressionsNum>1?"s":"") + " occured in current tests compared to old tests";
		}
		root.setAttribute(ATTR_REGRESSION_STATUS, noRegressionStatus);
		root.setAttribute(ATTR_TESTS_NUM, "" + testsNum);
		root.setAttribute(ATTR_ENHANCEMENT_NUM, "" + enhancementsNum);
		root.setAttribute(ATTR_REGRESSIONS_NUM, "" + regressionsNum);
		root.setAttribute(ATTR_ADDED_SUITES_NUM, "" + addedSuitesNum);
		root.setAttribute(ATTR_REMOVED_SUITES_NUM, "" + removedSuitesNum);
	}

	/* we procede first on OLD tree, compare the tests with CURRENT tree
	   and remove them from CURRENT tree when found
	   then we examine "new" tests which rest in CURRENT tree */
	private List<Element> testsDiff(Node oldSuite, Node currentSuite) {
		List<Element> list = new ArrayList<Element>();
		if (oldSuite != null) {
			List<Element> oldTests = DOMUtils.getTestcaseElements(oldSuite);
			for (int i = 0; i < oldTests.size(); i++) {

				if (currentSuite != null) {
					// search a current test corresponding to the old test
					List<Element> currentTests = DOMUtils.getTestcaseElements(currentSuite);
					int j = 0;
					boolean found = false;
					while (j < currentTests.size() && !found) {
						if (DOMUtils.getAttribute(oldTests.get(i), "name") != ""
						  && DOMUtils.getAttribute(oldTests.get(i), "name").equals(DOMUtils.getAttribute(currentTests.get(j), "name"))) {
							found = true;
							Element e = getTestDiffElement(oldTests.get(i),
														currentTests.get(j),
														ATTR_CHANGE_UNCHANGED);
							if (e != null)
								list.add(e);
							currentSuite.removeChild(currentTests.get(j));
						}
						j++;
					}
					 if (!found) {
							list.add(getTestDiffElement(oldTests.get(i),
														null,
														ATTR_CHANGE_REMOVED));
						}
				} else {
					list.add(getTestDiffElement(oldTests.get(i),
												null,
												ATTR_CHANGE_REMOVED));
				}
			}
		}
		if (currentSuite != null) {
			// we may have some resting tests (added) to process
			List<Element> currentTests = DOMUtils.getTestcaseElements(currentSuite);
			for (int i = 0; i < currentTests.size(); i++) {
				list.add(getTestDiffElement(null,
											(Element)currentTests.get(i),
											ATTR_CHANGE_ADDED));
			}
		}
		return list;
	}
	
	private void addSuiteElement(Node suite, String changed, List<Element> testsTree) {
		Element suiteElement = diffResult.createElement(DIFF_SUITE_ELEMENT);
		suiteElement.setAttribute(ATTR_NAME, DOMUtils.getAttribute(suite, "name"));
		
		suiteElement.setAttribute(ATTR_CHANGE, changed);
		for (int i = 0; i < testsTree.size(); i++) {
			suiteElement.appendChild(testsTree.get(i));
		}
		root.appendChild(suiteElement);
	}
	
	private Element getTestDiffElement(Element oldTest, Element currentTest, String changed) {
		// we count the whole tests for information purpose (only changes are printed)
		testsNum++;
		
		Element element = (Element)diffResult.createElement(DIFF_TEST_ELEMENT);
		if (oldTest != null) {
			element.setAttribute(ATTR_NAME, DOMUtils.getAttribute(oldTest, "name"));
		} else {
			element.setAttribute(ATTR_NAME, DOMUtils.getAttribute(currentTest, "name"));
		}
		element.setAttribute(ATTR_CHANGE, changed);
		
		String oldStatus = ATTR_STATUS_UNKNOWN;
		String currentStatus = ATTR_STATUS_UNKNOWN;
		if (changed.equals(ATTR_CHANGE_UNCHANGED)) {
			// we have old and current tests
			oldStatus = getStatus(oldTest);
			currentStatus = getStatus(currentTest);
			
			// recording regressions
			if ((oldStatus == ATTR_STATUS_PASSED && 
					(currentStatus == ATTR_STATUS_ERROR ||
					 currentStatus == ATTR_STATUS_FAILURE)) ||
				(oldStatus == ATTR_STATUS_FAILURE &&
					currentStatus == ATTR_STATUS_ERROR))
				regressionsNum++;
			
			// recording enhancements
			else if ((oldStatus == ATTR_STATUS_ERROR && 
					(currentStatus == ATTR_STATUS_PASSED ||
					 currentStatus == ATTR_STATUS_FAILURE)) ||
				(oldStatus == ATTR_STATUS_FAILURE &&
					currentStatus == ATTR_STATUS_PASSED))
				enhancementsNum++;
			
			// no change between the old and new status => not printed
			else
				return null;
			
		} else if (changed.equals(ATTR_CHANGE_ADDED)) {
			// we have a current but no old test
			currentStatus = getStatus(currentTest);
			enhancementsNum++;
			addedSuitesNum++;
			
		} else { // changed.equals(ATTR_CHANGE_REMOVED)
			// we have a old test and no current
			oldStatus = getStatus(oldTest);
			removedSuitesNum++;
		}
		element.setAttribute(ATTR_OLD_STATUS, oldStatus);
		element.setAttribute(ATTR_CURRENT_STATUS, currentStatus);
		
		return element;
	}

	/*
	 * only openembedd tests results have status attribute
	 */
	private String getStatus(Element element) {
		String status = element.getAttribute(TEST_STATUS);
		
		if (status == null || status == "") {
			// Ant / JUnit test result => status must be computed
			status = ATTR_STATUS_PASSED;	// default value
			List<Element> list = DOMUtils.getChildElements(element);
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getNodeName().equals(FAILURE))
					status = ATTR_STATUS_FAILURE;
				if (list.get(i).getNodeName().equals(ERROR))
					status = ATTR_STATUS_ERROR;
			}
		}
		
		return status;
	}
	
	/**
	 * load the map file or create an empty map if no file is provided
	 * @param mapfilename
	 */
	private void loadMap(String mapfilename){
		if(mapfilename != null)
			testSuiteNameMap  = MapUtil.readMapFile(mapfilename);
		else
			// simply use an empty map
			testSuiteNameMap = new HashMap<String,String>();
	}
	
	public void saveXML(String directory, String xmlFileName) {
		DOMUtils.saveXML(diffResult, directory, xmlFileName);
	}

	private void processArgs(Object arg0) throws Exception {
		String[] args = (String[]) arg0;
		
		if (args.length < 10)
			throw new Exception("Uncorrect arguments! Give:\n" +
					" -pattern + the result files pattern\n" +
					" -mapfile + a file containing a mapping between old and new test suite name\n" +
					" -olddir + the old results dir path\n" +
					" -currentdir + the current results dir path\n" +
					" -outputdir + the output dir path\n" +
					" -outputfile + the output file name");
		
		for (int i = 0; i < args.length; i++) {
			if (args[i].equalsIgnoreCase("-pattern")
				&& args.length >= i)
				resultFilesPattern = args[i+1];
			if (args[i].equalsIgnoreCase("-mapfile")
					&& args.length >= i)
					mapFileName = args[i+1];
			if (args[i].equalsIgnoreCase("-olddir")
					&& args.length >= i)
				oldResultsDir = args[i+1];
			if (args[i].equalsIgnoreCase("-currentdir")
					&& args.length >= i)
				currentResultsDir = args[i+1];
			if (args[i].equalsIgnoreCase("-outputdir")
					&& args.length >= i)
				outputDir = args[i+1];
			if (args[i].equalsIgnoreCase("-outputfile")
					&& args.length >= i)
				outputFileName = args[i+1];
			if (args[i].equalsIgnoreCase("-quiet")
					&& args.length >= i)
				isVerbose = false;
		}
	}

}
