SYNTAXDEF logo
FOR <http://www.kermeta.org/kmLogo> <platform:/resource/org.kermeta.kmlogo.logoasm.model/model/ASMLogo.genmodel>
START org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Block


IMPORTS{
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM:<http://www.kermeta.org/kmLogo/ASM> <platform:/resource/org.kermeta.kmlogo.logoasm.model/model/ASMLogo.genmodel>
}


OPTIONS {
	overrideEditorConfiguration ="false";
}


TOKENS{
	DEFINE INTEGER$('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT$('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
}

TOKENSTYLES{
		"FLOAT"  COLOR #007F55, BOLD;
		"INTEGER" COLOR #007F55, BOLD;
		"TEXT" COLOR #666666, BOLD ;
		"Forward" COLOR #CC8000, ITALIC;
		"FORWARD" COLOR #CC8000, ITALIC;
		"fd" COLOR #CC8000, ITALIC;
		"Right" COLOR #CC8000, ITALIC;
		"RIGHT" COLOR #CC8000, ITALIC;
		"rt" COLOR #CC8000, ITALIC;
		"Left" COLOR #CC8000, ITALIC;
		"LEFT" COLOR #CC8000, ITALIC;
		"lt" COLOR #CC8000, ITALIC;
		"Back" COLOR #CC8000, ITALIC;
		"BACK" COLOR #CC8000, ITALIC;
		"PenDown" COLOR #A22000, BOLD;
		"PENDOWN" COLOR #A22000, BOLD;
		"PenUp" COLOR #A22000, BOLD;
		"PENUP" COLOR #A22000, BOLD;
		"Clear" COLOR #0055bb, ITALIC;
		"CLEAR" COLOR #0055bb, ITALIC;	
} 
RULES{
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Back::= ("Back"|"BACK") steps ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Forward::=( "Forward" | "fd" | "FORWARD" ) steps ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Left::= ("Left"|"lt"|"LEFT") angle  ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Right::=( "Right" | "rt" | "RIGHT"  )angle  ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenDown::= ("PenDown"|"PENDOWN")  ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.PenUp::= ("PenUp"|"PENUP")  ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Clear::= ("Clear"|"CLEAR" ) ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Constant::=integerValue[INTEGER] ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcCall::= ("$")?declaration[] ("(" actualArgs? (","actualArgs)* ")")? ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ProcDeclaration::= ("to"|"TO") #0 name[](args)*block  ("end"|"END") ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Block::= ("{"|"[") (!1 instructions  )*!0  ("}"|"]") ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.If::= (
						(("If"|"IF") condition !0 ("then"|"THEN") thenPart !0 ( ("else"|"ELSE") elsePart !0 )?)|
						(("ifelse"|"IFELSE") condition !0 thenPart !0 elsePart)
						) ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ControlStructure::=condition  ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Repeat::= ("Repeat"|"REPEAT") #0 condition !1 block  ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.While::=("While"|"WHILE") #0 condition !1 block  ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Parameter::= ":" #0 name[] ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.ParameterCall::= ":" #0 parameter[] ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Plus::= (("(" lhs  "+" rhs  ")" )|("+(" lhs "," rhs ")")) ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Minus::= (("(" lhs  "-" rhs  ")" )|("-(" lhs "," rhs ")")) ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Mult::= (("(" lhs  "*" rhs  ")" )|("*(" lhs "," rhs ")")) ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Div::= (("(" lhs  "/" rhs  ")")|("/(" lhs "," rhs ")")) ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Equals::= (("(" lhs  "=" rhs  ")" )|("=(" lhs "," rhs ")")) ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Greater::= (("(" lhs  ">" rhs  ")" )|(">(" lhs "," rhs ")")) ;
	
	org.kermeta.kmlogo.logoasm.model.kmLogo.ASM.Lower::= (("(" lhs  "<" rhs  ")" )|("<(" lhs "," rhs ")"))  ;
}
