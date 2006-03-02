package fr.irisa.triskell.kermeta.graphicaleditor.diagram;

import org.eclipse.emf.ecore.EObject;
import org.topcased.modeler.di.model.DiagramInterchangeFactory;
import org.topcased.modeler.di.model.EdgeObjectUV;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.editor.AbstractCreationUtils;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureEdgeObjectConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.figures.FPropertyFigureNode;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FPackage;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTag;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.StructurePackage;
import fr.irisa.triskell.kermeta.structure.util.StructureSwitch;

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
			public Object caseFPackage(FPackage object) {
				return createGraphElementFPackage((FPackage) object);
			}

			public Object caseFClassDefinition(FClassDefinition object) {
				return createGraphElementFClassDefinition((FClassDefinition) object);
			}

			public Object caseFOperation(FOperation object) {
				return createGraphElementFOperation((FOperation) object);
			}

			/* modified to handle properties that are represented as nodes 
			 * (properties whose type is FPrimitiveType) labels in 
			 * a class figure) as well as properties represented as edges.
			 */
			public Object caseFProperty(FProperty object) {
				// Contract!!
				// The constraint according to which property is a node 
				// (if its type is a PrimitiveType) or an edge (otherwise).
				// TODO : check that object type's type is always FClass
				if (KermetaUtils.getDefault().isStandardType(object.getFType())
				||  KermetaUtils.getDefault().isPrimitiveType(object.getFType()))
				{
					return createGraphElementFPropertyNode((FProperty) object);
				}
				else
					return createGraphElementFPropertyEdge((FProperty) object);
			}
			
			public Object caseFTag(FTag object) {
				return createGraphElementFTag((FTag) object);
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
	private GraphElement createGraphElementFPackage(FPackage element) {
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
	private GraphElement createGraphElementFClassDefinition(
			FClassDefinition element) {
		// TODO this snippet of code should be customized if it is not well generated
		GraphNode nodeParent = createGraphNode(element);

		GraphNode foperation = createGraphNode(element,
				StructurePackage.FCLASS_DEFINITION__FOWNED_OPERATION);
		foperation.setContainer(nodeParent);
		
		GraphNode fproperty = createGraphNode(element,
				StructurePackage.FCLASS_DEFINITION__FOWNED_ATTRIBUTES);
		fproperty.setContainer(nodeParent);
		
		GraphNode ftag = createGraphNode(element,
				StructurePackage.FCLASS_DEFINITION__FTAG);
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
	private GraphElement createGraphElementFOperation(FOperation element) {
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
	private GraphElement createGraphElementFTag(FTag element) {
		return createGraphNode(element);
	}

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GraphElement createGraphElementFProperty(FProperty element) {
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
	 * @was createGraphElementFProperty : duplicate method, since
	 * we create 2 graph elemenst (one is a node, the other is an edge) for
	 * the same model element.
	 * @generated NOT
	 */
	private GraphElement createGraphElementFPropertyNode(FProperty element) {
		GraphElement result = createGraphNode(element, StructurePackage.FCLASS_DEFINITION__FOWNED_ATTRIBUTES);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param element
	 * @return the complete GraphElement
	 * @was createGraphElementFProperty : duplicate method, since
	 * we create 2 graph elemenst (one is a node, the other is an edge) for
	 * the same model element.
	 * What you have to do after generation process :
	 * cut/paste createGraphElementFProperty body here and make the modifications
	 * you want, or directly return createGraphElementFProperty.
	 * @generated NOT 
	 */
	private GraphElement createGraphElementFPropertyEdge(FProperty element) {
		GraphEdge graphEdge = createGraphEdge(element);
		EdgeObjectUV fnameEdgeObjectUV = DiagramInterchangeFactory.eINSTANCE
				.createEdgeObjectUV();
		fnameEdgeObjectUV
				.setId(StructureEdgeObjectConstants.FNAME_EDGE_OBJECT_ID);
		fnameEdgeObjectUV.setUDistance(0);
		fnameEdgeObjectUV.setVDistance(0);
		graphEdge.getContained().add(fnameEdgeObjectUV);
		return graphEdge;
		//return createGraphElementFProperty(element);
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
			public Object caseFPackage(FPackage object) {
				return createModelObjectFPackage((FPackage) object);
			}

			public Object caseFClassDefinition(FClassDefinition object) {
				return createModelObjectFClassDefinition((FClassDefinition) object);
			}

			public Object caseFOperation(FOperation object) {
				return createModelObjectFOperation((FOperation) object);
			}

			public Object caseFTag(FTag object) {
				return createModelObjectFTag((FTag) object);
			}

			public Object caseFProperty(FProperty object) {
				return createModelObjectFProperty((FProperty) object);
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
	private FPackage createModelObjectFPackage(FPackage element) {
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
	private FClassDefinition createModelObjectFClassDefinition(
			FClassDefinition element) {
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
	private FOperation createModelObjectFOperation(FOperation element) {
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
	private FTag createModelObjectFTag(FTag element) {
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
	private FProperty createModelObjectFProperty(FProperty element) {
		return element;
	}

}
