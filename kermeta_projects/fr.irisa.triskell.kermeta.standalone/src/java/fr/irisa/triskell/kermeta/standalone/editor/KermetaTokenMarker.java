/*
 * CTokenMarker.java - C token marker
 * Copyright (C) 1998, 1999 Slava Pestov
 *
 * You may use and modify this package for any purpose. Redistribution is
 * permitted, in both source and binary form, provided that this notice
 * remains intact in all source distributions of this package.
 */


package fr.irisa.triskell.kermeta.standalone.editor;

import java.util.Iterator;

import javax.swing.text.Segment;

import fr.irisa.triskell.kermeta.standalone.editor.jedit.KeywordMap;
import fr.irisa.triskell.kermeta.standalone.editor.jedit.Token;
import fr.irisa.triskell.kermeta.standalone.editor.jedit.TokenMarker;


/**
 * C token marker.
 *
 * @author Slava Pestov
 * @version $Id: KermetaTokenMarker.java,v 1.1 2006-01-03 15:31:50 ffleurey Exp $
 */
public class KermetaTokenMarker extends TokenMarker
{
	public KermetaTokenMarker()
	{
		this(true,getKeywords());
	}

	public KermetaTokenMarker(boolean cpp, KeywordMap keywords)
	{
		this.cpp = cpp;
		this.keywords = keywords;
	}

	public byte markTokensImpl(byte token, Segment line, int lineIndex)
	{
		char[] array = line.array;
		int offset = line.offset;
		lastOffset = offset;
		lastKeyword = offset;
		int length = line.count + offset;
		boolean backslash = false;

loop:		for(int i = offset; i < length; i++)
		{
			int i1 = (i+1);

			char c = array[i];
			if(c == '\\')
			{
				backslash = !backslash;
				continue;
			}

			switch(token)
			{
			case Token.NULL:
				switch(c)
				{
				case '"':
					doKeyword(line,i,c);
					if(backslash)
						backslash = false;
					else
					{
						addToken(i - lastOffset,token);
						token = Token.LITERAL1;
						lastOffset = lastKeyword = i;
					}
					break;
				case '\'':
					doKeyword(line,i,c);
					if(backslash)
						backslash = false;
					else
					{
						addToken(i - lastOffset,token);
						token = Token.LITERAL2;
						lastOffset = lastKeyword = i;
					}
					break;
				case ':':
					if(lastKeyword == offset)
					{
						if(doKeyword(line,i,c))
							break;
						backslash = false;
						addToken(i1 - lastOffset,Token.LABEL);
						lastOffset = lastKeyword = i1;
					}
					else if(doKeyword(line,i,c))
						break;
					break;
				case '/':
					backslash = false;
					doKeyword(line,i,c);
					if(length - i > 1)
					{
						switch(array[i1])
						{
						case '*':
							addToken(i - lastOffset,token);
							lastOffset = lastKeyword = i;
							if(length - i > 2 && array[i+2] == '*')
								token = Token.COMMENT2;
							else
								token = Token.COMMENT1;
							break;
						case '/':
							addToken(i - lastOffset,token);
							addToken(length - i,Token.COMMENT1);
							lastOffset = lastKeyword = length;
							break loop;
						}
					}
					break;
				default:
					backslash = false;
					if(!Character.isLetterOrDigit(c)
						&& c != '_')
						doKeyword(line,i,c);
					break;
				}
				break;
			case Token.COMMENT1:
			case Token.COMMENT2:
				backslash = false;
				if(c == '*' && length - i > 1)
				{
					if(array[i1] == '/')
					{
						i++;
						addToken((i+1) - lastOffset,token);
						token = Token.NULL;
						lastOffset = lastKeyword = i+1;
					}
				}
				break;
			case Token.LITERAL1:
				if(backslash)
					backslash = false;
				else if(c == '"')
				{
					addToken(i1 - lastOffset,token);
					token = Token.NULL;
					lastOffset = lastKeyword = i1;
				}
				break;
			case Token.LITERAL2:
				if(backslash)
					backslash = false;
				else if(c == '\'')
				{
					addToken(i1 - lastOffset,Token.LITERAL1);
					token = Token.NULL;
					lastOffset = lastKeyword = i1;
				}
				break;
			default:
				throw new InternalError("Invalid state: "
					+ token);
			}
		}

		if(token == Token.NULL)
			doKeyword(line,length,'\0');

		switch(token)
		{
		case Token.LITERAL1:
		case Token.LITERAL2:
			addToken(length - lastOffset,Token.INVALID);
			token = Token.NULL;
			break;
		case Token.KEYWORD2:
			addToken(length - lastOffset,token);
			if(!backslash)
				token = Token.NULL;
		default:
			addToken(length - lastOffset,token);
			break;
		}

		return token;
	}

	public static KeywordMap getKeywords()
	{
		if(cKeywords == null)
		{
			cKeywords = new KeywordMap(false);
			Iterator it = CathegorizedKWList.getInstance().getNonSpacialKW().iterator();
			while (it.hasNext()) {
				cKeywords.add(it.next().toString(),Token.KEYWORD1);
			}
			
			it = CathegorizedKWList.getInstance().specialKW.iterator();
			while (it.hasNext()) {
				cKeywords.add(it.next().toString(),Token.KEYWORD2);
			}
			
			it = CathegorizedKWList.getInstance().structKW.iterator();
			while (it.hasNext()) {
				cKeywords.add(it.next().toString(),Token.KEYWORD3);
			}
		}
		return cKeywords;
	}

	// private members
	private static KeywordMap cKeywords;

	private boolean cpp;
	private KeywordMap keywords;
	private int lastOffset;
	private int lastKeyword;

	private boolean doKeyword(Segment line, int i, char c)
	{
		int i1 = i+1;

		int len = i - lastKeyword;
		byte id = keywords.lookup(line,lastKeyword,len);
		if(id != Token.NULL)
		{
			if(lastKeyword != lastOffset)
				addToken(lastKeyword - lastOffset,Token.NULL);
			addToken(len,id);
			lastOffset = i;
		}
		lastKeyword = i1;
		return false;
	}
}
