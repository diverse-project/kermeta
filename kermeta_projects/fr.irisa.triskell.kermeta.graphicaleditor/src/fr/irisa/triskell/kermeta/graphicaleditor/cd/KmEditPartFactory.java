/*******************************************************************************
 * $Id: KmEditPartFactory.java,v 1.7 2008-04-17 12:06:12 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.topcased.modeler.ModelerPropertyConstants;
import org.topcased.modeler.di.model.Diagram;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.di.model.SimpleSemanticModelElement;
import org.topcased.modeler.di.model.util.DIUtils;
import org.topcased.modeler.edit.EListEditPart;
import org.topcased.modeler.edit.EMFGraphEdgeEditPart;
import org.topcased.modeler.edit.EMFGraphNodeEditPart;
import org.topcased.modeler.edit.GraphEdgeEditPart;
import org.topcased.modeler.edit.GraphNodeEditPart;
import org.topcased.modeler.utils.Utils;

import fr.irisa.triskell.kermeta.graphicaleditor.cd.edit.ClassDefinitionEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.edit.InheritanceEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.edit.KmDiagramEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.edit.OperationEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.edit.PackageEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.edit.PropertyEditPart;
import fr.irisa.triskell.kermeta.graphicaleditor.cd.edit.PropertyNodeEditPart;
import fr.irisa.triskell.kermeta.language.behavior.util.BehaviorSwitch;
import fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch;
import fr.irisa.triskell.kermeta.language.util.LanguageSwitch;
import fr.irisa.triskell.kermeta.util.KmSwitch;

/**
 * Part Factory : associates a model object to its controller. <br>
 *
 * @generated
 */
public class KmEditPartFactory implements EditPartFactory {
	/**
	 * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart,java.lang.Object)
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof Diagram) {
			return new KmDiagramEditPart((Diagram) model);
		} else if (model instanceof GraphNode) {
			final GraphNode node = (GraphNode) model;
			EObject element = Utils.getElement(node);
			if (element != null) {
				if ("http://www.kermeta.org/kermeta/1_2_0//kermeta"
						.equals(element.eClass().getEPackage().getNsURI())) {
					return (EditPart) new NodeKmSwitch(node).doSwitch(element);
				}
				if ("http://www.kermeta.org/kermeta/1_2_0//kermeta/language"
						.equals(element.eClass().getEPackage().getNsURI())) {
					return (EditPart) new NodeLanguageSwitch(node)
							.doSwitch(element);
				}
				if ("http://www.kermeta.org/kermeta/1_2_0//kermeta/language/behavior"
						.equals(element.eClass().getEPackage().getNsURI())) {
					return (EditPart) new NodeBehaviorSwitch(node)
							.doSwitch(element);
				}
				if ("http://www.kermeta.org/kermeta/1_2_0//kermeta/language/structure"
						.equals(element.eClass().getEPackage().getNsURI())) {
					return (EditPart) new NodeStructureSwitch(node)
							.doSwitch(element);
				}

				return new EMFGraphNodeEditPart(node);
			}

			if (node.getSemanticModel() instanceof SimpleSemanticModelElement) {
				// Manage the Element that are not associated with a model object
			}
			return new GraphNodeEditPart(node);
		} else if (model instanceof GraphEdge) {
			final GraphEdge edge = (GraphEdge) model;
			EObject element = Utils.getElement(edge);
			if (element != null) {
				if ("http://www.kermeta.org/kermeta/1_2_0//kermeta"
						.equals(element.eClass().getEPackage().getNsURI())) {
					return (EditPart) new EdgeKmSwitch(edge).doSwitch(element);
				}
				if ("http://www.kermeta.org/kermeta/1_2_0//kermeta/language"
						.equals(element.eClass().getEPackage().getNsURI())) {
					return (EditPart) new EdgeLanguageSwitch(edge)
							.doSwitch(element);
				}
				if ("http://www.kermeta.org/kermeta/1_2_0//kermeta/language/behavior"
						.equals(element.eClass().getEPackage().getNsURI())) {
					return (EditPart) new EdgeBehaviorSwitch(edge)
							.doSwitch(element);
				}
				if ("http://www.kermeta.org/kermeta/1_2_0//kermeta/language/structure"
						.equals(element.eClass().getEPackage().getNsURI())) {
					return (EditPart) new EdgeStructureSwitch(edge)
							.doSwitch(element);
				}

				return new EMFGraphEdgeEditPart(edge);
			}

			if (edge.getSemanticModel() instanceof SimpleSemanticModelElement) {
				// Manage the Element that are not associated with a model object
				if (KmSimpleObjectConstants.SIMPLE_OBJECT_INHERITANCE
						.equals(((SimpleSemanticModelElement) edge
								.getSemanticModel()).getTypeInfo())) {
					return new InheritanceEditPart(edge);
				}
			}

			return new GraphEdgeEditPart(edge);
		}

		throw new IllegalStateException(
				"No edit part matches with the '"
						+ model.getClass().getName()
						+ "' model element. Check KmEditPartFactory#createEditPart(EditPart,Object) class");
	}

	/**
	 * @generated
	 */
	private class NodeKmSwitch extends KmSwitch {
		/**
		 * The graphical node
		 * @generated
		 */
		private GraphNode node;

