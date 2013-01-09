package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait SlicerAspectGeneratorAspect  extends _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.GeneratorAspect with `_root_`.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerAspectGenerator{

    def initialise(slicer : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator):_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerAspectGenerator = {
var `~result` : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerAspectGenerator = null.asInstanceOf[_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerAspectGenerator]; 
  { 


{
(this).ScalaslicerGenerator = (slicer).asInstanceOf[_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator];
`~result` = (this).asInstanceOf[_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerAspectGenerator];}
        }
 return `~result`
}

    override def generateCode():_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
var mainPackageName : _root_.java.lang.String = (((((this).ScalaslicerGenerator).ScalaaspectisedClasses).last()).ScalaePackage).getQualifiedName();
var packages : _root_.k2.standard.KermetaBag[_root_.java.lang.String] = _root_.k2.standard.KerRichFactory.createBag[_root_.java.lang.String];
(((this).ScalaslicerGenerator).ScalaaspectisedClasses).each({(cl : _root_.org.eclipse.emf.ecore.EClass)=>

{
var packageName : _root_.java.lang.String = ((cl).ScalaePackage).getQualifiedName();
if (((((packages).contains(packageName)).not())).and(_root_.k2.utils.UTilScala.isNotEqual((mainPackageName),packageName)))

{
(packages).add(packageName)}
}
})
var codeUsing : _root_.java.lang.String = "";
(this).ScalageneratedCode = (((this).ScalaslicerGenerator).getPackageFromClasses(((this).ScalaslicerGenerator).ScalaaspectisedClasses)).asInstanceOf[_root_.java.lang.String];
(packages).each({(pkg : _root_.java.lang.String)=>

{
codeUsing = ((((codeUsing).plus("using ")).plus(pkg)).plus("\n")).asInstanceOf[_root_.java.lang.String];}
})
(this).ScalageneratedCode = (((((this).ScalageneratedCode).plus(codeUsing)).plus("using kermeta::standard\nusing kermeta::utils\nusing kermeta::io::StdIO => stdio\n")).plus((this).generateVisitAspect())).asInstanceOf[_root_.java.lang.String];
(packages).add(mainPackageName)
(((this).ScalaslicerGenerator).ScalaaspectisedClasses).each({(eclass : _root_.org.eclipse.emf.ecore.EClass)=>

{
var packageName : _root_.java.lang.String = ((eclass).ScalaePackage).getQualifiedName();
if (((packageName) == (mainPackageName)))

{
(this).ScalageneratedCode = (((this).ScalageneratedCode).plus((this).generateAspect(eclass, true))).asInstanceOf[_root_.java.lang.String];}
else 


{
(packages).add(packageName)
(this).generateExternAspect(eclass, mainPackageName, packages)}
}
})
if (((this).ScalaslicerGenerator).ScalahasOpposite)

{
(this).ScalageneratedCode = (((this).ScalageneratedCode).plus((this).generateAspectFeedableOtherClasses())).asInstanceOf[_root_.java.lang.String];
(this).ScalageneratedCode = (((this).ScalageneratedCode).plus("abstract class Feedable {\n\toperation feedOpposites() is do end\n}\n")).asInstanceOf[_root_.java.lang.String];}
}
        }
 
}

    def generateAspectFeedableOtherClasses():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ("").asInstanceOf[_root_.java.lang.String];
var coll : _root_.k2.standard.KermetaCol[_root_.org.eclipse.emf.ecore.EClass] = (((this).ScalaslicerGenerator).ScalaallClasses).select({(clazz : _root_.org.eclipse.emf.ecore.EClass)=>

{
((((this).ScalaslicerGenerator).ScalaaspectisedClasses).exists({(cl : _root_.org.eclipse.emf.ecore.EClass)=>

{
(((cl).getQualifiedName()) == ((clazz).getQualifiedName()))}
})).not()}
});
(coll).each({(clazz : _root_.org.eclipse.emf.ecore.EClass)=>

{
`~result` = ((`~result`).plus((this).generateAspect(clazz, false))).asInstanceOf[_root_.java.lang.String];}
})}
        }
 return `~result`
}

    def generateVisitFeedCallBlock(clazz : _root_.org.eclipse.emf.ecore.EClass):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ("").asInstanceOf[_root_.java.lang.String];
