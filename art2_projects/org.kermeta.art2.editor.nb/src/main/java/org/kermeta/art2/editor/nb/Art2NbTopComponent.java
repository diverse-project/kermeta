/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.editor.nb;

import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Logger;
import javax.swing.JLabel;
import org.openide.util.Exceptions;
import org.openide.util.ImageUtilities;
import org.openide.util.NbBundle;
import org.openide.windows.CloneableTopComponent;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;

/**
 *
 * @author ffouquet
 */
public class Art2NbTopComponent extends CloneableTopComponent {

    public Art2NbTopComponent() {




        setName(NbBundle.getMessage(Art2NbTopComponent.class, "CTL_Art2NbTopComponent"));
        setToolTipText(NbBundle.getMessage(Art2NbTopComponent.class, "HINT_Art2NbTopComponent"));
        setIcon(ImageUtilities.loadImage(ICON_PATH, true));


        try {

// Get all resource paths (classpath paths) of the current classloader.
            Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getSystemResources("");

            System.out.println("Size  "+resources.hasMoreElements());
// Show them all.
            while (resources.hasMoreElements()) {
                System.out.println(resources.nextElement());
            }

        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }


        setLayout(new BorderLayout());
        org.kermeta.art2.ui.editor.panel.Art2EditorPanel panel = new org.kermeta.art2.ui.editor.panel.Art2EditorPanel();
        add(panel, BorderLayout.CENTER);

    }
    private static Art2NbTopComponent instance;
    /** path to the icon used by the component and its open action */
    static final String ICON_PATH = "org/kermeta/art2/editor/nb/socket16.png";
    private static final String PREFERRED_ID = "Art2NbTopComponent";

    // Variables declaration - do not modify
    // End of variables declaration
    /**
     * Gets default instance. Do not use directly: reserved for *.settings files only,
     * i.e. deserialization routines; otherwise you could get a non-deserialized instance.
     * To obtain the singleton instance, use {@link #findInstance}.
     */
    public static synchronized Art2NbTopComponent getDefault() {
        if (instance == null) {
            instance = new Art2NbTopComponent();
        }
        return instance;
    }

    /**
     * Obtain the Art2NbTopComponent instance. Never call {@link #getDefault} directly!
     */
    public static synchronized Art2NbTopComponent findInstance() {
        TopComponent win = WindowManager.getDefault().findTopComponent(PREFERRED_ID);
        if (win == null) {
            Logger.getLogger(Art2NbTopComponent.class.getName()).warning(
                    "Cannot find " + PREFERRED_ID + " component. It will not be located properly in the window system.");
            return getDefault();
        }
        if (win instanceof Art2NbTopComponent) {
            return (Art2NbTopComponent) win;
        }
        Logger.getLogger(Art2NbTopComponent.class.getName()).warning(
                "There seem to be multiple components with the '" + PREFERRED_ID
                + "' ID. That is a potential source of errors and unexpected behavior.");
        return getDefault();
    }

    @Override
    public int getPersistenceType() {
        return TopComponent.PERSISTENCE_ALWAYS;
    }

    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    Object readProperties(java.util.Properties p) {
        if (instance == null) {
            instance = this;
        }
        instance.readPropertiesImpl(p);
        return instance;
    }

    private void readPropertiesImpl(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }

    @Override
    protected String preferredID() {
        return PREFERRED_ID;
    }
}
