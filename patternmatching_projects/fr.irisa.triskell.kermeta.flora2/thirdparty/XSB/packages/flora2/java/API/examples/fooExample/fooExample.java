/* File:      fooExample.java
**
** Author(s): Aditi Pandit
**
** Contact:   flora-users@lists.sourceforge.net
** 
** Copyright (C) The Research Foundation of SUNY, 2005, 2006
** 
** FLORA-2 is free software; you can redistribute it and/or modify it under the
** terms of the GNU Library General Public License as published by the Free
** Software Foundation; either version 2 of the License, or (at your option)
** any later version.
** 
** FLORA-2 is distributed in the hope that it will be useful, but WITHOUT ANY
** WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
** FOR A PARTICULAR PURPOSE.  See the GNU Library General Public License for
** more details.
** 
** 
** You should have received a copy of the GNU Library General Public License
** along with FLORA-2; if not, write to the Free Software Foundation,
** Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
**
**
** 
*/

/***********************************************************************
    Examples of the low-level API followed by examples of the uses of
    the high-level API.
***********************************************************************/

import net.sourceforge.flora.javaAPI.src.*;
import java.util.*;

public class fooExample{
	
    public static void main(String[] args) {
		
    	FloraSession session = new FloraSession();
	System.out.println("FLORA-2 session started");	
		
	String fileName = System.getProperty("FLORA_FILE");
	if(fileName == null || fileName.trim().length() == 0) {
	    System.out.println("Invalid path to example file");
	    System.exit(0);
	}
	session.loadFile(fileName,"example");
	
	/***********************************************************
                    Low-level API examples
	***********************************************************/

	String command = "?Y : foo @ example.";
	Iterator fooObjs = session.ExecuteQuery(command);
		
	System.out.println("Query: ?Y : foo @ example.");
	FloraObject johnSuper = null; 
    	while (fooObjs.hasNext()) {
	    johnSuper = (FloraObject)fooObjs.next();
	    if (johnSuper != null) {
		System.out.println("FOO obj Id:"+johnSuper);
	    } else
		System.out.println("FOO obj Id: wrong answer!");
	}

	 
	Vector vars = new Vector();
	vars.add("?X");
	vars.add("?Y");
		
	// Use of ExecuteQuery/2
	Iterator allmatches = session.ExecuteQuery("?X : ?Y @ example.",vars);
	HashMap firstmatch;
	System.out.println("Query: ?X : ?Y @ example.");
	while (allmatches.hasNext()) {	
	    firstmatch = (HashMap)allmatches.next();
	    Object Xobj = firstmatch.get("?X");
	    Object Yobj = firstmatch.get("?Y");	
	    System.out.println("    " + Xobj + " : " + Yobj);	
	}
		
	/*******************************************************************
                Examples of the high-level API
	*******************************************************************/

	foo objJohn = new foo("john","example",session);
	boolean check = objJohn.getBDN_boolean();
	if (check)
	    System.out.println("boolean is true");
	else
	    System.out.println("boolean is false");

	check = objJohn.getBDN_boolean2();
	if(check)
	    System.out.println("boolean2 is true");
	else
	    System.out.println("boolean2 is false");

	check = objJohn.getPDN_procedural();
	if (check)
	    System.out.println("procedural is true");
	else
	    System.out.println("procedural is false");

	check = objJohn.getPDN_procedural2();
	if (check)
	    System.out.println("procedural2 is true");
	else
	    System.out.println("procedural2 is false");
			

	objJohn.setVDN_bonus("2004","Jan","5000");
	System.out.println("Set John's bonus");
	objJohn.setVDN_age("2004","50");
	System.out.println("Set John's age");
	Iterator ageValues = objJohn.getVDN_age("2004");
	while (ageValues.hasNext()) {
	    System.out.println("John's age: "+ageValues.next());
	}
		
	Vector ancestors = new Vector();
	ancestors.add("mary");
	ancestors.add("sally");
		
	objJohn.setVDN_ancestors(ancestors);
	System.out.println("John obj: "+objJohn);

	Iterator ancestorVals = objJohn.getVDN_ancestors();
	while (ancestorVals.hasNext()) {
	    System.out.println("John's ancestors: " + ancestorVals.next());
	}
	 
	// good bye
	session.close();
	System.exit(0);
    }
}
