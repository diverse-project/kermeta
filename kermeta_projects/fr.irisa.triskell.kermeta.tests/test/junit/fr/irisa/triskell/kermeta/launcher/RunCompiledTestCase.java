package fr.irisa.triskell.kermeta.launcher;


import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.launcher.RunJunitFactory;
import fr.irisa.triskell.kermeta.launcher.RunInterpretedTestCase;
import fr.irisa.triskell.kermeta.language.structure.Class;

/**
 * Launcher for Kermeta interpreter. It can be run from the command line or as a
 * test case for JUnit.
 */
public class RunCompiledTestCase extends RunInterpretedTestCase {

    public RunCompiledTestCase(String themainClassValue,
			String themainOperationValue, RunJunitFactory thecontainerTestSuite, boolean constraintExecution, boolean isLastOfSerie) {
		super(themainClassValue, themainOperationValue, thecontainerTestSuite,
				constraintExecution, isLastOfSerie);
		// TODO Auto-generated constructor stub
	}

	/**
     * This method is used for a kermeta program when it does not contain the
     * tag "testOperation". But when the tag "testOperation" is defined, it
     * means that we have to execute all the operation prefixed by
     * <code>test</code>. Otherwise, there should be a "mainOperation" to
     * launch (which name is defined in the <code>mainOperation</code> tag
     * @throws Exception 
     */
    public void runTest() throws KermetaRaisedException {
    	try {    		 			
    		interpreter.setEntryPoint(mainClassValue, mainOperationValue);
    		interpreter.launch();
    	} catch(KermetaRaisedException e){
    		// If this is a kermeta assertion that failed, then the Test must fail
    		Class t_target=(Class)e.raised_object.getMetaclass().getKCoreObject();        	
    		String exceptionTypeName = t_target.getTypeDefinition().getName();
    		if(exceptionTypeName.compareTo("AssertionFailedError") == 0){
    			fail(e.toString());
    		}
    		//	 otherwise it must be an error, so just forward the exception
    		else throw e;
    		
    	}
    }

}