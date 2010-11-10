/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package smartadapters4ART.resource.smARText.analysis;

public class InstanceGroupInstancesReferenceResolver implements smartadapters4ART.resource.smARText.ISmARTextReferenceResolver<art_relaxed.group_relaxed.InstanceGroup, art_relaxed.instance_relaxed.ComponentInstance> {
	
	private smartadapters4ART.resource.smARText.analysis.SmARTextDefaultResolverDelegate<art_relaxed.group_relaxed.InstanceGroup, art_relaxed.instance_relaxed.ComponentInstance> delegate = new smartadapters4ART.resource.smARText.analysis.SmARTextDefaultResolverDelegate<art_relaxed.group_relaxed.InstanceGroup, art_relaxed.instance_relaxed.ComponentInstance>();
	
	public void resolve(java.lang.String identifier, art_relaxed.group_relaxed.InstanceGroup container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final smartadapters4ART.resource.smARText.ISmARTextReferenceResolveResult<art_relaxed.instance_relaxed.ComponentInstance> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public java.lang.String deResolve(art_relaxed.instance_relaxed.ComponentInstance element, art_relaxed.group_relaxed.InstanceGroup container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
