package org.kermeta.kompren.gwelet.model;

import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.Package;
import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypedElement;

public final class ModelUtils {
	public static final ModelUtils INSTANCE = new ModelUtils();

	private ModelUtils() {
		super();
	}


	public String getCardinalityString(final Property prop) {
		int upper = prop.getUpper();
		int lower = prop.getLower();

		if(upper==lower)
			return upper==-1 ? "*" : String.valueOf(upper);
		return String.valueOf(lower) + ".." + (upper==-1 ? "*" : String.valueOf(upper));
	}


	public boolean isKermetaPrimitiveType(final String name) {
		return name.equals("String") || name.equals("Boolean") || name.equals("Real") || name.equals("Integer");
	}


	public String getTypeQualifiedName(final Type type) {
		if(!(type instanceof org.kermeta.language.structure.Class) || !(((org.kermeta.language.structure.Class)type).getTypeDefinition() instanceof ClassDefinition))
			return "";
		return getQualifiedName((ClassDefinition)((org.kermeta.language.structure.Class)type).getTypeDefinition());
	}


	public String getTypeName(final TypedElement te) {
		if(te.getType()==null || !(te.getType() instanceof org.kermeta.language.structure.Class))
			return "";
		return ((org.kermeta.language.structure.Class)te.getType()).getName();
	}


	public String getQualifiedName(final ClassDefinition cd) {
		String qname = cd.getName();

		if(cd.eContainer() instanceof Package)
			qname = getQualifiedName((Package)cd.eContainer()) + "." + qname;

		return qname;
	}


	public String getQualifiedName(final Package pkg) {
		String qname = pkg.getName();

		if(pkg.getNestingPackage()!=null)
			qname = getQualifiedName(pkg.getNestingPackage()) + "." + qname;

		return qname;
	}
}
