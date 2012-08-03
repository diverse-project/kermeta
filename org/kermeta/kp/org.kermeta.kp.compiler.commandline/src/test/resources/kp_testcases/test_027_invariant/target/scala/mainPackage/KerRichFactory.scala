package mainPackage
import ScalaImplicit.my.group.Test_027_invariant.ImplicitConversion._
object KerRichFactory{
 def createMainClass() : mainPackage.MainClass = { new mainPackage.RichMainClass }
 def createCar() : mainPackage.Car = { new mainPackage.RichCar }
 def createCar2() : mainPackage.Car2 = { new mainPackage.RichCar2 }
 def createCar3() : mainPackage.Car3 = { new mainPackage.RichCar3 }
 def createWheel() : mainPackage.Wheel = { new mainPackage.RichWheel }
}

