/* $Id: KermetaScanner.java 13570 2010-11-22 16:17:02Z hrambelo $
 * Project    : org.kermeta.language.texteditor.eclipse
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 *           Francois Fouquet 
 */
package org.kermeta.language.texteditor.eclipse;

import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.ITextEditor;
//import org.kermeta.language.api.kevent.KDocumentUpdate;
//import org.kermeta.language.api.ktoken.IKToken;
//import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.loader.kmt.scala.Lexer;
import org.kermeta.language.loader.kmt.scala.api.IKToken;
//import org.kermeta.traceability.TextReference;
//import org.kermeta.traceability.TraceabilityFactory;

public class KermetaScanner implements KermetaTokenScanner {

    //protected UnifiedMessageFactory mFactory = UnifiedMessageFactory.getInstance();
    private KermetaColorManager colorManager;
    private org.kermeta.language.texteditor.eclipse.KermetaEditor editor;
    //private int estimatedOffset;
    //private KMLexer lexer = null;
    //protected KParser parser = null;
    protected boolean fileHasError;
    private List<IKToken> tokens = null;
    private Integer actualTokenPosition = -1;
    private IKToken actualToken = null;

    public KermetaScanner(KermetaColorManager _colorManager, org.kermeta.language.texteditor.eclipse.KermetaEditor _editor) {
        colorManager = _colorManager;
        editor = _editor;
    }

    //private int rangeOffset = 0;
//	@Override
    public void setRange(IDocument document, int offset, int length) {

        try {
            // Note: do not try to parse only this range, recheck the whole document (more reliable)
            String content = document.get(0, document.getLength());

            //Art2ComponentTexteditorEclipse.getDefault().getLogPort().process("Parser Text = "+content);
            
            Lexer toto = new Lexer();
            tokens = toto.lex(content);
            //System.out.println("LEXER got it => "+tokens.size());
            //Art2ComponentTexteditorEclipse.getDefault().getLogPort().process("Size"+tokens.size());

            actualTokenPosition = 0;

            
        } catch (org.eclipse.jface.text.BadLocationException e) {
            //ignore this error. It might occur during editing when locations are outdated quickly.
        }
    }

    public void setFileHasError(boolean fileHasError) {
        this.fileHasError = fileHasError;
    }

    //	@Override
    public IToken nextToken() {
        // try {
        if (actualTokenPosition >= (tokens.size() - 1)) {
            return org.eclipse.jface.text.rules.Token.EOF;
        }

        actualToken = tokens.get(actualTokenPosition);
        actualTokenPosition++;
        /*
        if (t instanceof org.kermeta.language.lexer.KTokens.KToken) {
        actualToken = (org.kermeta.language.lexer.KTokens.KToken) t;
        }*/
        /*
        if (t instanceof org.kermeta.language.lexer.KTokens.KError) {
        org.kermeta.language.lexer.KTokens.KError k = (org.kermeta.language.lexer.KTokens.KError) t;
        }*
        } catch (Exception e) {
        return org.eclipse.jface.text.rules.Token.EOF;
        }

        /*try{
        actualToken = (org.kermeta.language.lexer.KTokens.KToken) lexer.nextToken();
        //	KError k;
        } catch (Exception e){
        return org.eclipse.jface.text.rules.Token.EOF;
        }*/
        if (actualToken.getClass().getSimpleName().equals("KEOF")) {
            return org.eclipse.jface.text.rules.Token.EOF;
        }

        String tokenName = actualToken.getClass().getSimpleName();

        RGB color = new RGB(0, 0, 0);
        int style = org.eclipse.swt.SWT.NORMAL;
        if (tokenName.equals("StringLit")) {
            color = new RGB(0, 0, 255);
        }
        if (tokenName.equals("NumericLit")) {
            color = new RGB(0, 0, 255);
        }
        if (tokenName.equals("Keyword")) {
            color = new RGB(128, 0, 0);
            style = SWT.BOLD;
        }
        if (tokenName.equals("Delimiter")) {
            color = new RGB(64, 64, 64);
            style = SWT.UNDERLINE_SINGLE;
        }
        if (tokenName.equals("Comment") || tokenName.equals("MLComment")) {
            color = new RGB(0, 128, 0);
            style = SWT.ITALIC;
        }

        if (tokenName.equals("KIncomplet") || tokenName.equals("KError")) {

            color = new RGB(255, 0, 0);
            style = SWT.BOLD;
            //report error to error system (marker)
            ITextEditor textEditor = (ITextEditor) editor;
            IEditorInput input = textEditor.getEditorInput();
            IFile file = ((FileEditorInput) input).getFile();
            IPath path = file.getFullPath();
            String url = path.toOSString();

            //TextReference textRef = TraceabilityFactory.eINSTANCE.createTextReference();
            //textRef.setFileURI(url);
            //textRef.setCharBeginOffset(getTokenOffset());
            //textRef.setCharEndOffset(getTokenOffset() + getTokenLength());
            System.err.println("Incomplete token " + actualToken.toString());
            //System.err.println("Resource at : " + textRef.getFileURI() + " should be marked");

            setFileHasError(true);
        }
        //System.out.println(tokenName + "\t Offset=" + getTokenOffset() + "; Length=" + getTokenLength() + "; -> " + actualToken.toString());
        TextAttribute ta = new TextAttribute(colorManager.getColor(color), null, style);
        return new Token(ta);
    }

    //	@Override
    public int getTokenOffset() {
        if (actualToken == null) {
            return 0;
        }

        return actualToken.getOffset();

    }

    //	@Override
    public int getTokenLength() {
        if (actualToken == null) {
            return 0;
        }

        return actualToken.getLength();
    }

    @Override
    public void notifyFileClear() {
        ITextEditor textEditor = (ITextEditor) editor;
        IEditorInput input = textEditor.getEditorInput();
        IFile file = ((FileEditorInput) input).getFile();
        IPath path = file.getFullPath();
        String url = path.toOSString();
        //TextReference textRef = TraceabilityFactory.eINSTANCE.createTextReference();
        //textRef.setFileURI(url);
        //textRef.setCharBeginOffset(getTokenOffset());
        //textRef.setCharEndOffset(getTokenOffset() + getTokenLength());
        System.err.println("File is clear ");
        //System.err.println("Resource at : " + textRef.getFileURI() + " should not be marked");
    }

    @Override
    public void notifyFileHasError() {
        // Already done by each token on error (see public IToken nextToken() method)
    }

    @Override
    public boolean isFileOnError() {
        return fileHasError;
    }
}
