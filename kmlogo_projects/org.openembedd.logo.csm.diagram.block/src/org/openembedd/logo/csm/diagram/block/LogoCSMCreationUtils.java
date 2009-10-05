/*******************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 ******************************************************************************/
package org.openembedd.logo.csm.diagram.block;

import org.eclipse.emf.ecore.EObject;
import org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch;
import org.topcased.modeler.di.model.GraphElement;
import org.topcased.modeler.editor.AbstractCreationUtils;
import org.topcased.modeler.graphconf.DiagramGraphConf;

/**
 * This utility class allows to create a GraphElement associated with a Model Object
 * 
 * @generated
 */
public class LogoCSMCreationUtils extends AbstractCreationUtils
{

	/**
	 * Constructor
	 * 
	 * @param diagramConf
	 *        the Diagram Graphical Configuration
	 * @generated
	 */
	public LogoCSMCreationUtils(DiagramGraphConf diagramConf)
	{
		super(diagramConf);
	}

	/**
	 * @generated
	 */
	private class GraphicLogoCSMSwitch extends LogoCSMSwitch
	{
		/**
		 * The presentation of the graphical element
		 * 
		 * @generated
		 */
		private String	presentation;

		/**
		 * Constructor
		 * 
		 * @param presentation
		 *        the presentation of the graphical element
		 * @generated
		 */
		public GraphicLogoCSMSwitch(String presentation)
		{
			this.presentation = presentation;
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#caseForward(org.openembedd.logo.csm.logoCSM.Forward)
		 * @generated
		 */
		public Object caseForward(org.openembedd.logo.csm.logoCSM.Forward object)
		{
			if ("default".equals(presentation))
			{
				return createGraphElementForward(object, presentation);
			}
			return null;
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#caseBack(org.openembedd.logo.csm.logoCSM.Back)
		 * @generated
		 */
		public Object caseBack(org.openembedd.logo.csm.logoCSM.Back object)
		{
			if ("default".equals(presentation))
			{
				return createGraphElementBack(object, presentation);
			}
			return null;
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#caseLeft(org.openembedd.logo.csm.logoCSM.Left)
		 * @generated
		 */
		public Object caseLeft(org.openembedd.logo.csm.logoCSM.Left object)
		{
			if ("default".equals(presentation))
			{
				return createGraphElementLeft(object, presentation);
			}
			return null;
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#caseRight(org.openembedd.logo.csm.logoCSM.Right)
		 * @generated
		 */
		public Object caseRight(org.openembedd.logo.csm.logoCSM.Right object)
		{
			if ("default".equals(presentation))
			{
				return createGraphElementRight(object, presentation);
			}
			return null;
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#casePenUp(org.openembedd.logo.csm.logoCSM.PenUp)
		 * @generated
		 */
		public Object casePenUp(org.openembedd.logo.csm.logoCSM.PenUp object)
		{
			if ("default".equals(presentation))
			{
				return createGraphElementPenUp(object, presentation);
			}
			return null;
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#casePenDown(org.openembedd.logo.csm.logoCSM.PenDown)
		 * @generated
		 */
		public Object casePenDown(org.openembedd.logo.csm.logoCSM.PenDown object)
		{
			if ("default".equals(presentation))
			{
				return createGraphElementPenDown(object, presentation);
			}
			return null;
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#caseClear(org.openembedd.logo.csm.logoCSM.Clear)
		 * @generated
		 */
		public Object caseClear(org.openembedd.logo.csm.logoCSM.Clear object)
		{
			if ("default".equals(presentation))
			{
				return createGraphElementClear(object, presentation);
			}
			return null;
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#caseBlock(org.openembedd.logo.csm.logoCSM.Block)
		 * @generated
		 */
		public Object caseBlock(org.openembedd.logo.csm.logoCSM.Block object)
		{
			if ("default".equals(presentation))
			{
				return createGraphElementBlock(object, presentation);
			}
			return null;
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#caseIf(org.openembedd.logo.csm.logoCSM.If)
		 * @generated
		 */
		public Object caseIf(org.openembedd.logo.csm.logoCSM.If object)
		{
			if ("default".equals(presentation))
			{
				return createGraphElementIf(object, presentation);
			}
			return null;
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#caseRepeat(org.openembedd.logo.csm.logoCSM.Repeat)
		 * @generated
		 */
		public Object caseRepeat(org.openembedd.logo.csm.logoCSM.Repeat object)
		{
			if ("default".equals(presentation))
			{
				return createGraphElementRepeat(object, presentation);
			}
			return null;
		}

		/**
		 * @see org.openembedd.logo.csm.logoCSM.util.LogoCSMSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 * @generated
		 */
		public Object defaultCase(EObject object)
		{
			return null;
		}
	}

	/**
	 * @see org.topcased.modeler.editor.ICreationUtils#createGraphElement(org.eclipse.emf.ecore.EObject,
	 *      java.lang.String)
	 * @generated
	 */
	public GraphElement createGraphElement(EObject obj, String presentation)
	{
		Object graphElt = null;

		if ("http://openembedd.org/logoCSM".equals(obj.eClass().getEPackage().getNsURI()))
		{
			graphElt = new GraphicLogoCSMSwitch(presentation).doSwitch(obj);
		}

		return (GraphElement) graphElt;
	}

	/**
	 * @param element
	 *        the model element
	 * @param presentation
	 *        the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementForward(org.openembedd.logo.csm.logoCSM.Forward element,
			String presentation)
	{
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element
	 *        the model element
	 * @param presentation
	 *        the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementBack(org.openembedd.logo.csm.logoCSM.Back element, String presentation)
	{
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element
	 *        the model element
	 * @param presentation
	 *        the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementLeft(org.openembedd.logo.csm.logoCSM.Left element, String presentation)
	{
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element
	 *        the model element
	 * @param presentation
	 *        the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementRight(org.openembedd.logo.csm.logoCSM.Right element, String presentation)
	{
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element
	 *        the model element
	 * @param presentation
	 *        the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementPenUp(org.openembedd.logo.csm.logoCSM.PenUp element, String presentation)
	{
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element
	 *        the model element
	 * @param presentation
	 *        the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementPenDown(org.openembedd.logo.csm.logoCSM.PenDown element,
			String presentation)
	{
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element
	 *        the model element
	 * @param presentation
	 *        the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementClear(org.openembedd.logo.csm.logoCSM.Clear element, String presentation)
	{
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element
	 *        the model element
	 * @param presentation
	 *        the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementBlock(org.openembedd.logo.csm.logoCSM.Block element, String presentation)
	{
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element
	 *        the model element
	 * @param presentation
	 *        the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementIf(org.openembedd.logo.csm.logoCSM.If element, String presentation)
	{
		return createGraphNode(element, presentation);
	}

	/**
	 * @param element
	 *        the model element
	 * @param presentation
	 *        the presentation of the graphical element
	 * @return the complete GraphElement
	 * @generated
	 */
	protected GraphElement createGraphElementRepeat(org.openembedd.logo.csm.logoCSM.Repeat element, String presentation)
	{
		return createGraphNode(element, presentation);
	}

	/**
	 * Create the ModelObject with its initial children
	 * 
	 * @param obj
	 *        the model object
	 * @return the model object with its children
	 * @generated
	 */
	public EObject createModelObject(EObject obj)
	{
		return obj;
	}

}
