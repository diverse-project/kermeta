package fr.irisa.triskell.maven.merger;

/*
 * Copyright 2001-2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Goal which touches a timestamp file.
 *
 * @goal merge
 * 
 * @phase process-sources
 */
public class Runner
    extends AbstractMojo
{
    /**
     * Location of the file.
     * @parameter expression="${project.build.directory}"
     * @required
     */
    private File outputDirectory;
    
    /**
     * Location of the file.
     * @parameter expression="${basedir}"
     * @required
     */   
    private String outputBaseDir;

    public void execute()
        throws MojoExecutionException
    {
    
    	//getLog().info(arg0);
    	//System.out.println("out "+outputBaseDir);
    	//System.out.println("out "+outputDirectory);
        File f = outputDirectory;
        if ( !f.exists() )
        {
            f.mkdirs();
        }
        
        //String kermetaKMPath = outputDirectory+"/classes/resources/framework.km";
        //String loaderPath = outputDirectory+"/classes/resources";
        String plateformeWorkspace = outputBaseDir+"/src/main/resources/";
        String frameworkKM = "file:/"+outputBaseDir+"/src/main/resources/fr.irisa.triskell.kermeta.io/src/kermeta/framework.km";
        
        
        
        
        String sourceKMTPath = "platform:/resource/HelloWorld/000HelloWorld.kmt";
        String targetKMPath = "platform:/resource/HelloWorld/000HelloWorld.km";
        
        String mainArgs[] = {"-K",frameworkKM,"-PlatformMapping",plateformeWorkspace};
        
        org.kermeta.merger.exporter.FullMergeKmExporter merger = new org.kermeta.merger.exporter.FullMergeKmExporter(mainArgs);
        
        merger.merge(sourceKMTPath, targetKMPath);

        File touch = new File( f, "touch.txt" );
        
        

        FileWriter w = null;
        try
        {
            w = new FileWriter( touch );

            w.write( "touch.txt" );
        }
        catch ( IOException e )
        {
            throw new MojoExecutionException( "Error creating file " + touch, e );
        }
        finally
        {
            if ( w != null )
            {
                try
                {
                    w.close();
                }
                catch ( IOException e )
                {
                    // ignore
                }
            }
        }
    }
}
