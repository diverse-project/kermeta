package org.kermeta.ki.task.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.kermeta.ki.task.TaskPackage;
import org.kermeta.ki.task.diagram.edit.parts.AbstractNameEditPart;
import org.kermeta.ki.task.diagram.edit.parts.AbstractOperationEditPart;
import org.kermeta.ki.task.diagram.edit.parts.ApplicationNameEditPart;
import org.kermeta.ki.task.diagram.edit.parts.ApplicationOperationEditPart;
import org.kermeta.ki.task.diagram.edit.parts.InteractionNameEditPart;
import org.kermeta.ki.task.diagram.edit.parts.InteractionOperationEditPart;
import org.kermeta.ki.task.diagram.edit.parts.UserNameEditPart;
import org.kermeta.ki.task.diagram.edit.parts.UserOperationEditPart;
import org.kermeta.ki.task.diagram.edit.parts.WrappingLabelEditPart;
import org.kermeta.ki.task.diagram.parsers.MessageFormatParser;
import org.kermeta.ki.task.diagram.part.TaskVisualIDRegistry;

/**
 * @generated
 */
public class TaskParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser userName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getUserName_5001Parser() {
		if (userName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { TaskPackage.eINSTANCE
					.getTask_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { TaskPackage.eINSTANCE
					.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			userName_5001Parser = parser;
		}
		return userName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser userOperation_5002Parser;

	/**
	 * @generated
	 */
	private IParser getUserOperation_5002Parser() {
		if (userOperation_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { TaskPackage.eINSTANCE
					.getTask_Operation() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userOperation_5002Parser = parser;
		}
		return userOperation_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser interactionName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getInteractionName_5003Parser() {
		if (interactionName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { TaskPackage.eINSTANCE
					.getTask_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { TaskPackage.eINSTANCE
					.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			interactionName_5003Parser = parser;
		}
		return interactionName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser interactionOperation_5004Parser;

	/**
	 * @generated
	 */
	private IParser getInteractionOperation_5004Parser() {
		if (interactionOperation_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { TaskPackage.eINSTANCE
					.getTask_Operation() };
			MessageFormatParser parser = new MessageFormatParser(features);
			interactionOperation_5004Parser = parser;
		}
		return interactionOperation_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser applicationName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getApplicationName_5005Parser() {
		if (applicationName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { TaskPackage.eINSTANCE
					.getTask_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { TaskPackage.eINSTANCE
					.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			applicationName_5005Parser = parser;
		}
		return applicationName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser applicationOperation_5006Parser;

	/**
	 * @generated
	 */
	private IParser getApplicationOperation_5006Parser() {
		if (applicationOperation_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { TaskPackage.eINSTANCE
					.getTask_Operation() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applicationOperation_5006Parser = parser;
		}
		return applicationOperation_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser abstractName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getAbstractName_5007Parser() {
		if (abstractName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { TaskPackage.eINSTANCE
					.getTask_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { TaskPackage.eINSTANCE
					.getTask_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			abstractName_5007Parser = parser;
		}
		return abstractName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser abstractOperation_5008Parser;

	/**
	 * @generated
	 */
	private IParser getAbstractOperation_5008Parser() {
		if (abstractOperation_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { TaskPackage.eINSTANCE
					.getTask_Operation() };
			MessageFormatParser parser = new MessageFormatParser(features);
			abstractOperation_5008Parser = parser;
		}
		return abstractOperation_5008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case UserNameEditPart.VISUAL_ID:
			return getUserName_5001Parser();
		case UserOperationEditPart.VISUAL_ID:
			return getUserOperation_5002Parser();
		case InteractionNameEditPart.VISUAL_ID:
			return getInteractionName_5003Parser();
		case InteractionOperationEditPart.VISUAL_ID:
			return getInteractionOperation_5004Parser();
		case ApplicationNameEditPart.VISUAL_ID:
			return getApplicationName_5005Parser();
		case ApplicationOperationEditPart.VISUAL_ID:
			return getApplicationOperation_5006Parser();
		case AbstractNameEditPart.VISUAL_ID:
			return getAbstractName_5007Parser();
		case AbstractOperationEditPart.VISUAL_ID:
			return getAbstractOperation_5008Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(TaskVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(TaskVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (TaskElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
