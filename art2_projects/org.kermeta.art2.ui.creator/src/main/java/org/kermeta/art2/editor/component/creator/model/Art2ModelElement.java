/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.editor.component.creator.model;

import java.awt.Point;
import java.io.Serializable;
import javax.swing.JPanel;

/**
 *
 * @author gnain
 */
public abstract class Art2ModelElement implements Serializable{

    public abstract void setLocation(Point p);
    public abstract JPanel getGraphicalRepresentation();
    
}
