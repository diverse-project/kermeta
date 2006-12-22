/*******************************************************************************
 * Copyright (c) 2005 AIRBUS FRANCE. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   David Sciamma (Anyware Technologies), Mathieu Garcia (Anyware Technologies),
 *   Jacques Lescot (Anyware Technologies), Thomas Friol (Anyware Technologies),
 *   Nicolas Lalevée (Anyware Technologies) - initial API and implementation 
 ******************************************************************************/

package fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.diagram;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.ecore.EObject;
import org.topcased.modeler.di.model.DiagramInterchangeFactory;
import org.topcased.modeler.di.model.EdgeObjectOffset;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.editor.AbstractCreationUtils;
import org.topcased.modeler.graphconf.DiagramGraphConf;

import fr.irisa.triskell.kermeta.samples.fsm.util.FsmSwitch;

/**
 * This utility class allows to create a GraphElement associated with a Model Object
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmCreationUtils extends AbstractCreationUtils {

	/**
	 * Constructor
	 * 
	 * @param diagramConf the Diagram Graphical Configuration
	 */
	public FsmCreationUtils(DiagramGraphConf diagramConf) {
		super(diagramConf);
	}

	/**
	 * @generated
	 */
	private class GraphicFsmSwitch extends FsmSwitch {
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
		public GraphicFsmSwitch(String presentation) {
			this.presentation = presentation;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.samples.fsm.util.FsmSwitch#caseState(fr.irisa.triskell.kermeta.samples.fsm.State)
		 * @generated
		 */
		public Object caseState(
				fr.irisa.triskell.kermeta.samples.fsm.State object) {
			if ("default".equals(presentation)) {
				return createGraphElementState(object, presentation);
			}
			return null;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.samples.fsm.util.FsmSwitch#caseTransition(fr.irisa.triskell.kermeta.samples.fsm.Transition)
		 * @generated
		 */
		public Object caseTransition(
				fr.irisa.triskell.kermeta.samples.fsm.Transition object) {
			if ("default".equals(presentation)) {
				return createGraphElementTransition(object, presentation);
			}
			return null;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.samples.fsm.util.FsmSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see org.topcased.modeler.editor.ICreationUtils#createGraphElement(org.eclipse.emf.ecore.EObject, java.lang.String)
	 * @generated
	 */
	public GraphElement createGraphElement(EObject obj, String presentation) {
		Object graphElt = null;

		if ("platform:/resource/fr.irisa.triskell.kermeta.samples.fsm/src/metamodels/fsm.ecore"
				.equals(obj.eClass().getEPackage().getNsURI())) {
			graphElt = new GraphicFsmSwitch(presentation).doSwitch(obj);
		}

		return (GraphElement) graphElt;
	}

	/**
	 * @param element the model element
	 * @param presentation the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementState(
			fr.irisa.triskell.kermeta.samples.fsm.State element,
			String presentation) {
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element the model element
	 * @param presentation the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementTransition(
			fr.irisa.triskell.kermeta.samples.fsm.Transition element,
			String presentation) {
		GraphEdge graphEdge = createGraphEdge(element, presentation);
		EdgeObjectOffset inputEdgeObjectOffset = DiagramInterchangeFactory.eINSTANCE
				.createEdgeObjectOffset();
		inputEdgeObjectOffset
				.setId(FsmEdgeObjectConstants.INPUT_EDGE_OBJECT_ID);
		inputEdgeObjectOffset.setOffset(new Dimension(0, 0));
		graphEdge.getContained().add(inputEdgeObjectOffset);
		return graphEdge;
	}

	/**
	 * Create the ModelObject with its initial children
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param obj the model object
	 * @return the model object with its children
	 * @generated
	 */
	public EObject createModelObject(EObject obj) {
		return obj;
	}

}
