package tests.fr.irisa.triskell.osgi.introspector.generator;

import jar.Folder;
import jar.JarFactory;
import jar.Package;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import manifest.MANIFEST;
import manifest.MANIFESTEntry;
import manifest.ManifestFactory;
import manifest.SimpleMANIFESTEntry;

import fr.irisa.osgi.manifest.parser.lexer.Lexer;
import fr.irisa.osgi.manifest.parser.lexer.LexerException;
import fr.irisa.osgi.manifest.parser.node.AAttribute;
import fr.irisa.osgi.manifest.parser.node.AQuotedStringStringEntryValue;
import fr.irisa.osgi.manifest.parser.node.PStringEntryValue;
import fr.irisa.osgi.manifest.parser.node.Start;
import fr.irisa.osgi.manifest.parser.node.TAttributeEntry;
import fr.irisa.osgi.manifest.parser.node.TQuotedString;
import fr.irisa.osgi.manifest.parser.parser.ParserException;
import fr.irisa.triskell.osgi.introspector.OSGiIntrospectorUtil;
import fr.irisa.triskell.osgi.introspector.generator.Translation;
import framework.Bundle;
import framework.FrameworkFactory;
import junit.framework.TestCase;

public class TranslationTests extends TestCase {
	
	private Translation translation;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();		
		//try {
			MANIFEST manifest = ManifestFactory.eINSTANCE.createMANIFEST();
			Bundle bundle = FrameworkFactory.eINSTANCE.createBundle();
			
			Folder f = JarFactory.eINSTANCE.createFolder();
			f.setFullPath("");
			f.setName("");
			bundle.setFolder(f);
			
			Package p = JarFactory.eINSTANCE.createPackage();
			p.setFullPath("");
			p.setName("");
			bundle.setPackage(p);
			
			// TODO concevoir un bundle complet et mettre son addresse
			// Pour les tests du ClassPath
			bundle.setLocation("toto");
			