((clazz).ScalaeStructuralFeatures).each({(sf : _root_.org.eclipse.emf.ecore.EStructuralFeature)=>

{
if ((sf).isInstanceOf[_root_.org.eclipse.emf.ecore.EReference])

{
var ref : _root_.org.eclipse.emf.ecore.EReference = (sf).asInstanceOf[_root_.org.eclipse.emf.ecore.EReference];
if ((ref).Scalacontainment)

{
`~result` = (((`~result`).plus("\t\t")).plus((this).generateVisitFeedCallExpression(ref))).asInstanceOf[_root_.java.lang.String];}
}
}
})}
        }
 return `~result`
}

    def generateVisitFeedCallExpression(ref : _root_.org.eclipse.emf.ecore.EReference):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ((("self.").plus((ref).getValidKermetaName())).plus(".")).asInstanceOf[_root_.java.lang.String];
if ((((ref).ScalaupperBound) == ((1).uminus())))

{
`~result` = ((((((`~result`).plus("each{the")).plus((ref).Scalaname)).plus(" | the")).plus((ref).Scalaname)).plus(".feedOpposites() }\n")).asInstanceOf[_root_.java.lang.String];}
else 


{
`~result` = ((`~result`).plus("feedOpposites()")).asInstanceOf[_root_.java.lang.String];
if ((((ref).ScalalowerBound) == (0)))

{
`~result` = ((((("if not self.").plus((ref).getValidKermetaName())).plus(".isVoid then ")).plus(`~result`)).plus(" end\n")).asInstanceOf[_root_.java.lang.String];}
else 


{
`~result` = ((`~result`).plus("\n")).asInstanceOf[_root_.java.lang.String];}
}
}
        }
 return `~result`
}

    def generateExternAspect(clazz : _root_.org.eclipse.emf.ecore.EClass, mainPackageName : _root_.java.lang.String, packages : _root_.k2.standard.KermetaBag[_root_.java.lang.String]):_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
var namePackage : _root_.java.lang.String = ((clazz).ScalaePackage).getQualifiedName();
var codeAspect : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String];
if (_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalarequiredAspectFiles).get(namePackage))))

{
var codeUsing : _root_.java.lang.String = "";
codeAspect = ((("package ").plus(namePackage)).plus(";\n")).asInstanceOf[_root_.java.lang.String];
(packages).each({(pkg : _root_.java.lang.String)=>

{
if (((_root_.k2.utils.UTilScala.isNotEqual((pkg),namePackage))).and(_root_.k2.utils.UTilScala.isNotEqual((pkg),mainPackageName)))

{
codeUsing = ((((codeUsing).plus("using ")).plus(pkg)).plus("\n")).asInstanceOf[_root_.java.lang.String];}
}
})
codeAspect = ((((((codeAspect).plus("using kermeta::standard\nusing ")).plus(mainPackageName)).plus("\n")).plus(codeUsing)).plus("\n")).asInstanceOf[_root_.java.lang.String];}
else 


{
codeAspect = ((((this).ScalaslicerGenerator).ScalarequiredAspectFiles).get(namePackage)).asInstanceOf[_root_.java.lang.String];
(((this).ScalaslicerGenerator).ScalarequiredAspectFiles).remove(namePackage)}

codeAspect = ((codeAspect).plus((this).generateAspect(clazz, true))).asInstanceOf[_root_.java.lang.String];
(((this).ScalaslicerGenerator).ScalarequiredAspectFiles).put(namePackage, codeAspect)}
        }
 
}

    def generateCopyOfRequiredAttributesOfClass(eclass : _root_.org.eclipse.emf.ecore.EClass, varName : _root_.java.lang.String, doSuper : _root_.java.lang.Boolean):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ("").asInstanceOf[_root_.java.lang.String];
