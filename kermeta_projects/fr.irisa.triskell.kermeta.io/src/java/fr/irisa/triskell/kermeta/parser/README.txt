How to generated the parser ?

1 - Modify the ast file.
2 - Right click on ast file and choose generate (you will need emfatic version from the CVS ONLY).
3 - From the ast file copy the line containing "defaultErrorHandler=false;" and paste it in the generated file Kermeta.g in the options area.
4 - Right click on Kermeta.g and choose "Compile ANTLT Grammar"


Emfatic has been hacked because it did not give us the offset AND the line number.
The hack is the following : 
	1 - Instead of using the default token, we ask the lexer to use TokenWithIndex this way "lexer.setTokenObjectClass("antlr.TokenWithIndex");".
	This special token has an extra fields named index that can be used to store the line number.
	
	2* - The makeToken method from KermetaLexer has been hacked to take into account TokenWithIndex so that the line number is saved.
	
	3 - The TokenInfo class has been hacked in adding an extra field to store line numbers.
	
	4* - The createTokenInfo from the KermetaParser has been hacked to take into account TokenWithIndex et the hacked TokenInfo
	
	
	* In fact, templates have been hacked to generate properly KermetaLexer and KermetaParser.
	You can find those templates in org.eclipse.gymnast.generators.parser.antlr.AntlrGrammarWriter for the parser
	and in KermetaLexer.g for the lexer.