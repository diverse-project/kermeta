package org.kermeta.language.api.tests;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.TestSuite;
import org.kermeta.language.api.tests.port.PortResourceLoaderTest;
import org.kermeta.language.api.tests.port.PortResourceLoaderTestSuite;

/**
 * Hello world!
 *
 */
public class Util
{
    


public static void populate(TestSuite ts, String folder, Boolean valid,Class p,String filter) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String[] vfiles;
        try {
            vfiles = getResourceListing(PortResourceLoaderTestSuite.class, folder);

            Arrays.sort(vfiles);
            

            for (String uri : vfiles) {
                if (uri.endsWith(filter)) {
                    InputStream is = PortResourceLoaderTestSuite.class.getClassLoader().getResourceAsStream(uri);
                    File f = convertStreamToFile(is,uri.substring(uri.lastIndexOf("/")+1));

                    ts.addTest(new PortResourceLoaderTest(f, valid,p));
                }
            }

        } catch (URISyntaxException ex) {
            Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PortResourceLoaderTestSuite.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static String[] getResourceListing(Class clazz, String path) throws URISyntaxException, IOException {
        URL dirURL = clazz.getClassLoader().getResource(path);
        if (dirURL != null && dirURL.getProtocol().equals("file")) {
            /* A file path: easy enough */
            return new File(dirURL.toURI()).list();
        }

        if (dirURL == null) {
            /*
             * In case of a jar file, we can't actually find a directory.
             * Have to assume the same jar as clazz.
             */
            String me = clazz.getName().replace(".", "/") + ".class";
            dirURL = clazz.getClassLoader().getResource(me);
        }

        if (dirURL.getProtocol().equals("jar")) {
            /* A JAR path */
            String jarPath = dirURL.getPath().substring(5, dirURL.getPath().indexOf("!")); //strip out only the JAR file
            JarFile jar = new JarFile(URLDecoder.decode(jarPath, "UTF-8"));
            Enumeration<JarEntry> entries = jar.entries(); //gives ALL entries in jar
            Set<String> result = new HashSet<String>(); //avoid duplicates in case it is a subdirectory
            while (entries.hasMoreElements()) {
                String name = entries.nextElement().getName();
                if (name.startsWith(path)) { //filter according to the path

                    result.add(name);
                }
            }
            return result.toArray(new String[result.size()]);
        }

        throw new UnsupportedOperationException("Cannot list files for URL " + dirURL);
    }

    private static File convertStreamToFile(InputStream inputStream,String targetFileName) throws IOException {
        File temp = File.createTempFile(targetFileName+"_", ".tmp");        // Delete temp file when program exits.
       // temp.deleteOnExit();
        OutputStream out = new FileOutputStream(temp);
        int read = 0;
        byte[] bytes = new byte[1024];
        while ((read = inputStream.read(bytes)) != -1) {
            out.write(bytes, 0, read);
        }
        inputStream.close();
        out.flush();
        out.close();
        return temp;
    }
}
