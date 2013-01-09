package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait SlicerClassGeneratorAspect  extends _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.GeneratorAspect with `_root_`.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerClassGenerator{

    def initialise(slicer : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator):_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerClassGenerator = {
var `~result` : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerClassGenerator = null.asInstanceOf[_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerClassGenerator]; 
  { 


{
(this).ScalaslicerGenerator = (slicer).asInstanceOf[_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator];
`~result` = (this).asInstanceOf[_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerClassGenerator];}
        }
 return `~result`
}

    override def generateCode():_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
var linedHelper : _root_.k2.standard.KermetaSequence[_root_.java.lang.String] = null.asInstanceOf[_root_.k2.standard.KermetaSequence[_root_.java.lang.String]];
if (_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).Scalahelper)))

{
linedHelper = (null).asInstanceOf[_root_.k2.standard.KermetaSequence[_root_.java.lang.String]];}
else 


{
linedHelper = (((((this).ScalaslicerGenerator).ScalaslicerModel).Scalahelper).ksplit("\n")).asInstanceOf[_root_.k2.standard.KermetaSequence[_root_.java.lang.String]];}

(this).ScalageneratedCode = (((this).ScalaslicerGenerator).getPackageFromClasses(((this).ScalaslicerGenerator).ScalaaspectisedClasses)).asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid((linedHelper))).not())

{
var requireStr : _root_.java.lang.String = "require \"";
(linedHelper).collect({(str : _root_.java.lang.String)=>

{
if ((str).contains(requireStr))

{
(this).ScalageneratedCode = ((((this).ScalageneratedCode).plus(str)).plus("\n")).asInstanceOf[_root_.java.lang.String];
(((this).ScalaslicerGenerator).ScalaslicerModel).Scalahelper = (((((this).ScalaslicerGenerator).ScalaslicerModel).Scalahelper).replaceAll(str, "")).asInstanceOf[_root_.java.lang.String];}
}
})}

if ((((this).ScalaslicerGenerator).ScalaslicerModel).Scalastrict)

{
(this).ScalageneratedCode = (((this).ScalageneratedCode).plus("using kermeta::emfpersistence")).asInstanceOf[_root_.java.lang.String];}

(this).ScalageneratedCode = ((((this).ScalageneratedCode).plus("\nusing kermeta::standard\nusing kermeta::utils\nusing kermeta::io::StdIO => stdio\n")).plus(((this).ScalaslicerGenerator).getUsingsFromClasses(((this).ScalaslicerGenerator).ScalaaspectisedClasses))).asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid((linedHelper))).not())

{
var usingStr : _root_.java.lang.String = "using ";
(linedHelper).collect({(str : _root_.java.lang.String)=>

{
if ((str).contains(usingStr))

{
(this).ScalageneratedCode = ((((this).ScalageneratedCode).plus(str)).plus("\n")).asInstanceOf[_root_.java.lang.String];
(((this).ScalaslicerGenerator).ScalaslicerModel).Scalahelper = (((((this).ScalaslicerGenerator).ScalaslicerModel).Scalahelper).replaceAll(str, "")).asInstanceOf[_root_.java.lang.String];}
}
})}

(this).ScalageneratedCode = (((((this).ScalageneratedCode).plus("class ")).plus((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaname)).plus(" {\n")).asInstanceOf[_root_.java.lang.String];
if ((((this).ScalaslicerGenerator).ScalaslicerModel).Scalastrict)

{
(this).ScalageneratedCode = (((this).ScalageneratedCode).plus("\treference sliceRoots : Bag<SlicerVisitor>\n")).asInstanceOf[_root_.java.lang.String];}
else 


{
if ((_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius))).not())

{
(this).ScalageneratedCode = (((this).ScalageneratedCode).plus("\tattribute radius : Integer\n\n")).asInstanceOf[_root_.java.lang.String];}

((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaconstraints).each({(const : _root_.org2.kermeta.kompren.slicer.Constraint)=>

{
(this).ScalageneratedCode = (((((this).ScalageneratedCode).plus("\tattribute ")).plus((const).Scalaname)).plus(" : Boolean\n\n")).asInstanceOf[_root_.java.lang.String];}
})}

