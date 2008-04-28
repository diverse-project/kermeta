package fr.irisa.triskell.kermeta.interpreter;

public class FakeBreakpoint {

	
	static public FakeBreakpoint create(int lineNumber, String file) {
		return new FakeBreakpoint(lineNumber, file);
	}
	
	static public FakeBreakpoint increment(FakeBreakpoint breakpoint) {
		return new FakeBreakpoint(breakpoint.getLineNumber()+1, breakpoint.getFile());
	}
	
	private int _lineNumber;
	
	private String _file;
	
	protected FakeBreakpoint(int lineNumber, String file) {
		_lineNumber = lineNumber;
		_file = file;
	}
	
	public int getLineNumber() {
		return _lineNumber;
	}
	
	public String getFile() {
		return _file;
	}
	
	public String toString() {
		return _file + " " + _lineNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof FakeBreakpoint ) {
			FakeBreakpoint fk = (FakeBreakpoint) obj;
			if ( fk.getFile().equals( _file ) && fk.getLineNumber() == _lineNumber )
				return true;
		}
		return false;
	}
	
}
