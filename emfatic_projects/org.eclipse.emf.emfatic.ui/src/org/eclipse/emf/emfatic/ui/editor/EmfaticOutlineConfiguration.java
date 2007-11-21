
package org.eclipse.emf.emfatic.ui.editor;

import org.eclipse.emf.emfatic.core.util.EmfaticOutlineBuilder;
import org.eclipse.emf.emfatic.ui.outline.EmfaticContentOutlinePage;
import org.eclipse.gymnast.runtime.core.outline.IOutlineBuilder;
import org.eclipse.gymnast.runtime.ui.outline.LDTContentOutlinePage;
import org.eclipse.gymnast.runtime.ui.outline.LDTOutlineConfiguration;

public class EmfaticOutlineConfiguration extends LDTOutlineConfiguration {

	private EmfaticEditor _editor;

	public EmfaticOutlineConfiguration(EmfaticEditor editor) {
		super(editor);
		_editor = editor;
	}

	public IOutlineBuilder getOutlineBuilder() {
		return new EmfaticOutlineBuilder();
	}

	public LDTContentOutlinePage createContentOutlinePage() {
		return new EmfaticContentOutlinePage(_editor);
	}
	
}
