package fr.irisa.triskell.testdiff;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import fr.irisa.triskell.testdiff.utils.ZipUtil;

public class DOMUtils implements Constants {

	public static String indent = "";

	public static String getAttribute(Node node, String attributeName) {
		if (node instanceof Element) {
			Element e = (Element) node;
			return e.getAttribute(attributeName);
		}
		//		return "WARNING: No attribute '" + attributeName + "' found in node: " + node;
		return "";
	}

	public static List<Element> getChildElements(Node node) {
		List<Element> list = new ArrayList<Element>();
		NodeList nodeChildren =  node.getChildNodes();
		for (int i = 0; i < nodeChildren.getLength(); i++) {
			if (nodeChildren.item(i) instanceof Element) {
				list.add((Element) nodeChildren.item(i));
			}
		}
		return list;
	}

	public static List<Element> getTestcaseElements(Node node) {
		List<Element> list = new ArrayList<Element>();
		NodeList nodeChildren =  node.getChildNodes();
		for (int i = 0; i < nodeChildren.getLength(); i++) {
			if (nodeChildren.item(i) instanceof Element) {
				if (nodeChildren.item(i).getNodeName().equals(TEST))
					list.add((Element) nodeChildren.item(i));
			}
		}
		return list;
	}

	public static Document buildDocument(File file){
		Document doc = null;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			doc = builder.parse(file);
		} catch (ParserConfigurationException e) {
			// Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
		//		//DEBUG
		//		indent = "";
		//		System.out.println("Exploration of document: "+ doc);
		//		exploreTree(doc);

		return doc;
	}

	public static void exploreTree(Node node) {
		System.out.println(indent + "+--> " + node.getNodeName() +" '"+ DOMUtils.getAttribute(node, "name")+"'");
		for (int i = 0; i < node.getChildNodes().getLength(); i++) {
			indent = indent + "  ";
			exploreTree(node.getChildNodes().item(i));
			indent = indent.substring(2);
		}
	}

	/**
	 * physical saving of a DOM tree
	 * 
	 * @param documentTree the DOM tree to save
	 * @param directory  the pyhsical directory where the file would be created/saved
	 * @param xmlFileName the name of the file which will contain the DOM tree
	 */
	public static void saveXML(Document documentTree, String directory, String xmlFileName) {
		try {
			/* Checking for directory existence       	 */
			File folder = new File( directory );
			if ( ! folder.exists() )
				folder.mkdirs();

			// set source and output stream of transformation (DOM -> XML)
			Source source = new DOMSource(documentTree);
			File xmlFile = new File(directory + System.getProperty("file.separator")+xmlFileName);

			StreamResult stream = new StreamResult(xmlFile);

			// set the transformation tool
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");

			// do the transformation
			transformer.transform(source, stream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Load a DOM tree from a zipped XML file.<P>
	 * The zipped archive must embedded an unique file.
	 * 
	 * @param fullDirectoryPath  the physical directory where the file would be found
	 * @param xmlFileName the name of the file which will contain the DOM tree
	 * @throws IOException 
	 */
	public static Document loadZippedXML(String fullDirectoryPath, String xmlFileName) throws IOException {
		File file = ZipUtil.unzipFile(fullDirectoryPath, xmlFileName);
		
		return buildDocument(file);
	}

	public static HashSet<Node> buildMultiFilesDOMTree(String pattern, String directory) throws Exception {

		HashSet<Node> tree = new HashSet<Node>();
		boolean foundFiles = false;

		// we get the list of files corresponding to the pattern in the directory
		File dir = new File(directory);
		File[] files = dir.listFiles();
		if(files == null){
			System.out.println("Error : No file in directory : " + dir.toString());
			return null;
		}
		for (int i = 0; i < files.length; i++) {
			if (files[i].getName().matches(pattern)){
				// NB : each file is ONE testSuite result
				tree.add(DOMUtils.buildDocument(files[i]).getFirstChild());
				foundFiles = true;
			}
		}
		if(!foundFiles) 
			System.out.println("Error : No matching file in directory : " + dir.toString());
		return tree;
	}
}
