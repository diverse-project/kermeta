package fr.irisa.triskell.osgi.introspector.generator;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.List;
import java.util.Map;

import manifest.BundleActivator;
import manifest.ClassPath;
import manifest.ExportPackage;
import manifest.ImportPackage;
import manifest.ImportService;
import manifest.MANIFEST;
import manifest.ManifestFactory;
import manifest.NativeCode;
import manifest.Package;
import manifest.RequireBundle;
import manifest.Service;
import option.Uses;

import org.apache.log4j.Level;

import fr.irisa.triskell.osgi.introspector.manifest.lexer.Lexer;
import fr.irisa.triskell.osgi.introspector.manifest.lexer.LexerException;
import fr.irisa.triskell.osgi.introspector.manifest.node.Start;
import fr.irisa.triskell.osgi.introspector.manifest.parser.ParserException;
import fr.irisa.triskell.osgi.introspector.util.OSGiIntrospectorUtil;
import framework.Bundle;

/**
 * 
 * @author Erwan Daubert - erwan.daubert@gmail.com
 * @version 1.0
 * @see Translation This class is used to parse the Manifest of an OSGi Bundle.
 * 
 */
public class Parser {

	private Translation translation;
	private OSGiIntrospectorUtil util;

	public Parser(OSGiIntrospectorUtil util) {
		this.translation = new Translation(util);
		this.util = util;
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
	public boolean parse(String manifestContent, Bundle bundle) {
		try {
			MANIFEST manifest = ManifestFactory.eINSTANCE.createMANIFEST();
			fr.irisa.triskell.osgi.introspector.manifest.parser.Parser p = new fr.irisa.triskell.osgi.introspector.manifest.parser.Parser(
					new Lexer(new PushbackReader(new StringReader(
							manifestContent), 1000)));
			Start tree = p.parse();
			this.translation.setManifest(manifest);
			this.translation.setBundle(bundle);
			tree.apply(translation);
			manifest = translation.getManifest();

			bundle.setManifest(manifest);

			return this.translation.isValidTranslation();
		} catch (ParserException e) {
			StringBuffer message = new StringBuffer(
					manifestContent.split("\n")[e.getToken().getLine()]);
			message.append("\n");
			for (int i = 0; i < e.getToken().getPos(); i++) {
				message.append(" ");
			}
			for (int i = 0; i < e.getToken().getText().length(); i++) {
				message.append("^");
			}
			util.log(Level.ERROR,
					"There is an error when we try to parse the MANIFEST file on the bundle "
							+ bundle.getLocation() + ".\n" + message, bundle);
			return false;
		} catch (LexerException e) {
			int line = Integer.parseInt(e.getMessage().substring(1, 1));
			int pos = Integer.parseInt(e.getMessage().substring(3, 3));
			String text = e.getMessage().substring(
					e.getMessage().indexOf("unknown token:"));
			StringBuffer message = new StringBuffer(
					manifestContent.split("\n")[line]);
			message.append("\n");
			for (int i = 0; i < pos; i++) {
				message.append(" ");
			}
			for (int i = 0; i < text.length(); i++) {
				message.append("^");
			}
			util.log(Level.ERROR,
					"There is an error when we try to parser the MANIFEST file on the bundle "
							+ bundle.getLocation() + ".", bundle);
			return false;
		} catch (IOException e) {
			// must not appear
			util
					.log(
							Level.ERROR,
							"There is an IOException error when we try to parse the MANIFEST file on the bundle "
									+ bundle.getLocation()
									+ ".\n"
									+ e.getMessage(), bundle);
			return false;
		}
	}

	public Map<BundleActivator, Bundle> getUnresolvedActivator() {
		return this.translation.getUnresolvedActivator();
	}

	public Map<Service, Bundle> getUnresolvedExportService() {
		return this.translation.getUnresolvedExportService();
	}

	public Map<Package, Bundle> getUnresolvedExportPackage() {
		return this.translation.getUnresolvedExportPackage();
	}

	public Map<Uses, Bundle> getUnresolvedExportPackageUsesBundle() {
		return this.translation.getUnresolvedExportPackageUsesBundle();
	}

	public Map<Uses, List<String>> getUnresolvedExportPackageUsesValue() {
		return this.translation.getUnresolvedExportPackageUsesValue();
	}

	public Map<option.Class, ExportPackage> getUnresolvedExportPackageExclude() {
		return this.translation.getUnresolvedExportPackageExclude();
	}

	public Map<option.Class, ExportPackage> getUnresolvedExportPackageInclude() {
		return this.translation.getUnresolvedExportPackageInclude();
	}

	public Map<ExportPackage, Bundle> getUnresolvedExportPackageBundles() {
		return this.translation.getUnresolvedExportPackageBundles();
	}

	public Map<option.Package, Bundle> getUnresolvedActivationPolicyExclude() {
		return this.translation.getUnresolvedActivationPolicyExclude();
	}

	public Map<option.Package, Bundle> getUnresolvedActivationPolicyInclude() {
		return this.translation.getUnresolvedActivationPolicyInclude();
	}

	public Map<Bundle, String> getFragmentHostReferences() {
		return this.translation.getFragmentHostReferences();
	}

	public Map<RequireBundle, Bundle> getUnresolvedRequireBundle() {
		return this.translation.getUnresolvedRequireBundle();
	}

	public Map<ImportPackage, Bundle> getUnresolvedImportPackage() {
		return this.translation.getUnresolvedImportPackage();
	}

	public Map<ImportService, Bundle> getUnresolvedImportService() {
		return this.translation.getUnresolvedImportService();
	}

	public List<Service> getServicesAvailable() {
		return this.translation.getServicesAvailable();
	}

	public Map<ClassPath, Bundle> getUnresolvedBundleClassPath() {
		return translation.getUnresolvedBundleClassPath();
	}

	public Map<NativeCode, Bundle> getUnresolvedBundleNativeCode() {
		return translation.getUnresolvedBundleNativeCode();
	}

}