((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaslicedProperties).each({(elt : _root_.org2.kermeta.kompren.slicer.SlicedProperty)=>

{
if (((_root_.k2.standard.KerRichFactory.isVoid(((elt).ScalaisOption))).not()).andThen({(b : _root_.java.lang.Boolean)=>

{
(elt).ScalaisOption}
}))

{
(this).ScalageneratedCode = (((((this).ScalageneratedCode).plus("\tattribute consider")).plus(((elt).Scaladomain).Scalaname)).plus(" : Boolean\n\n")).asInstanceOf[_root_.java.lang.String];}
}
})
if (((this).ScalaslicerGenerator).ScalahasOpposite)

{
(this).ScalageneratedCode = (((((this).ScalageneratedCode).plus("\treference model : ")).plus((((this).ScalaslicerGenerator).ScalarootClass).Scalaname)).plus("\n\n")).asInstanceOf[_root_.java.lang.String];}

(this).ScalageneratedCode = (((this).ScalageneratedCode).plus("\tattribute idPass : Integer\n\n")).asInstanceOf[_root_.java.lang.String];
(this).ScalageneratedCode = ((((((((((this).ScalageneratedCode).plus((this).generateRequiredAttributes())).plus((this).generateAddedAttributes())).plus((this).generateIntialiseOperation())).plus((this).generateLaunchOperation())).plus("\n")).plus((this).generateAddOperations())).plus((this).generateOnEndMethod())).plus((this).generateOnStartMethod())).asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).Scalahelper))).not())

{
(this).ScalageneratedCode = (((this).ScalageneratedCode).plus((((this).ScalaslicerGenerator).ScalaslicerModel).Scalahelper)).asInstanceOf[_root_.java.lang.String];}

(this).ScalageneratedCode = (((((this).ScalageneratedCode).plus("\n")).plus("}\n")).plus((this).generateRelationClasses())).asInstanceOf[_root_.java.lang.String];}
        }
 
}

    def generateOnEndMethod():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ("\toperation onEnd() is do\n").asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaonEnd))).not())

{
`~result` = (((`~result`).plus((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaonEnd)).plus("\n")).asInstanceOf[_root_.java.lang.String];}

`~result` = ((`~result`).plus("\tend\n")).asInstanceOf[_root_.java.lang.String];}
        }
 return `~result`
}

    def generateOnStartMethod():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ("\toperation onStart() is do\n").asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaonStart))).not())

{
`~result` = (((`~result`).plus((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaonStart)).plus("\n")).asInstanceOf[_root_.java.lang.String];}

`~result` = ((`~result`).plus("\tend\n")).asInstanceOf[_root_.java.lang.String];}
        }
 return `~result`
}

    def generateRelationClasses():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ("").asInstanceOf[_root_.java.lang.String];
((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaslicedProperties).each({(rel : _root_.org2.kermeta.kompren.slicer.SlicedProperty)=>

{
if ((_root_.k2.standard.KerRichFactory.isVoid(((rel).Scalaexpression))).not())

{
`~result` = (((((((((((((((((`~result`).plus("class Class")).plus(((rel).Scaladomain).Scalaname)).plus(" {\n")).plus("\treference src : ")).plus((((rel).Scaladomain).ScalaeContainingClass).Scalaname)).plus("\n")).plus("\treference tar : ")).plus(((((rel).Scaladomain).ScalaeType).asInstanceOf[_root_.org.eclipse.emf.ecore.EClass]).Scalaname)).plus("\n")).plus("\toperation initialise(src : ")).plus((((rel).Scaladomain).ScalaeContainingClass).Scalaname)).plus(", tar : ")).plus(((((rel).Scaladomain).ScalaeType).asInstanceOf[_root_.org.eclipse.emf.ecore.EClass]).Scalaname)).plus(") : Class")).plus(((rel).Scaladomain).Scalaname)).plus(" is do\n\t\tresult := self\n\t\tself.src := src\n\t\tself.tar := tar\n\tend\n}\n")).asInstanceOf[_root_.java.lang.String];}
}
})}
        }
 return `~result`
}

    def generateAddOperations():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ("").asInstanceOf[_root_.java.lang.String];