((eclass).ScalaeStructuralFeatures).each({(sf : _root_.org.eclipse.emf.ecore.EStructuralFeature)=>

{
if ((((sf).isInstanceOf[_root_.org.eclipse.emf.ecore.EAttribute])).and(((((sf).ScalalowerBound) == (1))).orElse({(b : _root_.java.lang.Boolean)=>

{
((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaslicedElements).exists({(elt : _root_.org2.kermeta.kompren.slicer.SlicedElement)=>

{
((elt).isInstanceOf[_root_.org2.kermeta.kompren.slicer.SlicedProperty]).andThen({(b : _root_.java.lang.Boolean)=>

{
(((((elt).asInstanceOf[_root_.org2.kermeta.kompren.slicer.SlicedProperty]).Scaladomain).getQualifiedName()) == ((sf).getQualifiedName()))}
})}
})}
})))

{
if ((((sf).ScalaupperBound) == (1)))

{
`~result` = ((((((((`~result`).plus("\t\t")).plus(varName)).plus(".")).plus((sf).getValidKermetaName())).plus(" := self.")).plus((sf).getValidKermetaName())).plus("\n")).asInstanceOf[_root_.java.lang.String];}
else 


{
`~result` = ((((((((`~result`).plus("\t\tself.")).plus((sf).getValidKermetaName())).plus(".each{attr | ")).plus(varName)).plus(".")).plus((sf).getValidKermetaName())).plus(".add(attr) }\n")).asInstanceOf[_root_.java.lang.String];}
}
}
})
if (doSuper)

{
((eclass).ScalaeSuperTypes).each({(st : _root_.org.eclipse.emf.ecore.EClass)=>

{
`~result` = ((`~result`).plus((this).generateCopyOfRequiredAttributesOfClass(st, varName, doSuper))).asInstanceOf[_root_.java.lang.String];}
})}
}
        }
 return `~result`
}

    def createImplementationOperationCreateFrom(eclass : _root_.org.eclipse.emf.ecore.EClass):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
if ((((((this).ScalaslicerGenerator).ScalaslicerModel).Scalastrict)).and(((eclass).Scalaabstract).not()))

{
`~result` = ((((((((((("\tmethod createFrom() : Object is do\n\t\tvar the").plus((eclass).Scalaname)).plus(" : ")).plus((eclass).Scalaname)).plus(" init ")).plus((eclass).Scalaname)).plus(".new\n")).plus((this).generateCopyOfRequiredAttributesOfClass(eclass, ("the").plus((eclass).Scalaname), true))).plus("\t\tresult := the")).plus((eclass).Scalaname)).plus("\n\tend\n\n")).asInstanceOf[_root_.java.lang.String];}
else 


{
`~result` = ("").asInstanceOf[_root_.java.lang.String];}
}
        }
 return `~result`
}

    def generateAspect(eclass : _root_.org.eclipse.emf.ecore.EClass, considerSlicerVisitor : _root_.java.lang.Boolean):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
