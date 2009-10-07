package fr.irisa.triskell.testdiff;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/** 
 * DOM2HTML
 * @author vmahe@irisa.fr
 * 
 * Transform a Diff Result DOM tree into an HTML file
 */
public class Diff2HTML implements Constants {

	private StringBuffer buffer;
	
	private void processResult(Document document) {
		buffer = new StringBuffer();
		// generate the HTML document
		processHead(document.getDocumentElement());
		processRoot(document.getDocumentElement());
		processEnd();
	}
	
	private void processHead(Element rootElement) {
		// some keywords for automated processing of Diff
		String keywords = "";
		if (rootElement.getAttribute(ATTR_ADDED_SUITES_NUM).equals("0")
				|| rootElement.getAttribute(ATTR_REMOVED_SUITES_NUM).equals("0")
				|| rootElement.getAttribute(ATTR_REGRESSIONS_NUM).equals("0"))
			keywords = keywords + " ZERO_CHANGE";
		
		if (!rootElement.getAttribute(ATTR_ADDED_SUITES_NUM).equals("0"))
			keywords = keywords + " SOME_ADDED_SUITES";
		
		if (!rootElement.getAttribute(ATTR_REMOVED_SUITES_NUM).equals("0"))
			keywords = keywords + " SOME_REMOVED_SUITES";
		
		if (!rootElement.getAttribute(ATTR_REGRESSIONS_NUM).equals("0"))
			keywords = keywords + " SOME_REGRESSIONS";
		
		String head = "<HTML>\n" +
			"<HEAD>\n" +
			"<TITLE>\n" +
			"Results Differences: "+ rootElement.getAttribute(ATTR_CLASS_NAME) +
			"</TITLE>\n" +
			"<META name=\"keywords\" content=\""+ keywords + "\">" +
			"</HEAD>\n" +
			"<BODY>\n";
		
		buffer.append(head);
	}
	
	private void processRoot(Element element) {
		// specific generation for tree root ("All" test)
		String rootTitle = "<H1>"+ 
			element.getAttribute(ATTR_NAME) +
			"</H1>\n";
		buffer.append(rootTitle);
		buffer.append(element.getAttribute(ATTR_DIFF_DATE));
		String rootAttributes = "<BR>Differences between:\n" +
			"<BR> - Old test suites results dir: <B><I>"+ element.getAttribute(ATTR_OLD_DIR)+"</I></B>\n" +
			"<BR> - Current test suites results dir: <B><I>"+ element.getAttribute(ATTR_CURRENT_DIR)+"</I></B>\n<P>\n";
		buffer.append(rootAttributes);
		
		// some figures about results
		String results = "<TABLE cellspacing=\"0\" cellpadding=\"15\" border=\"2\">\n" +
			"<TR><TD>Number of tests</TD><TD>" + element.getAttribute(ATTR_TESTS_NUM) + "</TD></TR>" +
			"<TR><TD><FONT COLOR=\"green\">Number of enhancements</FONT></TD>" +
				"<TD><FONT COLOR=\"green\">" + element.getAttribute(ATTR_ENHANCEMENT_NUM) + "</FONT></TD></TR>" +
			"<TR><TD><FONT COLOR=\"blue\">Number of added tests</FONT></TD>" +
				"<TD><FONT COLOR=\"blue\">" + element.getAttribute(ATTR_ADDED_SUITES_NUM) + "</FONT></TD></TR>" +
			"<TR><TD><FONT COLOR=\"orange\">Number of removed tests</FONT></TD>" +
				"<TD><FONT COLOR=\"orange\">" + element.getAttribute(ATTR_REMOVED_SUITES_NUM) + "</FONT></TD></TR>" +
			"<TR><TD><FONT COLOR=\"red\">Number of regressions</FONT></TD>" +
				"<TD><FONT COLOR=\"red\">" + element.getAttribute(ATTR_REGRESSIONS_NUM) + "</FONT></TD></TR>" +
			"</TABLE>";
		buffer.append(results);
		
		// regression alert
		String regressionStatus = "<H2><FONT color=\"red\">" + element.getAttribute(ATTR_REGRESSION_STATUS) + "</FONT></H2>";
		buffer.append(regressionStatus);
		
		// we present tests in sub lists
		String testSuitesListBegin = "<H3>Test suites</H3>\n"+
									"<UL>\n";
		buffer.append(testSuitesListBegin);
		
		List<Element> list = DOMUtils.getChildElements(element);
		for (int i = 0; i < list.size(); i++) {
			String listItemBegin = "<LI>\n";
			buffer.append(listItemBegin);
			
			// sub nodes
			processSuite((Element)element.getChildNodes().item(i));
			
			String listItemEnd = "</LI>\n";
			buffer.append(listItemEnd);
		}
		String testSuitesListEnd = "</UL>\n";
		buffer.append(testSuitesListEnd);
	}

	
	private void processSuite(Element element) {
		// we are in a list
		//buffer.append("<UL>");
		
		String suiteTitle = "<B>"+getChangedFormatBegin(element)+ element.getAttribute(ATTR_NAME)+ getChangedFormatEnd(element) +" </B>\n";
		buffer.append(suiteTitle);
		
		buffer.append(" --> "+ getChangedText(element));
		
		// it is a TestSuite so we need to process its testcases
		String listBegin = "<P><TABLE cellspacing=\"0\" cellpadding=\"5\" border=\"2\">\n";
		buffer.append(listBegin);
			
		List<Element> list = DOMUtils.getChildElements(element);
		for (int i = 0; i < list.size(); i++) {
			processTestcase(list.get(i));
		}
		String listEnd = "</TABLE>\n";
		buffer.append(listEnd);
		
		// we are in a list
		//buffer.append("</UL>\n");
	}
	
