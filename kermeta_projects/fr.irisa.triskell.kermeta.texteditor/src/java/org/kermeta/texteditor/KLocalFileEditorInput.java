package org.kermeta.texteditor;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.debug.core.sourcelookup.containers.LocalFileStorage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IStorageEditorInput;

public class KLocalFileEditorInput extends PlatformObject implements IStorageEditorInput {

	private LocalFileStorage _storage;
	
	public KLocalFileEditorInput(LocalFileStorage s) {
		_storage = s;
	}
	
	public IStorage getStorage() throws CoreException {
		return _storage;
	}

	public boolean exists() {
		return _storage.getFile().exists();
	}

	public ImageDescriptor getImageDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return _storage.getName();
	}

	public IPersistableElement getPersistable() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getToolTipText() {
		return "";
	}

}
