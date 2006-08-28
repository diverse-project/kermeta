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

import fr.irisa.triskell.kermeta.samples.fsm.State;
import fr.irisa.triskell.kermeta.samples.fsm.Transition;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private class GraphicSwitch extends FsmSwitch {
		/** The presentation of the graphical element */
		private String presentation;

		/**
		 * Constructor
		 * 
		 * @param presentation the presentation of the graphical element
		 */
		public GraphicSwitch(String presentation) {
			this.presentation = presentation;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.samples.fsm.util.FsmSwitch#caseState(fr.irisa.triskell.kermeta.samples.fsm.State)
		 */
		public Object caseState(State object) {
			return createGraphElementState(object, presentation);
		}

		/**
		 * @see fr.irisa.triskell.kermeta.samples.fsm.util.FsmSwitch#caseTransition(fr.irisa.triskell.kermeta.samples.fsm.Transition)
		 */
		public Object caseTransition(Transition object) {
			return createGraphElementTransition(object, presentation);
		}

		/**
		 * @see fr.irisa.triskell.kermeta.samples.fsm.util.FsmSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
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
		Object graphElt = new GraphicSwitch(presentation).doSwitch(obj);
		return (GraphElement) graphElt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param element the model element
	 * @param presentation the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementState(State element,
			String presentation) {
		return createGraphNode(element, presentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param element the model element
	 * @param presentation the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementTransition(Transition element,
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private class ModelSwitch extends FsmSwitch {
		/**
		 * @see fr.irisa.triskell.kermeta.samples.fsm.util.FsmSwitch#caseState(fr.irisa.triskell.kermeta.samples.fsm.State)
		 */
		public Object caseState(State object) {
			return createModelObjectState(object);
		}

		/**
		 * @see fr.irisa.triskell.kermeta.samples.fsm.util.FsmSwitch#caseTransition(fr.irisa.triskell.kermeta.samples.fsm.Transition)
		 */
		public Object caseTransition(Transition object) {
			return createModelObjectTransition(object);
		}

		/**
		 * @see fr.irisa.triskell.kermeta.samples.fsm.util.FsmSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 */
		public Object defaultCase(EObject object) {
			return null;
		}
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
		Object eObject = new ModelSwitch().doSwitch(obj);
		return (EObject) eObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param element the original model element
	 * @return the complete Model Object
	 * @generated
	 */
	protected State createModelObjectState(State element) {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param element the original model element
	 * @return the complete Model Object
	 * @generated
	 */
	protected Transition createModelObjectTransition(Transition element) {
		return element;
	}

}