((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaslicedClasses).each({(clazz : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
if ((_root_.k2.standard.KerRichFactory.isVoid(((clazz).Scalaexpression))).not())

{
`~result` = ((((((((`~result`).plus("\toperation on")).plus(((clazz).Scaladomain).Scalaname)).plus("Added(")).plus(((clazz).Scalactx).ScalavarName)).plus(" : ")).plus(((clazz).Scaladomain).Scalaname)).plus(") is do\n")).asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid(((clazz).Scalaexpression))).not())

{
`~result` = ((`~result`).plus((clazz).Scalaexpression)).asInstanceOf[_root_.java.lang.String];}

`~result` = ((`~result`).plus("\n\tend\n")).asInstanceOf[_root_.java.lang.String];}
}
})
((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaslicedProperties).each({(rel : _root_.org2.kermeta.kompren.slicer.SlicedProperty)=>

{
if ((_root_.k2.standard.KerRichFactory.isVoid(((rel).Scalaexpression))).not())

{
var `type` : _root_.org.eclipse.emf.ecore.EClass = (((rel).Scaladomain).ScalaeType).asInstanceOf[_root_.org.eclipse.emf.ecore.EClass];
`~result` = (((((((((((((`~result`).plus("\toperation on")).plus((((rel).Scaladomain).ScalaeContainingClass).Scalaname)).plus(((rel).Scaladomain).Scalaname)).plus("Added(")).plus(((rel).Scalasrc).ScalavarName)).plus(" : ")).plus((((rel).Scaladomain).ScalaeContainingClass).Scalaname)).plus(", ")).plus(((rel).Scalatgt).ScalavarName)).plus(" : ")).plus((`type`).Scalaname)).plus(") is do\n")).asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid(((rel).Scalaexpression))).not())

{
`~result` = ((`~result`).plus((rel).Scalaexpression)).asInstanceOf[_root_.java.lang.String];}

`~result` = ((`~result`).plus("\n\tend\n")).asInstanceOf[_root_.java.lang.String];}
}
})}
        }
 return `~result`
}

    def generateLaunchOperation():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ("\toperation launch() is do\n").asInstanceOf[_root_.java.lang.String];
if (((this).ScalaslicerGenerator).ScalahasOpposite)

{
`~result` = ((`~result`).plus("\t\tself.model.feedOpposites()\n")).asInstanceOf[_root_.java.lang.String];}

`~result` = ((`~result`).plus("\t\tonStart()\n")).asInstanceOf[_root_.java.lang.String];
((((this).ScalaslicerGenerator).ScalaslicerModel).ScalainputClasses).each({(clazz : _root_.org.eclipse.emf.ecore.EClass)=>

{
`~result` = ((((((((`~result`).plus("\t\tself.")).plus((clazz).getRequiredAttributeName())).plus(".each{")).plus((clazz).getVarNameClassifier())).plus(" | ")).plus((clazz).getVarNameClassifier())).plus(".visitToAddClasses(self")).asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius))).not())

{
`~result` = ((`~result`).plus(", 0")).asInstanceOf[_root_.java.lang.String];}

`~result` = ((`~result`).plus(") }\n")).asInstanceOf[_root_.java.lang.String];}
})
((((this).ScalaslicerGenerator).ScalaslicerModel).ScalainputClasses).each({(clazz : _root_.org.eclipse.emf.ecore.EClass)=>

{
`~result` = ((((((((`~result`).plus("\t\tself.")).plus((clazz).getRequiredAttributeName())).plus(".each{")).plus((clazz).getVarNameClassifier())).plus(" | ")).plus((clazz).getVarNameClassifier())).plus(".visitToAddRelations(self")).asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius))).not())

{
`~result` = ((`~result`).plus(", 0")).asInstanceOf[_root_.java.lang.String];}

`~result` = ((`~result`).plus(") }\n")).asInstanceOf[_root_.java.lang.String];}
})
if (((((this).ScalaslicerGenerator).ScalaslicerModel).Scalastrict).not())

