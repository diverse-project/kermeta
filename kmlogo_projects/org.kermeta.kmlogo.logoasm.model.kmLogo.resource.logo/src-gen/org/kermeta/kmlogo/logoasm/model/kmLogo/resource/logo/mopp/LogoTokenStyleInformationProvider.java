/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp;

public class LogoTokenStyleInformationProvider {
	
	public org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.ILogoTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("SL_COMMENT".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x34, 0x80, 0x17}, null, false, false, false, false);
		}
		if ("ML_COMMENT".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x34, 0x80, 0x17}, null, false, false, false, false);
		}
		if ("FLOAT".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x00, 0x7F, 0x55}, null, true, false, false, false);
		}
		if ("INTEGER".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x00, 0x7F, 0x55}, null, true, false, false, false);
		}
		if ("TEXT".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x66, 0x66, 0x66}, null, true, false, false, false);
		}
		if ("Forward".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("FORWARD".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("FD".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("fd".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("forward".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("Right".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("RIGHT".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("rt".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("RT".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("right".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("Left".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("LEFT".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("lt".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("LT".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("left".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("Back".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("BACK".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("bk".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("BK".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("back".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, false, true, false, false);
		}
		if ("PenDown".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xA2, 0x20, 0x00}, null, true, false, false, false);
		}
		if ("PENDOWN".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xA2, 0x20, 0x00}, null, true, false, false, false);
		}
		if ("pd".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xA2, 0x20, 0x00}, null, true, false, false, false);
		}
		if ("PD".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xA2, 0x20, 0x00}, null, true, false, false, false);
		}
		if ("PenUp".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xA2, 0x20, 0x00}, null, true, false, false, false);
		}
		if ("PENUP".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xA2, 0x20, 0x00}, null, true, false, false, false);
		}
		if ("pu".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xA2, 0x20, 0x00}, null, true, false, false, false);
		}
		if ("PU".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xA2, 0x20, 0x00}, null, true, false, false, false);
		}
		if ("penUp".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0xA2, 0x20, 0x00}, null, true, false, false, false);
		}
		if ("Clear".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x00, 0x55, 0xbb}, null, false, true, false, false);
		}
		if ("CLEAR".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x00, 0x55, 0xbb}, null, false, true, false, false);
		}
		if ("cs".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x00, 0x55, 0xbb}, null, false, true, false, false);
		}
		if ("CLEARSCREEN".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x00, 0x55, 0xbb}, null, false, true, false, false);
		}
		if ("clearScreen".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x00, 0x55, 0xbb}, null, false, true, false, false);
		}
		if ("ClearScreen".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x00, 0x55, 0xbb}, null, false, true, false, false);
		}
		if ("CS".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x00, 0x55, 0xbb}, null, false, true, false, false);
		}
		if ("clear".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x00, 0x55, 0xbb}, null, false, true, false, false);
		}
		if ("penDown".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("To".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TO".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("to".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("End".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("END".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("end".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("If".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("IF".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("if".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Then".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("THEN".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("then".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Ifelse".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("IFELSE".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("ifelse".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Repeat".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("REPEAT".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("repeat".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("While".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("WHILE".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("while".equals(tokenName)) {
			return new org.kermeta.kmlogo.logoasm.model.kmLogo.resource.logo.mopp.LogoTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		return null;
	}
	
}
