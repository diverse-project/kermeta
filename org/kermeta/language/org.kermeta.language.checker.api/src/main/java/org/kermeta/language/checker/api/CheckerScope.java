package org.kermeta.language.checker.api;

public enum CheckerScope {
	LOADED { public String toString(){return "LOADED";} },
	MERGED { public String toString(){return "MERGED";} },
	RESOLVED { public String toString() {return "RESOLVED";} }
}
