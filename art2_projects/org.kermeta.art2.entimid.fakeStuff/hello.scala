package org.entimid.fakeStuff.devices;
import org.kermeta.art2.framework.AbstractPort;
import org.entimid.framework.SimpleActionService;
public class FakeSimpleLightPORTPROXYon extends AbstractPort implements org.entimid.framework.SimpleActionService {
public void process(){
((org.entimid.fakeStuff.devices.FakeSimpleLight)getComponent()).lightUp();}
}
