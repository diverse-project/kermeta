package art.resource.art;

// An element that is expected at a given position in a resource
// stream.
public interface IArtExpectedElement {
	
	public void setPosition(int startIncludingHiddenTokens, int startExcludingHiddenTokens);
	public int getStartExcludingHiddenTokens();
	public int getStartIncludingHiddenTokens();
	public String getPrefix();
	public void setPrefix(String prefix);
	public String getScopeID();
	public boolean discardFollowingExpectations();
}
