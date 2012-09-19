/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 27 juil. 2012
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.texteditor.eclipse.internal.outline;

import java.util.ArrayList;
import java.util.List;

import org.kermeta.language.structure.KermetaModelElement;
import org.kermeta.language.structure.Tag;

public class ItemLocalisation {
	public enum LocalisationType {
		Local,
		External,
		Mixed
	}
	
	
	
	public LocalisationType localisationType = LocalisationType.External;
	protected FileHighlight localHighlight = null;
	protected List<FileHighlight> extHighlight = new ArrayList<FileHighlight>();
	
	public ItemLocalisation(String localFile, KermetaModelElement elem){
			
		boolean localFound = false;
		boolean externalFound = false;
		for(Tag tag : elem.getKOwnedTags()){
			if(tag.getName().equals("traceability_text_reference")){
				if(tag.getValue().contains(localFile)){
					localFound = true;
					localHighlight = new FileHighlight(tag.getValue());
				}
				else{
					externalFound = true;
					extHighlight.add(new FileHighlight(tag.getValue()));
				}
			}
			if(tag.getName().equals("ecore")){
				if(!localFile.endsWith(".ecore")){
					externalFound = true;
				}
			}
		}
		if(localFound && externalFound) localisationType = LocalisationType.Mixed;
		else if(localFound) localisationType = LocalisationType.Local;
		else localisationType = LocalisationType.External;
	}
	
	public class FileHighlight{		
		/**
		 * @param fileName
		 * @param offset
		 * @param length
		 */
		public FileHighlight(String fileName, int offset, int length) {
			super();
			this.fileName = fileName;
			this.offset = offset;
			this.length = length;
		}
		public FileHighlight(String traceability_text_reference){
			//file:/usr/local/jenkins/jenkins_kermeta/data/jobs/K2_org.kermeta.language.library.core/workspace/org.kermeta.language.library.core/src/main/kmt/org/kermeta/language/structure/aspects.kmt;14;236
			String[] chunks  = traceability_text_reference.split(";");
			fileName = chunks[0];
			offset = Integer.parseInt(chunks[1]);
			length = Integer.parseInt(chunks[2]);
		}
		public String fileName;
		public int offset;
		public int length;
	}
}
