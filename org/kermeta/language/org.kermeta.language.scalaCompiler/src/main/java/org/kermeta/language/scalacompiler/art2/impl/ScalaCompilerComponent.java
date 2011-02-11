/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.scalacompiler.art2.impl;

/**
 *
 * @author ffouquet
 */
public class ScalaCompilerComponent {

    public void compile(String srcFolder,String targetFolder,java.util.List<String> classpath){

        org.kermeta.language.scalacompiler.sub.ScalaCompiler compiler = new org.kermeta.language.scalacompiler.sub.ScalaCompiler();
        compiler.compile(srcFolder,targetFolder,classpath);

    }

}
