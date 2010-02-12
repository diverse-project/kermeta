package fsm.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import fsm.diagram.part.FsmVisualIDRegistry;

/**
 * @generated
 */
public class FsmNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof FsmNavigatorItem) {
			FsmNavigatorItem item = (FsmNavigatorItem) element;
			return FsmVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
