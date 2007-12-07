/* $Id: Generator.java,v 1.7 2007-12-07 05:31:58 cfaucher Exp $
 * Project    : fr.irisa.triskell.kermeta.ket
 * File       : Generator.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 23 Jul. 2007
 * Authors : 
 *        Olivier Barais <barais@irisa.fr>
 *        Cyril Faucher <cfaucher@irisa.fr>
 * Description : 
 *   First iteration of a template engine for Kermeta
 */

package fr.irisa.triskell.kermeta.ket;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringBufferInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.filebuffers.ITextFileBufferManager;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
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
	 * List of ketffiles to compile into kmt
	 */
	private List<IFile> ketfiles;
	
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
	  * @param ketfile
	  */
	 public void generate( IFile ketfile ){
		 IJETParser p = new KetParser(nullTemplateResolver, new NullTagLibraryResolver() ,new HashMap());
		 String outputURI = ketfile.getLocation().removeFileExtension().addFileExtension("kmt").toOSString();
		 generate(ketfile, outputURI);
	 }
	 
	 /**
	  * 
	  * @param ketfile
	  */
	 public void generate( IFile ketfile, String outputURI){
		 IJETParser p = new KetParser(nullTemplateResolver, new NullTagLibraryResolver() ,new HashMap());
		 String content = "";
		 try {
			 FileInputStream stream = new FileInputStream(ketfile.getLocation().toString());
			 content = readAll(stream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JETCompilationUnit cu = (JETCompilationUnit) p.parse(content.toCharArray());
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
	 
	 private String readAll(InputStream in) { 
		    StringBuffer output = new StringBuffer();
		    try
		    {
		        int c; 
		       // int charcount = 0; int linenum = 1; int c_old = -1;
		        while ((c = in.read()) != -1) {
		            output.append((char)c);
		        }
		        in.close();
		    }
		    catch (IOException e)
		    {
		        e.printStackTrace();
		    }
		    return output.toString();
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
		for(IFile ketfile : this.ketfiles) {
			generate(ketfile);   
			try {
				ketfile.getParent().refreshLocal(IResource.DEPTH_ONE, null);
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
			ketfiles = new ArrayList<IFile>();
			// the selection should be a single *.ket file or multiple
			currentSelection = (StructuredSelection)selection;
			Iterator it = currentSelection.iterator();

			while(it.hasNext()) {
				IResource res = (IResource) it.next();
				if( res instanceof IFile ) {
					this.ketfiles.add((IFile)res);
				}
			}

		}
		
	}
}
