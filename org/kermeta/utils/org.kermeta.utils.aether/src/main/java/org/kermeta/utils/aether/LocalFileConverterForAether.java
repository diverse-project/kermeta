/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 26 sept. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.aether;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

import org.kermeta.utils.aether.AetherUtil;
import org.kermeta.utils.helpers.LocalFileConverter;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class LocalFileConverterForAether extends LocalFileConverter {

	protected MessagingSystem logger;
	protected String baseMsgGroup;
	protected java.util.List<String> repositoriesUrl;
	
	public LocalFileConverterForAether(MessagingSystem messagingSystem , String baseMsgGroup, java.util.List<String> repositoriesUrl){
		this.baseMsgGroup = baseMsgGroup;
		this.logger = messagingSystem;
		this.repositoriesUrl = repositoriesUrl;
	}
	public LocalFileConverterForAether(MessagingSystem messagingSystem , String baseMsgGroup, String repositoryUrl){
		this.baseMsgGroup = baseMsgGroup;
		this.logger = messagingSystem;
		this.repositoriesUrl = Arrays.asList(repositoryUrl);
	}
	
	@Override
	public java.net.URI convertSpecialURItoFileURI(java.net.URI javaUri) {
		try {
			URL javaUrl = javaUri.toURL();
			if(javaUrl.getProtocol().equals("file")){
				// already a file, nothing to do
				return javaUri;
			}
			if(javaUrl.getProtocol().equals("mvn")){
				AetherUtil aetherUtil = new AetherUtil(logger,baseMsgGroup);
				File theFile = aetherUtil.resolveMavenArtifact4J(javaUrl.toString(), repositoriesUrl);
				if(theFile.exists())
					return java.net.URI.create("file://"+theFile.getAbsolutePath());
			}
			
			
		} catch (MalformedURLException e) {
			return null;
		}
		
		return null;
	}

}
