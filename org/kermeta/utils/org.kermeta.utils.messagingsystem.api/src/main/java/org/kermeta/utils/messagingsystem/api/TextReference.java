/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 14 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.messagingsystem.api;

import java.net.URL;

public class TextReference extends org.kermeta.utils.messagingsystem.api.FileReference {
	protected Integer beginOffset;
	protected Integer endOffset;
	
		
	public TextReference(URL fileURL, Integer beginOffset, Integer endOffset) {
		super(fileURL);
		this.beginOffset = beginOffset;
		this.endOffset = endOffset;
	}
	
	// getters and setters
	public Integer getBeginOffset() {
		return beginOffset;
	}
	public void setBeginOffset(Integer beginOffset) {
		this.beginOffset = beginOffset;
	}
	public Integer getEndOffset() {
		return endOffset;
	}
	public void setEndOffset(Integer endOffset) {
		this.endOffset = endOffset;
	}
	
	
}
