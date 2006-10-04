package fr.irisa.triskell.kermeta.graphicaleditor.editor.properties.sections;

import org.eclipse.emf.ecore.EAttribute;
import org.topcased.modeler.editor.properties.sections.AbstractStringPropertySection;
import org.topcased.modeler.editor.properties.sections.AbstractTextPropertySection;

import fr.irisa.triskell.kermeta.language.structure.StructurePackage;

public class NamePropertySection extends AbstractStringPropertySection {

	/**
     * @see org.topcased.modeler.editor.properties.sections.AbstractTextPropertySection#getLabelText()
     */
    protected String getLabelText()
    {
        return "Name:";
    }

    /**
     * @see org.topcased.modeler.editor.properties.sections.AbstractTextPropertySection#getFeature()
     */
    protected EAttribute getFeature()
    {
        return StructurePackage.eINSTANCE.getNamedElement_Name();
    }
    
}
