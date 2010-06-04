/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor;

import org.kermeta.art2.framework.Art2Handler;
import org.kermeta.art2.ui.framework.elements.ModelPanel;

/**
 *
 * @author ffouquet
 */
public class Art2UIKernel {

    public Art2UIKernel(){
        uifactory = new Art2UIFactory(this);
        modelPanel = new ModelPanel();
        modelHandler = new Art2Handler();
    }

    private Art2UIFactory uifactory;
    private ModelPanel modelPanel;
    private Art2Handler modelHandler;

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
