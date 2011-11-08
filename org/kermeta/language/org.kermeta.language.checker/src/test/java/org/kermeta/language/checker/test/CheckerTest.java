package org.kermeta.language.checker.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.diagnostic.Constraint;
import org.kermeta.diagnostic.ConstraintDiagnostic;
import org.kermeta.diagnostic.DiagnosticModel;
import org.kermeta.diagnostic.InvariantProxy;
import org.kermeta.language.behavior.BehaviorPackage;
import org.kermeta.language.checker.CheckerImpl;
import org.kermeta.language.checker.api.Checker;
import org.kermeta.language.checker.api.CheckerScope;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CheckerTest extends TestCase {

	String kmFile;
	Boolean isInvalidTestCase;
	String kmFileInvDescr=null;
	String fileSeparator;
	CheckerScope scope=null;
	
	
	public CheckerTest(String path/*, String parent*/) {
		super();
		System.out.println("--------------------------------------\nCreating test for file " + path);
		this.kmFile=path;

		String fileSeparator=System.getProperty("file.separator");
		
		if (path.contains(fileSeparator+"invalid"+fileSeparator)) {
			System.out.println("- This is an invalid testcase");
			this.isInvalidTestCase=true;
			this.kmFileInvDescr=kmFile+".txt";
		} else {
			System.out.println("- This is a valid testcase");
			this.isInvalidTestCase=false;
		}
		
		for (CheckerScope scope : CheckerScope.values()) {
			//System.err.println("- Checking scope : " + scope.toString() + " for file " + kmFile.toUpperCase());
			if (kmFile.toUpperCase().contains(fileSeparator+scope.toString()+fileSeparator)) {
				this.scope=scope;
				System.out.println("This test is for scope " + this.scope.toString());
			}
		}
		//System.err.println("isInvalid?"+isInvalidTestCase);
		

	}

	public void test() throws IOException  {
        System.out.println("---------------------------------\nChecking " + kmFile);

        
        String expectedFailedInvariant="";
        
        if (isInvalidTestCase) { 

        	// If this test is an invalid test case, retrieve the description of the 
        	// invariant that is expected to fail
        	if (kmFileInvDescr!=null) {
        		System.out.println("trying to read " + kmFileInvDescr);
        		try {
        			expectedFailedInvariant = readFile(kmFileInvDescr);
        		} catch (FileNotFoundException e) {
        			// TODO Auto-generated catch block
        			Assert.fail("The file " + kmFileInvDescr + " describing the expected failed invariant cannot be found");
        		}
        	}
            if (expectedFailedInvariant==null) {
            	Assert.fail("There is no expected failed invariant in " + kmFileInvDescr);
            } else if (expectedFailedInvariant.length()==0) {
            	Assert.fail("There is no expected failed invariant in " + kmFileInvDescr);
            }
        
        }
        
        
        // the checker
        Checker checker = new CheckerImpl();
        
        
        ModelingUnit mu=null;
        try {
			mu = loadKm(kmFile);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail("Impossible to load " + kmFile);
		}
        
		// Check the modeling unit
		DiagnosticModel result = checker.check(mu, scope, null, new StdioSimpleMessagingSystem());
		System.out.println("DiagnosticModel size : " + result.getDiagnostics().size());
		
		// check results
		if (isInvalidTestCase) {
			// check that the expected failed invariant was indeed violated
			boolean testOk=false;
			for(ConstraintDiagnostic diag : result.getDiagnostics()) {
				Constraint failedConstraint = diag.getFailedConstraint();//if (diag.)
				//if (diag.getFailedConstraint())
				//failedConstraint.
				if (failedConstraint instanceof InvariantProxy) {
					InvariantProxy invProxy = (InvariantProxy) failedConstraint;
					System.out.println("failed constraint : " + invProxy.getInvariantName() + ", expected : (" + expectedFailedInvariant + ")");
					if (invProxy.getInvariantName().equals(expectedFailedInvariant)) {
						testOk=true;
					}
				}
			}
			Assert.assertTrue("The expected failed invariant " + expectedFailedInvariant + " was not violated", testOk);
		} else {
			// No invariant should fail (allow warnings ?)
			Assert.assertTrue("This is a valid test case, no invariant should be violated. (" + result.getDiagnostics().size() + " invariants failed)", result.getDiagnostics().size()==0);
		}
		
    }

	private ModelingUnit loadKm(String kmFile2) throws IOException {
		
		System.err.println("Trying to load modeling unit from " + kmFile2);
		
		//kmLoader loader = new KmLoaderImpl();
		
        ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(StructurePackage.eNS_URI, StructurePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(BehaviorPackage.eNS_URI, BehaviorPackage.eINSTANCE);
		Resource.Factory.Registry f = resourceSet
				.getResourceFactoryRegistry();
		Map<String, Object> m = f.getExtensionToFactoryMap();
		m.put("km", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.createResource(URI.createFileURI(kmFile));
		ModelingUnit mu;
		resource.load(m);
		mu = (ModelingUnit) resource.getContents().get(0);
           
		System.err.println("Mu name : " + mu.getName());
		
		return mu;
	}

	private Checker initChecker() {
        Checker checker = new CheckerImpl();
		return checker;
	}
	
	private String readFile(String path) throws FileNotFoundException {
		File file = new File(path);
		StringBuffer contents = new StringBuffer();
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader(file));
			String text = null;
			
			// repeat until all lines is read
			while ((text = reader.readLine()) != null) {
				contents.append(text)/*.append(System.getProperty("line.separator"))*/;
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			throw e;
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		 
		// show file contents here
		System.out.println("("+contents.toString()+")");
		// And delete \n at the end
		return contents.toString().substring(0, contents.toString().length()/*-2*/);
	}
	
    @Override
    public String getName() {
    	//return kmFile;
    	
    	int last = kmFile.lastIndexOf(System.getProperty("file.separator"));
    	return kmFile.substring(last+1);
    	
    }

    @Override
    public void runTest() throws Throwable  {
        test();
    }

    /*
    @Override
    protected void tearDown() throws Exception {
        //
    }*/
}
