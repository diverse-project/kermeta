package fsm.diagram.providers;

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

import fsm.FsmDemoPackage;
import fsm.diagram.edit.parts.StateName2EditPart;
import fsm.diagram.edit.parts.StateNameEditPart;
import fsm.diagram.parsers.MessageFormatParser;
import fsm.diagram.part.FsmVisualIDRegistry;

/**
 * @generated
 */
public class FsmParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser stateName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getStateName_5001Parser() {
		if (stateName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { FsmDemoPackage.eINSTANCE
					.getState_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { FsmDemoPackage.eINSTANCE
					.getState_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			stateName_5001Parser = parser;
		}
		return stateName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser stateName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getStateName_5002Parser() {
		if (stateName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { FsmDemoPackage.eINSTANCE
					.getState_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { FsmDemoPackage.eINSTANCE
					.getState_Name() };
			MessageFormatParser parser = new MessageFormatParser(features,
					editableFeatures);
			stateName_5002Parser = parser;
		}
		return stateName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case StateNameEditPart.VISUAL_ID:
			return getStateName_5001Parser();
		case StateName2EditPart.VISUAL_ID:
			return getStateName_5002Parser();
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
			return getParser(FsmVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(FsmVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (FsmElementTypes.getElement(hint) == null) {
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
