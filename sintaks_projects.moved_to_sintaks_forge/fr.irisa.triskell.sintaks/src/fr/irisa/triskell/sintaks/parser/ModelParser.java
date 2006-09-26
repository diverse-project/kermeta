/*
 * Created on 4 févr. 2006
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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.irisa.triskell.sintaks.lexer.ILexer;
import fr.irisa.triskell.sintaks.lexer.Lexer;
import fr.irisa.triskell.sintaks.subject.ModelSubject;

import sts.Rule;


public class ModelParser {

    private MetaModelParser mmParser;
    private ModelSubject subject;
    
    static public boolean debugParser = false;
    
    
    /**
     * @param mmParser
     * @param subject
     */
    public ModelParser (MetaModelParser mmParser, ModelSubject subject) {
        this.mmParser = mmParser;
        this.subject = subject;
    }

    
    /**
     * @param inputFile
     * @return
     */
    private ILexer getLexer (IFile inputFile, IFile ruleFile) {
        try {
            String fullName = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + "/" + inputFile.getFullPath().toString();
        	File f = new File(fullName);
            Reader r = new BufferedReader(new FileReader(fullName), (int) f.length());
            
            URI fileURI = URI.createURI("platform:/resource" + ruleFile.getFullPath().toString());
    		ResourceSet rs = new ResourceSetImpl();
            ILexer lexer = new Lexer (r, rs.getResource(fileURI, true));
            
            return lexer;
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    
    /**
     * @param ruleFile
     * @param inputFile
     * @return
     */
    public boolean parse (IFile ruleFile, IFile inputFile) {
        Rule startSymbol = mmParser.getStartSymbol(ruleFile);
        if (debugParser) {
            System.out.print ("startSymbol=");
            System.out.print (startSymbol);
            System.out.println ();
        }
        
        IParser parser = new ParserAbstract (startSymbol, subject);
        ILexer lexer = getLexer(inputFile, ruleFile);

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
            System.out.print ("State");
            System.out.print ("\t");
            System.out.print ("Parser=");
            System.out.print (r1 ? "atend" : "failed");
            System.out.print ("\t");
            System.out.print ("Lexer=");
            System.out.print (r2 ? "atend" : "pending character(s)");
            System.out.println ();
            System.out.print ("Acceptable : ");
            System.out.println (r1 & r2);
        }
        lexer.close();
        
        return r1 & r2;
    }
}
