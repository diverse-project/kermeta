

/*$Id: DoubleClickListener.java,v 1.1 2008-06-05 14:20:45 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	DoubleClickListener.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 4 juin 08
* Authors : paco
*/

package fr.irisa.triskell.kermeta.texteditor.outline;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.sourcelookup.containers.LocalFileStorage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.part.FileEditorInput;
import org.kermeta.io.KermetaUnit;
import org.kermeta.model.KermetaModelHelper;
import org.kermeta.texteditor.KLocalFileEditorInput;
import org.osgi.framework.Bundle;

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.Package;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.traceability.TextReference;

public class DoubleClickListener implements IDoubleClickListener {

	public void doubleClick(DoubleClickEvent event) {

		if ( event.getSelection() instanceof TreeSelection ) {
			TreeSelection s = (TreeSelection) event.getSelection();

			// Trying to get the underlying kermeta object
			EObject initialObject = null;
			if ( s.getFirstElement() instanceof PackageItem ) {
				PackageItem item = (PackageItem) s.getFirstElement();
				initialObject = item.initialPackage;
			} else if ( s.getFirstElement() instanceof OutlineItem ) {
				OutlineItem item = (OutlineItem) s.getFirstElement();
				if ( item instanceof ModelElementOutlineItem ) {
					initialObject = ((ModelElementOutlineItem) item).modelElement;
				}
			}	
			
			EObject[] chosenObjects = chooseObject(initialObject);
			
			for ( EObject o : chosenObjects ) {
				// Getting the kermeta unit containing the kermeta object
				KermetaUnit ku = KermetaUnitHelper.getKermetaUnitFromObject(o);
				if ( ku.getUri().startsWith("platform:/resource") ) {
					// Getting a file to open
					String eclipsePath = ku.getUri().replace("platform:/resource", "");
					IFile file = ResourceHelper.getIFile( eclipsePath );
					// Open an editor on that file
					TextEditor editor = openEditor(file);
					if ( editor != null ) {
						// Try to select the definition of the object in the file
						TextReference reference = ku.getTracer().getFirstTextReference(o);
						if ( reference != null )
							editor.setHighlightRange( reference.getCharBeginAt(), 0 ,true );
					}			
				} else if ( ku.getUri().startsWith("platform:/plugin") ) {
					TextReference reference = ku.getTracer().getFirstTextReference(o);
					if ( reference != null ) {
						URL url = getResolvedURL( reference.getFileURI() );
						if ( url != null ) {
							File file;
							try {
								file = new File(url.toURI());
								TextEditor editor = openEditor(file);
								if ( editor != null )
									editor.setHighlightRange( reference.getCharBeginAt(), 0 ,true );
							} catch (URISyntaxException e1) {
								e1.printStackTrace();
							}
						}
					}
				}
			}
			
		}
	
	}
	