		/**
		 * Constructor
		 * 
		 * @param node the graphical node
		 * @generated
		 */
		public NodeKmSwitch(GraphNode node) {
			this.node = node;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.util.KmSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphNodeEditPart(node);
		}
	}

	/**
	 * @generated
	 */
	private class NodeLanguageSwitch extends LanguageSwitch {
		/**
		 * The graphical node
		 * @generated
		 */
		private GraphNode node;

		/**
		 * Constructor
		 * 
		 * @param node the graphical node
		 * @generated
		 */
		public NodeLanguageSwitch(GraphNode node) {
			this.node = node;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.util.LanguageSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphNodeEditPart(node);
		}
	}

	/**
	 * @generated
	 */
	private class NodeBehaviorSwitch extends BehaviorSwitch {
		/**
		 * The graphical node
		 * @generated
		 */
		private GraphNode node;

		/**
		 * Constructor
		 * 
		 * @param node the graphical node
		 * @generated
		 */
		public NodeBehaviorSwitch(GraphNode node) {
			this.node = node;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.behavior.util.BehaviorSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphNodeEditPart(node);
		}
	}

	/**
	 * @generated
	 */
	private class NodeStructureSwitch extends StructureSwitch {
		/**
		 * The graphical node
		 * @generated
		 */
		private GraphNode node;

		/**
		 * Constructor
		 * 
		 * @param node the graphical node
		 * @generated
		 */
		public NodeStructureSwitch(GraphNode node) {
			this.node = node;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#casePackage(fr.irisa.triskell.kermeta.language.structure.Package)
		 * @generated
		 */
		public Object casePackage(
				fr.irisa.triskell.kermeta.language.structure.Package object) {
			return new PackageEditPart(node);
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#caseClassDefinition(fr.irisa.triskell.kermeta.language.structure.ClassDefinition)
		 * @generated
		 */
		public Object caseClassDefinition(
				fr.irisa.triskell.kermeta.language.structure.ClassDefinition object) {
			String feature = DIUtils.getPropertyValue(node,
					ModelerPropertyConstants.ESTRUCTURAL_FEATURE_ID);
			if (!"".equals(feature)) {
				int featureID = Integer.parseInt(feature);
				return new EListEditPart(node, object.eClass()
						.getEStructuralFeature(featureID));
			} else {
				return new ClassDefinitionEditPart(node);
			}
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#caseProperty(fr.irisa.triskell.kermeta.language.structure.Property)
		 * @generated
		 */
		public Object caseProperty(
				fr.irisa.triskell.kermeta.language.structure.Property object) {
			return new PropertyNodeEditPart(node);
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#caseOperation(fr.irisa.triskell.kermeta.language.structure.Operation)
		 * @generated
		 */
		public Object caseOperation(
				fr.irisa.triskell.kermeta.language.structure.Operation object) {
			return new OperationEditPart(node);
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphNodeEditPart(node);
		}
	}

	/**
	 * @generated
	 */
	private class EdgeKmSwitch extends KmSwitch {
		/**
		 * The graphical edge
		 * @generated
		 */
		private GraphEdge edge;

		/**
		 * Constructor
		 * 
		 * @param edge the graphical edge
		 * @generated
		 */
		public EdgeKmSwitch(GraphEdge edge) {
			this.edge = edge;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.util.KmSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphEdgeEditPart(edge);
		}
	}

	/**
	 * @generated
	 */
	private class EdgeLanguageSwitch extends LanguageSwitch {
		/**
		 * The graphical edge
		 * @generated
		 */
		private GraphEdge edge;

		/**
		 * Constructor
		 * 
		 * @param edge the graphical edge
		 * @generated
		 */
		public EdgeLanguageSwitch(GraphEdge edge) {
			this.edge = edge;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.util.LanguageSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphEdgeEditPart(edge);
		}
	}

	/**
	 * @generated
	 */
	private class EdgeBehaviorSwitch extends BehaviorSwitch {
		/**
		 * The graphical edge
		 * @generated
		 */
		private GraphEdge edge;

		/**
		 * Constructor
		 * 
		 * @param edge the graphical edge
		 * @generated
		 */
		public EdgeBehaviorSwitch(GraphEdge edge) {
			this.edge = edge;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.behavior.util.BehaviorSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphEdgeEditPart(edge);
		}
	}

	/**
	 * @generated
	 */
	private class EdgeStructureSwitch extends StructureSwitch {
		/**
		 * The graphical edge
		 * @generated
		 */
		private GraphEdge edge;

		/**
		 * Constructor
		 * 
		 * @param edge the graphical edge
		 * @generated
		 */
		public EdgeStructureSwitch(GraphEdge edge) {
			this.edge = edge;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#caseProperty(fr.irisa.triskell.kermeta.language.structure.Property)
		 * @generated
		 */
		public Object caseProperty(
				fr.irisa.triskell.kermeta.language.structure.Property object) {
			return new PropertyEditPart(edge);
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return new EMFGraphEdgeEditPart(edge);
		}
	}

}