/* $Id: InterpretedRunJunitFactory.java,v 1.1 2008-10-31 13:57:06 dvojtise Exp $
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
public class InterpretedRunJunitFactory extends AbstractRunJunitFactory {

	/**
     * Default constructor
     */
    public InterpretedRunJunitFactory() {
        super();
        isCompiled = false;
        
    }
    
    /**
     * constructor allowing to set a default path (useful when using relative pathes
     */
    public InterpretedRunJunitFactory(String defaultPath) {
        super(defaultPath);
        isCompiled = true;
    }
    
    /**
     * constructor allowing to change some default setting
     */
    public InterpretedRunJunitFactory(boolean optimizeLoading) {
        super(optimizeLoading);
        isCompiled = true;
    }

	@Override
	public AbstractRunTestCase createRunTestCase(String themainClassValue,
			String themainOperationValue,
			AbstractRunJunitFactory thecontainerTestSuite,
			boolean constraintExecution, boolean isFirstOfSerie, boolean isLastOfSerie) {
		return new InterpretedRunTestCase(themainClassValue, 
				themainOperationValue, 
				thecontainerTestSuite, constraintExecution, isFirstOfSerie, isLastOfSerie);
	}
}