package org.kermeta.kp.compiler.mavenplugin;

public class ModelingUnitLoaderExtensionPoint {
	
	/**
	 * Supported file extensions, for example ".profile.uml"
	 * @parameter
	 */
	private String[] fileExtensions;
	
	/**
	 * Qualified name of the factory
	 * @parameter
	 */
	private String factory;

	public String[] getFileExtensions() {
		return fileExtensions;
	}

	public void setFileExtensions(String[] fileExtensions) {
		this.fileExtensions = fileExtensions;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

}
