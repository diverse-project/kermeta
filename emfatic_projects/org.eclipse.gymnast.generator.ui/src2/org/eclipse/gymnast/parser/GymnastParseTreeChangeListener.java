package org.eclipse.gymnast.parser;

import org.eclipse.gymnast.generator.core.ast.CompUnit;
import org.eclipse.gymnast.generator.ui.editor.GymnastEditor;
import org.eclipse.gymnast.runtime.core.ast.ASTNode;
import org.eclipse.gymnast.runtime.ui.views.parsetree.IParseTreeChangedListener;

public class GymnastParseTreeChangeListener implements
		IParseTreeChangedListener {

	private GymnastEditor _editor = null;

	public GymnastParseTreeChangeListener(GymnastEditor editor) {
		_editor  = editor; 
	}
	
	public void parseTreeChanged(ASTNode[] changedNodes) {
		CompUnit cu = (CompUnit) changedNodes[0];
		GymnastAST2EMFConveter c = new GymnastAST2EMFConveter();
		gymnast.CompUnit eCU = c.convert(cu);
		// TODO do sthg with eCU
	}

}
