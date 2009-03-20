package fr.irisa.triskell.observation.exceptions;

public class AliasAlreadyExistsException extends Exception {
	
	private String alias;
	
	public AliasAlreadyExistsException(String alias) {
		super(alias + " already exists as an observer.");
		this.alias = alias;
	}
	
	public String getAlias() {
		return alias;
	}

}
