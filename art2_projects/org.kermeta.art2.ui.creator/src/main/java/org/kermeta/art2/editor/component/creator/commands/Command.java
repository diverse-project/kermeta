/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.editor.component.creator.commands;

import org.kermeta.art2.editor.component.creator.Kernel;

/**
 *
 * @author gnain
 */
public abstract class Command {
    
    protected Kernel kernel;

    public Kernel getKernel() {
        return kernel;
    }

    public void setKernel(Kernel kernel) {
        this.kernel = kernel;
    }

    public abstract void execute(Object o);
}
