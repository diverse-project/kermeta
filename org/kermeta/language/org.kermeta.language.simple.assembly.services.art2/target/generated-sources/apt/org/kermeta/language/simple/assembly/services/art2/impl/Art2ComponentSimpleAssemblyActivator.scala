package org.kermeta.language.simple.assembly.services.art2.impl;
import java.util.Hashtable
import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import org.osgi.util.tracker.ServiceTracker
import org.kermeta.art2.framework.Art2Actor
import org.kermeta.art2.framework.Art2Component
import org.kermeta.art2.framework._
class Art2ComponentSimpleAssemblyActivator extends org.kermeta.art2.framework.osgi.Art2ComponentActivator {
def callFactory() : Art2Component = { Art2ComponentSimpleAssemblyFactory.createComponentActor() } }
