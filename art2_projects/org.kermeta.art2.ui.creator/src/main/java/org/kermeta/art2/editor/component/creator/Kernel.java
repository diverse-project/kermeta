/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.editor.component.creator;

import org.kermeta.art2.editor.component.creator.handlers.ModelHandler;
import org.kermeta.art2.editor.component.creator.handlers.ModelMapper;
import org.kermeta.art2.editor.component.creator.panels.BasicCommandsPanel;
import org.kermeta.art2.editor.component.creator.panels.ModelPanel;
import org.kermeta.art2.editor.component.creator.panels.PalettePanel;

/**
 *
 * @author gnain
 */
public class Kernel {

    private ModelPanel modelPanel;
    private PalettePanel palette;
    private ModelHandler modelHandler;
    private BasicCommandsPanel basicCommandsPanel;
    private ModelMapper modelMapper;

    public ModelMapper getModelMapper() {
        return modelMapper;
    }

    public void setModelMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public BasicCommandsPanel getBasicCommandsPanel() {
        return basicCommandsPanel;
    }

    public void setBasicCommandsPanel(BasicCommandsPanel basicCommandsPanel) {
        this.basicCommandsPanel = basicCommandsPanel;
    }

    public ModelHandler getModelHandler() {
        return modelHandler;
    }

    public void setModelHandler(ModelHandler modelHandler) {
        this.modelHandler = modelHandler;
    }

    public ModelPanel getModelPanel() {
        return modelPanel;
    }

    public void setModelPanel(ModelPanel modelPanel) {
        this.modelPanel = modelPanel;
    }

    public PalettePanel getPalette() {
        return palette;
    }

    public void setPalette(PalettePanel palette) {
        this.palette = palette;
    }

}
