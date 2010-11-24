package org.kermeta.language.kwf.art2.impl;
import org.kermeta.art2.framework.AbstractPort;
import org.kermeta.language.api.port.PortKEvent;
public class Art2ComponentKWFPORTkevent extends AbstractPort implements org.kermeta.language.api.port.PortKEvent {
public void getKEvent(org.kermeta.language.api.kevent.KEvent arg0){
((org.kermeta.language.kwf.art2.impl.Art2ComponentKWF)getComponent()).getKEvent(arg0);}
}
