/* This file was generated by SableCC (http://www.sablecc.org/). */

package fr.irisa.triskell.osgi.introspector.manifest.parser;

import fr.irisa.triskell.osgi.introspector.manifest.node.*;
import fr.irisa.triskell.osgi.introspector.manifest.analysis.*;

class TokenIndex extends AnalysisAdapter {
	int index;

	@Override
	public void caseTQuote(@SuppressWarnings("unused")
	TQuote node) {
		this.index = 0;
	}

	@Override
	public void caseTDefinition(@SuppressWarnings("unused")
	TDefinition node) {
		this.index = 1;
	}

	@Override
	public void caseTLeftBracket(@SuppressWarnings("unused")
	TLeftBracket node) {
		this.index = 2;
	}

	@Override
	public void caseTRightBracket(@SuppressWarnings("unused")
	TRightBracket node) {
		this.index = 3;
	}

	@Override
	public void caseTDotdot(@SuppressWarnings("unused")
	TDotdot node) {
		this.index = 4;
	}

	@Override
	public void caseTDoubleAntiSlash(@SuppressWarnings("unused")
	TDoubleAntiSlash node) {
		this.index = 5;
	}

	@Override
	public void caseTProtectedString(@SuppressWarnings("unused")
	TProtectedString node) {
		this.index = 6;
	}

	@Override
	public void caseTPathSep(@SuppressWarnings("unused")
	TPathSep node) {
		this.index = 7;
	}

	@Override
	public void caseTSemicolon(@SuppressWarnings("unused")
	TSemicolon node) {
		this.index = 8;
	}

	@Override
	public void caseTComma(@SuppressWarnings("unused")
	TComma node) {
		this.index = 9;
	}

	@Override
	public void caseTOptional(@SuppressWarnings("unused")
	TOptional node) {
		this.index = 10;
	}

	@Override
	public void caseTDot(@SuppressWarnings("unused")
	TDot node) {
		this.index = 11;
	}

	@Override
	public void caseTEquals(@SuppressWarnings("unused")
	TEquals node) {
		this.index = 12;
	}

	@Override
	public void caseTGreaterEquals(@SuppressWarnings("unused")
	TGreaterEquals node) {
		this.index = 13;
	}

	@Override
	public void caseTLesserEquals(@SuppressWarnings("unused")
	TLesserEquals node) {
		this.index = 14;
	}

	@Override
	public void caseTGreater(@SuppressWarnings("unused")
	TGreater node) {
		this.index = 15;
	}

	@Override
	public void caseTLess(@SuppressWarnings("unused")
	TLess node) {
		this.index = 16;
	}

	@Override
	public void caseTNotEquals(@SuppressWarnings("unused")
	TNotEquals node) {
		this.index = 17;
	}

	@Override
	public void caseTUrlHttp(@SuppressWarnings("unused")
	TUrlHttp node) {
		this.index = 18;
	}

	@Override
	public void caseTUrlFtp(@SuppressWarnings("unused")
	TUrlFtp node) {
		this.index = 19;
	}

	@Override
	public void caseTUrlFile(@SuppressWarnings("unused")
	TUrlFile node) {
		this.index = 20;
	}

	@Override
	public void caseTBundleActivationpolicy(@SuppressWarnings("unused")
	TBundleActivationpolicy node) {
		this.index = 21;
	}

	@Override
	public void caseTBundleActivator(@SuppressWarnings("unused")
	TBundleActivator node) {
		this.index = 22;
	}

	@Override
	public void caseTBundleCategory(@SuppressWarnings("unused")
	TBundleCategory node) {
		this.index = 23;
	}

	@Override
	public void caseTBundleClasspath(@SuppressWarnings("unused")
	TBundleClasspath node) {
		this.index = 24;
	}

	@Override
	public void caseTBundleContactaddress(@SuppressWarnings("unused")
	TBundleContactaddress node) {
		this.index = 25;
	}

	@Override
	public void caseTBundleCopyright(@SuppressWarnings("unused")
	TBundleCopyright node) {
		this.index = 26;
	}

	@Override
	public void caseTBundleDescription(@SuppressWarnings("unused")
	TBundleDescription node) {
		this.index = 27;
	}

	@Override
	public void caseTBundleDocurl(@SuppressWarnings("unused")
	TBundleDocurl node) {
		this.index = 28;
	}

	@Override
	public void caseTBundleLocalization(@SuppressWarnings("unused")
	TBundleLocalization node) {
		this.index = 29;
	}

	@Override
	public void caseTBundleManifestversion(@SuppressWarnings("unused")
	TBundleManifestversion node) {
		this.index = 30;
	}

