/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.api.kevent;

/**
 * Represent the event fired when a document has chaged on the filesystem 
 * @author ffouquet
 */
public class KDocumentUpdate extends KEvent {

	/**
	 * The content of the document
	 */
    private String document = "";

    /**
     * getter
     * @return the content of the document
     */
    public String getDocument() {
        return document;
    }

    /**
     * setter
     * @param document the new content of the document
     */
    public void setDocument(String document) {
        this.document = document;
    }



}
