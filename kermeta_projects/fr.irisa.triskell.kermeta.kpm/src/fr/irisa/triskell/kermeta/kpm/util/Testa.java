package fr.irisa.triskell.kermeta.kpm.util;

public class Testa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String kmt = "/fr.irisa.triskell.kermeta.kpm/rep/otherrep/kermeta.kmt";
		String ecoreRegex = "/fr.irisa.triskell.kermeta.kpm/backup/*.ecore";
		
		String[] kmtSegments = kmt.split( "/" );
		String kmtLastSegment = kmtSegments[kmtSegments.length-1];

		String[] ecoreSegments = ecoreRegex.split( "/" );
		String ecoreLastSegment = ecoreSegments[ecoreSegments.length-1];
		
		String[] bodyAndExtensionOut = ecoreLastSegment.split ( "\\." );
		String[] bodyAndExtensionIn = kmtLastSegment.split ( "\\." );
		
		System.out.println( bodyAndExtensionIn[0] + "." + bodyAndExtensionOut[bodyAndExtensionOut.length-1] );
		

	}

}