{
((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaslicedClasses).each({(eclass : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
if ((_root_.k2.standard.KerRichFactory.isVoid(((eclass).Scalaexpression))).not())

{
var varName : _root_.java.lang.String = ((eclass).Scaladomain).getVarNameClassifier();
var endCode : _root_.java.lang.String = "";
`~result` = ((((((`~result`).plus("\t\tself.")).plus(((eclass).Scaladomain).getAddedAttributeName())).plus(".each{")).plus(varName)).plus(" | ")).asInstanceOf[_root_.java.lang.String];
if ((_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius))).not())

{
if (((((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius).ScalafocusedClasses).contains(eclass)).not())

{
`~result` = ((((`~result`).plus("if(")).plus(varName)).plus(".checkCanReallyBeAdded()) then ")).asInstanceOf[_root_.java.lang.String];
endCode = (" end").asInstanceOf[_root_.java.lang.String];}
}

`~result` = ((((((((`~result`).plus("on")).plus(((eclass).Scaladomain).Scalaname)).plus("Added(")).plus(varName)).plus(")")).plus(endCode)).plus(" }\n")).asInstanceOf[_root_.java.lang.String];}
}
})
((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaslicedProperties).each({(rel : _root_.org2.kermeta.kompren.slicer.SlicedProperty)=>

{
if ((_root_.k2.standard.KerRichFactory.isVoid(((rel).Scalaexpression))).not())

{
var varName : _root_.java.lang.String = ("the").plus(((rel).Scaladomain).Scalaname);
`~result` = (((((((((((((`~result`).plus("\t\tself.added")).plus(((rel).Scaladomain).Scalaname)).plus(".each{")).plus(varName)).plus(" | self.on")).plus((((rel).Scaladomain).ScalaeContainingClass).Scalaname)).plus(((rel).Scaladomain).Scalaname)).plus("Added(")).plus(varName)).plus(".src, ")).plus(varName)).plus(".tar) }\n")).asInstanceOf[_root_.java.lang.String];}
}
})}

`~result` = ((`~result`).plus("\t\tonEnd()\n\tend\n")).asInstanceOf[_root_.java.lang.String];}
        }
 return `~result`
}

    def generateIntialiseOperation():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
var i : _root_.java.lang.Integer = 0;
`~result` = ("\toperation initialise(").asInstanceOf[_root_.java.lang.String];
((((this).ScalaslicerGenerator).ScalaslicerModel).ScalainputClasses).each({(clazz : _root_.org.eclipse.emf.ecore.EClass)=>

{
if ((i).isGreater(0))

{
`~result` = ((`~result`).plus(", ")).asInstanceOf[_root_.java.lang.String];}

`~result` = (((((`~result`).plus((clazz).getRequiredAttributeName())).plus(" : bag ")).plus((clazz).Scalaname)).plus("[0..*]")).asInstanceOf[_root_.java.lang.String];
i = ((i).plus(1)).asInstanceOf[_root_.java.lang.Integer];}
})
if (((((this).ScalaslicerGenerator).ScalaslicerModel).Scalastrict).not())

{
if ((_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius))).not())

{
`~result` = ((`~result`).plus(", radius : Integer")).asInstanceOf[_root_.java.lang.String];}

((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaconstraints).each({(param : _root_.org2.kermeta.kompren.slicer.Constraint)=>

{
`~result` = ((((`~result`).plus(", ")).plus((param).Scalaname)).plus(" : Boolean")).asInstanceOf[_root_.java.lang.String];}
})}

