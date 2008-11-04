/* $Id: CompiledRunJunitFactory.java,v 1.2 2008-11-04 15:37:34 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.interpreter
 * File       : RunJunit.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 27 avr. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        <desription.text> 
 */
package fr.irisa.triskell.kermeta.launcher;

import org.eclipse.core.resources.IProject;


/**
 * Run a kermeta program as a Junit test It may return either a TestCase or a
 * TestSuite
 *  
 */
/**
 * @author dvojtise
 *
 */
public class CompiledRunJunitFactory extends AbstractRunJunitFactory {

	public String test_container_plugin_id; 
	public IProject generatedPluginProject; 
    
    /**
     * Default constructor
     */
    public CompiledRunJunitFactory() {
        super();
        isCompiled = true;
        
    }
    
    /**
     * constructor allowing to set a default path (useful when using relative pathes
     */
    public CompiledRunJunitFactory(String defaultPath, String testcontainer_plugin_id) {
        super(defaultPath);
        test_container_plugin_id = testcontainer_plugin_id;
        isCompiled = true;
    }
    
    /**
     * constructor allowing to change some default setting
     */
    public CompiledRunJunitFactory(boolean optimizeLoading) {
        super(optimizeLoading);
        isCompiled = true;
    }

	@Override
	public AbstractRunTestCase createRunTestCase(String themainClassValue,
			String themainOperationValue,
			AbstractRunJunitFactory thecontainerTestSuite,
			boolean constraintExecution, boolean isFirstOfSerie, boolean isLastOfSerie) {
		return new CompiledRunTestCase(themainClassValue, 
				themainOperationValue, 
				thecontainerTestSuite, constraintExecution, isFirstOfSerie, isLastOfSerie);
	}
   
    
}