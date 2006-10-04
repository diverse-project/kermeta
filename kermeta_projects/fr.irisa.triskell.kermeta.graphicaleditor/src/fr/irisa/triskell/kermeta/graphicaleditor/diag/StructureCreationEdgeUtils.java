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

package fr.irisa.triskell.kermeta.graphicaleditor.diag;

import org.eclipse.emf.ecore.EObject;
import org.topcased.modeler.di.model.DiagramInterchangeFactory;
import org.topcased.modeler.di.model.EdgeObjectUV;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.editor.AbstractCreationUtils;
import org.topcased.modeler.graphconf.DiagramGraphConf;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch;

/**
 * This utility class allows to create a GraphElement associated with a Model
 * Object <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class StructureCreationEdgeUtils extends AbstractCreationUtils {

	/**
	 * Constructor
	 * 
	 * @param diagramConf
	 *            the Diagram Graphical Configuration
	 */
	public StructureCreationEdgeUtils(DiagramGraphConf diagramConf) {
		super(diagramConf);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private class GraphicSwitch extends StructureSwitch {
		/** The presentation of the graphical element */
		private String presentation;

		/**
		 * Constructor
		 * 
		 * @param presentation
		 *            the presentation of the graphical element
		 */
		public GraphicSwitch(String presentation) {
			this.presentation = presentation;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#casePackage(fr.irisa.triskell.kermeta.language.structure.Package)
		 */
		public Object casePackage(Package object) {
			return createGraphElementPackage(object, presentation);
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#caseClassDefinition(fr.irisa.triskell.kermeta.language.structure.ClassDefinition)
		 */
		public Object caseClassDefinition(ClassDefinition object) {
			return createGraphElementClassDefinition(object, presentation);
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#caseOperation(fr.irisa.triskell.kermeta.language.structure.Operation)
		 */
		public Object caseOperation(Operation object) {
			return createGraphElementOperation(object, presentation);
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#caseProperty(fr.irisa.triskell.kermeta.language.structure.Property)
		 */
		public Object caseProperty(Property object) {
			return createGraphElementProperty(object, presentation);
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 */
		public Object defaultCase(EObject object) {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.topcased.modeler.editor.ICreationUtils#createGraphElement(org.eclipse.emf.ecore.EObject,
	 *      java.lang.String)
	 * @generated
	 */
	public GraphElement createGraphElement(EObject obj, String presentation) {
		Object graphElt = new GraphicSwitch(presentation).doSwitch(obj);
		return (GraphElement) graphElt;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param element
	 *            the model element
	 * @param presentation
	 *            the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementPackage(Package element,
			String presentation) {
		return createGraphNode(element, presentation);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param element
	 *            the model element
	 * @param presentation
	 *            the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated NOT
	 */
	protected GraphElement createGraphElementClassDefinition(
			ClassDefinition element, String presentation) {
		// TODO this snippet of code should be customized if it is not well
		// generated
		GraphNode nodeParent = createGraphNode(element, presentation);

		GraphNode property = createGraphNode(element,
				StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE,
				presentation);
		property.setContainer(nodeParent);
		
		GraphNode operation = createGraphNode(element,
				StructurePackage.CLASS_DEFINITION__OWNED_OPERATION,
				presentation);
		operation.setContainer(nodeParent);

		return nodeParent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param element
	 *            the model element
	 * @param presentation
	 *            the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementOperation(Operation element,
			String presentation) {
		return createGraphNode(element, presentation);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param element
	 *            the model element
	 * @param presentation
	 *            the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated NOT
	 */
	protected GraphElement createGraphElementProperty(Property element,
			String presentation) {
		GraphEdge graphEdge = createGraphEdge(element, presentation);

		// Create 2 edge objects to display the cardinality and
		// the name of the EReference

		EdgeObjectUV nameEdgeObjectUV = DiagramInterchangeFactory.eINSTANCE
				.createEdgeObjectUV();
		nameEdgeObjectUV
				.setId(StructureEdgeObjectConstants.NAME_EDGE_OBJECT_ID);
		nameEdgeObjectUV.setUDistance(10);
		nameEdgeObjectUV.setVDistance(10);
		graphEdge.getContained().add(nameEdgeObjectUV);

		EdgeObjectUV multiplicityEdgeObjectUV = DiagramInterchangeFactory.eINSTANCE
				.createEdgeObjectUV();
		multiplicityEdgeObjectUV
				.setId(StructureEdgeObjectConstants.MULTIPLICITY_EDGE_OBJECT_ID);
		multiplicityEdgeObjectUV.setUDistance(10);
		multiplicityEdgeObjectUV.setVDistance(-10);
		graphEdge.getContained().add(multiplicityEdgeObjectUV);

		return graphEdge;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private class ModelSwitch extends StructureSwitch {
		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#casePackage(fr.irisa.triskell.kermeta.language.structure.Package)
		 */
		public Object casePackage(Package object) {
			return createModelObjectPackage(object);
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#caseClassDefinition(fr.irisa.triskell.kermeta.language.structure.ClassDefinition)
		 */
		public Object caseClassDefinition(ClassDefinition object) {
			return createModelObjectClassDefinition(object);
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#caseOperation(fr.irisa.triskell.kermeta.language.structure.Operation)
		 */
		public Object caseOperation(Operation object) {
			return createModelObjectOperation(object);
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#caseProperty(fr.irisa.triskell.kermeta.language.structure.Property)
		 */
		public Object caseProperty(Property object) {
			return createModelObjectProperty(object);
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 */
		public Object defaultCase(EObject object) {
			return null;
		}
	}

	/**
	 * Create the ModelObject with its initial children <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param obj
	 *            the model object
	 * @return the model object with its children
	 * @generated
	 */
	public EObject createModelObject(EObject obj) {
		Object eObject = new ModelSwitch().doSwitch(obj);
		return (EObject) eObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param element
	 *            the original model element
	 * @return the complete Model Object
	 * @generated
	 */
	protected Package createModelObjectPackage(Package element) {
		return element;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param element
	 *            the original model element
	 * @return the complete Model Object
	 * @generated
	 */
	protected ClassDefinition createModelObjectClassDefinition(
			ClassDefinition element) {
		return element;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param element
	 *            the original model element
	 * @return the complete Model Object
	 * @generated
	 */
	protected Operation createModelObjectOperation(Operation element) {
		return element;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param element
	 *            the original model element
	 * @return the complete Model Object
	 * @generated
	 */
	protected Property createModelObjectProperty(Property element) {
		return element;
	}

}
