package org.kermeta.kp.compiler.mavenplugin;

public class Dependency {
	
	/**
	 * @parameter
	 */
	private String groupId;
	
	/**
	 * @parameter
	 */
	private String artifactId;
	
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

	public String getArtifactId() {
		return artifactId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
}
