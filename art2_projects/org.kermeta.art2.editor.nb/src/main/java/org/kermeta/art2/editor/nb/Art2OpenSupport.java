/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.editor.nb;

import org.openide.cookies.CloseCookie;
import org.openide.cookies.OpenCookie;
import org.openide.loaders.OpenSupport;
import org.openide.windows.CloneableTopComponent;
//import org.ops4j.pax.url.mvn.Handler;

/**
 *
 * @author ffouquet
 */
public class Art2OpenSupport extends OpenSupport implements OpenCookie,CloseCookie {

    public Art2OpenSupport(Art2NbDataObject.Entry entry) {
        super(entry);
    }

    @Override
    protected CloneableTopComponent createCloneableTopComponent() {


        //Handler handler =new Handler();

        System.out.println(this.entry.getFile());



        Art2NbDataObject dobj = (Art2NbDataObject) entry.getDataObject();
        Art2NbTopComponent tc = Art2NbTopComponent.getDefault();
        tc.setDisplayName(dobj.getName());

        tc.getEditor().loadModel("file://"+this.entry.getFile().getPath());
        tc.getEditor().setDefaultSaveLocation("file://"+this.entry.getFile().getPath());

        return tc;

    }

}
