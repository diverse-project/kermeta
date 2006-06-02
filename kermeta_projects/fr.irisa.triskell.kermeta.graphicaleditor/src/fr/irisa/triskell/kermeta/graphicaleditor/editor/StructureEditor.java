package fr.irisa.triskell.kermeta.graphicaleditor.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.topcased.modeler.documentation.EAnnotationDocPage;
import org.topcased.modeler.documentation.IDocPage;
import org.topcased.modeler.editor.Modeler;

import fr.irisa.triskell.kermeta.graphicaleditor.StructurePlugin;
import fr.irisa.triskell.kermeta.graphicaleditor.actions.StructureKm2KmtAction;
import fr.irisa.triskell.kermeta.graphicaleditor.actions.StructureValidateAction;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.StructureCreationUtils;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.StructureEditPartFactory;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.StructurePaletteManager;

/**
 * Generated Model editor
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureEditor extends Modeler {

	private StructurePaletteManager paletteManager;

	private StructureEditPartFactory editPartFactory;

	private StructureCreationUtils creationUtils;

	protected SourceViewerConfiguration configuration;

	/**
	 * 
	 */
	public StructureEditor() {
		super();
	}

	/**
	 * @see org.topcased.modeler.editor.Modeler#getAdapterFactories()
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected List getAdapterFactories() {
		List factories = new ArrayList();
		factories
				.add(new fr.irisa.triskell.kermeta.language.structure.provider.StructureItemProviderAdapterFactory());

		factories
				.add(new fr.irisa.triskell.kermeta.graphicaleditor.providers.StructureModelerProviderAdapterFactory());

		factories.addAll(super.getAdapterFactories());

		return factories;
	}

	/**
	 * Returns the Editor Id (used by the minibus)
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the String that identifies the Editor
	 * @generated
	 */
	public static String getId() {
		return new String(
				"fr.irisa.triskell.kermeta.graphicaleditor.editor.StructureEditor");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.Modeler#getAdapter(java.lang.Class)
	 * @generated
	 */
	public Object getAdapter(Class type) {
		if (type == IDocPage.class) {
			return new EAnnotationDocPage(getCommandStack());
		}
		return super.getAdapter(type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.Modeler#getPreferenceStore()
	 * @generated
	 */
	public IPreferenceStore getPreferenceStore() {
		return StructurePlugin.getDefault().getPreferenceStore();
	}

	/**
	 * I overrid this method in order to add a new Action (linked to a button
	 * that appears in the tool bar), which is StructureValidateAction.
	 * @see org.topcased.modeler.editor.Modeler#createActions()
	 */
	protected void createActions() {
		super.createActions();
		// The constraint checking action
		ActionRegistry registry = getActionRegistry();
		IAction action = new StructureValidateAction(this);
		// Once it is registered, we can find it through a RetargetAction
		// See StructureEditorActionBarContributor
		registry.registerAction(action);

		// The convert km2kmt action
		action = new StructureKm2KmtAction(this);
		registry.registerAction(action);
	}

	/**
	 * Method and javadoc copied from Modeler class, and adapted because of some special stuff in kermeta model :
	 * 
	 *   - the contained types
	 *   - the tags
	 *   
	 * Effective save action : <br>
	 * <ol>
	 * <li> Save the models in temporary files
	 * <li> Read the saved model
	 * <li> Save the models in the right files
	 * </ol>
	 * If one of these tasks fails, the save is cancelled and a message is send
	 * to the user.
	 * 
	 * @see org.topcased.modeler.editor.Modeler#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 * @see org.eclipse.ui.ISaveablePart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	/*public void doSave(IProgressMonitor monitor)
	 {
	 }*/

}
