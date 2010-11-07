/* $Id$ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */

package org.kermeta.art2.ui.editor;

import org.kermeta.art2.ui.Art2Cluster;
import org.kermeta.art2.ui.Art2Handler;
import org.kermeta.art2.ui.editor.panel.Art2EditorPanel;
import org.kermeta.art2.ui.framework.SelectElement;
import org.kermeta.art2.ui.framework.elements.ModelPanel;

/**
 *
 * @author ffouquet
 */
public class Art2UIKernel {

    public Art2UIKernel(){
        uifactory = new Art2UIFactory(this);
        modelHandler = new Art2Handler();
        modelPanel = uifactory.createModelPanelUI(modelHandler.getActualModel());
        Art2Cluster.start();
    }

    private Art2UIFactory uifactory;
    private ModelPanel modelPanel;

    private Art2Handler modelHandler;
    private Art2EditorPanel editorPanel;

    public void setEditorPanel(Art2EditorPanel editorPanel) {
        this.editorPanel = editorPanel;
    }

    public Art2EditorPanel getEditorPanel() {
        return editorPanel;
    }

    public Art2Handler getModelHandler() {
        return modelHandler;
    }

    public ModelPanel getModelPanel() {
        return modelPanel;
    }

    public Art2UIFactory getUifactory() {
        return uifactory;
    }

}
