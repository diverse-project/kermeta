package p1
object RichFactory extends  fr.irisa.triskell.scala.generated.fw.ImplicitConversion{
 def createATest : p1.ATest = { new p1.RichATest }
 def createATestAttr : p1.ATestAttr = { new p1.RichATestAttr }
 def createB : p1.B = { new p1.RichB }
 def createC : p1.C = { new p1.RichC }
 def createMain : p1.Main = { new p1.RichMain }
}