	@Override
	public void caseTBundleName(@SuppressWarnings("unused")
	TBundleName node) {
		this.index = 31;
	}

	@Override
	public void caseTBundleNativecode(@SuppressWarnings("unused")
	TBundleNativecode node) {
		this.index = 32;
	}

	@Override
	public void caseTBundleRequiredexecutionenvironment(
			@SuppressWarnings("unused")
			TBundleRequiredexecutionenvironment node) {
		this.index = 33;
	}

	@Override
	public void caseTBundleSymbolicname(@SuppressWarnings("unused")
	TBundleSymbolicname node) {
		this.index = 34;
	}

	@Override
	public void caseTBundleUpdatelocation(@SuppressWarnings("unused")
	TBundleUpdatelocation node) {
		this.index = 35;
	}

	@Override
	public void caseTBundleVendor(@SuppressWarnings("unused")
	TBundleVendor node) {
		this.index = 36;
	}

	@Override
	public void caseTBundleVersion(@SuppressWarnings("unused")
	TBundleVersion node) {
		this.index = 37;
	}

	@Override
	public void caseTDynamicimportPackage(@SuppressWarnings("unused")
	TDynamicimportPackage node) {
		this.index = 38;
	}

	@Override
	public void caseTExportPackage(@SuppressWarnings("unused")
	TExportPackage node) {
		this.index = 39;
	}

	@Override
	public void caseTExportService(@SuppressWarnings("unused")
	TExportService node) {
		this.index = 40;
	}

	@Override
	public void caseTFragmentHost(@SuppressWarnings("unused")
	TFragmentHost node) {
		this.index = 41;
	}

	@Override
	public void caseTImportPackage(@SuppressWarnings("unused")
	TImportPackage node) {
		this.index = 42;
	}

	@Override
	public void caseTImportService(@SuppressWarnings("unused")
	TImportService node) {
		this.index = 43;
	}

	@Override
	public void caseTRequireBundle(@SuppressWarnings("unused")
	TRequireBundle node) {
		this.index = 44;
	}

	@Override
	public void caseTEntryDigest(@SuppressWarnings("unused")
	TEntryDigest node) {
		this.index = 45;
	}

	@Override
	public void caseTEntry(@SuppressWarnings("unused")
	TEntry node) {
		this.index = 46;
	}

	@Override
	public void caseTLazy(@SuppressWarnings("unused")
	TLazy node) {
		this.index = 47;
	}

	@Override
	public void caseTSingleton(@SuppressWarnings("unused")
	TSingleton node) {
		this.index = 48;
	}

	@Override
	public void caseTFragmentAttachment(@SuppressWarnings("unused")
	TFragmentAttachment node) {
		this.index = 49;
	}

	@Override
	public void caseTOsname(@SuppressWarnings("unused")
	TOsname node) {
		this.index = 50;
	}

	@Override
	public void caseTOsversion(@SuppressWarnings("unused")
	TOsversion node) {
		this.index = 51;
	}

	@Override
	public void caseTProcessor(@SuppressWarnings("unused")
	TProcessor node) {
		this.index = 52;
	}

	@Override
	public void caseTLanguage(@SuppressWarnings("unused")
	TLanguage node) {
		this.index = 53;
	}

	@Override
	public void caseTSelectionFilter(@SuppressWarnings("unused")
	TSelectionFilter node) {
		this.index = 54;
	}

	@Override
	public void caseTVisibility(@SuppressWarnings("unused")
	TVisibility node) {
		this.index = 55;
	}

	@Override
	public void caseTResolution(@SuppressWarnings("unused")
	TResolution node) {
		this.index = 56;
	}

	@Override
	public void caseTUses(@SuppressWarnings("unused")
	TUses node) {
		this.index = 57;
	}

	@Override
	public void caseTExclude(@SuppressWarnings("unused")
	TExclude node) {
		this.index = 58;
	}

	@Override
	public void caseTInclude(@SuppressWarnings("unused")
	TInclude node) {
		this.index = 59;
	}

	@Override
	public void caseTMandatory(@SuppressWarnings("unused")
	TMandatory node) {
		this.index = 60;
	}

	@Override
	public void caseTExtension(@SuppressWarnings("unused")
	TExtension node) {
		this.index = 61;
	}

	@Override
	public void caseTAttributeEntry(@SuppressWarnings("unused")
	TAttributeEntry node) {
		this.index = 62;
	}

	@Override
	public void caseTProcessor68k(@SuppressWarnings("unused")
	TProcessor68k node) {
		this.index = 63;
	}