var prunerVarName : _root_.java.lang.String = ("the").plus((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaname);
var paramCode : _root_.java.lang.String = "";
var feedOppositeMethod : _root_.java.lang.String = "";
`~result` = (("aspect class ").plus((eclass).Scalaname)).asInstanceOf[_root_.java.lang.String];
if ((considerSlicerVisitor).andThen({(b : _root_.java.lang.Boolean)=>

{
((((this).ScalaslicerGenerator).ScalaaspectisedClasses).exists({(eclass2 : _root_.org.eclipse.emf.ecore.EClass)=>

{
(eclass2).isSuperTypeOfBis(eclass)}
})).not()}
}))

{
`~result` = ((`~result`).plus(" inherits SlicerVisitor")).asInstanceOf[_root_.java.lang.String];
if (((this).ScalaslicerGenerator).ScalahasOpposite)

{
`~result` = ((`~result`).plus(", Feedable")).asInstanceOf[_root_.java.lang.String];}
}
else 


{
if (((this).ScalaslicerGenerator).ScalahasOpposite)

{
`~result` = ((`~result`).plus(" inherits Feedable")).asInstanceOf[_root_.java.lang.String];}
}

`~result` = ((`~result`).plus(" {\n")).asInstanceOf[_root_.java.lang.String];
`~result` = ((`~result`).plus((this).createImplementationOperationCreateFrom(eclass))).asInstanceOf[_root_.java.lang.String];
if (((this).ScalaslicerGenerator).ScalahasOpposite)

{
feedOppositeMethod = (("\tmethod feedOpposites() from Feedable is do\n\t\tsuper()\n").plus((this).generateVisitFeedCallBlock(eclass))).asInstanceOf[_root_.java.lang.String];}

((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaslicedProperties).each({(rel : _root_.org2.kermeta.kompren.slicer.SlicedProperty)=>

{
if ((_root_.k2.standard.KerRichFactory.isVoid(((rel).Scalaopposite))).not())

{
var cl : _root_.org.eclipse.emf.ecore.EClass = ((rel).Scaladomain).ScalaeContainingClass;
var etype : _root_.org.eclipse.emf.ecore.EClass = (((rel).Scaladomain).ScalaeType).asInstanceOf[_root_.org.eclipse.emf.ecore.EClass];
if ((((cl).getQualifiedName()) == ((eclass).getQualifiedName())))

{
`~result` = ((((((((`~result`).plus("\treference ")).plus(((rel).Scaladomain).getValidKermetaName())).plus(" : ")).plus(((((rel).Scaladomain).ScalaeType).asInstanceOf[_root_.org.eclipse.emf.ecore.EClass]).Scalaname)).plus("[")).plus(_root_.k2.utils.UTilScala.toString((((rel).Scaladomain).ScalalowerBound)))).plus("..")).asInstanceOf[_root_.java.lang.String];
if (((((rel).Scaladomain).ScalaupperBound) == ((1).uminus())))

{
`~result` = ((`~result`).plus("*")).asInstanceOf[_root_.java.lang.String];}
else 


{
`~result` = ((`~result`).plus(_root_.k2.utils.UTilScala.toString((((rel).Scaladomain).ScalaupperBound)))).asInstanceOf[_root_.java.lang.String];}

`~result` = ((`~result`).plus("]\n\n")).asInstanceOf[_root_.java.lang.String];}

if (((((((etype).getQualifiedName()) == ((eclass).getQualifiedName()))).or((etype).isSuperTypeOfBis(eclass)))).and(((rel).Scaladomain).isInstanceOf[_root_.org.eclipse.emf.ecore.EReference]))

{
feedOppositeMethod = ((feedOppositeMethod).plus((this).generateInitialiseOppositeOperation(rel))).asInstanceOf[_root_.java.lang.String];}
}
}
})
if ((considerSlicerVisitor).andThen({(b : _root_.java.lang.Boolean)=>

{
((((((eclass).ScalaoutputFocusedRelations).empty()).not()).or(((((this).ScalaslicerGenerator).ScalaslicerModel).ScalainputClasses).exists({(cl : _root_.org.eclipse.emf.ecore.EClass)=>

{
(((cl).getQualifiedName()) == (eclass))}
}))).or(((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaslicedClasses).exists({(sc : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
((((sc).Scaladomain).getQualifiedName()) == ((eclass).getQualifiedName()))}
}))).or(((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaslicedProperties).exists({(sp : _root_.org2.kermeta.kompren.slicer.SlicedProperty)=>

{
(((((sp).Scaladomain).ScalaeContainingClass).getQualifiedName()) == ((eclass).getQualifiedName()))}
}))}
}))

{
`~result` = (((((`~result`).plus("\tmethod visitToAddClasses(")).plus(prunerVarName)).plus(" : ")).plus((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaname)).asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius))).not())

{
`~result` = ((`~result`).plus(", currentRadius : Integer")).asInstanceOf[_root_.java.lang.String];}

`~result` = (((((`~result`).plus(") is do\n\t\tcheckInitialisation(")).plus(prunerVarName)).plus(".idPass)\n\t\tif(not self.visitedPass")).plus(paramCode)).asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius))).not())

{
`~result` = ((((((`~result`).plus(" and (")).plus(prunerVarName)).plus(".radius<=0 or currentRadius<=(")).plus(prunerVarName)).plus(".radius+1))")).asInstanceOf[_root_.java.lang.String];}

`~result` = (((`~result`).plus(") then\n\t\t\tsuper(")).plus(prunerVarName)).asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius))).not())

{
`~result` = ((`~result`).plus(", currentRadius")).asInstanceOf[_root_.java.lang.String];}

`~result` = ((`~result`).plus(")\n")).asInstanceOf[_root_.java.lang.String];
if (((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaslicedClasses).exists({(sc : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
((((sc).Scaladomain).getQualifiedName()) == ((eclass).getQualifiedName()))}
}))

{
`~result` = ((`~result`).plus("\t\t\tif(not self.sliced")).asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius))).not())

{
if (((((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius).ScalafocusedClasses).exists({(fc : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
((((fc).Scaladomain).getQualifiedName()) == ((eclass).getQualifiedName()))}
})).or((((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius).ScalafocusedClasses).exists({(cl : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
((cl).Scaladomain).isSuperTypeOfBis(eclass)}
})))

{
`~result` = ((((((`~result`).plus(" and (")).plus(prunerVarName)).plus(".radius<=0 or currentRadius<=")).plus(prunerVarName)).plus(".radius)")).asInstanceOf[_root_.java.lang.String];}
}

`~result` = ((`~result`).plus(") then\n\t\t\t\t")).asInstanceOf[_root_.java.lang.String];
if ((((this).ScalaslicerGenerator).ScalaslicerModel).Scalastrict)

{
`~result` = ((`~result`).plus("self.dup := self.createFrom()")).asInstanceOf[_root_.java.lang.String];}
else 


{
`~result` = (((((((`~result`).plus(prunerVarName)).plus(".")).plus((eclass).getAddedAttributeName())).plus(".add(self)\n\t\t\t\t")).plus(prunerVarName)).plus(".addToRoot(self.dup)\n\t\t\t\t")).asInstanceOf[_root_.java.lang.String];}

`~result` = ((`~result`).plus("self.sliced := true\n\t\t\tend\n")).asInstanceOf[_root_.java.lang.String];}

var relationCalls : _root_.java.lang.String = (this).generateRelationCalls(eclass, true);
if (((relationCalls).ksize()).isGreater(0))

{
`~result` = (((`~result`).plus("\t\t\tself.visitedPass := true\n")).plus((this).generateRelationCalls(eclass, true))).asInstanceOf[_root_.java.lang.String];}

`~result` = (((((`~result`).plus("\t\tend\n\tend\n\tmethod visitToAddRelations(")).plus(prunerVarName)).plus(" : ")).plus((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaname)).asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius))).not())

