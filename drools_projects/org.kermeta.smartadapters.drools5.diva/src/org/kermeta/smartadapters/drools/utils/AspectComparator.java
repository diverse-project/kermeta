package org.kermeta.smartadapters.drools.utils;

import java.util.Comparator;

public class AspectComparator implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		int position0 = Integer.parseInt(arg0.split("_")[0].split("compiled")[1].substring(1));
		int position1 = Integer.parseInt(arg1.split("_")[0].split("compiled")[1].substring(1));
		
		if(position0 > position1)
			return 1;
		else if(position0 < position1)
			return -1;
		else
			if (!arg0.split("_")[1].equals(arg1.split("_")[1]))
				return 1;
			else
				return 0;
	}

}
