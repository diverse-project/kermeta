/* Id: KermetaOutlineHelper.java,v 2.0.1 Apr 22, 2012 1:16:33 PM
 * Project : org.kermeta.language.texteditor.eclipse
 * File : KermetaOutlineHelper.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Apr 22, 2012
 * Authors : 
 * 		Suresh Pillay <suresh.pillay@irisa.fr> 
 * 
 */
package org.kermeta.language.texteditor.eclipse.internal.outline;

import java.net.URI;
import java.util.Scanner;

import org.eclipse.core.resources.IFile;
import org.kermeta.language.loader.kmt.scala.KMPrinter;
import org.kermeta.language.structure.Class;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.Constraint;
import org.kermeta.language.structure.Enumeration;
import org.kermeta.language.structure.EnumerationLiteral;
import org.kermeta.language.structure.KermetaModelElement;
import org.kermeta.language.structure.Metamodel;
import org.kermeta.language.structure.Operation;
import org.kermeta.language.structure.Package;
import org.kermeta.language.structure.Property;
import org.kermeta.language.structure.Tag;
import org.kermeta.language.structure.Type;
import org.kermeta.language.structure.TypeDefinition;
import org.kermeta.language.texteditor.eclipse.internal.outline.ItemLocalisation.LocalisationType;
import org.kermeta.language.texteditor.eclipse.internal.outline.OutlineItem.OutlineTypes;
import org.kermeta.language.util.ModelingUnit;

public class KermetaOutlineHelper {
	private ModelingUnit modelingUnit;

	protected URI outlineForFile;

	public KermetaOutlineHelper(ModelingUnit o) {
		modelingUnit = o;
	}

	public OutlineItem getRootStructure() {
		OutlineItem base = new OutlineItem("KermetaRoot", this);
		OutlineItem[] baseChildren = new OutlineItem[this.modelingUnit
				.getMetamodels().size()];
		base.setChildren(baseChildren);
		boolean hasChildren = false;
		for (int i = 0; i < this.modelingUnit.getMetamodels().size(); i++) {
			OutlineItem ele = new OutlineItem(this.modelingUnit.getMetamodels()
					.get(i).getName(), null, base, this);
			ele.type = OutlineTypes.Metamodel;
			ele.setLocalisation(new ItemLocalisation(outlineForFile.toString(),
					this.modelingUnit.getMetamodels().get(i)));
			baseChildren[i] = ele;
			hasChildren = true;

			// initial package must know their child in order to display the
			// open arrow
			// ele.setChildren(updatePackage(ele));
			// updateAllChildren(ele);
		}
		return base;
	}

	public OutlineItem[] getTypeDefinitionsChildrenForPackage(Package p,
			OutlineItem parent) {
		KMPrinter opPrinter = new KMPrinter();
		for (int i = 0; i < p.getOwnedTypeDefinition().size(); i++) {
			if (p.getOwnedTypeDefinition().get(i).getName()
					.compareTo(parent.getLabel()) == 0
					&& (p.getOwnedTypeDefinition().get(i) instanceof ClassDefinition)) {
				ClassDefinition cn = (ClassDefinition) p
						.getOwnedTypeDefinition().get(i);
				int size = getClassChildrenCount(cn);
				OutlineItem[] objs = new OutlineItem[size];
				int cnt = 0;
				for (int j = 0; j < cn.getOwnedOperation().size(); j++) {
					if (cn.getOwnedOperation().get(j) instanceof Operation) {
						Operation op = cn.getOwnedOperation().get(j);
						String label = opPrinter.convertToText(op);
						OutlineItem it = new OutlineItem(label, null, parent,
								this);

						it.type = OutlineTypes.Operation;
						it.setLocalisation(new ItemLocalisation(outlineForFile
								.toString(), op));

						it.setChildren(getOperationChildren(op, it));

						objs[cnt] = it;
						cnt++;
					}
				}
				for (Property prop : cn.getOwnedAttribute()) {
					String label = opPrinter.convertToText(prop);
					OutlineItem it = new OutlineItem(label, null, parent, this);
					if (prop.getIsDerived()) {
						it.type = OutlineTypes.DerivedProperty;
					} else {
						if (prop.getIsComposite()) {
							it.type = OutlineTypes.Attribute;
						} else
							it.type = OutlineTypes.Reference;
					}
					it.setLocalisation(new ItemLocalisation(outlineForFile
							.toString(), prop));
					objs[cnt] = it;
					cnt++;
				}
				for (Constraint inv : cn.getInv()) {
					String label = opPrinter.convertToText(inv);
					OutlineItem it = new OutlineItem(label, null, parent, this);
					it.type = OutlineTypes.Invariant;
					it.setLocalisation(new ItemLocalisation(outlineForFile
							.toString(), inv));
					objs[cnt] = it;
					cnt++;
				}
				return objs;
			} else if (p.getOwnedTypeDefinition().get(i).getName()
					.compareTo(parent.getLabel()) == 0
					&& (p.getOwnedTypeDefinition().get(i) instanceof org.kermeta.language.structure.Enumeration)) {
				org.kermeta.language.structure.Enumeration en = (org.kermeta.language.structure.Enumeration) p
						.getOwnedTypeDefinition().get(i);
				int size = getEnumerationChildrenCount(en);
				OutlineItem[] objs = new OutlineItem[size];
				int cnt = 0;
				for (EnumerationLiteral lit : en.getOwnedLiteral()) {
					String label = opPrinter.convertToText(lit);
					OutlineItem it = new OutlineItem(label, null, parent, this);

					it.type = OutlineTypes.EnumLiteral;
					it.setLocalisation(new ItemLocalisation(outlineForFile
							.toString(), en));

					objs[cnt] = it;
					cnt++;
				}
				return objs;
			}
		}
		return null;

	}