{
`~result` = ((`~result`).plus(", currentRadius : Integer")).asInstanceOf[_root_.java.lang.String];}

`~result` = ((((`~result`).plus(") is do\n\t\t")).plus("if(not self.visitedForRelations")).plus(paramCode)).asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius))).not())

{
`~result` = ((((((`~result`).plus(" and (")).plus(prunerVarName)).plus(".radius<=0 or currentRadius<=")).plus(prunerVarName)).plus(".radius)")).asInstanceOf[_root_.java.lang.String];}

`~result` = (((`~result`).plus(") then\n\t\t\tsuper(")).plus(prunerVarName)).asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius))).not())

{
`~result` = ((`~result`).plus(", currentRadius")).asInstanceOf[_root_.java.lang.String];}

`~result` = ((((`~result`).plus(")\n\t\t\tself.visitedForRelations := true\n")).plus((this).generateRelationCalls(eclass, false))).plus("\t\tend\n\tend\n")).asInstanceOf[_root_.java.lang.String];}

if (((feedOppositeMethod).ksize()).isGreater(0))

{
`~result` = (((`~result`).plus(feedOppositeMethod)).plus("\tend\n")).asInstanceOf[_root_.java.lang.String];}

`~result` = (((`~result`).plus((this).generateCheckOperation(eclass))).plus("}\n\n")).asInstanceOf[_root_.java.lang.String];}
        }
 return `~result`
}

    def generateCheckOperation(clazz : _root_.org.eclipse.emf.ecore.EClass):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ("").asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius))).not())

{
if (((((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius).ScalafocusedClasses).exists({(cl : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
(clazz).isSuperTypeOfBis((cl).Scaladomain)}
})).not())

{
`~result` = ("\tmethod checkCanReallyBeAdded() : Boolean is do\n").asInstanceOf[_root_.java.lang.String];
if ((((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius).ScalafocusedClasses).exists({(fc : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
((((fc).Scaladomain).getQualifiedName()) == ((clazz).getQualifiedName()))}
}))

{
`~result` = ((`~result`).plus("\t\tresult := self.sliced\n")).asInstanceOf[_root_.java.lang.String];}
else 


{
`~result` = ((`~result`).plus("\t\tresult := super()")).asInstanceOf[_root_.java.lang.String];
if (((((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius).ScalafocusedClasses).exists({(cl : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
((cl).Scaladomain).isSuperTypeOfBis(clazz)}
})).not())

{
((clazz).ScalaoutputFocusedRelations).each({(rel : _root_.org2.kermeta.kompren.slicer.SlicedProperty)=>

{
var relName : _root_.java.lang.String = ((rel).Scaladomain).getValidKermetaName();
`~result` = ((`~result`).plus(" and ")).asInstanceOf[_root_.java.lang.String];
if (((((rel).Scaladomain).ScalaupperBound) == (1)))

{
`~result` = ((((((((`~result`).plus("(self.")).plus(relName)).plus(".isVoid.orElse{b | self.")).plus(relName)).plus(".visitedPass.orElse{b | self.")).plus(relName)).plus(".checkCanReallyBeAdded()}})")).asInstanceOf[_root_.java.lang.String];}
else 


{
var varName : _root_.java.lang.String = ((((rel).Scaladomain).ScalaeType).asInstanceOf[_root_.org.eclipse.emf.ecore.EClass]).getVarNameClassifier();
`~result` = ((((((((((`~result`).plus("self.")).plus(relName)).plus(".each{")).plus(varName)).plus(" | ")).plus(varName)).plus(".visitedPass.orElse{b | ")).plus(varName)).plus(".checkCanReallyBeAdded()} }")).asInstanceOf[_root_.java.lang.String];}
}
})}

`~result` = ((`~result`).plus("\n")).asInstanceOf[_root_.java.lang.String];}

`~result` = ((`~result`).plus("\tend\n")).asInstanceOf[_root_.java.lang.String];}
}
}
        }
 return `~result`
}

    def generateInitialiseOppositeOperation(slicedProp : _root_.org2.kermeta.kompren.slicer.SlicedProperty):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
