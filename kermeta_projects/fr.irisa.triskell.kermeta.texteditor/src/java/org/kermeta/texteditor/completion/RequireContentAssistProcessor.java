

/*$Id: RequireContentAssistProcessor.java,v 1.3 2008-06-13 08:39:59 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.texteditor
* File : 	TagContentAssistProcessor.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 22 nov. 07
* Authors : paco
*/

package org.kermeta.texteditor.completion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Image;

import fr.irisa.triskell.kermeta.texteditor.icons.KermetaSpecialIcons;
import fr.irisa.triskell.kermeta.texteditor.icons.blue.KermetaIconsBlue;

public class RequireContentAssistProcessor implements IContentAssistProcessor {
	
	private IFile file;
	
	public RequireContentAssistProcessor(IFile file) {
		this.file = file;
	}
	
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {

		List<ICompletionProposal> proposals = new ArrayList<ICompletionProposal> ();
		try {
			String startString = "";
			int index = 1;
			while ( ! Character.isWhitespace(viewer.getDocument().getChar(offset - index) ) ) {
				startString = viewer.getDocument().getChar(offset - index) + startString;
				index++;
			}
				
			int replacementLength = 0;
			while (!(viewer.getDocument().getChar(offset + replacementLength) == '\n' ||
					viewer.getDocument().getChar(offset + replacementLength) == '\r' ))
				replacementLength++;
				
			replacementLength = index -1 + replacementLength;
			
			if ( "\"platform:/lookup".matches( startString + ".*") )
				proposals.add( new CompletionProposal("\"platform:/lookup/", offset - index+1, replacementLength, "\"platform:/lookup/".length()));

			if ( "\"platform:/resource".matches( startString + ".*") )
				proposals.add( new CompletionProposal("\"platform:/resource/", offset - index+1, replacementLength, "\"platform:/resource/".length()));

			if ( "\"platform:/plugin".matches( startString + ".*") )
				proposals.add( new CompletionProposal("\"platform:/plugin/", offset - index+1, replacementLength, "\"platform:/plugin/".length()));
			
			List<ICompletionProposal> packagesProposals = new ArrayList<ICompletionProposal>();
			List<String> packages = getPackagesMatching(startString);
			for ( String s : packages ) {
				int cursorPosition = s.length();
				Image image = KermetaIconsBlue.PACKAGE;
				packagesProposals.add( new CompletionProposal(s, offset - index+1, replacementLength, cursorPosition, image, null, null, null ) );
			}
			
			Collections.sort( packagesProposals, completionProposalComparator );
			proposals.addAll(packagesProposals);
						
			List<ResourceCompletionItem> resources = getResourcesMatching(startString);
			for ( ResourceCompletionItem item : resources ) {
				int cursorPosition = item.getReplacementString().length();
				proposals.add( new CompletionProposal(item.getReplacementString(), offset - index+1, replacementLength, cursorPosition, item.getImage(), item.getDisplayString(), null, null ) );
			}
			
		} catch (BadLocationException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
				
		ICompletionProposal[] proposalsArray = new ICompletionProposal[proposals.size()];
		proposals.toArray(proposalsArray);
		return proposalsArray;
	}
	
	static private final Comparator<ICompletionProposal> completionProposalComparator = new Comparator<ICompletionProposal>() {
	     public int compare(ICompletionProposal o1, ICompletionProposal o2) {
	         String s1 = o1.getDisplayString();
	         String s2 = o2.getDisplayString();
	         return s1.compareTo(s2);
	     }
	 };
	
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		return null;
	}

