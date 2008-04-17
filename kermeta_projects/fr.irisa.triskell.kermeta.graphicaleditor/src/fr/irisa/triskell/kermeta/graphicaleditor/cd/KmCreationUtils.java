/*******************************************************************************
 * $Id: KmCreationUtils.java,v 1.9 2008-04-17 12:06:12 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.cd;

import org.eclipse.emf.ecore.EObject;
import org.topcased.modeler.di.model.DiagramInterchangeFactory;
import org.topcased.modeler.di.model.EdgeObjectUV;
import org.topcased.modeler.di.model.GraphEdge;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.di.model.GraphNode;
import org.topcased.modeler.editor.AbstractCreationUtils;
import org.topcased.modeler.graphconf.DiagramGraphConf;

import fr.irisa.triskell.kermeta.language.behavior.util.BehaviorSwitch;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch;
import fr.irisa.triskell.kermeta.language.util.LanguageSwitch;
import fr.irisa.triskell.kermeta.modelhelper.TypeHelper;
import fr.irisa.triskell.kermeta.util.KmSwitch;

/**
 * This utility class allows to create a GraphElement associated with a Model Object
 *
 * @generated
 */
public class KmCreationUtils extends AbstractCreationUtils {

	/**
	 * Constructor
	 *
	 * @param diagramConf the Diagram Graphical Configuration
	 * @generated
	 */
	public KmCreationUtils(DiagramGraphConf diagramConf) {
		super(diagramConf);
	}

	/**
	 * @generated
	 */
	private class GraphicKmSwitch extends KmSwitch {
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
		public GraphicKmSwitch(String presentation) {
			this.presentation = presentation;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.util.KmSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return null;
		}
	}

	/**
	 * @generated
	 */
	private class GraphicLanguageSwitch extends LanguageSwitch {
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
		public GraphicLanguageSwitch(String presentation) {
			this.presentation = presentation;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.util.LanguageSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return null;
		}
	}

	/**
	 * @generated
	 */
	private class GraphicBehaviorSwitch extends BehaviorSwitch {
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
		public GraphicBehaviorSwitch(String presentation) {
			this.presentation = presentation;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.behavior.util.BehaviorSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return null;
		}
	}

	/**
	 * @generated
	 */
	private class GraphicStructureSwitch extends StructureSwitch {
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
		public GraphicStructureSwitch(String presentation) {
			this.presentation = presentation;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#casePackage(fr.irisa.triskell.kermeta.language.structure.Package)
		 * @generated
		 */
		public Object casePackage(
				fr.irisa.triskell.kermeta.language.structure.Package object) {
			if ("default".equals(presentation)) {
				return createGraphElementPackage(object, presentation);
			}
			return null;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#caseClassDefinition(fr.irisa.triskell.kermeta.language.structure.ClassDefinition)
		 * @generated
		 */
		public Object caseClassDefinition(
				fr.irisa.triskell.kermeta.language.structure.ClassDefinition object) {
			if ("default".equals(presentation)) {
				return createGraphElementClassDefinition(object, presentation);
			}
			return null;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#caseProperty(fr.irisa.triskell.kermeta.language.structure.Property)
		 * @generated
		 */
		public Object caseProperty(
				fr.irisa.triskell.kermeta.language.structure.Property object) {
			if ("propertyNode".equals(presentation)) {
				return createGraphElementPropertyNode(object, presentation);
			}
			if ("default".equals(presentation)) {
				return createGraphElementProperty(object, presentation);
			}
			return null;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#caseOperation(fr.irisa.triskell.kermeta.language.structure.Operation)
		 * @generated
		 */
		public Object caseOperation(
				fr.irisa.triskell.kermeta.language.structure.Operation object) {
			if ("default".equals(presentation)) {
				return createGraphElementOperation(object, presentation);
			}
			return null;
		}

		/**
		 * @see fr.irisa.triskell.kermeta.language.structure.util.StructureSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object) {
			return null;
		}
	}

	/**
	 * @see org.topcased.modeler.editor.ICreationUtils#createGraphElement(org.eclipse.emf.ecore.EObject, java.lang.String)
	 * @generated NOT
	 */
	public GraphElement createGraphElement(EObject obj, String presentation) {
		Object graphElt = null;

		if ("http://www.kermeta.org/kermeta/1_2_0//kermeta".equals(obj.eClass()
				.getEPackage().getNsURI())) {
			graphElt = new GraphicKmSwitch(presentation).doSwitch(obj);
		}
		if ("http://www.kermeta.org/kermeta/1_2_0//kermeta/language".equals(obj
				.eClass().getEPackage().getNsURI())) {
			graphElt = new GraphicLanguageSwitch(presentation).doSwitch(obj);
		}
		if ("http://www.kermeta.org/kermeta/1_2_0//kermeta/language/behavior"
				.equals(obj.eClass().getEPackage().getNsURI())) {
			graphElt = new GraphicBehaviorSwitch(presentation).doSwitch(obj);
		}
		if ("http://www.kermeta.org/kermeta/1_2_0//kermeta/language/structure"
				.equals(obj.eClass().getEPackage().getNsURI())) {

			// Switch according to the property type
			if (obj instanceof Property) {
				Property prop = (Property) obj;
				if (prop.eContainer() != null) {
					if (prop.getType() == null
							|| (TypeHelper.isStandardType(prop.getType()) || TypeHelper
									.isPrimitiveType(prop.getType()))) {
						presentation = "propertyNode";
					} else {
						presentation = "default";
					}
				}
			}

			graphElt = new GraphicStructureSwitch(presentation).doSwitch(obj);
		}

		return (GraphElement) graphElt;
	}

	/**
	 * @param element the model element
	 * @param presentation the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementPackage(
			fr.irisa.triskell.kermeta.language.structure.Package element,
			String presentation) {
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element the model element
	 * @param presentation the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementClassDefinition(
			fr.irisa.triskell.kermeta.language.structure.ClassDefinition element,
			String presentation) {
		// TODO this snippet of code should be customized if it is not well generated
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
	 * @param element the model element
	 * @param presentation the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementPropertyNode(
			fr.irisa.triskell.kermeta.language.structure.Property element,
			String presentation) {
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element the model element
	 * @param presentation the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementOperation(
			fr.irisa.triskell.kermeta.language.structure.Operation element,
			String presentation) {
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element the model element
	 * @param presentation the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated NOT
	 * changed setUDistance 0 to 8 or -8
	 */
	protected GraphElement createGraphElementProperty(
			fr.irisa.triskell.kermeta.language.structure.Property element,
			String presentation) {
		GraphEdge graphEdge = createGraphEdge(element, presentation);
		EdgeObjectUV nameEdgeObjectUV = DiagramInterchangeFactory.eINSTANCE
				.createEdgeObjectUV();
		nameEdgeObjectUV.setId(KmEdgeObjectConstants.NAME_EDGE_OBJECT_ID);
		nameEdgeObjectUV.setUDistance(8);
		nameEdgeObjectUV.setVDistance(8);
		graphEdge.getContained().add(nameEdgeObjectUV);
		EdgeObjectUV multiplicityEdgeObjectUV = DiagramInterchangeFactory.eINSTANCE
				.createEdgeObjectUV();
		multiplicityEdgeObjectUV
				.setId(KmEdgeObjectConstants.MULTIPLICITY_EDGE_OBJECT_ID);
		multiplicityEdgeObjectUV.setUDistance(8);
		multiplicityEdgeObjectUV.setVDistance(-8);
		graphEdge.getContained().add(multiplicityEdgeObjectUV);
		return graphEdge;
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
