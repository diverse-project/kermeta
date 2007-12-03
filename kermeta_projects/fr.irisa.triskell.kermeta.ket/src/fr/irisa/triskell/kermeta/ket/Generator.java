/* $Id: Generator.java,v 1.4 2007-12-03 13:44:22 cfaucher Exp $
 * Project    : fr.irisa.triskell.kermeta.ket
 * File       : Generator.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 23 Jul. 2007
 * Authors : 
 *        Olivier Barais <barais@irisa.fr>
 * Description : 
 *   First iteration of a template engine for Kermeta
 */

package fr.irisa.triskell.kermeta.ket;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.filebuffers.FileBuffers;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jet.core.parser.IJETParser;
import org.eclipse.jet.core.parser.ITagLibraryResolver;
import org.eclipse.jet.core.parser.ITemplateInput;
import org.eclipse.jet.core.parser.ITemplateResolver;
import org.eclipse.jet.core.parser.RecursiveIncludeException;
import org.eclipse.jet.core.parser.ast.JETCompilationUnit;
import org.eclipse.jet.taglib.TagLibrary;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import fr.irisa.triskell.kermeta.ket.builder.Visitor;
import fr.irisa.triskell.kermeta.ket.parser.KetParser;
import fr.irisa.triskell.kermeta.ket.parser.KetTagLibrary;

public class Generator implements IObjectActionDelegate{

	/**
	 * Current selection of files
	 */
	private StructuredSelection currentSelection;
	
	/**
	 * List of kmttffiles to compile into kmt
	 */
	private List<IFile> kmttfiles;
	
	private  final class NullTagLibraryResolver implements
			ITagLibraryResolver {

		public TagLibrary getLibrary(String tagLibraryID) {
			return new KetTagLibrary();
		}
	}

	private  final ITemplateResolver nullTemplateResolver = new ITemplateResolver() {

		public URI[] getBaseLocations() {
			URI nullURI;
			try {
				nullURI = new URI(""); //$NON-NLS-1$
				return new URI[] { nullURI };
			} catch (URISyntaxException e) {
				throw new RuntimeException(e);
			}
		}

		public ITemplateInput getIncludedInput(String templatePath,
				ITemplateInput[] activeInputs) throws RecursiveIncludeException {
			return null;
		}

		public ITemplateInput getInput(String templatePath) {
			return null;
		}

	};


	 public Generator(){
	 }
	 
	 /**
	  * 
	  * @param kmttfile
	  */
	 public void generate( IFile kmttfile ){
		 IJETParser p = new KetParser(nullTemplateResolver, new NullTagLibraryResolver() ,new HashMap());
		 String outputURI = kmttfile.getLocation().removeFileExtension().addFileExtension("kmt").toOSString();
		 try {
			FileBuffers.getTextFileBufferManager().connect(kmttfile.getLocation(),null);
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 String s = FileBuffers.getTextFileBufferManager().getTextFileBuffer(kmttfile.getLocation()).getDocument().get();
		 
			 JETCompilationUnit cu = (JETCompilationUnit) p.parse(s.toCharArray());
			// 
			 PrintWriter fo=null;
			File f = new File(outputURI);
			 try {
				fo = new PrintWriter( f);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			 Visitor v =new Visitor(fo); 
			 cu.accept(v);
			 fo.flush();
			 fo.close();
			 
	 }

	/**
	 * 
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 */
	public void run(IAction action) {
		Shell shell = new Shell();
		for(IFile kmttfile : this.kmttfiles) {
			generate(kmttfile);   
			try {
				kmttfile.getParent().refreshLocal(IResource.DEPTH_ONE, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * 
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection)
		{
			kmttfiles = new ArrayList<IFile>();
			// the selection should be a single *.kmtt file or multiple
			currentSelection = (StructuredSelection)selection;
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				IResource res = (IResource) it.next();
				if( res instanceof IFile ) {
					this.kmttfiles.add((IFile)res);
				}
			}

		}
		
	}
}