	private void processEnd() {
		String end = "</BODY>";
		
		buffer.append(end);
	}
	
	private void processTestcase(Element element) {
		// we are in a list
		buffer.append("<TR>\n");
		buffer.append("<TD>\n");
		String testcaseTitle = getChangedFormatBegin(element)+ element.getAttribute(ATTR_NAME)+ getChangedFormatEnd(element) +" \n";
		buffer.append(testcaseTitle);
		
		buffer.append("</TD>\n<TD>\n"+ getChangedText(element));
		
		//String caseAttributes = " - old result = " +getStatusText(element.getAttribute(ATTR_OLD_STATUS)) +
		//						" // current result = " +getStatusText(element.getAttribute(ATTR_CURRENT_STATUS));
		//buffer.append(caseAttributes);
		buffer.append("</TD>\n<TD>\n"+ getStatusText(element.getAttribute(ATTR_OLD_STATUS)));
		buffer.append("</TD>\n<TD>\n"+ getStatusText(element.getAttribute(ATTR_CURRENT_STATUS)));
		// we are in a list
		buffer.append("</TR>\n");
	}
	
	private String getStatusText(String status) {
		//TODO : obsolet => should use CSS styles
		if (status.equals(ATTR_STATUS_PASSED)) {
			return "<FONT COLOR=\"green\">PASSED</FONT>";
		} else
			if (status.equals(ATTR_STATUS_FAILURE)) {
				return "<FONT COLOR=\"orange\"><B>FAILED</B></FONT>";
			} else
				if (status.equals(ATTR_STATUS_ERROR)) {
					return "<FONT COLOR=\"red\"><B>ERROR</B></FONT>";
				} else
					if (status.equals(ATTR_STATUS_IGNORED)) {
						return "<FONT COLOR=\"grey\">IGNORED</FONT>";
					} else {
						return "<FONT COLOR=\"black\"><I>unknown</I></FONT>";
					}
	}
	
	private String getChangedFormatBegin(Element element) {
		String changed = element.getAttribute(ATTR_CHANGE);
		if (changed.equals(ATTR_CHANGE_UNCHANGED)) {
			return "";
		} else if (changed.equals(ATTR_CHANGE_ADDED)) {
			return "<FONT COLOR=\"blue\"><B>";
		} else {	// removed
			return "<FONT COLOR=\"brown\"><DEL>";
		}
	}
	
	private String getChangedText(Element element) {
		String changed = element.getAttribute(ATTR_CHANGE);
		if (changed.equals(ATTR_CHANGE_UNCHANGED)) {
			return "&nbsp;";
		} else if (changed.equals(ATTR_CHANGE_ADDED)) {
			return "<B> ADDED</B>";
		} else {
			return "<I> REMOVED</I>";
		}
	}
	
	private String getChangedFormatEnd(Element element) {
		String changed = element.getAttribute(ATTR_CHANGE);
		if (changed.equals(ATTR_CHANGE_UNCHANGED)) {
			return "";
		} else if (changed.equals(ATTR_CHANGE_ADDED)) {
			return "</B></FONT>";
		} else {	// removed
			return "</DEL></FONT>";
		}
	}
	
	public void result2HTML(Document result, String directory, String htmlFile) {
		processResult(result);
		try {
			FileWriter writer = new FileWriter(directory + System.getProperty("file.separator")+htmlFile);
			writer.write(buffer.toString());
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
