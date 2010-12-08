package org.kermeta.language.api.tests.port;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.api.port.PortKmBinaryMerger;
import org.kermeta.language.api.port.PortKmMerger;

import junit.framework.TestCase;

//import org.kermeta.language.merger.multimerger.art2.impl.Art2ComponentKmMultiMergerFactory;

public class PortKmMultiMergerTest extends TestCase {

	public boolean valid = true;
	public PortKmMerger mmerger = null;
	public PortKmBinaryMerger bmerger = null;
	
	// Resource folders
    public List<String> inputFilesPath;
    public String outputFilePath;
    public String expectedOutputFilePath;
    public String baseName;

    public ResourceSet resourceSet;
    
    public PortKmMultiMergerTest(String baseName, List<String> inputFilesPath, String outputFilePath, String expectedOutputfilePath, Boolean _valid, Class mergerclass) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println(" creating test ");
        System.out.println("                 basename " + baseName);
        for (String file : inputFilesPath) {
        	System.out.println("            inputFilePath " + file);
        }
        System.out.println("           outputFilePath " + outputFilePath);
        System.out.println("   expectedOutputfilePath " + expectedOutputfilePath);
        
        this.inputFilesPath = inputFilesPath;
        this.outputFilePath = outputFilePath;
        this.baseName = baseName;
        this.expectedOutputFilePath = expectedOutputfilePath;
        this.valid = _valid;

        bmerger = (PortKmBinaryMerger) mergerclass.getConstructors()[0].newInstance();
        //mmerger = (PortKmMultiMerger) mergerclass.getConstructors()[0].newInstance();
        
        //Art2ComponentKmMultiMergerFactory fff;
        //mmerger = Art2ComponentKmMultiMergerFactory;
        
        resourceSet = new ResourceSetImpl();
        Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
        Map<String,Object> m = f.getExtensionToFactoryMap();
        m.put("km",new XMIResourceFactoryImpl());
        //resourceSet.getPackageRegistry().put(KmPackage.eNS_URI, KmPackage.eINSTANCE);
    
    }
	
}
