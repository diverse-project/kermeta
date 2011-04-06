/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.k2.console;

/**
 *
 * @author barais
 */
public interface Console {
    
    public void writeln(String message);
    public void write(String message);
    public void errorln(String message);
    public String readln();
    public void changeColor(java.awt.Color c);
    
    

}