			/*bundle.setSymbolicName("translationTest");
			fr.irisa.osgi.manifest.parser.parser.Parser p = new fr.irisa.osgi.manifest.parser.parser.Parser(
					new Lexer(
							new PushbackReader(new FileReader(), 1000)));
			Start tree = p.parse();
			Map<Bundle, String> log = new HashMap<Bundle, String>();
			this.translation = new Translation(log);
			
			this.translation.setManifest(manifest);
			this.translation.setBundle(bundle);
			
			tree.apply(translation);
			manifest = translation.getManifest();
			
		} catch (ParserException e) {
				e.printStackTrace();
			} catch (LexerException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		*/
		
		
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}

	public void testCaseAAttribute() {
		fail("Not yet implemented");
	}

	public void testCaseAActivationPolicyExcludeIncludeIdentifier() {
		fail("Not yet implemented");
	}

	public void testCaseAActivationpolicyValue() {
		fail("Not yet implemented");
	}

	public void testCaseAAlwaysFragmentAttachmentValue() {
		fail("Not yet implemented");
	}

	public void testCaseABundleActivationpolicyEntry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleActivationpolicyEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleActivationpolicyEntryValue() {
		fail("Not yet implemented");
	}

	public void testCaseABundleActivatorEntry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleActivatorEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleActivatorEntryValue() {
		fail("Not yet implemented");
	}

	public void testCaseABundleCategoryEntry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleCategoryEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleCategoryEntryValue() {
		fail("Not yet implemented");
	}

	public void testCaseABundleClasspathEntry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleClasspathEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleClasspathEntryValue() {
		fail("Not yet implemented");
	}

	public void testCaseABundleContactaddressEntry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleContactaddressEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleCopyrightEntry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleCopyrightEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleDescriptionEntry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleDescriptionEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleDocurlEntry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleDocurlEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleLocalizationEntry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleLocalizationEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleManifestversionEntry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleManifestversionEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleNameEntry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleNameEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleNativecodeEntry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleNativecodeEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleNativecodeEntryValue() {
		fail("Not yet implemented");
	}

	public void testCaseABundleRequiredexecutionenvironmentEntry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleRequiredexecutionenvironmentEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleRequiredexecutionenvironmentEntryValue() {
		fail("Not yet implemented");
	}

	public void testCaseABundleSymbolicnameEntry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleSymbolicnameEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleUpdatelocationEntry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleUpdatelocationEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleVendorEntry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleVendorEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleVersionEntry() {
		fail("Not yet implemented");
	}

	public void testCaseABundleVersionEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseACategoryValue() {
		fail("Not yet implemented");
	}

	public void testCaseAClasspathEntry() {
		fail("Not yet implemented");
	}

	public void testCaseAClasspathEntryValue() {
		fail("Not yet implemented");
	}

	public void testCaseAClasspathValue() {
		fail("Not yet implemented");
	}

	public void testCaseADigestEntry() {
		fail("Not yet implemented");
	}

	public void testCaseADigestEntryOtherEntry() {
		fail("Not yet implemented");
	}

	public void testCaseADotTarget() {
		fail("Not yet implemented");
	}

	public void testCaseADynamicDescription() {
		fail("Not yet implemented");
	}

	public void testCaseADynamicimportPackageEntry() {
		fail("Not yet implemented");
	}

	public void testCaseADynamicimportPackageEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseADynamicimportPackageEntryValue() {
		fail("Not yet implemented");
	}

	public void testCaseADynamicimportPackageNames() {
		fail("Not yet implemented");
	}

	public void testCaseADynamicimportPackageValue() {
		fail("Not yet implemented");
	}

	public void testCaseAEqualsBooleanComparator() {
		fail("Not yet implemented");
	}

	public void testCaseAExcludeActivationpolicyDirective() {
		fail("Not yet implemented");
	}

	public void testCaseAExcludeExportPackageDirective() {
		fail("Not yet implemented");
	}

	public void testCaseAExcludeIncludeManyPackagesActivationPolicyExcludeIncludeValue() {
		fail("Not yet implemented");
	}

	public void testCaseAExcludeIncludeOnePackageActivationPolicyExcludeIncludeValue() {
		fail("Not yet implemented");
	}

	public void testCaseAExportPackageAttributeExportPackageParameter() {
		fail("Not yet implemented");
	}

	public void testCaseAExportPackageDirectiveExportPackageParameter() {
		fail("Not yet implemented");
	}

	public void testCaseAExportPackageEntry() {
		fail("Not yet implemented");
	}

	public void testCaseAExportPackageEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseAExportPackageEntryValue() {
		fail("Not yet implemented");
	}

	public void testCaseAExportPackageEntryValue1() {
		fail("Not yet implemented");
	}

	public void testCaseAExportPackageValue() {
		fail("Not yet implemented");
	}

	public void testCaseAExportServiceEntry() {
		fail("Not yet implemented");
	}

	public void testCaseAExportServiceEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseAExportServiceEntryValue() {
		fail("Not yet implemented");
	}

	public void testCaseAExtensionBootclasspathExtensionValue() {
		fail("Not yet implemented");
	}

	public void testCaseAExtensionFrameworkExtensionValue() {
		fail("Not yet implemented");
	}

	public void testCaseAFalseBoolean() {
		fail("Not yet implemented");
	}

	public void testCaseAFileUnquotedUrl() {
		fail("Not yet implemented");
	}

	public void testCaseAFragmentAttachmentSymbolicnameDirective() {
		fail("Not yet implemented");
	}

	public void testCaseAFragmentHostAttributeFragmentHostParameter() {
		fail("Not yet implemented");
	}

	public void testCaseAFragmentHostDirective() {
		fail("Not yet implemented");
	}

	public void testCaseAFragmentHostDirectiveFragmentHostParameter() {
		fail("Not yet implemented");
	}

	public void testCaseAFragmentHostEntry() {
		fail("Not yet implemented");
	}

	public void testCaseAFragmentHostEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseAFragmentHostEntryValue() {
		fail("Not yet implemented");
	}

	public void testCaseAFtpUnquotedUrl() {
		fail("Not yet implemented");
	}

	public void testCaseAGreaterBooleanComparator() {
		fail("Not yet implemented");
	}

	public void testCaseAGreaterEqualsBooleanComparator() {
		fail("Not yet implemented");
	}

	public void testCaseAHttpUnquotedUrl() {
		fail("Not yet implemented");
	}

	public void testCaseAImportPackageAttributeImportPackageParameter() {
		fail("Not yet implemented");
	}

	public void testCaseAImportPackageDirective() {
		fail("Not yet implemented");
	}

	public void testCaseAImportPackageDirectiveImportPackageParameter() {
		fail("Not yet implemented");
	}

	public void testCaseAImportPackageEntry() {
		fail("Not yet implemented");
	}

	public void testCaseAImportPackageEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseAImportPackageEntryValue() {
		fail("Not yet implemented");
	}

	public void testCaseAImportPackageEntryValue1() {
		fail("Not yet implemented");
	}

	public void testCaseAImportPackageValue() {
		fail("Not yet implemented");
	}

	public void testCaseAImportServiceEntry() {
		fail("Not yet implemented");
	}

	public void testCaseAImportServiceEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseAImportServiceEntryValue() {
		fail("Not yet implemented");
	}

	public void testCaseAIncludeActivationpolicyDirective() {
		fail("Not yet implemented");
	}

	public void testCaseAIncludeExportPackageDirective() {
		fail("Not yet implemented");
	}

	public void testCaseALanguageDirective() {
		fail("Not yet implemented");
	}

	public void testCaseALanguageDirectiveNativecodeDirective() {
		fail("Not yet implemented");
	}

	public void testCaseALanguageValue() {
		fail("Not yet implemented");
	}

	public void testCaseALessBooleanComparator() {
		fail("Not yet implemented");
	}

	public void testCaseALesserEqualsBooleanComparator() {
		fail("Not yet implemented");
	}

	public void testCaseAMajorVersion() {
		fail("Not yet implemented");
	}

	public void testCaseAMandatoryExportPackageDirective() {
		fail("Not yet implemented");
	}

	public void testCaseAMandatoryManyAttributesMandatoryValue() {
		fail("Not yet implemented");
	}

	public void testCaseAMandatoryOneAttributeMandatoryValue() {
		fail("Not yet implemented");
	}

	public void testCaseAMandatoryString() {
		fail("Not yet implemented");
	}

	public void testCaseAManifest() {
		fail("Not yet implemented");
	}

	public void testCaseAManifestcontent() {
		fail("Not yet implemented");
	}

	public void testCaseAMicroVersion() {
		fail("Not yet implemented");
	}

	public void testCaseAMinorVersion() {
		fail("Not yet implemented");
	}

	public void testCaseANativecodeAttributeNativecodeParameter() {
		fail("Not yet implemented");
	}

	public void testCaseANativecodeDirectiveNativecodeParameter() {
		fail("Not yet implemented");
	}

	public void testCaseANativecodeEntry() {
		fail("Not yet implemented");
	}

	public void testCaseANativecodeEntryValue() {
		fail("Not yet implemented");
	}

	public void testCaseANativecodeOptional() {
		fail("Not yet implemented");
	}

	public void testCaseANativecodeValue() {
		fail("Not yet implemented");
	}

	public void testCaseANeverFragmentAttachmentValue() {
		fail("Not yet implemented");
	}

	public void testCaseANotEqualsBooleanComparator() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameAixOsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameDigitalunixOsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameDirective() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameDirectiveNativecodeDirective() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameEmbosOsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameEpoc32OsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameFreebsdOsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameHpuxOsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameIrixOsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameLinuxOsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameMacosOsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameNetbsdOsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameNetwareOsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameOpenbsdOsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameOs2OsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameQnxOsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameSolarisOsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameSunosOsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameVxworksOsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameWindows2000OsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameWindows2003OsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameWindows95OsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameWindows98OsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameWindowsceOsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameWindowsntOsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameWindowsvistaOsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsnameWindowsxpOsnameValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOsversionDirective() {
		fail("Not yet implemented");
	}

	public void testCaseAOsversionDirectiveNativecodeDirective() {
		fail("Not yet implemented");
	}

	public void testCaseAOtherEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseAOtherEntryValue() {
		fail("Not yet implemented");
	}

	public void testCaseAOtherEntryValueNext() {
		fail("Not yet implemented");
	}

	public void testCaseAOtherValue() {
		fail("Not yet implemented");
	}

	public void testCaseAPackageNames() {
		fail("Not yet implemented");
	}

	public void testCaseAParameter() {
		fail("Not yet implemented");
	}

	public void testCaseAPathElement() {
		fail("Not yet implemented");
	}

	public void testCaseAPathQuoted() {
		fail("Not yet implemented");
	}

	public void testCaseAPathQuotedPath() {
		fail("Not yet implemented");
	}

	public void testCaseAPathSepOnlyPathUnquoted() {
		fail("Not yet implemented");
	}

	public void testCaseAPathSeptelementPathUnquoted() {
		fail("Not yet implemented");
	}

	public void testCaseAPathSuffix() {
		fail("Not yet implemented");
	}

	public void testCaseAPathTarget() {
		fail("Not yet implemented");
	}

	public void testCaseAPathUnquotedPath() {
		fail("Not yet implemented");
	}

	public void testCaseAProcessor68kProcessorValue() {
		fail("Not yet implemented");
	}

	public void testCaseAProcessorAlphaProcessorValue() {
		fail("Not yet implemented");
	}

	public void testCaseAProcessorArmProcessorValue() {
		fail("Not yet implemented");
	}

	public void testCaseAProcessorDirective() {
		fail("Not yet implemented");
	}

	public void testCaseAProcessorDirectiveNativecodeDirective() {
		fail("Not yet implemented");
	}

	public void testCaseAProcessorIgniteProcessorValue() {
		fail("Not yet implemented");
	}

	public void testCaseAProcessorMipsProcessorValue() {
		fail("Not yet implemented");
	}

	public void testCaseAProcessorPariscProcessorValue() {
		fail("Not yet implemented");
	}

	public void testCaseAProcessorPowerpcProcessorValue() {
		fail("Not yet implemented");
	}

	public void testCaseAProcessorS390ProcessorValue() {
		fail("Not yet implemented");
	}

	public void testCaseAProcessorS390xProcessorValue() {
		fail("Not yet implemented");
	}

	public void testCaseAProcessorSh4ProcessorValue() {
		fail("Not yet implemented");
	}

	public void testCaseAProcessorSparcProcessorValue() {
		fail("Not yet implemented");
	}

	public void testCaseAProcessorV850eProcessorValue() {
		fail("Not yet implemented");
	}

	public void testCaseAProcessorX8664ProcessorValue() {
		fail("Not yet implemented");
	}

	public void testCaseAProcessorX86ProcessorValue() {
		fail("Not yet implemented");
	}

	public void testCaseAQuotedStringStringEntryValue() {
		fail("Not yet implemented");
	}

	public void testCaseAQuotedUrl() {
		fail("Not yet implemented");
	}

	public void testCaseAQuotedUrlValue() {
		fail("Not yet implemented");
	}

	public void testCaseARequireBundleAttributeRequireBundleOptions() {
		fail("Not yet implemented");
	}

	public void testCaseARequireBundleDirectiveRequireBundleOptions() {
		fail("Not yet implemented");
	}

	public void testCaseARequireBundleEntry() {
		fail("Not yet implemented");
	}

	public void testCaseARequireBundleEntryManifestentry() {
		fail("Not yet implemented");
	}

	public void testCaseARequireBundleEntryValue() {
		fail("Not yet implemented");
	}

	public void testCaseARequireBundleSymbolicname() {
		fail("Not yet implemented");
	}

	public void testCaseARequireBundleValue() {
		fail("Not yet implemented");
	}

	public void testCaseARequiredexecutionenvironment() {
		fail("Not yet implemented");
	}

	public void testCaseARequiredexecutionenvironmentValue() {
		fail("Not yet implemented");
	}

	public void testCaseAResolutionDirectiveRequireBundleDirective() {
		fail("Not yet implemented");
	}

	public void testCaseAResolutionMandatoryResolutionValue() {
		fail("Not yet implemented");
	}

	public void testCaseAResolutionOptionalResolutionValue() {
		fail("Not yet implemented");
	}

	public void testCaseAResolveTimeFragmentAttachmentValue() {
		fail("Not yet implemented");
	}

	public void testCaseASelectionFilterDirective() {
		fail("Not yet implemented");
	}

	public void testCaseASelectionFilterDirectiveNativecodeDirective() {
		fail("Not yet implemented");
	}

	public void testCaseASelectionFilterValue() {
		fail("Not yet implemented");
	}

	public void testCaseAServiceValue() {
		fail("Not yet implemented");
	}

	public void testCaseASimpleEntry() {
		fail("Not yet implemented");
	}

	public void testCaseASimpleEntryOtherEntry() {
		fail("Not yet implemented");
	}

	public void testCaseASimpleEntryValue() {
		fail("Not yet implemented");
	}

	public void testCaseASingletonSymbolicnameDirective() {
		fail("Not yet implemented");
	}

	public void testCaseASymbolicnameAttributeSymbolicnameOption() {
		fail("Not yet implemented");
	}

	public void testCaseASymbolicnameDirectiveSymbolicnameOption() {
		fail("Not yet implemented");
	}

	public void testCaseATrueBoolean() {
		fail("Not yet implemented");
	}

	public void testCaseAUniqueName() {
		fail("Not yet implemented");
	}

	public void testCaseAUniqueNameSuffix() {
		fail("Not yet implemented");
	}

	public void testCaseAUnquotedStringStringEntryValue() {
		fail("Not yet implemented");
	}

	public void testCaseAUnquotedUrlValue() {
		fail("Not yet implemented");
	}

	public void testCaseAUsesExportPackageDirective() {
		fail("Not yet implemented");
	}

	public void testCaseAVersionAtleast() {
		fail("Not yet implemented");
	}

	public void testCaseAVersionAtleastVersionRange() {
		fail("Not yet implemented");
	}

	public void testCaseAVersionInterval() {
		fail("Not yet implemented");
	}

	public void testCaseAVersionIntervalVersionRange() {
		fail("Not yet implemented");
	}

	public void testCaseAVisibilityDirectiveRequireBundleDirective() {
		fail("Not yet implemented");
	}

	public void testCaseAVisibilityPrivateVisibilityValue() {
		fail("Not yet implemented");
	}

	public void testCaseAVisibilityReexportVisibilityValue() {
		fail("Not yet implemented");
	}

	public void testCaseEOF() {
		fail("Not yet implemented");
	}

	public void testCaseStart() {
		fail("Not yet implemented");
	}

	public void testCaseTAlways() {
		fail("Not yet implemented");
	}

	public void testCaseTBundleActivationpolicy() {
		fail("Not yet implemented");
	}

	public void testCaseTBundleActivator() {
		fail("Not yet implemented");
	}

	public void testCaseTBundleCategory() {
		fail("Not yet implemented");
	}

	public void testCaseTBundleClasspath() {
		fail("Not yet implemented");
	}

	public void testCaseTBundleContactaddress() {
		fail("Not yet implemented");
	}

	public void testCaseTBundleCopyright() {
		fail("Not yet implemented");
	}

	public void testCaseTBundleDescription() {
		fail("Not yet implemented");
	}

	public void testCaseTBundleDocurl() {
		fail("Not yet implemented");
	}

	public void testCaseTBundleLocalization() {
		fail("Not yet implemented");
	}

	public void testCaseTBundleManifestversion() {
		fail("Not yet implemented");
	}

	public void testCaseTBundleName() {
		fail("Not yet implemented");
	}

	public void testCaseTBundleNativecode() {
		fail("Not yet implemented");
	}

	public void testCaseTBundleRequiredexecutionenvironment() {
		fail("Not yet implemented");
	}

	public void testCaseTBundleSymbolicname() {
		fail("Not yet implemented");
	}

	public void testCaseTBundleUpdatelocation() {
		fail("Not yet implemented");
	}

	public void testCaseTBundleVendor() {
		fail("Not yet implemented");
	}

	public void testCaseTBundleVersion() {
		fail("Not yet implemented");
	}

	public void testCaseTComma() {
		fail("Not yet implemented");
	}

	public void testCaseTDefinition() {
		fail("Not yet implemented");
	}

	public void testCaseTDot() {
		fail("Not yet implemented");
	}

	public void testCaseTDotdot() {
		fail("Not yet implemented");
	}

	public void testCaseTDoubleAntiSlash() {
		fail("Not yet implemented");
	}

	public void testCaseTDynamicimportPackage() {
		fail("Not yet implemented");
	}

	public void testCaseTEntry() {
		fail("Not yet implemented");
	}

	public void testCaseTEntryDigest() {
		fail("Not yet implemented");
	}

	public void testCaseTEol() {
		fail("Not yet implemented");
	}

	public void testCaseTEolblank() {
		fail("Not yet implemented");
	}

	public void testCaseTEquals() {
		fail("Not yet implemented");
	}

	public void testCaseTExclude() {
		fail("Not yet implemented");
	}

	public void testCaseTExportPackage() {
		fail("Not yet implemented");
	}

	public void testCaseTExportService() {
		fail("Not yet implemented");
	}

	public void testCaseTExtension() {
		fail("Not yet implemented");
	}

	public void testCaseTExtensionBootclasspath() {
		fail("Not yet implemented");
	}

	public void testCaseTExtensionFramework() {
		fail("Not yet implemented");
	}

	public void testCaseTFalse() {
		fail("Not yet implemented");
	}

	public void testCaseTFragmentAttachment() {
		fail("Not yet implemented");
	}

	public void testCaseTFragmentHost() {
		fail("Not yet implemented");
	}

	public void testCaseTGreater() {
		fail("Not yet implemented");
	}

	public void testCaseTGreaterEquals() {
		fail("Not yet implemented");
	}

	public void testCaseTIdentifier() {
		fail("Not yet implemented");
	}

	public void testCaseTIdentifierRequiredConfiguration() {
		fail("Not yet implemented");
	}

	public void testCaseTIdentifierRequiredProfile() {
		fail("Not yet implemented");
	}

	public void testCaseTImportPackage() {
		fail("Not yet implemented");
	}

	public void testCaseTImportService() {
		fail("Not yet implemented");
	}

	public void testCaseTInclude() {
		fail("Not yet implemented");
	}

	public void testCaseTLanguage() {
		fail("Not yet implemented");
	}

	public void testCaseTLazy() {
		fail("Not yet implemented");
	}

	public void testCaseTLeftBracket() {
		fail("Not yet implemented");
	}

	public void testCaseTLess() {
		fail("Not yet implemented");
	}

	public void testCaseTLesserEquals() {
		fail("Not yet implemented");
	}

	public void testCaseTMandatory() {
		fail("Not yet implemented");
	}

	public void testCaseTManifestversion() {
		fail("Not yet implemented");
	}

	public void testCaseTNever() {
		fail("Not yet implemented");
	}

	public void testCaseTNotEquals() {
		fail("Not yet implemented");
	}

	public void testCaseTOptional() {
		fail("Not yet implemented");
	}

	public void testCaseTOsname() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameAix() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameDigitalunix() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameEmbos() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameEpoc32() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameFreebsd() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameHpux() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameIrix() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameLinux() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameMacos() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameNetbsd() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameNetware() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameOpenbsd() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameOs2() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameQnx() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameSolaris() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameSunos() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameVxworks() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameWindows2000() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameWindows2003() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameWindows95() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameWindows98() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameWindowsce() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameWindowsnt() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameWindowsvista() {
		fail("Not yet implemented");
	}

	public void testCaseTOsnameWindowsxp() {
		fail("Not yet implemented");
	}

	public void testCaseTOsversion() {
		fail("Not yet implemented");
	}

	public void testCaseTPathSep() {
		fail("Not yet implemented");
	}

	public void testCaseTProcessor() {
		fail("Not yet implemented");
	}

	public void testCaseTProcessor68k() {
		fail("Not yet implemented");
	}

	public void testCaseTProcessorAlpha() {
		fail("Not yet implemented");
	}

	public void testCaseTProcessorArm() {
		fail("Not yet implemented");
	}

	public void testCaseTProcessorIgnite() {
		fail("Not yet implemented");
	}

	public void testCaseTProcessorMips() {
		fail("Not yet implemented");
	}

	public void testCaseTProcessorParisc() {
		fail("Not yet implemented");
	}

	public void testCaseTProcessorPowerpc() {
		fail("Not yet implemented");
	}

	public void testCaseTProcessorS390() {
		fail("Not yet implemented");
	}

	public void testCaseTProcessorS390x() {
		fail("Not yet implemented");
	}

	public void testCaseTProcessorSh4() {
		fail("Not yet implemented");
	}

	public void testCaseTProcessorSparc() {
		fail("Not yet implemented");
	}

	public void testCaseTProcessorV850e() {
		fail("Not yet implemented");
	}

	public void testCaseTProcessorX86() {
		fail("Not yet implemented");
	}

	public void testCaseTProcessorX8664() {
		fail("Not yet implemented");
	}

	public void testCaseTProtectedString() {
		fail("Not yet implemented");
	}

	public void testCaseTQuote() {
		fail("Not yet implemented");
	}

	public void testCaseTQuotedString() {
		fail("Not yet implemented");
	}

	public void testCaseTRequireBundle() {
		fail("Not yet implemented");
	}

	public void testCaseTResolution() {
		fail("Not yet implemented");
	}

	public void testCaseTResolutionMandatory() {
		fail("Not yet implemented");
	}

	public void testCaseTResolutionOptional() {
		fail("Not yet implemented");
	}

	public void testCaseTResolveTime() {
		fail("Not yet implemented");
	}

	public void testCaseTRightBracket() {
		fail("Not yet implemented");
	}

	public void testCaseTSelectionFilter() {
		fail("Not yet implemented");
	}

	public void testCaseTSemicolon() {
		fail("Not yet implemented");
	}

	public void testCaseTSingleton() {
		fail("Not yet implemented");
	}

	public void testCaseTTrue() {
		fail("Not yet implemented");
	}

	public void testCaseTUnquotedString() {
		fail("Not yet implemented");
	}

	public void testCaseTUrlFile() {
		fail("Not yet implemented");
	}

	public void testCaseTUrlFtp() {
		fail("Not yet implemented");
	}

	public void testCaseTUrlHttp() {
		fail("Not yet implemented");
	}

	public void testCaseTUses() {
		fail("Not yet implemented");
	}

	public void testCaseTVisibility() {
		fail("Not yet implemented");
	}

	public void testCaseTVisibilityPrivate() {
		fail("Not yet implemented");
	}

	public void testCaseTVisibilityReexport() {
		fail("Not yet implemented");
	}

	public void testGetIn() {
		fail("Not yet implemented");
	}

	public void testGetOut() {
		fail("Not yet implemented");
	}

	public void testSetIn() {
		fail("Not yet implemented");
	}

	public void testSetOut() {
		fail("Not yet implemented");
	}

	public void testCaseAAttributeActivationpolicyOptions() {
		fail("Not yet implemented");
	}

	public void testCaseADirectiveActivationpolicyOptions() {
		fail("Not yet implemented");
	}

	public void testGetFragmentHostReferences() {
		fail("Not yet implemented");
	}

	public void testSetFragmentHostReferences() {
		fail("Not yet implemented");
	}

	public void testGetManifest() {
		fail("Not yet implemented");
	}

	public void testSetManifest() {
		fail("Not yet implemented");
	}

	public void testGetBundle() {
		fail("Not yet implemented");
	}

	public void testSetBundle() {
		fail("Not yet implemented");
	}

	public void testCaseTDigestValue() {
		fail("Not yet implemented");
	}

	public void testCaseTNumber() {
		fail("Not yet implemented");
	}

	public void testCaseTQualifier() {
		fail("Not yet implemented");
	}

	public void testCaseTAttributeEntry() {
		fail("Not yet implemented");
	}

	public void testCaseAQuotedVersionMajorVersionEntry() {
		fail("Not yet implemented");
	}

	public void testCaseAUnquotedVersionMajorVersionEntry() {
		fail("Not yet implemented");
	}

	public void testCaseTAllString() {
		fail("Not yet implemented");
	}

	public void testCaseTSimpleStringValue() {
		fail("Not yet implemented");
	}

	public void testCaseANumberQualifierVersion() {
		fail("Not yet implemented");
	}

	public void testCaseAQualifierQualifierVersion() {
		fail("Not yet implemented");
	}

	public void testCaseAGoodPackageNamePackageName() {
		fail("Not yet implemented");
	}

	public void testCaseAMustNotAppearsPackageName() {
		fail("Not yet implemented");
	}

	public void testCaseAPackageNameWildcard() {
		fail("Not yet implemented");
	}

	public void testCaseAIdentifierUniqueNameWildcardSuffix() {
		fail("Not yet implemented");
	}

	public void testCaseAOptionalUniqueNameWildcardSuffix() {
		fail("Not yet implemented");
	}

	public void testCaseAUniqueNameWildcard() {
		fail("Not yet implemented");
	}

	public void testCaseAIdentifierUniqueNameWildcardCommons() {
		fail("Not yet implemented");
	}

	public void testCaseAOptionalUniqueNameWildcardCommons() {
		fail("Not yet implemented");
	}

	public void testIsValidTranslation() {
		fail("Not yet implemented");
	}

	public void testCaseAExportPackageUseExcludeIncludeIdentifier() {
		fail("Not yet implemented");
	}

	public void testCaseAUseExcludeIncludeManyElementsExportPackageUseExcludeIncludeValue() {
		fail("Not yet implemented");
	}

	public void testCaseAUseExcludeIncludeOneElementExportPackageUseExcludeIncludeValue() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedActivatorBundle() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedActivatorValue() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedExportServiceBundle() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedExportServiceValue() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedExportPackageBundle() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedExportPackageValue() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedExportPackageUsesBundle() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedExportPackageUsesValue() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedExportPackageExcludeExportPackage() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedExportPackageExcludeValue() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedExportPackageIncludeExportPackage() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedExportPackageIncludeValue() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedActivationPolicyExcludeBundle() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedActivationPolicyExcludeValue() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedActivationPolicyIncludeBundle() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedActivationPolicyIncludeValue() {
		fail("Not yet implemented");
	}

	public void testGetLog() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedRequireBundleBundle() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedRequireBundleValue() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedImportPackageBundle() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedImportPackageValue() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedImportServiceBundle() {
		fail("Not yet implemented");
	}

	public void testGetUnresolvedImportServiceValue() {
		fail("Not yet implemented");
	}

	public void testGetServicesAvailable() {
		fail("Not yet implemented");
	}

}
