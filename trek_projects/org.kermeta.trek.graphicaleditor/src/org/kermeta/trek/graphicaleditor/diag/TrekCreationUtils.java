/*******************************************************************************
 * No CopyrightText Defined in the configurator file.
 ******************************************************************************/
package org.kermeta.trek.graphicaleditor.diag;

import org.eclipse.emf.ecore.EObject;
import org.kermeta.trek.util.TrekSwitch;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.editor.AbstractCreationUtils;
import org.topcased.modeler.graphconf.DiagramGraphConf;

/**
 * This utility class allows to create a GraphElement associated with a Model Object
 *
 * @generated
 */
public class TrekCreationUtils extends AbstractCreationUtils {

	/**
	 * Constructor
	 *
	 * @param diagramConf the Diagram Graphical Configuration
	 * @generated
	 */
	public TrekCreationUtils(DiagramGraphConf diagramConf) {
		super(diagramConf);
	}

	/**
	 * @generated
	 */
	private class GraphicTrekSwitch extends TrekSwitch {
		/**
		 * The presentation of the graphical element
		 *
		 * @generated
		 */
		private String presentation;

		/**
		 * Constructor
		 *
		 * @param presentation the presentation of the graphical element
		 * @generated
		 */
		public GraphicTrekSwitch(String presentation) {
			this.presentation = presentation;
		}

		/**
		 * @see org.kermeta.trek.util.TrekSwitch#caseKUseCase(org.kermeta.trek.KUseCase)
		 * @generated
		 */
		public Object caseKUseCase(org.kermeta.trek.KUseCase object) {
			if ("default".equals(presentation)) {
				return createGraphElementKUseCase(object, presentation);
			}
			return null;
		}

		/**
		 * @see org.kermeta.trek.util.TrekSwitch#caseKTestCase(org.kermeta.trek.KTestCase)
		 * @generated
		 */
		public Object caseKTestCase(org.kermeta.trek.KTestCase object) {
			if ("default".equals(presentation)) {
				return createGraphElementKTestCase(object, presentation);
			}
			return null;
		}

		/**
		 * @see org.kermeta.trek.util.TrekSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return null;
		}
	}

	/**
	 * @see org.topcased.modeler.editor.ICreationUtils#createGraphElement(org.eclipse.emf.ecore.EObject, java.lang.String)
	 * @generated
	 */
	public GraphElement createGraphElement(EObject obj, String presentation) {
		Object graphElt = null;

		if ("http://www.kermeta.org/trek".equals(obj.eClass().getEPackage()
				.getNsURI())) {
			graphElt = new GraphicTrekSwitch(presentation).doSwitch(obj);
		}

		return (GraphElement) graphElt;
	}

	/**
	 * @param element the model element
	 * @param presentation the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementKUseCase(
			org.kermeta.trek.KUseCase element, String presentation) {
		// TODO this snippet of code should be customized if it is not well generated
		GraphNode nodeParent = createGraphNode(element, presentation);

		return nodeParent;
	}

	/**
	 * @param element the model element
	 * @param presentation the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementKTestCase(
			org.kermeta.trek.KTestCase element, String presentation) {
		// TODO this snippet of code should be customized if it is not well generated
		GraphNode nodeParent = createGraphNode(element, presentation);

		return nodeParent;
	}

	/**
	 * Create the ModelObject with its initial children
	 * 
	 * @param obj the model object
	 * @return the model object with its children
	 * @generated
	 */
	public EObject createModelObject(EObject obj) {
		return obj;
	}

}