	public OutlineItem[] getOperationChildren(Operation op, OutlineItem parent) {
		KMPrinter opPrinter = new KMPrinter();
		int size = op.getPre().size() + op.getPost().size();
		OutlineItem[] objs = new OutlineItem[size];
		int cnt = 0;
		for (Constraint pre : op.getPre()) {
			String label = opPrinter.convertToText(pre);
			OutlineItem it = new OutlineItem(label, null, parent, this);
			it.type = OutlineTypes.Precondition;
			it.setLocalisation(new ItemLocalisation(outlineForFile.toString(),
					pre));

			objs[cnt] = it;
			cnt++;
		}
		for (Constraint post : op.getPost()) {
			String label = opPrinter.convertToText(post);
			OutlineItem it = new OutlineItem(label, null, parent, this);
			it.type = OutlineTypes.Postcondition;
			it.setLocalisation(new ItemLocalisation(outlineForFile.toString(),
					post));

			objs[cnt] = it;
			cnt++;
		}
		return objs;
	}

	public OutlineItem[] getMetamodelChildren(Metamodel mm, OutlineItem parent) {
		int size = getMetamodelChildrenCount(mm);
		OutlineItem[] objs = new OutlineItem[size];
		int cnt = 0;
		for (int i = 0; i < mm.getPackages().size(); i++) {
			StringBuilder displayedLabel = new StringBuilder();
			String mainLabel = mm.getPackages().get(i).getName();
			displayedLabel.append(mainLabel);

			OutlineItem it = new OutlineItem(mainLabel,
					displayedLabel.toString(), parent, this);
			it.type = OutlineTypes.Package;

			it.setLocalisation(new ItemLocalisation(outlineForFile.toString(),
					mm.getPackages().get(i)));
			objs[cnt] = it;
			cnt++;
		}

		return objs;
	}

	public OutlineItem[] getPackageChildren(Package p, OutlineItem parent) {
		int size = getPackageChildrenCount(p);
		OutlineItem[] objs = new OutlineItem[size];
		int cnt = 0;
		for (int i = 0; i < p.getOwnedTypeDefinition().size(); i++) {
			StringBuilder displayedLabel = new StringBuilder();
			String mainLabel = p.getOwnedTypeDefinition().get(i).getName();
			displayedLabel.append(mainLabel);
			if (p.getOwnedTypeDefinition().get(i) instanceof ClassDefinition) {
				ClassDefinition cd = (ClassDefinition) p
						.getOwnedTypeDefinition().get(i);
				if (!cd.getSuperType().isEmpty())
					displayedLabel.append(" inherits ");
				KMPrinter opPrinter = new KMPrinter();
				for (Type t : cd.getSuperType()) {
					displayedLabel.append(opPrinter.convertToText(t) + " ");
				}
			}
			OutlineItem it = new OutlineItem(mainLabel,
					displayedLabel.toString(), parent, this);
			if (p.getOwnedTypeDefinition().get(i) instanceof ClassDefinition) {
				it.type = OutlineTypes.Class;
			} else if (p.getOwnedTypeDefinition().get(i) instanceof org.kermeta.language.structure.Enumeration) {
				it.type = OutlineTypes.Enumeration;
			}
			it.setLocalisation(new ItemLocalisation(outlineForFile.toString(),
					p.getOwnedTypeDefinition().get(i)));
			objs[cnt] = it;
			cnt++;
		}
		for (int i = 0; i < p.getNestedPackage().size(); i++) {
			OutlineItem it = new OutlineItem(p.getNestedPackage().get(i)
					.getName(), null, parent, this);
			it.type = OutlineTypes.Package;
			it.setLocalisation(new ItemLocalisation(outlineForFile.toString(),
					p.getNestedPackage().get(i)));
			objs[cnt] = it;
			cnt++;
		}
		return objs;
	}

