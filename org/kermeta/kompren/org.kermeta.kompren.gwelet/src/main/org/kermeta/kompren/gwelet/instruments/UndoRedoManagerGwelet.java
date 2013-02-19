package org.kermeta.kompren.gwelet.instruments;

import javax.swing.ImageIcon;

import org.kermeta.kompren.gwelet.ui.MPieMenuButton;
import org.malai.instrument.library.UndoRedoManager;
import org.malai.ui.UIComposer;

public class UndoRedoManagerGwelet extends UndoRedoManager {

	public UndoRedoManagerGwelet(final UIComposer<?> composer) {
		super(composer);
	}

	@Override
	protected void initialiseWidgets() {
		undoB = new MPieMenuButton(new ImageIcon(UndoRedoManager.class.getResource("/res/Undo.png"))); //$NON-NLS-1$
		redoB = new MPieMenuButton(new ImageIcon(UndoRedoManager.class.getResource("/res/Redo.png"))); //$NON-NLS-1$
	}
}
