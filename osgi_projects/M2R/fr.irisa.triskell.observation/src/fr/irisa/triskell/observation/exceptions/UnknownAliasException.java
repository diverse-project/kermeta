package fr.irisa.triskell.observation.exceptions;

public class UnknownAliasException extends Exception {

	private String alias;
	
	public UnknownAliasException(String alias) {
		super(alias + " is unknown.");
		this.alias = alias;
	}
	
	public String getAlias() {
		return this.alias;
	}

}
