/* $Id: CompiledRunJunitFactory.java,v 1.1 2008-10-31 14:03:13 dvojtise Exp $
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