	public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] { ':', ' ' };
	}

	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}

	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}

	public String getErrorMessage() {
		return null;
	}

	private List<String> getPackagesMatching(String s) {
		List<String> result = new ArrayList<String>();
		for ( String key : Registry.INSTANCE.keySet() ) {
			String regex = s + ".+";
			if ( ("\"" + key).matches(regex) )
				result.add( "\"" + key + "\"" );
		}
		return result;
	}
	
	private List<ResourceCompletionItem> getResourcesMatching(String s) throws CoreException {
		List<ResourceCompletionItem> l = new ArrayList<ResourceCompletionItem>();
		String cleanS = s.replaceFirst("\"", "");
		cleanS = cleanS.replace("platform:/resource", "");
		String stringToMatch = cleanS;
		
		IContainer container = ResourcesPlugin.getWorkspace().getRoot();
		stringToMatch = getStringToMatch(stringToMatch);
		
		ResourceVisitor v = new ResourceVisitor(stringToMatch);
		container.accept(v);
		for ( IResource r : v.getResources() )
			l.add( new ResourceCompletionItem(r) );
		return l;
	}
	
	
	private String getStringToMatch(String s) {
		String stringToMatch = "";
		if ( s.startsWith("..") ) {
			String[] splits = s.split("\\.\\.");
			int i=1;
			while ( splits[i].equals("") )
				i++;
			IContainer container = file.getParent();
			for ( int j=0; j<i; j++ )
				container = container.getParent();
			stringToMatch = container.getFullPath().toString();
			for ( int j=i; j<splits.length; j++ )
				stringToMatch += splits[j];
		} else if ( s.startsWith("/") ) {
			return s;
		}
		return stringToMatch;
	}
	
	private class ResourceCompletionItem {
		private IResource resource;
		
		public ResourceCompletionItem(IResource resource) {
			this.resource = resource;
		}
		
		public String getReplacementString() {
			if ( resource instanceof IFile )
				return "\"platform:/resource" + resource.getFullPath().toString() + "\"";
			else
				return "\"platform:/resource" + resource.getFullPath().toString() + "/";
		}
		
		public String getDisplayString() {
			return resource.getName();
		}
		
		public Image getImage() {
			if ( resource instanceof IFolder )
				return KermetaSpecialIcons.FOLDER;
			else if ( resource instanceof IFile )
				return KermetaSpecialIcons.FILE;
			else if ( resource instanceof IProject )
				return KermetaSpecialIcons.FOLDER;
			return null;
		}
	}
	
	private class ResourceVisitor implements IResourceVisitor {
		
		private List<IResource> resources = new ArrayList<IResource>();
		
		private Stack<String> stack = new Stack<String>();
		
		public List<IResource> getResources() {
			return resources;
		}
		
		public ResourceVisitor(String s) {
			String stringToMatch = s.replaceAll("\\.", "\\\\.").replaceFirst("/", "");
			String[] splits = stringToMatch.split("/");
			for ( int i=0; i < splits.length; i++ )
					stack.push(splits[i]);
			if ( ! stringToMatch.equals("") )
				if ( stringToMatch.charAt(stringToMatch.length()-1) == '/' )
					stack.add("");
		}
		
		private String getString(int deep) {
			if ( deep > stack.size() )
				return null;
			return stack.get(deep-1);
		}
		
		public boolean visit(IResource resource) throws CoreException {
			boolean continueVisit = false;
			int size;
			String regex = "";
			String s = "";
			switch (resource.getType()) {
			case IResource.ROOT:
				continueVisit = true;
				break;
			case IResource.PROJECT:
				size = resource.getFullPath().segments().length;
				s = getString(size);
				if ( s != null ) {
					regex = s + ".*";
					if ( resource.getName().matches(regex) ) {
						if ( size == stack.size() )
							resources.add( resource );
						continueVisit = true;
					}
				}		
				break;
			case IResource.FOLDER:
				size = resource.getFullPath().segments().length;
				s = getString(size);
				if ( s != null ) {
					regex = s + ".*";
					if ( resource.getName().matches(regex) ) {
						if ( size == stack.size() )
							resources.add( resource );
						continueVisit = true;
					}
				}	
				break;
			case IResource.FILE:
				s = getString(resource.getFullPath().segments().length);
				if ( s != null ) {
					regex = s + ".*";
					if ( resource.getName().matches(regex) ) {
						resources.add( resource );
						continueVisit = true;
					}
				}
				break;
			}

			return continueVisit;
		}
	}

}


