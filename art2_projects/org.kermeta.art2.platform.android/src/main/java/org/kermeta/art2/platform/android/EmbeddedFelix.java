/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.platform.android;

import android.content.res.Resources;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import org.apache.felix.framework.Felix;
import org.apache.felix.framework.Logger;
import org.apache.felix.framework.util.FelixConstants;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.Constants;

/**
 *
 * @author ffouquet
 */
public class EmbeddedFelix {

    //public static final String FELIX_CACHE_DIR = "org.kermeta.art2.platform.android/felixcache";
    public static final String FELIX_CACHE_DIR = "/mnt/sdcard/OSGI";

    private static final String ANDROID_FRAMEWORK_PACKAGES = ("org.osgi.framework; version=1.5.0,"
            + "org.osgi.service.packageadmin; version=1.2.0,"
            + "org.osgi.framework.launch; version=1.5.0,"
            + "org.osgi.service.startlevel; version=1.0.0,"
            + "org.osgi.service.url; version=1.0.0,"
            + "org.osgi.util.tracker,"
            + "android; "
            + "android.app;"
            + "android.content;"
            + "android.database;"
            + "android.database.sqlite;"
            + "android.graphics; "
            + "android.graphics.drawable; "
            + "android.graphics.glutils; "
            + "android.hardware; "
            + "android.location; "
            + "android.media; "
            + "android.net; "
            + "android.opengl; "
            + "android.os; "
            + "android.provider; "
            + "android.sax; "
            + "android.speech.recognition; "
            + "android.telephony; "
            + "android.telephony.gsm; "
            + "android.text; "
            + "android.text.method; "
            + "android.text.style; "
            + "android.text.util; "
            + "android.speech; "
            + "android.speech.tts; "
            + "android.util; "
            + "android.view; "
            + "android.view.animation; "
            + "android.webkit; "
            + "android.widget; "
            + "com.google.android.maps; "
            + "com.google.android.xmppService; "
            + "javax.crypto; "
            + "javax.crypto.interfaces; "
            + "javax.crypto.spec; "
            + "javax.microedition.khronos.opengles; "
            + "javax.net; "
            + "javax.net.ssl; "
            + "javax.security.auth; "
            + "javax.security.auth.callback; "
            + "javax.security.auth.login; "
            + "javax.security.auth.x500; "
            + "javax.security.cert; "
            + "javax.sound.midi; "
            + "javax.sound.midi.spi; "
            + "javax.sound.sampled; "
            + "javax.sound.sampled.spi; "
            + "javax.sql; "
            + "javax.xml; "
            + "javax.xml.datatype; "
            + "javax.xml.namespace; "
            + "javax.xml.parsers; "
            + "javax.xml.transform; "
            + "javax.xml.transform.dom; "
            + "javax.xml.transform.sax; "
            + "javax.xml.transform.stream; "
            + "javax.xml.validation; "
            + "javax.xml.xpath; "
            + "junit.extensions; "
            + "junit.framework; "
            + "org.apache.commons.logging; "
            + "org.apache.commons.codec; "
            + "org.apache.commons.codec.binary; "
            + "org.apache.commons.codec.language; "
            + "org.apache.commons.codec.net; "
            + "org.apache.commons.httpclient; "
            + "org.apache.commons.httpclient.auth; "
            + "org.apache.commons.httpclient.cookie; "
            + "org.apache.commons.httpclient.methods; "
            + "org.apache.commons.httpclient.methods.multipart; "
            + "org.apache.commons.httpclient.params; "
            + "org.apache.commons.httpclient.protocol; "
            + "org.apache.commons.httpclient.util; "
            + "org.bluez; "
            + "org.json; "
            + "org.w3c.dom; "
            + "org.xml.sax; "
            + "org.xml.sax.ext; "
            + "org.xml.sax.helpers; "
            + "org.kermeta.art2.platform.android;").intern();
    //  private HostActivator m_activator = null;
    private Felix m_felix = null;
    private Map configMap = new HashMap();
    private Resources res;

    public EmbeddedFelix(Resources _res) {
        res = _res;
    }

