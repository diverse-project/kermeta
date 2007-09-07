import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.lang.*;

public class KermetaHelper {
	
	private static Set<String> keywords = new HashSet<String>();
	static {
		keywords.add("");
		keywords.add("package");
		keywords.add("require");
		keywords.add("includeFilter");
		keywords.add("excludeFilter");
		keywords.add("using");
		keywords.add("inherits");
		keywords.add("class");
		//keywords.add("@pre" );
		keywords.add("pre");
		keywords.add("post");
		keywords.add("inv");
		keywords.add("abstract");
		keywords.add("Self");
		keywords.add("Void");
		keywords.add("attribute");
		keywords.add("reference");
		keywords.add("property");
		keywords.add("readonly");
		keywords.add("getter");
		keywords.add("is");
		keywords.add("setter");
		keywords.add("raises");
		keywords.add("select");
		keywords.add("operation");
		keywords.add("method");
		keywords.add("bag");
		keywords.add("set");
		keywords.add("seq");
		keywords.add("oset");
		keywords.add("alias");
		keywords.add("enumeration");
		keywords.add("and");
		keywords.add("or");
		keywords.add("not");
		//keywords.add("self");
		keywords.add("super");
		keywords.add("do");
		keywords.add("end");
		keywords.add("function");
		keywords.add("rescue");
		keywords.add("from");
		keywords.add("until");
		keywords.add("loop");
		keywords.add("if");
		keywords.add("then");
		keywords.add("else");
		keywords.add("raise");
		keywords.add("var");
		keywords.add("init");
		keywords.add("extern");
		keywords.add("true");
		keywords.add("false");
		keywords.add("void");
		keywords.add("result");
		keywords.add("value");
	}
	
	private static Boolean isKeyword(String s){
		for (Iterator<String> i = keywords.iterator(); i.hasNext(); ){
			if (i.next().equals(s)) {
				return true;
			}
		}
		return false;
	}
	
	public static String escape(String id) {
			return isKeyword(id) ? "~" + id : id;
	}

}
