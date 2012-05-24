package org.kermeta.kp.compiler.mavenplugin;

public class Dependency {
	
	/**
	 * @parameter
	 */
	private String groupId;
	
	/**
	 * @parameter
	 */
	private String artefactId;
	
	/**
	 * @parameter
	 */
	private String version;

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getArtefactId() {
		return artefactId;
	}

	public void setArtefactId(String artefactId) {
		this.artefactId = artefactId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
}
