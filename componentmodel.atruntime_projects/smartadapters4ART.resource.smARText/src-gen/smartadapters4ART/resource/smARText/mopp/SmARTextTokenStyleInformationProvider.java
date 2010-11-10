/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.mopp;

public class SmARTextTokenStyleInformationProvider {
	
	public smartadapters4ART.resource.smARText.ISmARTextTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("TEXT".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x44, 0x44, 0x44}, null, false, false, false, false);
		}
		if ("SL_COMMENT".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x66, 0x66, 0x66}, null, false, false, false, false);
		}
		if ("ML_COMMENT".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x66, 0x66, 0x66}, null, false, false, false, false);
		}
		if ("STRING_LITERAL".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x00, 0x55, 0xbb}, null, false, false, false, false);
		}
		if ("system".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x44, 0x44, 0x44}, null, true, false, false, false);
		}
		if ("TXTID".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x44, 0x44, 0x44}, null, true, false, false, false);
		}
		if ("root".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x00, 0x7F, 0x55}, null, true, false, false, false);
		}
		if ("primitive".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x00, 0x7F, 0x55}, null, true, false, false, false);
		}
		if ("composite".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x00, 0x7F, 0x55}, null, true, false, false, false);
		}
		if ("component".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x00, 0x7F, 0x55}, null, true, false, false, false);
		}
		if ("binding".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x00, 0x7F, 0x55}, null, true, false, false, false);
		}
		if ("server".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x00, 0x7F, 0x55}, null, true, false, false, false);
		}
		if ("requiredPort".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x00, 0x7F, 0x55}, null, true, false, false, false);
		}
		if ("providedPort".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x00, 0x7F, 0x55}, null, true, false, false, false);
		}
		if ("instance".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x00, 0x7F, 0x55}, null, true, false, false, false);
		}
		if ("T_INSTANCE_STATE".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x00, 0x7F, 0x55}, null, true, false, false, false);
		}
		if (":".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x44, 0x44, 0x44}, null, true, false, false, false);
		}
		if ("?".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x44, 0x44, 0x44}, null, true, false, false, false);
		}
		if ("=".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x44, 0x44, 0x44}, null, true, false, false, false);
		}
		if ("+=".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x44, 0x44, 0x44}, null, true, false, false, false);
		}
		if ("bind".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x00, 0x7F, 0x55}, null, true, false, false, false);
		}
		if ("delegate".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x00, 0x7F, 0x55}, null, true, false, false, false);
		}
		if ("to".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x00, 0x7F, 0x55}, null, true, false, false, false);
		}
		if ("id".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x00, 0x7F, 0x55}, null, true, false, false, false);
		}
		if ("functional".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, true, false, false, false);
		}
		if ("control".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, true, false, false, false);
		}
		if ("service".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, true, false, false, false);
		}
		if ("services".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, true, false, false, false);
		}
		if ("operation".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0xCC, 0x80, 0x00}, null, true, false, false, false);
		}
		if ("implementation".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x00, 0x55, 0xbb}, null, true, false, false, false);
		}
		if ("T_IMPLEM".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x00, 0x55, 0xbb}, null, true, false, false, false);
		}
		if ("OSGiComponent".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x00, 0x55, 0xbb}, null, false, false, false, false);
		}
		if ("instancegroup".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x44, 0x44, 0x44}, null, true, false, false, false);
		}
		if ("typegroup".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x44, 0x44, 0x44}, null, true, false, false, false);
		}
		if ("instances".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x44, 0x44, 0x44}, null, true, false, false, false);
		}
		if ("types".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x44, 0x44, 0x44}, null, true, false, false, false);
		}
		if ("type".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0xA2, 0x20, 0x00}, null, true, false, false, false);
		}
		if ("compositetype".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0xA2, 0x20, 0x00}, null, true, false, false, false);
		}
		if ("port".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0xA2, 0x20, 0x00}, null, true, false, false, false);
		}
		if ("T_PORT_KIND".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0xA2, 0x20, 0x00}, null, true, false, false, false);
		}
		if ("attribute".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0xA2, 0x20, 0x00}, null, true, false, false, false);
		}
		if ("default".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0xA2, 0x20, 0x00}, null, true, false, false, false);
		}
		if ("datatype".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x00, 0x55, 0xbb}, null, true, false, false, false);
		}
		if ("pointcut".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("advice".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("strategies".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("protocol".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("global".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("per".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("role".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("elements".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("set".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("datatypes".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("state".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("super".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("name".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("delegation".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("node".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("components".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("uri".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("FractalComponent".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("controllerDesc".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("contentDesc".equals(tokenName)) {
			return new smartadapters4ART.resource.smARText.mopp.SmARTextTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		return null;
	}
	
}
