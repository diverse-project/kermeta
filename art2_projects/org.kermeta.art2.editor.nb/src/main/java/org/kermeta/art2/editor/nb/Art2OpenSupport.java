/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.editor.nb;

import org.openide.cookies.CloseCookie;
import org.openide.cookies.OpenCookie;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileStateInvalidException;
import org.openide.loaders.OpenSupport;
import org.openide.util.Exceptions;
import org.openide.windows.CloneableTopComponent;
import org.ops4j.pax.url.mvn.Handler;

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


        Handler handler =new Handler();




        Art2NbDataObject dobj = (Art2NbDataObject) entry.getDataObject();
        Art2NbTopComponent tc = new Art2NbTopComponent();
        tc.setDisplayName(dobj.getName());
        return tc;

    }

}