	public Package getNestedPackage(String name, Package parent) {
		for (int i = 0; i < parent.getNestedPackage().size(); i++) {
			if (parent.getNestedPackage().get(i).getName().compareTo(name) == 0) {
				return parent.getNestedPackage().get(i);
			}
		}
		return null;
	}

	public Metamodel findMetamodel(String metamodelName) {
		
		
		for (Metamodel mm : this.modelingUnit.getMetamodels()) {
			if (mm.getName().equals(metamodelName))
				return mm;
		}
		return null;
	}

	public Package findPackage(String packageName, Metamodel mm) {

		// Will Return the deepest Package found
		if (packageName.contains("::")) {
			Package curr = null;
			String[] result = packageName.split("::");
			for (int x = 0; x < result.length; x++) {
				Package p = (curr == null) ? findPackage(result[x], mm) : getNestedPackage(result[x], curr);
				if (p != null) {
					curr = p;
				}
			}
			return curr;
		} else {
			for (Package p : mm.getPackages()) {
				if (p.getName().equals(packageName))
					return p;
			}

		}
		return null;
	}

	public Package findPackage(String packageName) {
		Package curr = null;
		if (packageName.contains("#")) {
			Metamodel mm = findMetamodel(packageName.split("#")[0]);
			return findPackage(packageName.split("#")[1], mm);
		}
		return curr;
	}

	public OutlineItem[] updateMetamodel(OutlineItem it) {
		return getMetamodelChildren(findMetamodel(it.realName()), it);
	}

	public OutlineItem[] updatePackage(OutlineItem it) {
		return getPackageChildren(findPackage(it.realName()), it);
	}

	public OutlineItem[] updateClass(OutlineItem it) {
		return getTypeDefinitionsChildrenForPackage(
				findPackage(it.parent.realName()), it);
	}

	public OutlineItem[] updateEnumeration(OutlineItem it) {
		return getTypeDefinitionsChildrenForPackage(
				findPackage(it.parent.realName()), it);
	}

	public URI getOutlineForFile() {
		return outlineForFile;
	}

	public void setOutlineForFile(URI outlineForFile) {
		this.outlineForFile = outlineForFile;
	}

	public void updateAllChildren(OutlineItem base) {
		if (base.type == OutlineTypes.Metamodel) {
			base.setChildren(updateMetamodel(base));
		}
		if (base.type == OutlineTypes.Package) {
			base.setChildren(updatePackage(base));
		}
		if (base.type == OutlineTypes.Class) {
			base.setChildren(updateClass(base));
		}

		if (base.type == OutlineTypes.Enumeration) {
			base.setChildren(updateEnumeration(base));
		}
		for (Object child : base.getChildren()) {
			updateAllChildren((OutlineItem) child);
		}

	}

	public int getMetamodelChildrenCount(OutlineItem outlineItem) {
		Metamodel mm = findMetamodel(outlineItem.realName());
		return getMetamodelChildrenCount(mm);
		// return outlineItem.getChildren().length;
	}

	public int getPackageChildrenCount(OutlineItem outlineItem) {
		Package p = findPackage(outlineItem.realName());
		return getPackageChildrenCount(p);
		// return outlineItem.getChildren().length;
	}

	public int getTypeDefinitionChildrenCount(OutlineItem outlineItem) {
		Package p = findPackage(outlineItem.realName());
		for (TypeDefinition td : p.getOwnedTypeDefinition()) {
			if (td.getName().compareTo(outlineItem.realName()) == 0
					&& (td instanceof ClassDefinition)) {
				ClassDefinition cn = (ClassDefinition) td;
				return getClassChildrenCount(cn);
			}
			if (td.getName().compareTo(outlineItem.realName()) == 0
					&& (td instanceof Enumeration)) {
				Enumeration cn = (Enumeration) td;
				return getEnumerationChildrenCount(cn);
			}
		}
		return 0;
		// return outlineItem.getChildren().length;
	}

	public int getMetamodelChildrenCount(Metamodel mm) {
		return mm.getPackages().size();
	}

	public int getClassChildrenCount(ClassDefinition cn) {
		return cn.getOwnedAttribute().size() + cn.getOwnedOperation().size()
				+ cn.getInv().size();
	}

	public int getEnumerationChildrenCount(Enumeration en) {
		return en.getOwnedLiteral().size();
	}

	public int getPackageChildrenCount(Package p) {
		return p.getOwnedTypeDefinition().size() + p.getNestedPackage().size();
	}
}
