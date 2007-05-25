/*
 * Created on 4 f�vr. 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
package fr.irisa.triskell.sintaks.parser;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.irisa.triskell.sintaks.lexer.ILexer;
import fr.irisa.triskell.sintaks.lexer.Lexer;
import fr.irisa.triskell.sintaks.SintaksPlugin;
import fr.irisa.triskell.sintaks.subject.ModelSubject;

import sts.Rule;
import sts.Terminal;


public class ModelParser {

    private MetaModelParser mmParser;
    private ModelSubject subject;
    
    
    /**
     * @param mmParser
     * @param subject
     */
    public ModelParser (MetaModelParser mmParser, ModelSubject subject) {
        this.mmParser = mmParser;
        this.subject = subject;
    }

    
    //////////////////////////////
    //////////////////////////////
    //		Lexer Mechanism		//
    //////////////////////////////
    //////////////////////////////
    
    private ILexer getLexer(Reader reader, String ruleFile) {
		URI fileURI = URI.createURI(ruleFile);
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(fileURI, true);

		List<String> terminals = new ArrayList<String>();
		List<String> separators = new ArrayList<String>();
		TreeIterator i = res.getAllContents();
		while (i.hasNext()) {
			Object o = i.next();
			if (o instanceof Terminal) {
				Terminal terminal = (Terminal) o;
				terminals.add(terminal.getTerminal());
				if (terminal.isLexicalSeparator())
					separators.add(terminal.getTerminal());
			}
		}
		ILexer lexer = new Lexer(reader, terminals, separators);

		return lexer;
	}

	/**
	 * @param inputFile
	 * @return
	 */
	private ILexer getLexer(String text, String ruleFile) {
		Reader r = new BufferedReader(new StringReader(text), text.length());
		return getLexer(r, ruleFile);
	}
    
    /**
	 * @param inputFile
	 * @return
	 */
    private ILexer getLexer (IFile inputFile, String ruleFile) {
        try {
            //String fullName = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + "/" + inputFile.getFullPath().toString();
        	String fullName = inputFile.getLocation().toString();
        	File f = new File(fullName);
            Reader r = new BufferedReader(new FileReader(fullName), (int) f.length());
            return getLexer(r, ruleFile);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    //////////////////////////////////////
    //////////////////////////////////////
    //		End of Lexer Mechanism		//
    //////////////////////////////////////
    //////////////////////////////////////

    


    
    //////////////////////////////////
    //////////////////////////////////
    //		Parsing Mechanism		//
    //////////////////////////////////
    //////////////////////////////////

    private IParser getParser(String ruleFile) {
        Rule startSymbol = mmParser.getStartSymbol(ruleFile);
        if (SintaksPlugin.getDefault().getOptionManager().isDebugProcess()) {
        	SintaksPlugin.getDefault().debug ("startSymbol=");
        	SintaksPlugin.getDefault().debug (startSymbol.toString());
        	SintaksPlugin.getDefault().debugln ("");
        }
        return new ParserAbstract (startSymbol, subject);
    }
    
    private boolean basicParse(IParser parser, ILexer lexer) {
        boolean r1 = false;
        boolean r2 = false;
        if (parser != null && lexer != null) {
            lexer.begin();
            try {
                r1 = parser.parse(lexer);
            }
            catch (ParserSemanticException e) {
                e.printStackTrace();
            }
            r2 = lexer.atEnd();
            StringBuffer tmp = new StringBuffer ();
            tmp.append("State\tParser=");
            tmp.append(r1 ? "atend" : "failed");
            tmp.append("\tLexer=");
            tmp.append(r2 ? "atend" : "pending character(s)");
            tmp.append("\r\n");
            tmp.append("Acceptable : ");
            tmp.append((r1 & r2) ? "true" : "false");
            SintaksPlugin.getDefault().debugln (tmp.toString());
        }
        lexer.close();
        
        return r1 & r2;
    }
    
    /**
     * @param ruleFile
     * @param inputFile
     * @return
     */
    public boolean parse (String ruleFile, String text) {
        IParser parser = getParser(ruleFile);
        ILexer lexer = getLexer(text, ruleFile);
        return basicParse(parser, lexer);
    }
    
    /**
     * @param ruleFile
     * @param inputFile
     * @return
     */
    public boolean parse (String ruleFile, IFile inputFile) {
        IParser parser = getParser(ruleFile);
        ILexer lexer = getLexer(inputFile, ruleFile);
        return basicParse(parser, lexer);
    }
    //////////////////////////////////////
    //////////////////////////////////////
    //		End Parsing Mechanism		//
    //////////////////////////////////////
    //////////////////////////////////////

}
