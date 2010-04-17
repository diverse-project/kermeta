package org.kermeta.language.filegraph.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;

import fr.irisa.triskell.eclipse.ecore.EcoreHelper;
import fr.irisa.triskell.eclipse.emf.EMFRegistryHelper;


public class UriResolver {

	public static String resolveUri(String fileUri, String rootFileURI){
		String s = fileUri;
		String resultUri = null;
		try {
			String uri;
			if (s.matches("http.+"))
				uri = s;
			else {
				String cleanedRequire = cleanRequireValue(s);
				if (cleanedRequire.equals("kermeta")
						|| cleanedRequire.equals("java_rt_jar")) {
					uri = cleanedRequire;
				} else if (cleanedRequire.endsWith("/")
						|| cleanedRequire.endsWith("\\")) {
					// this is probably a malformed URI or a registered URI
					uri = cleanedRequire;
				} else if (cleanedRequire.endsWith(":")) {

					uri = cleanedRequire;
					if (!EMFRegistryHelper.isRegistered(uri))
						/*
						 * throw new IOException("The file " + uri +
						 * " does not exist.");
						 */
						return null;

				} else if (cleanedRequire.contains(":")) {

					uri = cleanedRequire;
					// if(! EMFRegistryHelper.isRegistered(uri) )
					// throw new IOException("The file " + uri +
					// " does not exist.");

				} else {
					/*
					 * Take care about relative path.
					 */
					if (!cleanedRequire.startsWith("platform:\\\\/")
							&& !cleanedRequire.startsWith("file:")&& !cleanedRequire.startsWith("/")) {
						int index = rootFileURI.lastIndexOf("/");
						String path = rootFileURI.substring(0, index);
						uri = path + "/" + cleanedRequire;
					} else
						uri = cleanedRequire;
				}
			}

			URI emfURI = URI.createURI(uri);
			emfURI = EcoreHelper.getCanonicalURI(emfURI);
			uri = emfURI.toString();

			/*
			 * Checking if the required file exists. or is registered
			 */

			if (!EMFRegistryHelper.isRegistered(uri)) {
				URIConverter converter = new ExtensibleURIConverterImpl();
				if (uri.startsWith("platform:/")) {
					if (uri.startsWith("platform:/lookup/")) {
						// search in resource first, if not found, search in
						// plugin
						// DVK: a better version would be to take into account
						// the global context,
						// and not search in the user workspace if we are
						// running a file from a plugin
						// unfortunately this is impossible now, unless we
						// correctly separate the interpreter context between
						// executions
						// try in workspace
						String newUri = uri.replaceAll("platform:/lookup/",
								"platform:/resource/");
						emfURI = URI.createURI(newUri);
						emfURI = EcoreHelper.getCanonicalURI(emfURI);
						if (!converter.exists(emfURI, null)) {
							newUri = uri.replaceAll("platform:/lookup/",
									"platform:/plugin/");
							emfURI = URI.createURI(newUri);
							emfURI = EcoreHelper.getCanonicalURI(emfURI);
							if (!converter.exists(emfURI, null)) {
								/*
								 * throw new IOException( "The file " + uri +
								 * " does not exist. \n(neither in resource, nor in plugin)"
								 * );
								 */
								return null;
							}
						}
						// ok no exception, completly switch to the new uri
						uri = newUri;
					} else if (!converter.exists(emfURI, null)){
						/*
						 * throw new IOException("The file " + uri +
						 * " does not exist.");
						 */
						return null;
					}
					else{
						resultUri = uri;
					}
				} else if (!uri.equals("kermeta") && !uri.equals("java_rt_jar"))
					/*
					 * throw new IOException("The file " + uri +
					 * " does not exist.");
					 * 
					 */
					
					if (converter.exists(emfURI, null)){
						 resultUri = uri;
					 }
			}

			/*
			 * If no error, then we can create a link between the require and
			 * the kermeta unit to import.
			 */

			resultUri = uri;

			} catch (Throwable t) {
			return null;
			// t.printStackTrace();
		}
		return resultUri;
	}
	
	private static String cleanRequireValue(String value) {
		String cleanedRequire = value.replaceAll("\"", "");
		if (cleanedRequire.startsWith("./"))
			cleanedRequire = cleanedRequire.substring(2, cleanedRequire
					.length());
		return cleanedRequire;
	}

	
}
