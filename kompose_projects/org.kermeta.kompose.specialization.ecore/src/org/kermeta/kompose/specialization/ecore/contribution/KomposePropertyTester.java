package org.kermeta.kompose.specialization.ecore.contribution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;

public class KomposePropertyTester extends PropertyTester {

	private static final String METAMODEL = "http://www.eclipse.org/emf/2002/Ecore";
	
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		IFile komposeModel = (IFile) receiver;
		BufferedReader br = null;
		String composerDefinition = "";
		String composerMetamodel = "";
		String composerMetamodelTmp = "";
		try {
			br = new BufferedReader(new InputStreamReader(komposeModel.getContents()));
			br.readLine();
			composerDefinition = br.readLine();
			composerMetamodelTmp = composerDefinition.substring(composerDefinition.indexOf("metamodelName"), composerDefinition.indexOf(">"));
			composerMetamodel = composerMetamodelTmp.substring(composerMetamodelTmp.indexOf("=")+2, composerMetamodelTmp.lastIndexOf("\""));
		} catch (CoreException e) {
			System.out.println("KOMPOSE-ERROR: Impossible to open selected file");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("KOMPOSE-ERROR: Impossible to read selected file");
			e.printStackTrace();
		}
		if (composerMetamodel.equals(METAMODEL))
			return true;
		else
			return false;
	}
}

