package fr.irisa.triskell.osgi.introspector.generator;

import java.util.List;
import java.util.Map;

import manifest.ImportPackage;
import manifest.ImportService;
import option.Uses;
import framework.Bundle;

public class ResolverDynamic extends ResolverStatic implements Resolver {

	public void resolveExportPackageUses(Map<Uses, List<String>> uses, Map<Uses, Bundle> bundles) {
		for (Uses value : uses.keySet()) {
			for (String _package : uses.get(value)) {
				value.addPackage(_package);
			}

		}
	}

	public void resolveImportPackage(Map<ImportPackage, List<String>> importPackages, Map<ImportPackage, Bundle> bundles) {
		for (ImportPackage value : importPackages.keySet()) {
			for (String _package : importPackages.get(value)) {
				value.addPackage(_package);
			}

		}
	}

	public void resolveImportService(Map<ImportService, String> importServices) {
		for (ImportService value : importServices.keySet()) {
			value.setService(importServices.get(value));

		}
	}
	
}
