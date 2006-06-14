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

import fr.irisa.triskell.kermeta.samples.fsm.State;
import fr.irisa.triskell.kermeta.samples.fsm.Transition;
import fr.irisa.triskell.kermeta.samples.fsm.graphicalEditor.FsmEditorEdgeObjectConstants;
import fr.irisa.triskell.kermeta.samples.fsm.util.FsmSwitch;

/**
 * This utility class allows to create a GraphElement associated with a Model Object
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FsmDiagramCreationUtils extends AbstractCreationUtils {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * Create the GraphElement with its initial children
	 * @param obj the model object
	 * @return the GraphElement
	 * @generated
	 */
	public GraphElement createGraphElement(EObject obj) {
		Object graphElt = new FsmSwitch() {
			public Object caseState(State object) {
				return createGraphElementState(object);
			}

			public Object caseTransition(Transition object) {
				return createGraphElementTransition(object);
			}

			public Object defaultCase(EObject object) {
				return null;
			}
		}.doSwitch(obj);
		return (GraphElement) graphElt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param element the model element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementState(State element) {
		return createGraphNode(element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param element the model element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementTransition(Transition element) {
		GraphEdge graphEdge = createGraphEdge(element);
		EdgeObjectOffset inputEdgeObjectOffset = DiagramInterchangeFactory.eINSTANCE
				.createEdgeObjectOffset();
		inputEdgeObjectOffset
				.setId(FsmEditorEdgeObjectConstants.INPUT_EDGE_OBJECT_ID);
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
		Object eObject = new FsmSwitch() {
			public Object caseState(State object) {
				return createModelObjectState(object);
			}

			public Object caseTransition(Transition object) {
				return createModelObjectTransition(object);
			}

			public Object defaultCase(EObject object) {
				return null;
			}
		}.doSwitch(obj);
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
