package fr.irisa.triskell.osgi.introspector.generator;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import manifest.BundleActivator;
import manifest.ExportPackage;
import manifest.ImportPackage;
import manifest.ImportService;
import manifest.MANIFEST;
import manifest.ManifestFactory;
import manifest.RequireBundle;
import manifest.Service;
import option.ExcludeClasses;
import option.ExcludePackages;
import option.IncludeClasses;
import option.IncludePackages;
import option.Uses;
import fr.irisa.osgi.manifest.parser.lexer.Lexer;
import fr.irisa.osgi.manifest.parser.lexer.LexerException;
import fr.irisa.osgi.manifest.parser.node.Start;
import fr.irisa.osgi.manifest.parser.parser.ParserException;
import framework.Bundle;

public class Parser {

	private Translation translation;
	private Map<Bundle, String> log;

	public Parser(Map<Bundle, String> log) {
		this.translation = new Translation(log);
		this.log = log;
	}

	/**
	 * This function is used to generate the MANIFEST representation with all
	 * entry MANIFEST representation
	 * 
	 * @param manifest
	 * @param manifestFile
	 * @param bundle
	 * @throws ParserException
	 * @throws LexerException
	 * @throws IOException
	 */
	public boolean parse(java.io.File manifestFile,
			Bundle bundle) {
	try {
		MANIFEST manifest = ManifestFactory.eINSTANCE.createMANIFEST();
		fr.irisa.osgi.manifest.parser.parser.Parser p = new fr.irisa.osgi.manifest.parser.parser.Parser(
				new Lexer(
						new PushbackReader(new FileReader(manifestFile), 1000)));
		Start tree = p.parse();
		this.translation.setManifest(manifest);
		this.translation.setBundle(bundle);
		tree.apply(translation);
		manifest = translation.getManifest();
		
		bundle.setManifest(manifest);

		return this.translation.isValidTranslation();
		
			// TODO log
		} catch (ParserException e) {
			System.err.println(bundle.getLocation());
			e.printStackTrace();
			System.err
					.println("There is an unknown error when we try to parser the MANIFEST file on the bundle "
							+ bundle.getLocation() + ".");
			return false;
		} catch (LexerException e) {
			System.err.println(bundle.getLocation());
			e.printStackTrace();
			System.err
					.println("There is an unknown error when we try to parser the MANIFEST file on the bundle "
							+ bundle.getLocation() + ".");
			// e.printStackTrace();
			return false;
		} catch (IOException e) {
			System.err.println(bundle.getLocation());
			e.printStackTrace();
			System.err
					.println("There is an unknown error when we try to parser the MANIFEST file on the bundle "
							+ bundle.getLocation() + ".");
			return false;
		}
	}
	
	public Map<BundleActivator, Bundle> getUnresolvedActivatorBundle() {
		return this.translation.getUnresolvedActivatorBundle();
	}

	public Map<BundleActivator, String> getUnresolvedActivatorValue() {
		return this.translation.getUnresolvedActivatorValue();
	}

	public Map<Service, Bundle> getUnresolvedExportServiceBundle() {
		return this.translation.getUnresolvedExportServiceBundle();
	}

	public Map<Service, String> getUnresolvedExportServiceValue() {
		return this.translation.getUnresolvedExportServiceValue();
	}

	public Map<ExportPackage, Bundle> getUnresolvedExportPackageBundle() {
		return this.translation.getUnresolvedExportPackageBundle();
	}

	public Map<ExportPackage, List<String>> getUnresolvedExportPackageValue() {
		return this.translation.getUnresolvedExportPackageValue();
	}

	public Map<Uses, Bundle> getUnresolvedExportPackageUsesBundle() {
		return this.translation.getUnresolvedExportPackageUsesBundle();
	}

	public Map<Uses, List<String>> getUnresolvedExportPackageUsesValue() {
		return this.translation.getUnresolvedExportPackageUsesValue();
	}

	public Map<ExcludeClasses, ExportPackage> getUnresolvedExportPackageExcludeExportPackage() {
		return this.translation.getUnresolvedExportPackageExcludeExportPackage();
	}

	public Map<ExcludeClasses, List<String>> getUnresolvedExportPackageExcludeValue() {
		return this.translation.getUnresolvedExportPackageExcludeValue();
	}

	public Map<IncludeClasses, ExportPackage> getUnresolvedExportPackageIncludeExportPackage() {
		return this.translation.getUnresolvedExportPackageIncludeExportPackage();
	}

	public Map<IncludeClasses, List<String>> getUnresolvedExportPackageIncludeValue() {
		return this.translation.getUnresolvedExportPackageIncludeValue();
	}

	public Map<ExcludePackages, Bundle> getUnresolvedActivationPolicyExcludeBundle() {
		return this.translation.getUnresolvedActivationPolicyExcludeBundle();
	}

	public Map<ExcludePackages, List<String>> getUnresolvedActivationPolicyExcludeValue() {
		return this.translation.getUnresolvedActivationPolicyExcludeValue();
	}

	public Map<IncludePackages, Bundle> getUnresolvedActivationPolicyIncludeBundle() {
		return this.translation.getUnresolvedActivationPolicyIncludeBundle();
	}

	public Map<IncludePackages, List<String>> getUnresolvedActivationPolicyIncludeValue() {
		return this.translation.getUnresolvedActivationPolicyIncludeValue();
	}
	
	public Map<Bundle, String> getFragmentHostReferences() {
		return this.translation.getFragmentHostReferences();
	}

	public Map<RequireBundle, List<String>> getRequiredBundleReferences() {
		return this.translation.getRequiredBundleReferences();
	}

	public Map<ImportPackage, List<String>> getImportPackageReferences() {
		return this.translation.getImportPackageReferences();
	}

	public Map<ImportService, String> getImportServiceReferences() {
		return this.translation.getImportServiceReferences();
	}
}
