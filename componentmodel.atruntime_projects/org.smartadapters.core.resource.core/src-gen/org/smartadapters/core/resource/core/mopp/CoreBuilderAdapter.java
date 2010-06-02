/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.smartadapters.core.resource.core.mopp;

public class CoreBuilderAdapter extends org.eclipse.core.resources.IncrementalProjectBuilder {
	
	// the ID of the default, generated builder
	public final static String BUILDER_ID = "org.smartadapters.core.resource.core.builder";
	
	private org.smartadapters.core.resource.core.ICoreBuilder builder = new org.smartadapters.core.resource.core.mopp.CoreBuilder();
	
	public org.eclipse.core.resources.IProject[] build(int kind, java.util.Map args, final org.eclipse.core.runtime.IProgressMonitor monitor) throws org.eclipse.core.runtime.CoreException {
		return build(kind, args, monitor, builder, getProject());
	}
	
	public org.eclipse.core.resources.IProject[] build(int kind, java.util.Map args, final org.eclipse.core.runtime.IProgressMonitor monitor, final org.smartadapters.core.resource.core.ICoreBuilder builder, org.eclipse.core.resources.IProject project) throws org.eclipse.core.runtime.CoreException {
		org.eclipse.core.resources.IResourceDelta delta = getDelta(project);
		if (delta == null) {
			return null;
		}
		delta.accept(new org.eclipse.core.resources.IResourceDeltaVisitor() {
			public boolean visit(org.eclipse.core.resources.IResourceDelta delta) throws org.eclipse.core.runtime.CoreException {
				org.eclipse.core.resources.IResource resource = delta.getResource();
				if (resource instanceof org.eclipse.core.resources.IFile && "core".equals(resource.getFileExtension())) {
					org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
					if (builder.isBuildingNeeded(uri)) {
						org.smartadapters.core.resource.core.mopp.CoreResource customResource = (org.smartadapters.core.resource.core.mopp.CoreResource) new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl().getResource(uri, true);
						builder.build(customResource, monitor);
					}
					return false;
				}
				return true;
			}
		});
		return null;
	}
	
}
