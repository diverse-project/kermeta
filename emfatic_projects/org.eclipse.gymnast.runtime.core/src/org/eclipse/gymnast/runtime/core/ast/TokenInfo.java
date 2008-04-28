package org.eclipse.gymnast.runtime.core.ast;

public class TokenInfo {
	
	private final String _text;
	private final int _offset;
	private final int _type;
	private final int _lineNumber;
	private final int _column;
	
	public TokenInfo(String text, int lineNumber, int column, int offset, int type) {
		_text = text;
		_offset = offset;
		_type = type;
		_lineNumber = lineNumber;
		_column = column;
	}
	
	public String getText() {
		return _text;
	}

	public int getOffset() {
		return _offset;
	}
	
	public int getType() {
		return _type;
	}
	
	public int getLineNumber() {
		return _lineNumber;
	}
	
	public int getColumn() {
		return _column;
	}
	
}
