package kermeta.ki.util
trait ExpressionVisitor extends fr.irisa.triskell.kermeta.language.structure.Object{

    def visitAssignment(assignment : _root_.fr.irisa.triskell.kermeta.language.behavior.Assignment) : Unit
    def visitVoidLiteral(lit : _root_.fr.irisa.triskell.kermeta.language.behavior.VoidLiteral) : Unit
    def visitConditional(cond : _root_.fr.irisa.triskell.kermeta.language.behavior.Conditional) : Unit
    def visitCallValue(callValue : _root_.fr.irisa.triskell.kermeta.language.behavior.CallValue) : Unit
    def visitStringLiteral(lit : _root_.fr.irisa.triskell.kermeta.language.behavior.StringLiteral) : Unit
    def visitBooleanLiteral(lit : _root_.fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral) : Unit
    def visitEmptyExpression(expr : _root_.fr.irisa.triskell.kermeta.language.behavior.EmptyExpression) : Unit
    def visitIntegerLiteral(lit : _root_.fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral) : Unit
    def visitCallFeature(callFeature : _root_.fr.irisa.triskell.kermeta.language.behavior.CallFeature) : Unit
    def visitBlock(block : _root_.fr.irisa.triskell.kermeta.language.behavior.Block) : Unit
    def visitCallVariable(callVariable : _root_.fr.irisa.triskell.kermeta.language.behavior.CallVariable) : Unit
    def visitSelfExpression(expr : _root_.fr.irisa.triskell.kermeta.language.behavior.SelfExpression) : Unit
    def initialize(out : _root_.kermeta.ki.util.SourcePrinter) : Unit}

