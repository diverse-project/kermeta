/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.context

case class Art2OSGiBundle(name : String,objClass : Class[_],bundle : org.osgi.framework.Bundle)
