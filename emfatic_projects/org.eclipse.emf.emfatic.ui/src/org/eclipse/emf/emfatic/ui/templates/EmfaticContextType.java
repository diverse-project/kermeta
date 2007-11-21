package org.eclipse.emf.emfatic.ui.templates;

import org.eclipse.jface.text.templates.GlobalTemplateVariables;
import org.eclipse.jface.text.templates.TemplateContextType;

/**
 * 
 * @author miguel.garcia@tuhh.de
 */
public class EmfaticContextType 
extends TemplateContextType {
    public static final String EMFATIC_CONTEXT_TYPE = "org.eclipse.emf.emfatic.ui.templates.EmfaticContextType";
    
    /**
     * Constructor
     */
    public EmfaticContextType() {
    	super(EMFATIC_CONTEXT_TYPE);
        addGlobalResolvers();
    }
    
    /*
     * All default solvers provided by eclipse are enabled
     */
    private void addGlobalResolvers() {
        addResolver(new GlobalTemplateVariables.Cursor());
        addResolver(new GlobalTemplateVariables.WordSelection());
        addResolver(new GlobalTemplateVariables.LineSelection());
        addResolver(new GlobalTemplateVariables.Dollar());
        addResolver(new GlobalTemplateVariables.Date());
        addResolver(new GlobalTemplateVariables.Year());
        addResolver(new GlobalTemplateVariables.Time());
        addResolver(new GlobalTemplateVariables.User());
    }
}
