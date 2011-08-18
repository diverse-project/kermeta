package org.embedded

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;


object JarCreatorScala {

  
	var dir :File  =_
  	def run(_dir:String,outtputJar:String, km:String) =
	{
	  var manifest = new java.util.jar.Manifest();
	  manifest.getMainAttributes().put(java.util.jar.Attributes.Name.MANIFEST_VERSION, "1.0");
	  var target = new java.util.jar.JarOutputStream(new java.io.FileOutputStream(outtputJar), manifest);
	  dir = new java.io.File(_dir);
	  add(dir, target);
	  addKM(new java.io.File(km) ,target)
	  target.close();
	}

	def add(source:File, target:JarOutputStream ) : Unit =
	{
	  var in : BufferedInputStream= null
	  try
	  {
	    if (source.isDirectory())
	    {
	      
	      var name = source.getPath().replace(dir.getPath() + File.separator ,"").replace("\\", "/");
	      if (!name.isEmpty())
	      {
	        if (!name.endsWith("/"))
	          name += "/";
	        var entry = new JarEntry(name);
	        entry.setTime(source.lastModified());
	        target.putNextEntry(entry);
	        target.closeEntry();
	      }
	      source.listFiles().foreach(nestedFile =>
	        add(nestedFile, target))
	      return;
	    }

	    var entry = new JarEntry(source.getPath().replace(dir.getPath() + File.separator ,"").replace("\\", "/"));
	    entry.setTime(source.lastModified()); 
	    target.putNextEntry(entry);
	    in = new BufferedInputStream(new FileInputStream(source));

	    var buffer :Array[Byte]= new Array[Byte](1024)
	    var count = 0;
	    do 
	    {
	      count = in.read(buffer);
	      target.write(buffer, 0, count);
	    }while (count == -1);
	    
	    target.closeEntry();
	  }
	  finally
	  {
	    if (in != null)
	      in.close();
	  }
	}

	def addKM(source:File, target:JarOutputStream ) : Unit =
	{
	  var in : BufferedInputStream= null
	  try
	  {
	    var entry = new JarEntry(source.getName);
	    entry.setTime(source.lastModified());
	    target.putNextEntry(entry);
	    in = new BufferedInputStream(new FileInputStream(source));

	    var buffer :Array[Byte]= new Array[Byte](1024)
	    var count = 0;
	    do 
	    {
	      count = in.read(buffer);
	      target.write(buffer, 0, count);
	    }while (count == -1);
	    
	    target.closeEntry();
	  }
	  finally
	  {
	    if (in != null)
	      in.close();
	  }
	}

	
}