	@Override
	public void caseTProcessorArm(@SuppressWarnings("unused")
	TProcessorArm node) {
		this.index = 64;
	}

	@Override
	public void caseTProcessorAlpha(@SuppressWarnings("unused")
	TProcessorAlpha node) {
		this.index = 65;
	}

	@Override
	public void caseTProcessorIgnite(@SuppressWarnings("unused")
	TProcessorIgnite node) {
		this.index = 66;
	}

	@Override
	public void caseTProcessorMips(@SuppressWarnings("unused")
	TProcessorMips node) {
		this.index = 67;
	}

	@Override
	public void caseTProcessorParisc(@SuppressWarnings("unused")
	TProcessorParisc node) {
		this.index = 68;
	}

	@Override
	public void caseTProcessorPowerpc(@SuppressWarnings("unused")
	TProcessorPowerpc node) {
		this.index = 69;
	}

	@Override
	public void caseTProcessorSh4(@SuppressWarnings("unused")
	TProcessorSh4 node) {
		this.index = 70;
	}

	@Override
	public void caseTProcessorSparc(@SuppressWarnings("unused")
	TProcessorSparc node) {
		this.index = 71;
	}

	@Override
	public void caseTProcessorS390(@SuppressWarnings("unused")
	TProcessorS390 node) {
		this.index = 72;
	}

	@Override
	public void caseTProcessorS390x(@SuppressWarnings("unused")
	TProcessorS390x node) {
		this.index = 73;
	}

	@Override
	public void caseTProcessorV850e(@SuppressWarnings("unused")
	TProcessorV850e node) {
		this.index = 74;
	}

	@Override
	public void caseTProcessorX86(@SuppressWarnings("unused")
	TProcessorX86 node) {
		this.index = 75;
	}

	@Override
	public void caseTProcessorX8664(@SuppressWarnings("unused")
	TProcessorX8664 node) {
		this.index = 76;
	}

	@Override
	public void caseTOsnameAix(@SuppressWarnings("unused")
	TOsnameAix node) {
		this.index = 77;
	}

	@Override
	public void caseTOsnameDigitalunix(@SuppressWarnings("unused")
	TOsnameDigitalunix node) {
		this.index = 78;
	}

	@Override
	public void caseTOsnameEmbos(@SuppressWarnings("unused")
	TOsnameEmbos node) {
		this.index = 79;
	}

	@Override
	public void caseTOsnameEpoc32(@SuppressWarnings("unused")
	TOsnameEpoc32 node) {
		this.index = 80;
	}

	@Override
	public void caseTOsnameFreebsd(@SuppressWarnings("unused")
	TOsnameFreebsd node) {
		this.index = 81;
	}

	@Override
	public void caseTOsnameHpux(@SuppressWarnings("unused")
	TOsnameHpux node) {
		this.index = 82;
	}

	@Override
	public void caseTOsnameIrix(@SuppressWarnings("unused")
	TOsnameIrix node) {
		this.index = 83;
	}

	@Override
	public void caseTOsnameLinux(@SuppressWarnings("unused")
	TOsnameLinux node) {
		this.index = 84;
	}

	@Override
	public void caseTOsnameMacos(@SuppressWarnings("unused")
	TOsnameMacos node) {
		this.index = 85;
	}

	@Override
	public void caseTOsnameNetbsd(@SuppressWarnings("unused")
	TOsnameNetbsd node) {
		this.index = 86;
	}

	@Override
	public void caseTOsnameNetware(@SuppressWarnings("unused")
	TOsnameNetware node) {
		this.index = 87;
	}

	@Override
	public void caseTOsnameOpenbsd(@SuppressWarnings("unused")
	TOsnameOpenbsd node) {
		this.index = 88;
	}

	@Override
	public void caseTOsnameOs2(@SuppressWarnings("unused")
	TOsnameOs2 node) {
		this.index = 89;
	}

	@Override
	public void caseTOsnameQnx(@SuppressWarnings("unused")
	TOsnameQnx node) {
		this.index = 90;
	}

	@Override
	public void caseTOsnameSolaris(@SuppressWarnings("unused")
	TOsnameSolaris node) {
		this.index = 91;
	}

	@Override
	public void caseTOsnameSunos(@SuppressWarnings("unused")
	TOsnameSunos node) {
		this.index = 92;
	}

	@Override
	public void caseTOsnameVxworks(@SuppressWarnings("unused")
	TOsnameVxworks node) {
		this.index = 93;
	}

