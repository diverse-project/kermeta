//*******************************************************************************
// Copyright IRISA / INRIA / Universite de Rennes 1 2010
// 
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0 
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
//
// Contributors:
//   Software Technology Group - TU Dresden, Germany 
//      - initial API and implementation
//	IRISA / INRIA / Universite de Rennes 1
//		- Logo language implementation
//		- author : Haja Rambelontsalama
// ******************************************************************************/

SYNTAXDEF logo
FOR <http://www.kermeta.org/kmLogo> <platform:/resource/org.kermeta.kmlogo.logoasm.model/model/ASMLogo.genmodel>
START ASM.LogoProgram

IMPORTS{
	ASM:<http://www.kermeta.org/kmLogo/ASM> <platform:/resource/org.kermeta.kmlogo.logoasm.model/model/ASMLogo.genmodel>
}

OPTIONS {
	overrideEditorConfiguration ="false";
}

TOKENS{
	DEFINE INTEGER$('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT$('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
	DEFINE SL_COMMENT$('//'(~('\n'|'\r'))*) | (';'(~('\n'|'\r'))*) $;
	DEFINE ML_COMMENT$'/*'.*'*/'$;
}

TOKENSTYLES{
	"SL_COMMENT" COLOR #348017;
	"ML_COMMENT" COLOR #348017;
	"FLOAT" COLOR #007F55, BOLD;
	"INTEGER" COLOR #007F55, BOLD;
	"TEXT" COLOR #666666, BOLD;
	"Forward" COLOR #CC8000, ITALIC;
	"FORWARD" COLOR #CC8000, ITALIC;
	"FD" COLOR #CC8000, ITALIC;
	"fd" COLOR #CC8000, ITALIC;
	"forward" COLOR #CC8000, ITALIC;
	"Right" COLOR #CC8000, ITALIC;
	"RIGHT" COLOR #CC8000, ITALIC;
	"rt" COLOR #CC8000, ITALIC;
	"RT" COLOR #CC8000, ITALIC;
	"right" COLOR #CC8000, ITALIC;
	"Left" COLOR #CC8000, ITALIC;
	"LEFT" COLOR #CC8000, ITALIC;
	"lt" COLOR #CC8000, ITALIC;
	"LT" COLOR #CC8000, ITALIC;
	"left" COLOR #CC8000, ITALIC;
	"Back" COLOR #CC8000, ITALIC;
	"BACK" COLOR #CC8000, ITALIC;
	"bk" COLOR #CC8000, ITALIC;
	"BK" COLOR #CC8000, ITALIC;
	"back" COLOR #CC8000, ITALIC;
	"PenDown" COLOR #A22000, BOLD;
	"PENDOWN" COLOR #A22000, BOLD;
	"pd" COLOR #A22000, BOLD;
	"PD" COLOR #A22000, BOLD;
	"PenUp" COLOR #A22000, BOLD;
	"PENUP" COLOR #A22000, BOLD;
	"pu" COLOR #A22000, BOLD;
	"PU" COLOR #A22000, BOLD;
	"penUp" COLOR #A22000, BOLD;
	"Clear" COLOR #0055bb, ITALIC;
	"CLEAR" COLOR #0055bb, ITALIC;
	"cs" COLOR #0055bb, ITALIC;
	"CLEARSCREEN" COLOR #0055bb, ITALIC;
	"clearScreen" COLOR #0055bb, ITALIC;
	"ClearScreen" COLOR #0055bb, ITALIC;
	"CS" COLOR #0055bb, ITALIC;
	"clear" COLOR #0055bb, ITALIC;
}

RULES{
	
	ASM.LogoProgram::=	(instructions !0  )* ;
	
	ASM.Back::=		( "Back" | "BACK" | "bk" | "BK" | "back" )steps  ;
	
	ASM.Forward::=	( "Forward" | "fd" | "FORWARD" | "FD" | "forward" )steps  ;
	
	ASM.Left::=		( "Left" | "lt" | "LEFT" | "LT" | "left" )angle  ;
	
	ASM.Right::=	( "Right" | "rt" | "RIGHT" | "RT" | "right" )angle  ;
	
	ASM.PenDown::=	( "PenDown" | "PENDOWN" | "PD" | "pd" | "penDown" ) ;
	
	ASM.PenUp::=	( "PenUp" | "PENUP" | "pu" | "PU" | "penUp" ) ;
	
	ASM.Clear::=	( "Clear" | "CLEAR" | "cs" | "CLEARSCREEN" | "clearScreen" | "ClearScreen" | "CS" | "clear" ) ;
	
	ASM.Constant::=	integerValue[INTEGER] ;
	
	ASM.ProcCall::=	( "$"  )?declaration[]( "(" actualArgs ( "," actualArgs  )* ")"  )? ;
	
	ASM.ProcDeclaration::=	( "to" | "TO" | "To" )#0 name[](args  )*  block ( "end" | "END" | "End" ) ;
	
	ASM.Block ::= (!1 	instructions:ASM.If |instructions:ASM.Right |instructions:ASM.Left |instructions:ASM.Back |
						instructions:ASM.Forward |instructions:ASM.PenDown |instructions:ASM.PenUp |instructions:ASM.Clear |
						instructions:ASM.ProcCall |instructions:ASM.Repeat |instructions:ASM.While	)
						  
					((!1instructions:ASM.If |instructions:ASM.Right |instructions:ASM.Left |instructions:ASM.Back |
						instructions:ASM.Forward |instructions:ASM.PenDown |instructions:ASM.PenUp |instructions:ASM.Clear |
						instructions:ASM.ProcCall |instructions:ASM.Repeat |instructions:ASM.While ))* !0 
						
				| "["(!1instructions:ASM.If |instructions:ASM.Right |instructions:ASM.Left |instructions:ASM.Back |
						instructions:ASM.Forward |instructions:ASM.PenDown |instructions:ASM.PenUp |instructions:ASM.Clear |
						instructions:ASM.ProcCall |instructions:ASM.Repeat |instructions:ASM.While )? 
					
					(!1	instructions:ASM.If |instructions:ASM.Right |instructions:ASM.Left |instructions:ASM.Back |
						instructions:ASM.Forward |instructions:ASM.PenDown |instructions:ASM.PenUp |instructions:ASM.Clear |
						instructions:ASM.ProcCall |instructions:ASM.Repeat |instructions:ASM.While )* "]" !0  ;
	
	ASM.If::= 	(( "If" | "IF" | "if" ) condition !0 ( "then" | "THEN" | "Then" ) thenPart !0 ( ("Else"|"else"|"ELSE") elsePart !0 )?)|
				(("Ifelse" | "IFELSE" | "ifelse" ) condition !0 thenPart !0 elsePart) ;
	
	ASM.ControlStructure::=	condition  ;
	
	ASM.Repeat::=	( "Repeat" | "REPEAT" | "repeat") #0 condition !1 block  ;
	
	ASM.While::=	( "While" | "WHILE" | "while") #0 condition !1 block  ;
	
	ASM.Parameter::= ":" #0 name[] ;
	
	ASM.ParameterCall::= ":" #0 parameter[] ;
	
	ASM.Plus::=		(("(" lhs  "+" rhs  ")" )|("+""(" lhs "," rhs ")")) ;
	
	ASM.Minus::= 	(("(" lhs  "-" rhs  ")" )|("-""(" lhs "," rhs ")")) ;
	
	ASM.Mult::= 	(("(" lhs  "*" rhs  ")" )|("*""(" lhs "," rhs ")")) ;
	
	ASM.Div::= 		(("(" lhs  "/" rhs  ")")|("/""(" lhs "," rhs ")"))  ;
	
	ASM.Equals::= 	(("(" lhs  "=" rhs  ")" )|("=""(" lhs "," rhs ")")) ;
	
	ASM.Greater::= 	(("(" lhs  ">" rhs  ")" )|(">""(" lhs "," rhs ")")) ;
	
	ASM.Lower::= 	(("(" lhs  "<" rhs  ")" )|("<""(" lhs "," rhs ")")) ;
}