	/**
	 * When the given object is a type definition or a package, ask the user the file he wants to open.
	 * If the given object is not a type definition or a package, returns the given object.
	 * If the user cancels, returns null.
	 * @param o
	 * @return
	 */
	private EObject[] chooseObject(EObject o) {
		// Class Definition handling
		if ( o instanceof ClassDefinition ) {
			ClassDefinition cd = (ClassDefinition) o;
			// Get the list of aspects
			Collection<TypeDefinition> context = KermetaModelHelper.ClassDefinition.getFullContext( cd );
			List<TypeDefinition> l = new ArrayList<TypeDefinition>();
			for ( TypeDefinition td : context )
				if ( td.getName().equals(cd.getName()) )
					l.add(td);
			// If there is some, open a dialog for selecting the file to open.
			if ( l.size() > 1 ) {
				ListSelectionDialog d = new ListSelectionDialog(
											new Shell(), 
											l.toArray(), 
											new StructuredContentProvider(),
											new LabelProvider(),
											"Select the class definition to open");
				d.open();
				if ( d.getResult() == null )
					return new EObject[] {};
				EObject[] result = new EObject[ d.getResult().length ];
				for ( int i=0; i < d.getResult().length; i++ ) 
					result[i] = (EObject) d.getResult()[i];
				return result;
			}
			return new EObject[] {o};
		// Package handling
		} else if ( o instanceof Package ) {
			Package p = (Package) o;
			KermetaUnit ku = KermetaUnitHelper.getKermetaUnitFromObject(p);
			// Get a list of packages with the same name.
			List<Package> l = ku.getExternalPackage( KermetaModelHelper.NamedElement.qualifiedName(p) );
			if ( l.size() == 1 )
				return new EObject[] { l.get(0) };
			else if ( l.size() > 1 ) {
				// If several found packages, open a dialog to select the files to open.
				ListSelectionDialog d = new ListSelectionDialog(
											new Shell(),
											l.toArray(),
											new StructuredContentProvider(),
											new LabelProvider(),
											"Select the package to open");
				d.open();
				EObject[] result = new EObject[ d.getResult().length ];
				if ( d.getResult() == null )
					return new EObject[] {};
				for ( int i=0; i < d.getResult().length; i++ ) 
					result[i] = (EObject) d.getResult()[i];
				return result;
			} else
				return new EObject[] {o};
		} else
			return new EObject[] {o};
	}
	
	/**
	 * Given a path formed like platform:/plugin, return a resolved URL formed like file:/*
	 * @param path
	 * @return
	 */
	private URL getResolvedURL(String path) {
		try {
			if ( path.startsWith("platform:/resource") ) {
			
			} else if ( path.startsWith("platform:/plugin") ) {
				// Getting the bundle name and the path relative to the bundle.
				String eclipsePath = path.replace("platform:/plugin/", "");
				String bundleName = eclipsePath.replaceFirst("/.+", "");
				String entryPath = eclipsePath.replace(bundleName + "/", "");
				// Getting the bundle.
				Bundle bundle = Platform.getBundle( bundleName );
				if ( bundle != null ) {
					// Getting the entry.
					URL url = bundle.getEntry( entryPath );
					if ( url != null ) {
						// Finally, resolved the url.
						url = FileLocator.resolve(url);
						return url;
					}
				}
			}				
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private TextEditor openEditor(File file) {
		IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor( file.toString() );
		TextEditor editor;
		try {
			editor = (TextEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(
					new KLocalFileEditorInput( new LocalFileStorage(file) ),
					desc.getId());
			return editor;
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private TextEditor openEditor(IFile file) {
		IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName());
		try {
			// Open an editor on that file
			TextEditor editor = (TextEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(
			      new FileEditorInput(file),
			      desc.getId());
			return editor;
		} catch (PartInitException e) {
			e.printStackTrace();
		};		
		return null;
	}
	
	/**
	 * A label provider for the list selection dialog.
	 * @author paco
	 *
	 */
	private class LabelProvider implements ILabelProvider {

		public Image getImage(Object element) {
			return null;
		}

		public String getText(Object element) {
			if ( element instanceof NamedElement ) {
				NamedElement ne = (NamedElement) element;
				KermetaUnit ku = KermetaUnitHelper.getKermetaUnitFromObject(ne);
				return ne.getName() + " coming from " + ku.getUri();
			}
			return null;
		}

		public void addListener(ILabelProviderListener listener) {
		}

		public void dispose() {
		}

		public boolean isLabelProperty(Object element, String property) {
			return false;
		}

		public void removeListener(ILabelProviderListener listener) {
		}
		
	}
	
	/**
	 * A content provider for the list selection dialog.
	 * @author paco
	 *
	 */
	private class StructuredContentProvider implements IStructuredContentProvider {

		public Object[] getElements(Object inputElement) {
			return (Object[]) inputElement;
		}

		public void dispose() {
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
		
	}
	
}


