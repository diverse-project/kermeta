package org.kermeta.prototyper.editor.properties.sections;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.viewers.ILabelProvider;
import org.kermeta.prototyper.connector.KermetaConnector;

import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.language.structure.provider.StructureItemProviderAdapterFactory;
import org.topcased.tabbedproperties.AbstractTabbedPropertySheetPage;
import org.topcased.tabbedproperties.providers.TabbedPropertiesLabelProvider;
import org.topcased.tabbedproperties.sections.AbstractChooserPropertySection;

/**
 * A section featuring a combo box with a seach button. This section<br>
 * displays single references.
 *
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EObjectSectionOld extends AbstractChooserPropertySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.topcased.tabbedproperties.sections.AbstractTabbedPropertySection#getLabelText()
	 * @generated
	 */
	protected String getLabelText() {
		return "EObject:";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.topcased.tabbedproperties.sections.AbstractTabbedPropertySection#getFeature()
	 * @generated
	 */
	protected EStructuralFeature getFeature() {
		return StructurePackage.eINSTANCE.getNamedElement_Name();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.topcased.tabbedproperties.sections.AbstractChooserPropertySection#getFeatureValue()
	 * @generated
	 */
	protected Object getFeatureValue() {
		//return ((EObject) getEObject()).toString();
		KermetaConnector kconnector = new KermetaConnector();
		List<Operation> callableOperations = kconnector.getCallableOperations(getEObject());
		return callableOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.topcased.tabbedproperties.sections.AbstractChooserPropertySection#getComboFeatureValues()
	 * @generated
	 */
	protected Object[] getComboFeatureValues() {
		/*if(getEObject() instanceof EClassifier) {
			return getChoices(getEObject(), (EClassifier) getEObject());
		}*/
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see org.topcased.tabbedproperties.sections.AbstractChooserPropertySection#getLabelProvider()
	 * @generated
	 */
	protected ILabelProvider getLabelProvider() {
		List f = new ArrayList();
		f.add(new StructureItemProviderAdapterFactory()); // Reflective import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
		f
				.addAll(AbstractTabbedPropertySheetPage
						.getPrincipalAdapterFactories());
		return new TabbedPropertiesLabelProvider(new ComposedAdapterFactory(f));
	}

}