var relation : _root_.org.eclipse.emf.ecore.EReference = ((slicedProp).Scaladomain).asInstanceOf[_root_.org.eclipse.emf.ecore.EReference];
var selfNameVar : _root_.java.lang.String = ("self.").plus(((relation).ScalaeOpposite).getValidKermetaName());
`~result` = ("\t\t").asInstanceOf[_root_.java.lang.String];
if ((((((relation).ScalaeOpposite).ScalaupperBound) == ((1).uminus()))).or((((relation).ScalaeOpposite).ScalaupperBound).isGreater(1)))

{
var name : _root_.java.lang.String = ((relation).ScalaeContainingClass).getVarNameClassifier();
`~result` = (((((((((`~result`).plus(selfNameVar)).plus(".each{")).plus(name)).plus(" | ")).plus(name)).plus(".")).plus((relation).getValidKermetaName())).plus(".add(self) }")).asInstanceOf[_root_.java.lang.String];}
else 


{
if (((((relation).ScalaeOpposite).ScalalowerBound) == (0)))

{
`~result` = ((((`~result`).plus("if(not ")).plus(selfNameVar)).plus("isVoid) then ")).asInstanceOf[_root_.java.lang.String];}

`~result` = (((((`~result`).plus(selfNameVar)).plus(".")).plus((relation).getValidKermetaName())).plus(".add(self)")).asInstanceOf[_root_.java.lang.String];
if (((((relation).ScalaeOpposite).ScalalowerBound) == (0)))

{
`~result` = ((`~result`).plus(" end")).asInstanceOf[_root_.java.lang.String];}
}

`~result` = ((`~result`).plus("\n")).asInstanceOf[_root_.java.lang.String];}
        }
 return `~result`
}

    def generateRelationCall(ref : _root_.org.eclipse.emf.ecore.EReference, isOption : _root_.java.lang.Boolean, visitMethodName : _root_.java.lang.String, nameVarPruner : _root_.java.lang.String, classVisit : _root_.java.lang.Boolean):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ("").asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid(((ref).Scaladerived))).orElse({(b : _root_.java.lang.Boolean)=>

{
((ref).Scaladerived).not()}
}))

{
var radiusCode : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String];
var relName : _root_.java.lang.String = (ref).getValidKermetaName();
if ((_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius))).not())

