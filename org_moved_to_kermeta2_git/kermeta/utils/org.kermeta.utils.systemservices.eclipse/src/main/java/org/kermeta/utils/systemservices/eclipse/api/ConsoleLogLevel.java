/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 6 oct. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.systemservices.eclipse.api;

import org.kermeta.utils.systemservices.api.messaging.MessagingSystem.Kind;
import org.kermeta.utils.systemservices.eclipse.internal.console.message.DebugErrorMessage;
import org.kermeta.utils.systemservices.eclipse.internal.console.message.DebugMessage;
import org.kermeta.utils.systemservices.eclipse.internal.console.message.DebugWarningMessage;
import org.kermeta.utils.systemservices.eclipse.internal.console.message.ErrorMessage;
import org.kermeta.utils.systemservices.eclipse.internal.console.message.InfoMessage;
import org.kermeta.utils.systemservices.eclipse.internal.console.message.WarningMessage;

public class ConsoleLogLevel{
	public static final int 	DEV_DEBUG = 1;
	public static final int 	DEV_INFO= 2;
	public static final int 	DEV_WARNING = 3;
	public static final int 	DEV_ERROR = 4;
	public static final int 	USER_INFO= 8;
	public static final int 	USER_WARNING = 9;
	public static final int 	USER_ERROR = 10;
	
	public static boolean isLevelEnoughToLog(Integer requiredLevel, Integer allowedLevel){
		return requiredLevel>=allowedLevel;
	}
	
	public static String level2String(Integer level){
		switch(level){
		case DEV_DEBUG :
			return "DEV_DEBUG";
		case DEV_INFO :
			return "DEV_INFO";
		case DEV_WARNING :
			return "DEV_WARNING";
		case DEV_ERROR :
			return "DEV_ERROR";
		case USER_INFO :
			return "USER_INFO";
		case USER_WARNING :
			return "USER_WARNING";
		case USER_ERROR :
			return "USER_ERROR";
		default:
			return "";
		}
	}
	public static int String2Level(String s){
		if(s.equals("DEV_DEBUG")) 	return DEV_DEBUG;
		if(s.equals("DEV_INFO")) 	return DEV_INFO;
		if(s.equals("DEV_WARNING")) return DEV_WARNING;
		if(s.equals("DEV_ERROR"))	return DEV_ERROR;
		if(s.equals("USER_INFO")) 	return USER_INFO;
		if(s.equals("USER_WARNING"))return USER_WARNING;
		if(s.equals("USER_ERROR")) 	return USER_ERROR;
		return DEV_DEBUG;
	}
	
	public static int kind2Level(Kind msgKind){
		switch (msgKind) {
		case DevDEBUG:
			return DEV_DEBUG;
		case UserINFO:
			return USER_INFO;
		case DevINFO:
			return DEV_INFO;
		case UserWARNING:
			return USER_WARNING;
		case DevWARNING:
			return DEV_WARNING;
		case UserERROR:
			return USER_ERROR;
		case DevERROR:
			return DEV_ERROR;
			
		default:
			return DEV_DEBUG;
		}
	}
}