	@Override
	public void caseTOsnameWindows95(@SuppressWarnings("unused")
	TOsnameWindows95 node) {
		this.index = 94;
	}

	@Override
	public void caseTOsnameWindows98(@SuppressWarnings("unused")
	TOsnameWindows98 node) {
		this.index = 95;
	}

	@Override
	public void caseTOsnameWindowsnt(@SuppressWarnings("unused")
	TOsnameWindowsnt node) {
		this.index = 96;
	}

	@Override
	public void caseTOsnameWindowsce(@SuppressWarnings("unused")
	TOsnameWindowsce node) {
		this.index = 97;
	}

	@Override
	public void caseTOsnameWindows2000(@SuppressWarnings("unused")
	TOsnameWindows2000 node) {
		this.index = 98;
	}

	@Override
	public void caseTOsnameWindows2003(@SuppressWarnings("unused")
	TOsnameWindows2003 node) {
		this.index = 99;
	}

	@Override
	public void caseTOsnameWindowsxp(@SuppressWarnings("unused")
	TOsnameWindowsxp node) {
		this.index = 100;
	}

	@Override
	public void caseTOsnameWindowsvista(@SuppressWarnings("unused")
	TOsnameWindowsvista node) {
		this.index = 101;
	}

	@Override
	public void caseTVisibilityPrivate(@SuppressWarnings("unused")
	TVisibilityPrivate node) {
		this.index = 102;
	}

	@Override
	public void caseTVisibilityReexport(@SuppressWarnings("unused")
	TVisibilityReexport node) {
		this.index = 103;
	}

	@Override
	public void caseTResolutionMandatory(@SuppressWarnings("unused")
	TResolutionMandatory node) {
		this.index = 104;
	}

	@Override
	public void caseTResolutionOptional(@SuppressWarnings("unused")
	TResolutionOptional node) {
		this.index = 105;
	}

	@Override
	public void caseTExtensionFramework(@SuppressWarnings("unused")
	TExtensionFramework node) {
		this.index = 106;
	}

	@Override
	public void caseTExtensionBootclasspath(@SuppressWarnings("unused")
	TExtensionBootclasspath node) {
		this.index = 107;
	}

	@Override
	public void caseTAlways(@SuppressWarnings("unused")
	TAlways node) {
		this.index = 108;
	}

	@Override
	public void caseTNever(@SuppressWarnings("unused")
	TNever node) {
		this.index = 109;
	}

	@Override
	public void caseTResolveTime(@SuppressWarnings("unused")
	TResolveTime node) {
		this.index = 110;
	}

	@Override
	public void caseTTrue(@SuppressWarnings("unused")
	TTrue node) {
		this.index = 111;
	}

	@Override
	public void caseTFalse(@SuppressWarnings("unused")
	TFalse node) {
		this.index = 112;
	}

	@Override
	public void caseTManifestversion(@SuppressWarnings("unused")
	TManifestversion node) {
		this.index = 113;
	}

	@Override
	public void caseTEol(@SuppressWarnings("unused")
	TEol node) {
		this.index = 114;
	}

	@Override
	public void caseTIdentifier(@SuppressWarnings("unused")
	TIdentifier node) {
		this.index = 115;
	}

	@Override
	public void caseTIdentifierRequiredProfile(@SuppressWarnings("unused")
	TIdentifierRequiredProfile node) {
		this.index = 116;
	}

	@Override
	public void caseTIdentifierRequiredConfiguration(
			@SuppressWarnings("unused")
			TIdentifierRequiredConfiguration node) {
		this.index = 117;
	}

	@Override
	public void caseTDigestValue(@SuppressWarnings("unused")
	TDigestValue node) {
		this.index = 118;
	}

	@Override
	public void caseTUnquotedString(@SuppressWarnings("unused")
	TUnquotedString node) {
		this.index = 119;
	}

	@Override
	public void caseTQuotedString(@SuppressWarnings("unused")
	TQuotedString node) {
		this.index = 120;
	}

	@Override
	public void caseTSimpleStringValue(@SuppressWarnings("unused")
	TSimpleStringValue node) {
		this.index = 121;
	}

	@Override
	public void caseTAllString(@SuppressWarnings("unused")
	TAllString node) {
		this.index = 122;
	}

	@Override
	public void caseTNumber(@SuppressWarnings("unused")
	TNumber node) {
		this.index = 123;
	}

	@Override
	public void caseTQualifier(@SuppressWarnings("unused")
	TQualifier node) {
		this.index = 124;
	}

	@Override
	public void caseEOF(@SuppressWarnings("unused")
	EOF node) {
		this.index = 125;
	}
}
