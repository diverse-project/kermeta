/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.context

import org.eclipse.emf.ecore.EObject

case class Art2OSGiBundle(obj : EObject,name : String,objClass : Class[_],bundle : org.osgi.framework.Bundle)
