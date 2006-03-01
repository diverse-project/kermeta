package fr.irisa.triskell.kermeta.graphicaleditor.diagram;

import org.eclipse.gef.EditPartFactory;
import org.topcased.modeler.editor.IConfiguration;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.IPaletteManager;

/**
 * A diagram configuration : manages Palette, EditPartFactory for this diagram.
 * <br>
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureConfiguration implements IConfiguration {
	private StructurePaletteManager paletteManager;

	private StructureEditPartFactory editPartFactory;

	private StructureCreationUtils creationUtils;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getId()
	 * @generated
	 */
	public String getId() {
		return new String("kmClassDiagram");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getName()
	 * @generated
	 */
	public String getName() {
		return new String("kmClassDiagram");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getEditPartFactory()
	 * @generated
	 */
	public EditPartFactory getEditPartFactory() {
		if (editPartFactory == null)
			editPartFactory = new StructureEditPartFactory();

		return editPartFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Difference with generated code : 
	 * we instanciated ExtendedStructurePaletteManager instead of 
	 * StructurePaletteManager.
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getPaletteManager()
	 * @generated NOT
	 * 
	 */
	public IPaletteManager getPaletteManager() {
		if (paletteManager == null)
			paletteManager = new ExtendedStructurePaletteManager(getCreationUtils());

		return paletteManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.topcased.modeler.editor.IConfiguration#getCreationUtils()
	 * @generated
	 */
	public ICreationUtils getCreationUtils() {
		if (creationUtils == null)
			creationUtils = new StructureCreationUtils();

		return creationUtils;
	}
}