((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaslicedProperties).each({(rel : _root_.org2.kermeta.kompren.slicer.SlicedProperty)=>

{
if (((_root_.k2.standard.KerRichFactory.isVoid((rel))).not()).andThen({(b : _root_.java.lang.Boolean)=>

{
(rel).ScalaisOption}
}))

{
`~result` = ((((`~result`).plus(", consider")).plus(((rel).Scaladomain).Scalaname)).plus(" : Boolean")).asInstanceOf[_root_.java.lang.String];}
}
})
if (((this).ScalaslicerGenerator).ScalahasOpposite)

{
`~result` = (((`~result`).plus(", model : ")).plus((((this).ScalaslicerGenerator).ScalarootClass).Scalaname)).asInstanceOf[_root_.java.lang.String];}

`~result` = ((((`~result`).plus(") : ")).plus((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaname)).plus(" is do\n")).asInstanceOf[_root_.java.lang.String];
`~result` = ((`~result`).plus("\t\tresult := self\n")).asInstanceOf[_root_.java.lang.String];
if (((this).ScalaslicerGenerator).ScalahasOpposite)

{
`~result` = ((`~result`).plus("\t\tself.model := model\n")).asInstanceOf[_root_.java.lang.String];}

if ((((this).ScalaslicerGenerator).ScalaslicerModel).Scalastrict)

{
`~result` = ((`~result`).plus("\t\tself.sliceRoots := Bag<SlicerVisitor>.new\n")).asInstanceOf[_root_.java.lang.String];}
else 


{
((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaslicedClasses).each({(clazz : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
`~result` = ((((((`~result`).plus("\t\tself.")).plus(((clazz).Scaladomain).getAddedAttributeName())).plus(" := Bag<")).plus(((clazz).Scaladomain).Scalaname)).plus(">.new\n")).asInstanceOf[_root_.java.lang.String];}
})
((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaslicedProperties).each({(rel : _root_.org2.kermeta.kompren.slicer.SlicedProperty)=>

{
if ((_root_.k2.standard.KerRichFactory.isVoid(((rel).Scalaexpression))).not())

{
`~result` = ((((((`~result`).plus("\t\tself.added")).plus(((rel).Scaladomain).Scalaname)).plus(" := Bag<Class")).plus(((rel).Scaladomain).Scalaname)).plus(">.new\n")).asInstanceOf[_root_.java.lang.String];}
}
})
if ((_root_.k2.standard.KerRichFactory.isVoid(((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaradius))).not())

{
`~result` = ((`~result`).plus("\t\tself.radius := radius\n")).asInstanceOf[_root_.java.lang.String];}

((((this).ScalaslicerGenerator).ScalaslicerModel).Scalaconstraints).each({(param : _root_.org2.kermeta.kompren.slicer.Constraint)=>

{
`~result` = ((((((`~result`).plus("\t\tself.")).plus((param).Scalaname)).plus(" := ")).plus((param).Scalaname)).plus("\n")).asInstanceOf[_root_.java.lang.String];}
})}

((((this).ScalaslicerGenerator).ScalaslicerModel).ScalainputClasses).each({(clazz : _root_.org.eclipse.emf.ecore.EClass)=>

{
`~result` = ((((`~result`).plus("\t\tself.")).plus((clazz).getRequiredAttributeName())).plus(".clear()\n")).asInstanceOf[_root_.java.lang.String];
`~result` = ((((((`~result`).plus("\t\tself.")).plus((clazz).getRequiredAttributeName())).plus(".addAll(")).plus((clazz).getRequiredAttributeName())).plus(")\n")).asInstanceOf[_root_.java.lang.String];}
})
((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaslicedProperties).each({(rel : _root_.org2.kermeta.kompren.slicer.SlicedProperty)=>

{
if (((_root_.k2.standard.KerRichFactory.isVoid(((rel).ScalaisOption))).not()).andThen({(b : _root_.java.lang.Boolean)=>

{
(rel).ScalaisOption}
}))

{
`~result` = ((((((`~result`).plus("\t\tself.consider")).plus(((rel).Scaladomain).Scalaname)).plus(" := consider")).plus(((rel).Scaladomain).Scalaname)).plus("\n")).asInstanceOf[_root_.java.lang.String];}
}
})
`~result` = ((`~result`).plus("\n\t\tif(idPass.isVoid) then idPass := 0\n\t\telse idPass := idPass + 1 end\n")).asInstanceOf[_root_.java.lang.String];
`~result` = ((`~result`).plus("\tend\n\n")).asInstanceOf[_root_.java.lang.String];}
        }
 return `~result`
}

    def generateAddedAttributes():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ("").asInstanceOf[_root_.java.lang.String];
if (((((this).ScalaslicerGenerator).ScalaslicerModel).Scalastrict).not())

{
((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaslicedClasses).each({(clazz : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
`~result` = ((((((`~result`).plus("\treference ")).plus(((clazz).Scaladomain).getAddedAttributeName())).plus(" : Bag<")).plus(((clazz).Scaladomain).Scalaname)).plus(">\n\n")).asInstanceOf[_root_.java.lang.String];}
})
((((this).ScalaslicerGenerator).ScalaslicerModel).ScalaslicedProperties).each({(rel : _root_.org2.kermeta.kompren.slicer.SlicedProperty)=>

{
if ((_root_.k2.standard.KerRichFactory.isVoid(((rel).Scalaexpression))).not())

{
`~result` = ((((((`~result`).plus("\treference added")).plus(((rel).Scaladomain).Scalaname)).plus(" : Bag<Class")).plus(((rel).Scaladomain).Scalaname)).plus(">\n\n")).asInstanceOf[_root_.java.lang.String];}
}
})}
}
        }
 return `~result`
}

    def generateRequiredAttributes():_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ("").asInstanceOf[_root_.java.lang.String];
((((this).ScalaslicerGenerator).ScalaslicerModel).ScalainputClasses).each({(eclass : _root_.org.eclipse.emf.ecore.EClass)=>

{
`~result` = ((((((`~result`).plus("\treference ")).plus((eclass).getRequiredAttributeName())).plus(" : ")).plus((eclass).Scalaname)).plus("[0..*]\n\n")).asInstanceOf[_root_.java.lang.String];}
})}
        }
 return `~result`
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org2.kermeta.kompren.slicer.SlicerClassGenerator"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