{
if ((((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius).ScalafocusedClasses).exists({(cl : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
(((((ref).ScalaeContainingClass) == (cl))).or(((cl).Scaladomain).isSuperTypeOfBis((ref).ScalaeContainingClass))).or(((ref).ScalaeContainingClass).isSuperTypeOfBis((cl).Scaladomain))}
}))

{
radiusCode = (", currentRadius+1").asInstanceOf[_root_.java.lang.String];}
else 


{
radiusCode = (", currentRadius").asInstanceOf[_root_.java.lang.String];}
}
else 


{
radiusCode = ("").asInstanceOf[_root_.java.lang.String];}

`~result` = ((`~result`).plus("\t\t\t")).asInstanceOf[_root_.java.lang.String];
if (isOption)

{
`~result` = ((((((`~result`).plus("if(")).plus(nameVarPruner)).plus(".consider")).plus((ref).Scalaname)).plus(") then ")).asInstanceOf[_root_.java.lang.String];}

var prunerVarName : _root_.java.lang.String = ("the").plus((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaname);
if ((((ref).ScalaupperBound) == (1)))

{
if ((((ref).ScalalowerBound) == (0)))

{
`~result` = ((((`~result`).plus("if(not self.")).plus(relName)).plus(".isVoid) then ")).asInstanceOf[_root_.java.lang.String];}

`~result` = ((((((((((`~result`).plus("self.")).plus(relName)).plus(".")).plus(visitMethodName)).plus("(")).plus(nameVarPruner)).plus(radiusCode)).plus(")")).plus((this).generateAddRelations(classVisit, (ref).asInstanceOf[_root_.org.eclipse.emf.ecore.EReference]))).asInstanceOf[_root_.java.lang.String];
if ((((((this).ScalaslicerGenerator).ScalaslicerModel).Scalastrict)).and((classVisit).not()))

{
`~result` = ((((((((((((`~result`).plus("\n\t\t\tif(self.")).plus((ref).getValidKermetaName())).plus(".sliced) then\n\t\t\t\tself.dup.asType(")).plus((((ref).container()).asInstanceOf[_root_.org.eclipse.emf.ecore.EClassifier]).Scalaname)).plus(").")).plus((ref).getValidKermetaName())).plus(" := self.")).plus((ref).getValidKermetaName())).plus(".dup.asType(")).plus(((ref).ScalaeType).Scalaname)).plus(")\n\t\t\tend\n")).asInstanceOf[_root_.java.lang.String];}

if ((((ref).ScalalowerBound) == (0)))

{
`~result` = ((`~result`).plus(" end")).asInstanceOf[_root_.java.lang.String];}
}
else 


{
var nameVar : _root_.java.lang.String = (((ref).ScalaeType).asInstanceOf[_root_.org.eclipse.emf.ecore.EClass]).getVarNameClassifier();
`~result` = ((((((((((((((`~result`).plus("self.")).plus(relName)).plus(".each{")).plus(nameVar)).plus(" | ")).plus(nameVar)).plus(".")).plus(visitMethodName)).plus("(")).plus(nameVarPruner)).plus(radiusCode)).plus(")")).plus((this).generateAddRelations(classVisit, (ref).asInstanceOf[_root_.org.eclipse.emf.ecore.EReference]))).asInstanceOf[_root_.java.lang.String];
if ((((((this).ScalaslicerGenerator).ScalaslicerModel).Scalastrict)).and((classVisit).not()))

{
`~result` = (((((((((((((`~result`).plus("\n\t\t\t\tif(not dup.isVoid and ")).plus(nameVar)).plus(".sliced) then\n\t\t\t\t\t")).plus("dup.asType(")).plus((((ref).container()).asInstanceOf[_root_.org.eclipse.emf.ecore.EClassifier]).Scalaname)).plus(").")).plus((ref).getValidKermetaName())).plus(".add(")).plus(nameVar)).plus(".dup.asType(")).plus(((ref).ScalaeType).Scalaname)).plus("))\n\t\t\t\tend\n\t\t\t")).asInstanceOf[_root_.java.lang.String];}

`~result` = ((`~result`).plus("}")).asInstanceOf[_root_.java.lang.String];}

if (isOption)

{
`~result` = ((`~result`).plus(" end")).asInstanceOf[_root_.java.lang.String];}

`~result` = ((`~result`).plus("\n")).asInstanceOf[_root_.java.lang.String];}
}
        }
 return `~result`
}

    def generateRelationCalls(eclass : _root_.org.eclipse.emf.ecore.EClass, classVisit : _root_.java.lang.Boolean):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
var visitMethodName : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String];
var nameVarPruner : _root_.java.lang.String = ("the").plus((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaname);
if (classVisit)

{
visitMethodName = ("visitToAddClasses").asInstanceOf[_root_.java.lang.String];}
else 


{
visitMethodName = ("visitToAddRelations").asInstanceOf[_root_.java.lang.String];}

`~result` = ("").asInstanceOf[_root_.java.lang.String];
((eclass).ScalaoutputFocusedRelations).each({(relation : _root_.org2.kermeta.kompren.slicer.SlicedProperty)=>

{
if (((relation).Scaladomain).isInstanceOf[_root_.org.eclipse.emf.ecore.EReference])

{
`~result` = ((`~result`).plus((this).generateRelationCall(((relation).Scaladomain).asInstanceOf[_root_.org.eclipse.emf.ecore.EReference], (relation).ScalaisOption, visitMethodName, nameVarPruner, classVisit))).asInstanceOf[_root_.java.lang.String];}
}
})
if ((((this).ScalaslicerGenerator).ScalaslicerModel).Scalastrict)

{
(((eclass).ScalaeStructuralFeatures).select({(sf : _root_.org.eclipse.emf.ecore.EStructuralFeature)=>

{
(((sf).isInstanceOf[_root_.org.eclipse.emf.ecore.EReference]).andThen({(b : _root_.java.lang.Boolean)=>

{
(((sf).ScalalowerBound) == (1))}
})).andThen({(b : _root_.java.lang.Boolean)=>

{
(((eclass).ScalaoutputFocusedRelations).exists({(ofr : _root_.org2.kermeta.kompren.slicer.SlicedProperty)=>

{
(((ofr).Scaladomain) == (sf))}
})).not()}
})}
})).each({(sf : _root_.org.eclipse.emf.ecore.EStructuralFeature)=>

{
`~result` = ((`~result`).plus((this).generateRelationCall((sf).asInstanceOf[_root_.org.eclipse.emf.ecore.EReference], false, visitMethodName, nameVarPruner, classVisit))).asInstanceOf[_root_.java.lang.String];}
})}
}
        }
 return `~result`
}

    def generateAddRelations(classVisit : _root_.java.lang.Boolean, relation : _root_.org.eclipse.emf.ecore.EReference):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ("").asInstanceOf[_root_.java.lang.String];