    public void start() {

        File sdDir = Environment.getExternalStorageDirectory();
        File m_cache = new File(sdDir.getAbsolutePath() + "/" + FELIX_CACHE_DIR);
        if (!m_cache.exists()) {
            if (!m_cache.mkdirs()) {
                Log.e("art2.felix", "unable to create cache");
                throw new IllegalStateException("Unable to create cache dir");
            } else {
                Log.i("art2.felix", "cache created");
            }
        } else {
            m_cache.delete();
            m_cache.mkdir();
            Log.i("art2.felix", "cache already exist");
        }


        // List<BundleActivator> activators = new ArrayList<BundleActivator>();
        // Plugs the bundle installer (install bundle from application resources)
        // Art2Bootstrap bootstrap = new Art2Bootstrap(res);

        // activators.add(bootstrap);
        // m_lookupMap.put(FelixConstants., "true");

        configMap.put(FelixConstants.LOG_LEVEL_PROP, String.valueOf(Logger.LOG_DEBUG));
        configMap.put(Constants.FRAMEWORK_SYSTEMPACKAGES, ANDROID_FRAMEWORK_PACKAGES);
        configMap.put(Constants.FRAMEWORK_STORAGE, m_cache.getAbsolutePath());
        configMap.put(Constants.FRAMEWORK_STORAGE_CLEAN, Constants.FRAMEWORK_STORAGE_CLEAN_ONFIRSTINIT);
        //   configMap.put(FelixConstants.SYSTEMBUNDLE_ACTIVATORS_PROP, activators);

        //m_lookupMap.put(Constants., m_cache.getAbsolutePath());

        // m_configMap.put(BundleCache.CACHE_PROFILE_DIR_PROP, m_cache.getAbsolutePath(
        try {
            // Now create an instance of the framework with
            // our configuration properties.
            m_felix = new Felix(configMap);

            // Now start Felix instance.

            m_felix.init();
            m_felix.start();
            //m_felix.getBundleContext().i

        } catch (Exception ex) {
            Log.e("art2.felix", ex.getMessage(), ex);
            ex.printStackTrace();
        }
    }

