package fr.irisa.triskell.sintaks.parser;

import java.io.PrintStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.ResourceSet;

import fr.irisa.triskell.sintaks.main.IPrettyPrinter;
import fr.irisa.triskell.sintaks.main.MetaModel;

import sts.Root;
import sts.Rule;
//import smm.SmmPackage;
import sts.impl.StsPackageImpl;

public class MetaModelParser extends MetaModel {
	
	public MetaModelParser (ResourceSet rs) {
		super(rs);
		StsPackageImpl.init();
		registers("sts");
	}

	public void load (IFile file) {
		super.load(file);
	}
	
	public void store (IFile file) {
		super.store(file);
	}
	
	public Rule getStartSymbol (IFile file) {
		load (file);
		Root root = (Root) getRoot();
		return root.getStart();
	}

	public IPrettyPrinter getPrettyPrinter(PrintStream output) {
		return null;
	}
}
