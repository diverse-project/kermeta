package org.kermeta.kompose.creative.wizards;

public class SpecializerIntermediateDataContainer {
	
	private String mainKmtPackage;
	
	private String plugin_name;
	private String package_name;
	private String model_name;
	private String composer_name;
	
	private String activatorDir;
	private String popupDir;
	
	private String kmtDir;
	
	private String MetainfDir;
	
	private String ModelDir;

	private String rootDir;
	
	private String propertiesDir;
	
	private String pluginXmlDir;
	
	private String classPathFile;
	
	private String startupClass;
	
	public String getActivatorDir() {
		return activatorDir;
	}
	public void setActivatorDir(String activatorDir) {
		this.activatorDir = activatorDir;
	}
	public String getPopupDir() {
		return popupDir;
	}
	public void setPopupDir(String popupDir) {
		this.popupDir = popupDir;
	}
	public String getComposer_name() {
		return composer_name;
	}
	public void setComposer_name(String composer_name) {
		this.composer_name = composer_name;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public String getPackage_name() {
		return package_name;
	}
	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}
	public String getPlugin_name() {
		return plugin_name;
	}
	public void setPlugin_name(String plugin_name) {
		this.plugin_name = plugin_name;
	}
	public String getActivatorPackage(){
		if(this.package_name==null){
			return null;
		}
		return this.package_name+".activator";
	}
	public String getPopupPackage(){
		if(this.package_name==null){
			return null;
		}
		return this.package_name+".popup.action";
	}
	public String getKmtDir() {
		return kmtDir;
	}
	public void setKmtDir(String kmtDir) {
		this.kmtDir = kmtDir;
	}
	public String getMetainfDir() {
		return MetainfDir;
	}
	public void setMetainfDir(String metainfDir) {
		MetainfDir = metainfDir;
	}
	public String getModelDir() {
		return ModelDir;
	}
	public void setModelDir(String modelDir) {
		ModelDir = modelDir;
	}
	public String getRootDir() {
		return rootDir;
	}
	public void setRootDir(String rootDir) {
		this.rootDir = rootDir;
	}
	public String getPluginXmlDir() {
		return pluginXmlDir;
	}
	public void setPluginXmlDir(String pluginXmlDir) {
		this.pluginXmlDir = pluginXmlDir;
	}
	public String getPropertiesDir() {
		return propertiesDir;
	}
	public void setPropertiesDir(String propertiesDir) {
		this.propertiesDir = propertiesDir;
	}
	public String getClassPathFile() {
		return classPathFile;
	}
	public void setClassPathFile(String classPathFile) {
		this.classPathFile = classPathFile;
	}
	public String getStartupClass() {
		return startupClass;
	}
	public void setStartupClass(String startupClass) {
		this.startupClass = startupClass;
	}
	public String getStartupPackage() {
		if(this.package_name==null){
			return null;
		}
		return this.package_name+".startup";
	}
	public String getMainKmtPackage() {
		return mainKmtPackage;
	}
	public void setMainKmtPackage(String mainKmtPackage) {
		this.mainKmtPackage = mainKmtPackage;
	}
}