    public void bootstrap(BundleContext context) {

        //startRawBundle(context, "file://xmlstack.jar", R.raw.xmlstack);
        startRawBundle(context, "file://paxurl.jar", R.raw.paxurl, true);
        startRawBundle(context, "file://shell.jar", R.raw.shell, true);
        //startRawBundle(context,"file://shelltui.jar", R.raw.shelltui);
        startRawBundle(context, "file://shellremote.jar", R.raw.shellremote, true);
        startRawBundle(context, "file://osgi_compendium.jar", R.raw.osgi_compendium, true);
        startRawBundle(context, "file://slf4jandroid.jar", R.raw.slf4jandroid, true);
        //startRawBundle(context, "file://scala_collection.jar", R.raw.scala_collection, false);
        //startRawBundle(context, "file://scala_library.jar", R.raw.scala_library, true);

/*
        startUrlBundle(context, "file:/data/bundles/scala_collection.jar", false);
        startUrlBundle(context, "file:/data/bundles/scala_library.jar", true);
*/



        //      startRawBundle(context, "file://geronimo_blueprint.jar", R.raw.geronimo_blueprint);

        //startMavenBundle(context, "http://10.0.2.2/maven2", "org.kermeta.emf", "emf.lib.android");
        // startMavenBundle(context, "http://duke.irisa.fr/maven2/", "org.kermeta.art2.android", "art2.android.scala.collection", false);
        // startMavenBundle(context, "http://duke.irisa.fr/maven2/", "org.kermeta.art2.android", "art2.android.scala.library", true);


        //  startMavenBundle(context, "http://10.0.2.2/maven2", "org.kermeta.art2.android", "art2.android.akka.shared.remote", false);
        //  startMavenBundle(context, "http://10.0.2.2/maven2", "org.kermeta.art2.android", "art2.android.akka.shared.multiverse", false);
        //  startMavenBundle(context, "http://10.0.2.2/maven2", "org.kermeta.art2.android", "art2.android.akka.shared", true);
        //  startMavenBundle(context, "http://10.0.2.2/maven2", "org.kermeta.art2.android", "art2.android.akka.core", true);
        //  startMavenBundle(context, "http://duke.irisa.fr/maven2/", "org.kermeta.art2.android", "art2.android.sharedlib",true);
        // startMavenBundle(context, "http://duke.irisa.fr/maven2/", "org.kermeta.art2.android", "art2.android.core.bus.activemq",true);
        // startMavenBundle(context, "http://duke.irisa.fr/maven2/", "org.kermeta.art2.android", "art2.android.notification", true);

/*
        startUrlBundle(context, "http://10.0.2.2/maven2/org/kermeta/art2/android/mavenized/emf.lib-2.6.0/1.0.0/emf.lib-2.6.0-1.0.0.jar", true);
        startUrlBundle(context, "http://10.0.2.2/maven2/org/kermeta/art2/android/mavenized/art2.model-2.1.1-SNAPSHOT/1.0.0/art2.model-2.1.1-SNAPSHOT-1.0.0.jar", true);
        startUrlBundle(context, "http://10.0.2.2/maven2/org/kermeta/art2/android/mavenized/art2.api-2.1.1-SNAPSHOT/1.0.0/art2.api-2.1.1-SNAPSHOT-1.0.0.jar", true);
        startUrlBundle(context, "http://10.0.2.2/maven2/org/kermeta/art2/android/mavenized/art2.framework-2.1.1-SNAPSHOT/1.0.0/art2.framework-2.1.1-SNAPSHOT-1.0.0.jar", true);
        startUrlBundle(context, "http://10.0.2.2/maven2/org/kermeta/art2/android/mavenized/art2.adaptation.model-2.1.1-SNAPSHOT/1.0.0/art2.adaptation.model-2.1.1-SNAPSHOT-1.0.0.jar", true);
        startUrlBundle(context, "http://10.0.2.2/maven2/org/kermeta/art2/android/mavenized/art2.kompare-2.1.1-SNAPSHOT/1.0.0/art2.kompare-2.1.1-SNAPSHOT-1.0.0.jar", true);
        startUrlBundle(context, "http://10.0.2.2/maven2/org/kermeta/art2/android/mavenized/art2.deploy.osgi-2.1.1-SNAPSHOT/1.0.0/art2.deploy.osgi-2.1.1-SNAPSHOT-1.0.0.jar", true);
        startUrlBundle(context, "http://10.0.2.2/maven2/org/kermeta/art2/android/mavenized/art2.core-2.1.1-SNAPSHOT/1.0.0/art2.core-2.1.1-SNAPSHOT-1.0.0.jar", true);

        startUrlBundle(context, "http://10.0.2.2/maven2/org/kermeta/art2/android/mavenized/art2.framework.bus.netty-2.1.1-SNAPSHOT/1.0.0/art2.framework.bus.netty-2.1.1-SNAPSHOT-1.0.0.jar", true);
        startUrlBundle(context, "http://10.0.2.2/maven2/org/kermeta/art2/android/mavenized/art2.framework.bus.jmdns-2.1.1-SNAPSHOT/1.0.0/art2.framework.bus.jmdns-2.1.1-SNAPSHOT-1.0.0.jar", true);
*/
        // startMavenBundle(context, "http://duke.irisa.fr/maven2", "org.kermeta.art2", "art2.android.sharedlib");

        System.out.println(context.getBundles().length);

        for (Bundle b : context.getBundles()) {
            System.out.println(b.ACTIVE + "-" + b.INSTALLED + " " + b.getState() + " " + b.getSymbolicName() + " " + b.getHeaders());
        }
    }

    private Bundle startUrlBundle(BundleContext context, String url, Boolean start) {
        Bundle bundle = null;
        try {
            bundle = context.installBundle(url);
            if (start) {
                bundle.start();
            }
        } catch (BundleException ex) {
            Log.e("art2.bootstrap", ex.getMessage(), ex);
        }
        return bundle;
    }

    private Bundle startRawBundle(BundleContext context, String name, Integer id, Boolean start) {
        InputStream is = res.openRawResource(id);
        Bundle bundle = null;
        try {
            bundle = context.installBundle(name, is);
            if (start) {
                bundle.start();
            }
        } catch (BundleException ex) {
            Log.e("art2.bootstrap", ex.getMessage(), ex);
        }
        return bundle;
    }

    private void startMavenBundle(BundleContext context, String serverName, String groupId, String artefactId, Boolean start) {
        Bundle bundle;
        try {
            bundle = context.installBundle("mvn:" + serverName + "!" + groupId + "/" + artefactId);
            if (start) {
                bundle.start();
            }
        } catch (BundleException ex) {
            Log.e("art2.bootstrap", ex.getMessage(), ex);
        }
    }

    public BundleContext getFrameworkBundleContext() {
        return m_felix.getBundleContext();
    }

    public void stop() {
        try {
            m_felix.stop();
            m_felix.waitForStop(0);
        } catch (Exception ex) {
            ex.printStackTrace();
            Log.e("art2.felix", ex.getMessage(), ex);
        }

    }
}
