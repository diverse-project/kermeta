package kermeta.ki.util
trait JavaExpressionPrinter extends kermeta.ki.util.ExpressionVisitor{

    override def visitAssignment(assignment : _root_.fr.irisa.triskell.kermeta.language.behavior.Assignment) : Unit
    override def visitVoidLiteral(lit : _root_.fr.irisa.triskell.kermeta.language.behavior.VoidLiteral) : Unit
    override def visitIntegerLiteral(lit : _root_.fr.irisa.triskell.kermeta.language.behavior.IntegerLiteral) : Unit
    override def visitCallFeature(callFeature : _root_.fr.irisa.triskell.kermeta.language.behavior.CallFeature) : Unit
    override def visitCallValue(callValue : _root_.fr.irisa.triskell.kermeta.language.behavior.CallValue) : Unit
    override def visitConditional(cond : _root_.fr.irisa.triskell.kermeta.language.behavior.Conditional) : Unit
    override def visitBlock(block : _root_.fr.irisa.triskell.kermeta.language.behavior.Block) : Unit
    override def visitStringLiteral(lit : _root_.fr.irisa.triskell.kermeta.language.behavior.StringLiteral) : Unit
    override def visitCallVariable(callVariable : _root_.fr.irisa.triskell.kermeta.language.behavior.CallVariable) : Unit
    override def visitSelfExpression(expr : _root_.fr.irisa.triskell.kermeta.language.behavior.SelfExpression) : Unit
    override def initialize(out : _root_.kermeta.ki.util.SourcePrinter) : Unit
    override def visitBooleanLiteral(lit : _root_.fr.irisa.triskell.kermeta.language.behavior.BooleanLiteral) : Unit}

