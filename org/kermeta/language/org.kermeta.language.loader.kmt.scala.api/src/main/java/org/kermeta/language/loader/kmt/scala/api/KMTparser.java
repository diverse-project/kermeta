package org.kermeta.language.loader.kmt.scala.api;

import java.net.URL;

import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public interface KMTparser {
	
	public final static String LOG_MESSAGE_GROUP = "org.kermeta.language.loader.kmt.scala";
	public ModelingUnit load(URL uri, String optionalContent, MessagingSystem logger);

}
