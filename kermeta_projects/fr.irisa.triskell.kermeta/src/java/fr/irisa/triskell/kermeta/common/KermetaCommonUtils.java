package fr.irisa.triskell.kermeta.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Object;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

/**
 * KermetaCommonUtils contained some static methods used by the graphicaleditor and model.edit
 * 
 * @author cfaucher
 * 
 */
public class KermetaCommonUtils {

	/**
	 * Store all the types that are in the metamodel
	 */
	private static List<Type> ownedTypesForTypeDefinitions = null;

	/**
	 * Get the type that refers a source ClassDefinition in a target
	 * ClassDefinition through the type-typeDefinition path or the
	 * superType-typeDefinition path
	 * 
	 * @param sourceClassDef
	 * @param targetClassDef
	 * @return
	 * @generated NOT
	 */
	public static Type getReferencingTypeBetween2ClassDef(
			ClassDefinition sourceClassDef, ClassDefinition targetClassDef) {
		if (sourceClassDef.getSuperType() != null
				|| !sourceClassDef.getSuperType().isEmpty()) {
			for (Iterator it = sourceClassDef.getSuperType().iterator(); it
					.hasNext();) {
				Type next = (Type) it.next();
				if (next instanceof Class) {
					ClassDefinition nextTypeDef = (ClassDefinition) ((Class) next)
							.getTypeDefinition();
					if (nextTypeDef == targetClassDef) {
						return next;
					}
				}
			}
		}
		return null;
	}

	/**
	 * Get all the types corresponding to the type definitions that belong to
	 * the same package and subpackages as the one to which the given type
	 * definition believes.
	 * 
	 * @param typedef
	 *            the typedef from the package which we search the available
	 *            types.
	 * @generated NOT
	 */
	public static List<Type> getOwnedTypesForTypeDefinitions(
			TypeDefinition typedef) {
		ownedTypesForTypeDefinitions = new ArrayList<Type>();
		// By definition, a TypeDefinition container is always of type Package
		Package pkg = getRootPackage((Package) typedef.eContainer());

		getAllTypesForAllPackages(pkg);

		return ownedTypesForTypeDefinitions;
	}

	/**
	 * Evaluate the inheritance property between 2 DefinitionClasses
	 * @param parent
	 * @param child
	 * @return true if parent is the same as child or if parent is super type of child, else false
	 */
	public static boolean isSuperType(ClassDefinition parent,
			ClassDefinition child) {
		if (parent == child) {
			return true;
		}

		Type betType = getReferencingTypeBetween2ClassDef(parent, child);
		if (betType != null && betType.eContainer() instanceof ClassDefinition) {
			return true;
		}

		return false;
	}

	/**
	 * Get all the types contained in all the package tree
	 * 
	 * @param pkg
	 * @generated NOT
	 */
	private static void getAllTypesForAllPackages(Package pkg) {
		getAllTypesForAPackage(pkg);
		for (Iterator<Package> it = pkg.getNestedPackage().iterator(); it
				.hasNext();) {
			getAllTypesForAllPackages(pkg);
		}
	}

	/**
	 * 
	 * @param pkg
	 * @generated NOT
	 */
	private static void getAllTypesForAPackage(Package pkg) {
		// Loop on the content of the current package : pkg
		for (Iterator<TypeDefinition> it = pkg.getOwnedTypeDefinition()
				.iterator(); it.hasNext();) {

			TypeDefinition aTypeDef = (TypeDefinition) it.next();
			if (aTypeDef instanceof ClassDefinition) {
				// Look the content of the ClassDefinition
				for (Iterator cd_it = aTypeDef.eContents().iterator(); cd_it
						.hasNext();) {
					Object cd_obj = (Object) cd_it.next();
					if (cd_obj instanceof Property) {
						ownedTypesForTypeDefinitions.add(((Property) cd_obj)
								.getType());
					}
					if (cd_obj instanceof Type) {
						ownedTypesForTypeDefinitions.add((Type) cd_obj);
					}
				}
			}
		}
	}

	/**
	 * RootPackage stands for the uppermost containing package of the given
	 * package.
	 * 
	 * @generated NOT
	 */
	private static Package getRootPackage(Package fpackage) {
		if (fpackage.getNestingPackage() != null) {
			return getRootPackage(fpackage.getNestingPackage());
		} else
			return fpackage;
	}
}
