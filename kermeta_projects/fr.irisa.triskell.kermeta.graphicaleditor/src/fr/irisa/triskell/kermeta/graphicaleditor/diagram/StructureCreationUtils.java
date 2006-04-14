package fr.irisa.triskell.kermeta.graphicaleditor.diagram;

import org.eclipse.emf.ecore.EObject;
import org.topcased.modeler.di.model.DiagramInterchangeFactory;
import org.topcased.modeler.di.model.EdgeObjectUV;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.editor.AbstractCreationUtils;

import fr.irisa.triskell.kermeta.graphicaleditor.StructureEdgeObjectConstants;
import fr.irisa.triskell.kermeta.graphicaleditor.diagram.utils.KermetaUtils;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.language.structure.Tag;
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
						|| KermetaUtils.getDefault().isPrimitiveType(
								object.getType())) {
					return createGraphElementPropertyNode((Property) object);
				} else
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
	 * @param element the model element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementPackage(Package element) {
		return createGraphNode(element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Create the appearance of a class definition, with the accepted composite elements
	 * (namely, owned properties and operations).
	 * Developer note : the order where you add the contained elements (in the body of this method)
	 * condition their position in the 
	 * figure.  
	 * <!-- end-user-doc -->
	 * 
	 * @param element
	 * @return the complete GraphElement
	 * @generated NOT
	 * It could have been generated ?
	 */
	private GraphElement createGraphElementClassDefinition(
			ClassDefinition element) {
		// TODO this snippet of code should be customized if it is not well generated
		GraphNode nodeParent = createGraphNode(element);

		GraphNode fproperty = createGraphNode(element,
				StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE);
		fproperty.setContainer(nodeParent);
		
		GraphNode foperation = createGraphNode(element,
				StructurePackage.CLASS_DEFINITION__OWNED_OPERATION);
		foperation.setContainer(nodeParent);

		return nodeParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param element the model element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementOperation(Operation element) {
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
	protected GraphElement createGraphElementTag(Tag element) {
		return createGraphNode(element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param element the model element
	 * @return the complete GraphElement
	 * @generated NOT
	 */
	protected GraphElement createGraphElementProperty(Property element) {
		GraphEdge graphEdge = createGraphEdge(element);
		createPropertyLabels(graphEdge);
		return graphEdge;
	}

	private void createPropertyLabels(GraphEdge graphEdge) {
		// Create 2 edge objects to display the cardinality and the name of the
		// EReference
		EdgeObjectUV edgeObject = DiagramInterchangeFactory.eINSTANCE
				.createEdgeObjectUV();
		edgeObject.setId(StructureEdgeObjectConstants.MULTIPLICITY_LABEL_ID);
		edgeObject.setUDistance(20);
		edgeObject.setVDistance(-20);
		edgeObject.setContainer(graphEdge);
		graphEdge.getContained().add(edgeObject);

		edgeObject = DiagramInterchangeFactory.eINSTANCE.createEdgeObjectUV();
		edgeObject.setId(StructureEdgeObjectConstants.NAME_LABEL_ID);
		edgeObject.setUDistance(20);
		edgeObject.setVDistance(20);
		graphEdge.getContained().add(edgeObject);
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
		GraphElement result = createGraphNode(element,
				StructurePackage.CLASS_DEFINITION__OWNED_ATTRIBUTE);
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
		createPropertyLabels(graphEdge);
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
		Object eObject = new StructureSwitch() {
			public Object casePackage(Package object) {
				return createModelObjectPackage(object);
			}

			public Object caseClassDefinition(ClassDefinition object) {
				return createModelObjectClassDefinition(object);
			}

			public Object caseOperation(Operation object) {
				return createModelObjectOperation(object);
			}

			public Object caseTag(Tag object) {
				return createModelObjectTag(object);
			}

			public Object caseProperty(Property object) {
				return createModelObjectProperty(object);
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
	protected Package createModelObjectPackage(Package element) {
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
	protected ClassDefinition createModelObjectClassDefinition(
			ClassDefinition element) {
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
	protected Operation createModelObjectOperation(Operation element) {
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
	protected Tag createModelObjectTag(Tag element) {
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
	protected Property createModelObjectProperty(Property element) {
		return element;
	}

}
