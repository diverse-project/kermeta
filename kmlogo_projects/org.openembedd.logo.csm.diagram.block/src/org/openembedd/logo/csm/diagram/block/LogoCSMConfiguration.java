/*******************************************************************************
 * Copyright : INRIA OpenEmbeDD - integration team This plug-in is under the terms of the EPL License.
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * @author Christian Brunette
 ******************************************************************************/
package org.openembedd.logo.csm.diagram.block;

import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gef.EditPartFactory;
import org.openembedd.logo.csm.diagram.block.edit.BackEditPart;
import org.openembedd.logo.csm.diagram.block.edit.BlockEditPart;
import org.openembedd.logo.csm.diagram.block.edit.ClearEditPart;
import org.openembedd.logo.csm.diagram.block.edit.ForwardEditPart;
import org.openembedd.logo.csm.diagram.block.edit.IfEditPart;
import org.openembedd.logo.csm.diagram.block.edit.InstructionEditPart;
import org.openembedd.logo.csm.diagram.block.edit.LeftEditPart;
import org.openembedd.logo.csm.diagram.block.edit.PenDownEditPart;
import org.openembedd.logo.csm.diagram.block.edit.PenUpEditPart;
import org.openembedd.logo.csm.diagram.block.edit.RepeatEditPart;
import org.openembedd.logo.csm.diagram.block.edit.RightEditPart;
import org.topcased.modeler.editor.IConfiguration;
import org.topcased.modeler.editor.ICreationUtils;
import org.topcased.modeler.editor.IPaletteManager;
import org.topcased.modeler.graphconf.DiagramGraphConf;
import org.topcased.modeler.graphconf.exceptions.MissingGraphConfFileException;

/**
 * A diagram configuration : manages Palette, EditPartFactory for this diagram.
 * 
 * @generated
 */
public class LogoCSMConfiguration implements IConfiguration
{
	/**
	 * @generated
	 */
	private LogoCSMPaletteManager	paletteManager;

	/**
	 * @generated
	 */
	private LogoCSMEditPartFactory	editPartFactory;

	/**
	 * @generated
	 */
	private LogoCSMCreationUtils	creationUtils;

	/**
	 * The DiagramGraphConf that contains graphical informations on the configuration
	 * 
	 * @generated
	 */
	private DiagramGraphConf		diagramGraphConf;

	/**
	 * Constructor. Initialize Adapter factories.
	 * 
	 * @generated
	 */
	public LogoCSMConfiguration()
	{
		registerAdapters();
	}

	/**
	 * Registers the Adapter Factories for all the EditParts
	 * 
	 * @generated
	 */
	private void registerAdapters()
	{
		Platform.getAdapterManager().registerAdapters(
			new EditPart2ModelAdapterFactory(InstructionEditPart.class,
				org.openembedd.logo.csm.logoCSM.Instruction.class), InstructionEditPart.class);
		Platform.getAdapterManager().registerAdapters(
			new EditPart2ModelAdapterFactory(BackEditPart.class, org.openembedd.logo.csm.logoCSM.Back.class),
			BackEditPart.class);
		Platform.getAdapterManager().registerAdapters(
			new EditPart2ModelAdapterFactory(ForwardEditPart.class, org.openembedd.logo.csm.logoCSM.Forward.class),
			ForwardEditPart.class);
		Platform.getAdapterManager().registerAdapters(
			new EditPart2ModelAdapterFactory(LeftEditPart.class, org.openembedd.logo.csm.logoCSM.Left.class),
			LeftEditPart.class);
		Platform.getAdapterManager().registerAdapters(
			new EditPart2ModelAdapterFactory(RightEditPart.class, org.openembedd.logo.csm.logoCSM.Right.class),
			RightEditPart.class);
		Platform.getAdapterManager().registerAdapters(
			new EditPart2ModelAdapterFactory(PenDownEditPart.class, org.openembedd.logo.csm.logoCSM.PenDown.class),
			PenDownEditPart.class);
		Platform.getAdapterManager().registerAdapters(
			new EditPart2ModelAdapterFactory(PenUpEditPart.class, org.openembedd.logo.csm.logoCSM.PenUp.class),
			PenUpEditPart.class);
		Platform.getAdapterManager().registerAdapters(
			new EditPart2ModelAdapterFactory(ClearEditPart.class, org.openembedd.logo.csm.logoCSM.Clear.class),
			ClearEditPart.class);
		Platform.getAdapterManager().registerAdapters(
			new EditPart2ModelAdapterFactory(BlockEditPart.class, org.openembedd.logo.csm.logoCSM.Block.class),
			BlockEditPart.class);
		Platform.getAdapterManager().registerAdapters(
			new EditPart2ModelAdapterFactory(IfEditPart.class, org.openembedd.logo.csm.logoCSM.If.class),
			IfEditPart.class);
		Platform.getAdapterManager().registerAdapters(
			new EditPart2ModelAdapterFactory(RepeatEditPart.class, org.openembedd.logo.csm.logoCSM.Repeat.class),
			RepeatEditPart.class);
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getId()
	 * @generated
	 */
	public String getId()
	{
		return new String("org.openembedd.logo.csm.diagram.block");
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getName()
	 * @generated
	 */
	public String getName()
	{
		return new String("Block Diagram");
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getEditPartFactory()
	 * @generated
	 */
	public EditPartFactory getEditPartFactory()
	{
		if (editPartFactory == null)
		{
			editPartFactory = new LogoCSMEditPartFactory();
		}

		return editPartFactory;
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getPaletteManager()
	 * @generated
	 */
	public IPaletteManager getPaletteManager()
	{
		if (paletteManager == null)
		{
			paletteManager = new LogoCSMPaletteManager(getCreationUtils());
		}

		return paletteManager;
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getCreationUtils()
	 * @generated
	 */
	public ICreationUtils getCreationUtils()
	{
		if (creationUtils == null)
		{
			creationUtils = new LogoCSMCreationUtils(getDiagramGraphConf());
		}

		return creationUtils;
	}

	/**
	 * @see org.topcased.modeler.editor.IConfiguration#getDiagramGraphConf()
	 * @generated
	 */
	public DiagramGraphConf getDiagramGraphConf()
	{
		if (diagramGraphConf == null)
		{
			URL url = LogoCSMPlugin.getDefault().getBundle().getResource(
				"org/openembedd/logo/csm/diagram/block/diagram.graphconf");
			if (url != null)
			{
				URI fileURI = URI.createURI(url.toString());
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource resource = resourceSet.getResource(fileURI, true);
				if (resource != null && resource.getContents().get(0) instanceof DiagramGraphConf)
				{
					diagramGraphConf = (DiagramGraphConf) resource.getContents().get(0);
				}
			}
			else
			{
				new MissingGraphConfFileException(
					"The *.diagramgraphconf file can not be retrieved. Check if the path is correct in the Configuration class of your diagram.");
			}
		}

		return diagramGraphConf;
	}

}
