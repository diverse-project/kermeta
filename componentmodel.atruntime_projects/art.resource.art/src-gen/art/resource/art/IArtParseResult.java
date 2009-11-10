package art.resource.art;

// An interface used to access the result of parsing a
// document.
public interface IArtParseResult {
	
	public org.eclipse.emf.ecore.EObject getRoot();
	
	public java.util.Collection<art.resource.art.IArtCommand<art.resource.art.IArtTextResource>> getPostParseCommands();
}
