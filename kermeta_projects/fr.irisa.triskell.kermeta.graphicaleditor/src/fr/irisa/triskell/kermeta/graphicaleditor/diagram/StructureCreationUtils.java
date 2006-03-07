package fr.irisa.triskell.kermeta.graphicaleditor.diagram;

import org.eclipse.emf.ecore.EObject;
import org.topcased.modeler.di.model.DiagramInterchangeFactory;
import org.topcased.modeler.di.model.EdgeObjectUV;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.editor.AbstractCreationUtils;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureEdgeObjectConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures.PropertyFigureNode;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch;

/**
 * This utility class allows to create a GraphElement associated with a Model Object
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureCreationUtils extends AbstractCreationUtils {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * Create the GraphElement with its initial children.
	 * We add to choose, which between createGraphElement and createGraphElementProperty,
	 * had to be generated. We choosed this method since it is the simplest one
	 * to rewrite manually :)
	 * @param obj the model object
	 * @return the GraphElement
	 * @generated NOT
	 */
	public GraphElement createGraphElement(EObject obj) {
		Object graphElt = new StructureSwitch() {
			public Object casePackage(Package object) {
				return createGraphElementPackage((Package) object);
			}

			public Object caseClassDefinition(ClassDefinition object) {
				return createGraphElementClassDefinition((ClassDefinition) object);
			}

			public Object caseOperation(Operation object) {
				return createGraphElementOperation((Operation) object);
			}

			/* modified to handle properties that are represented as nodes 
			 * (properties whose type is PrimitiveType) labels in 
			 * a class figure) as well as properties represented as edges.
			 */
			public Object caseProperty(Property object) {
				// Contract!!
				// The constraint according to which property is a node 
				// (if its type is a PrimitiveType) or an edge (otherwise).
				// TODO : check that object type's type is always fr.irisa.triskell.kermeta.language.structure.Class
				if (KermetaUtils.getDefault().isStandardType(object.getType())
				||  KermetaUtils.getDefault().isPrimitiveType(object.getType()))
				{
					return createGraphElementPropertyNode((Property) object);
				}
				else
					return createGraphElementPropertyEdge((Property) object);
			}
			
			public Object caseTag(Tag object) {
				return createGraphElementTag((Tag) object);
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
	 * @param element
	 * @return the complete GraphElement
	 * @generated
	 */
	private GraphElement createGraphElementPackage(Package element) {
		return createGraphNode(element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param element
	 * @return the complete GraphElement
	 * @generated NOT
	 * It could have been generated 
	 */
	private GraphElement createGraphElementClassDefinition(
			ClassDefinition element) {
		// TODO this snippet of code should be customized if it is not well generated
		GraphNode nodeParent = createGraphNode(element);

		GraphNode foperation = createGraphNode(element,
				StructurePackage.CLASS_DEFINITION__OWNED_OPERATION);
		foperation.setContainer(nodeParent);
		
		GraphNode fproperty = createGraphNode(element,
				StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE);
		fproperty.setContainer(nodeParent);
		
		GraphNode ftag = createGraphNode(element,
				StructurePackage.CLASS_DEFINITION__TAG);
		ftag.setContainer(nodeParent);


		return nodeParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param element
	 * @return the complete GraphElement
	 * @generated
	 */
	private GraphElement createGraphElementOperation(Operation element) {
		return createGraphNode(element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param element
	 * @return the complete GraphElement
	 * @generated
	 */
	private GraphElement createGraphElementTag(Tag element) {
		return createGraphNode(element);
	}

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GraphElement createGraphElementProperty(Property element) {
		GraphEdge graphEdge = createGraphEdge(element);
		EdgeObjectUV fnameEdgeObjectUV = DiagramInterchangeFactory.eINSTANCE
				.createEdgeObjectUV();
		fnameEdgeObjectUV
				.setId(StructureEdgeObjectConstants.FNAME_EDGE_OBJECT_ID);
		fnameEdgeObjectUV.setUDistance(0);
		fnameEdgeObjectUV.setVDistance(0);
		graphEdge.getContained().add(fnameEdgeObjectUV);
		return graphEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param element
	 * @return the complete GraphElement
	 * @was createGraphElementProperty : duplicate method, since
	 * we create 2 graph elemenst (one is a node, the other is an edge) for
	 * the same model element.
	 * @generated NOT
	 */
	private GraphElement createGraphElementPropertyNode(Property element) {
		GraphElement result = createGraphNode(element, StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param element
	 * @return the complete GraphElement
	 * @was createGraphElementProperty : duplicate method, since
	 * we create 2 graph elemenst (one is a node, the other is an edge) for
	 * the same model element.
	 * What you have to do after generation process :
	 * cut/paste createGraphElementProperty body here and make the modifications
	 * you want, or directly return createGraphElementProperty.
	 * @generated NOT 
	 */
	private GraphElement createGraphElementPropertyEdge(Property element) {
		GraphEdge graphEdge = createGraphEdge(element);
		EdgeObjectUV fnameEdgeObjectUV = DiagramInterchangeFactory.eINSTANCE
				.createEdgeObjectUV();
		fnameEdgeObjectUV
				.setId(StructureEdgeObjectConstants.FNAME_EDGE_OBJECT_ID);
		fnameEdgeObjectUV.setUDistance(0);
		fnameEdgeObjectUV.setVDistance(0);
		graphEdge.getContained().add(fnameEdgeObjectUV);
		return graphEdge;
		//return createGraphElementProperty(element);
/*		GraphEdge graphEdge = createGraphEdge(element);
		EdgeObjectUV flowerEdgeObjectUV = DiagramInterchangeFactory.eINSTANCE
				.createEdgeObjectUV();
		flowerEdgeObjectUV
				.setId(StructureEdgeObjectConstants.FLOWER_EDGE_OBJECT_ID);
		flowerEdgeObjectUV.setUDistance(0);
		flowerEdgeObjectUV.setVDistance(0);
		graphEdge.getContained().add(flowerEdgeObjectUV);
		EdgeObjectUV fupperEdgeObjectUV = DiagramInterchangeFactory.eINSTANCE
				.createEdgeObjectUV();
		fupperEdgeObjectUV
				.setId(StructureEdgeObjectConstants.FUPPER_EDGE_OBJECT_ID);
		fupperEdgeObjectUV.setUDistance(0);
		fupperEdgeObjectUV.setVDistance(0);
		graphEdge.getContained().add(fupperEdgeObjectUV);
		EdgeObjectUV fnameEdgeObjectUV = DiagramInterchangeFactory.eINSTANCE
				.createEdgeObjectUV();
		fnameEdgeObjectUV
				.setId(StructureEdgeObjectConstants.FNAME_EDGE_OBJECT_ID);
		fnameEdgeObjectUV.setUDistance(0);
		fnameEdgeObjectUV.setVDistance(0);
		graphEdge.getContained().add(fnameEdgeObjectUV);
		return graphEdge;*/
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
		Object eObject = new StructureSwitch() {
			public Object casePackage(Package object) {
				return createModelObjectPackage((Package) object);
			}

			public Object caseClassDefinition(ClassDefinition object) {
				return createModelObjectClassDefinition((ClassDefinition) object);
			}

			public Object caseOperation(Operation object) {
				return createModelObjectOperation((Operation) object);
			}

			public Object caseTag(Tag object) {
				return createModelObjectTag((Tag) object);
			}

			public Object caseProperty(Property object) {
				return createModelObjectProperty((Property) object);
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
	 * @param element
	 * @return the complete Model Object
	 * @generated
	 */
	private Package createModelObjectPackage(Package element) {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param element
	 * @return the complete Model Object
	 * @generated
	 */
	private ClassDefinition createModelObjectClassDefinition(
			ClassDefinition element) {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param element
	 * @return the complete Model Object
	 * @generated
	 */
	private Operation createModelObjectOperation(Operation element) {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param element
	 * @return the complete Model Object
	 * @generated
	 */
	private Tag createModelObjectTag(Tag element) {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param element
	 * @return the complete Model Object
	 * @generated
	 */
	private Property createModelObjectProperty(Property element) {
		return element;
	}

}