if ((((classVisit).not())).and(((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaslicedProperties).exists({(rel : _root_.org2.kermeta.kompren.slicer.SlicedProperty)=>

{
((((((rel).asInstanceOf[_root_.org2.kermeta.kompren.slicer.SlicedProperty]).Scaladomain) == (relation)))).and((_root_.k2.standard.KerRichFactory.isVoid((((rel).asInstanceOf[_root_.org2.kermeta.kompren.slicer.SlicedProperty]).Scalaexpression))).not())}
})))

{
var nameVar2 : _root_.java.lang.String = (((relation).ScalaeType).asInstanceOf[_root_.org.eclipse.emf.ecore.EClass]).getVarNameClassifier();
`~result` = ((((((((((((`~result`).plus("\n\t\t\t\tif(self.visitedForRelations and ")).plus(nameVar2)).plus(".visitedForRelations) then\n\t\t\t\t\tthe")).plus((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaname)).plus(".added")).plus((relation).Scalaname)).plus(".add(Class")).plus((relation).Scalaname)).plus(".new.initialise(self, ")).plus(nameVar2)).plus(")) end ")).asInstanceOf[_root_.java.lang.String];}
}
        }
 return `~result`
}

    def generateVisitAspect():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
var prunerVarName : _root_.java.lang.String = ("the").plus((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaname);
`~result` = ("class SlicerVisitor {\n").asInstanceOf[_root_.java.lang.String];
if ((((this).ScalaslicerGenerator).ScalaslicerModel).Scalastrict)

{
`~result` = ((`~result`).plus("\treference dup : Object\n\n")).asInstanceOf[_root_.java.lang.String];}

`~result` = ((((((((((`~result`).plus("\tattribute visitedPass : Boolean\n\n\t")).plus("attribute visitedForRelations : Boolean\n\n\tattribute sliced : Boolean\n\n\t")).plus("attribute idPass : Integer\n\n\t")).plus("operation initialiseAttributes(pass : Integer) is do\n\t\tself.visitedPass := false\n\t\t")).plus("self.sliced := false\n\t\tself.visitedForRelations := false\n\t\tself.idPass := pass\n\tend\n\n\t")).plus("operation visitToAddClasses(")).plus(prunerVarName)).plus(" : ")).plus((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaname)).asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius))).not())

{
`~result` = ((`~result`).plus(", currentRadius : Integer")).asInstanceOf[_root_.java.lang.String];}

`~result` = ((((((`~result`).plus(") is do\n\t\tself.visitedPass := true\n\tend\n\n\t")).plus("operation visitToAddRelations(")).plus(prunerVarName)).plus(" : ")).plus((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaname)).asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius))).not())

{
`~result` = ((`~result`).plus(", currentRadius : Integer")).asInstanceOf[_root_.java.lang.String];}

`~result` = (((((`~result`).plus(") is do\n\tend\n\n\toperation checkInitialisation(pass : Integer) is do\n\t\t")).plus("if(self.visitedPass.isVoid or self.idPass.isVoid.orElse{b | self.idPass!=pass}) then initialiseAttributes(pass) end\n\t")).plus("end\n\toperation checkCanReallyBeAdded() : Boolean is do\n")).plus("\t\tself.visitedPass := true\n\t\tresult := true\n\tend\n")).asInstanceOf[_root_.java.lang.String];
if ((((this).ScalaslicerGenerator).ScalaslicerModel).Scalastrict)

{
`~result` = ((`~result`).plus("\n\toperation createFrom() : Object is abstract\n")).asInstanceOf[_root_.java.lang.String];}

`~result` = ((`~result`).plus("}\n\n")).asInstanceOf[_root_.java.lang.String];}
        }
 return `~result`
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org2.kermeta.kompren.slicer.SlicerAspectGenerator"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

