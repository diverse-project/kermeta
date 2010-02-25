package org.kermeta.smartadapters.drools.utils;

import java.util.Comparator;

public class AspectComparator implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		
		String tempArg0 = arg0.split("_")[arg0.split("_").length-2];
		String tempArg1 = arg1.split("_")[arg1.split("_").length-2]; 
		
		//System.out.println(tempArg0);
		//System.out.println(tempArg1);
		
		//System.out.println(tempArg0.substring(tempArg0.length()-2, tempArg0.length()));
		//System.out.println(tempArg1.substring(tempArg1.length()-2, tempArg1.length()));
		
		int position0 = Integer.parseInt(tempArg0.substring(tempArg0.length()-2, tempArg0.length()));
		int position1 = Integer.parseInt(tempArg1.substring(tempArg1.length()-2, tempArg1.length()));
		
		if(position0 > position1)
			return 1;
		else if(position0 < position1)
			return -1;
		else
			if (!arg0.equals(arg1))
				return 1;
			else
				return 0;
	}

}
