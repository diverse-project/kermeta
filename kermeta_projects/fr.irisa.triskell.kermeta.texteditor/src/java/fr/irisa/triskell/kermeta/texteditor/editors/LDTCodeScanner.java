//Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
//Jad home page: http://www.geocities.com/kpdus/jad.html
//Decompiler options: packimports(3) 
//Source File Name:   LDTCodeScanner.java

package fr.irisa.triskell.kermeta.texteditor.editors;

import java.util.ArrayList;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.*;
import org.eclipse.swt.graphics.RGB;

public abstract class LDTCodeScanner extends RuleBasedScanner
{
 public static class WhitespaceDetector
     implements IWhitespaceDetector
 {

     public boolean isWhitespace(char c)
     {
         return Character.isWhitespace(c);
     }

     public WhitespaceDetector()
     {
     }
 }

 public static class TokenIDDetector
     implements IWordDetector
 {

     public boolean isWordPart(char c)
     {
         if(Character.isUpperCase(c))
             return true;
         return c == '_';
     }

     public boolean isWordStart(char c)
     {
         if(Character.isUpperCase(c))
             return true;
         return c == '_';
     }

     public TokenIDDetector()
     {
     }
 }

 public static class IDDetector
     implements IWordDetector
 {

     public boolean isWordPart(char c)
     {
         return Character.isUnicodeIdentifierPart(c);
     }

     public boolean isWordStart(char c)
     {
         return Character.isUnicodeIdentifierStart(c);
     }

     public IDDetector()
     {
     }
 }


 public void dispose()
 {
     _colorProvider.dispose();
 }

 public LDTCodeScanner()
 {
     _rules = new ArrayList();
     _colorProvider = new ColorProvider();
     initSetup();
 }

 public IToken getLiteralToken()
 {
     return makeToken(ColorProvider.DARK_BLUE, null, 1);
 }

 public void initLiterals()
 {
     IToken literalToken = getLiteralToken();
     addRule(new SingleLineRule("\"", "\"", literalToken));
     addRule(new SingleLineRule("'", "'", literalToken));
 }

 public void initKeywords()
 {
 }

 public IToken getCommentToken()
 {
     return makeToken(ColorProvider.DARK_BLUE, ColorProvider.GREY1, 1);
 }

 public void initComments()
 {
     IToken commentToken = getCommentToken();
     addRule(new EndOfLineRule("//", commentToken));
     addRule(new MultiLineRule("/*", "*/", commentToken));
 }

 public void initSetup()
 {
     _rules = new ArrayList();
     addRule(new WhitespaceRule(new WhitespaceDetector()));
     _idRule = new WordRule(new IDDetector(), makeToken(getIdColor()));
     //_idRule = new WordRule(new IDDetector());
     addRule(_idRule);
     initLiterals();
     initKeywords();
     initComments();
     IRule result[] = new IRule[_rules.size()];
     _rules.toArray(result);
     setRules(result);
 }

 protected void addRule(IRule rule)
 {
     _rules.add(rule);
 }

 protected void addKeywords(String keywords[], RGB color)
 {
     for(int i = 0; i < keywords.length; i++)
         _idRule.addWord(keywords[i], makeToken(color));

 }

 protected void addKeywords(String keywords[], RGB foregroundColor, RGB backgroundColor, int style)
 {
     for(int i = 0; i < keywords.length; i++)
         _idRule.addWord(keywords[i], makeToken(foregroundColor, backgroundColor, style));

 }

 public RGB getIdColor()
 {
     return ColorProvider.BLACK;
 }

 protected IToken makeToken(RGB foregroundColor)
 {
     TextAttribute attr = new TextAttribute(_colorProvider.getColor(foregroundColor));
     return new Token(attr);
 }

 protected IToken makeToken(RGB foregroundColor, RGB backgroundColor, int style)
 {
     TextAttribute attr = new TextAttribute(_colorProvider.getColor(foregroundColor), _colorProvider.getColor(backgroundColor), style);
     return new Token(attr);
 }

 private ColorProvider _colorProvider;
 private ArrayList _rules;
 private WordRule _idRule;
}
