/* $Id: UserDirURI.java,v 1.1 2005-03-03 15:27:07 zdrey Exp $
 * Project : Kermeta (First iteration)
 * File : UserDirURI.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 3, 2005
 * Author : zdrey
 * Description : describe here file content
 * TODO : 
 * 	- write here your TODO actions
 *  - ...
 */
package fr.irisa.triskell.kermeta.utils;

import java.net.URI;

import fr.irisa.triskell.kermeta.dev.model.CreateGenericVisitor;


/**
 * 
 */
public class UserDirURI
{
    public static URI createURI(String str_path)
    {
        
        return URI.create(str_path);
    }
    
    public static URI createURI(URI uri)
    {
        return URI.create(System.getProperty("user.dir")+uri.getPath());
    }
    
}
