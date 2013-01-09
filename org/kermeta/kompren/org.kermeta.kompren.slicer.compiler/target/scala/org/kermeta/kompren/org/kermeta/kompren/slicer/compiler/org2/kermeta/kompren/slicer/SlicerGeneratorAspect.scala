package org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.ImplicitConversion._
trait SlicerGeneratorAspect  extends _root_.k2.standard.KermetaObjectAspect with `_root_`.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator{
var metamodel : _root_.org.eclipse.emf.ecore.EPackage= _
def KergetMetamodel() : _root_.org.eclipse.emf.ecore.EPackage={this.metamodel}
def KersetMetamodel(arg:_root_.org.eclipse.emf.ecore.EPackage)={ this.metamodel = arg}
def Scalametamodel : _root_.org.eclipse.emf.ecore.EPackage={this.KergetMetamodel().asInstanceOf[_root_.org.eclipse.emf.ecore.EPackage]}
def Scalametamodel_=(`~value` : _root_.org.eclipse.emf.ecore.EPackage):Unit={this.KersetMetamodel(`~value`)}
var modelURI : _root_.java.lang.String= _
def KergetModelURI() : _root_.java.lang.String={this.modelURI}
def KersetModelURI(arg:_root_.java.lang.String)={ this.modelURI = arg}
def ScalamodelURI : _root_.java.lang.String={this.KergetModelURI().asInstanceOf[_root_.java.lang.String]}
def ScalamodelURI_=(`~value` : _root_.java.lang.String):Unit={this.KersetModelURI(`~value`)}
var requiredAspectFiles : _root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.String]= _
def KergetRequiredAspectFiles() : _root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.String]={this.requiredAspectFiles}
def KersetRequiredAspectFiles(arg:_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.String])={ this.requiredAspectFiles = arg}
def ScalarequiredAspectFiles : _root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.String]={this.KergetRequiredAspectFiles().asInstanceOf[_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.String]]}
def ScalarequiredAspectFiles_=(`~value` : _root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.String]):Unit={this.KersetRequiredAspectFiles(`~value`)}
var slicerModel : _root_.org2.kermeta.kompren.slicer.Slicer= _
def KergetSlicerModel() : _root_.org2.kermeta.kompren.slicer.Slicer={this.slicerModel}
def KersetSlicerModel(arg:_root_.org2.kermeta.kompren.slicer.Slicer)={ this.slicerModel = arg}
def ScalaslicerModel : _root_.org2.kermeta.kompren.slicer.Slicer={this.KergetSlicerModel().asInstanceOf[_root_.org2.kermeta.kompren.slicer.Slicer]}
def ScalaslicerModel_=(`~value` : _root_.org2.kermeta.kompren.slicer.Slicer):Unit={this.KersetSlicerModel(`~value`)}
var aspectisedClasses : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EClass] = k2.standard.KerRichFactory.createOrderedSet[_root_.org.eclipse.emf.ecore.EClass]
def KergetAspectisedClasses() : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EClass]={this.aspectisedClasses}
def KersetAspectisedClasses(arg:k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EClass])={ this.aspectisedClasses = arg}
def ScalaaspectisedClasses : k2.standard.ReflectiveOrderedSet[org2.kermeta.kompren.slicer.SlicerGenerator,_root_.org.eclipse.emf.ecore.EClass]={  new k2.standard.RichReflectiveOrderedSet[org2.kermeta.kompren.slicer.SlicerGenerator,_root_.org.eclipse.emf.ecore.EClass](thisUpper = -1,value=this.KergetAspectisedClasses())}
def ScalaaspectisedClasses_=(`~value` : k2.standard.KermetaOrderedSet[_root_.org.eclipse.emf.ecore.EClass]):Unit={this.KergetAspectisedClasses().clear
this.KergetAspectisedClasses().addAll(`~value`)
}
var slicerAspectGenerator : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerAspectGenerator= _
def KergetSlicerAspectGenerator() : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerAspectGenerator={this.slicerAspectGenerator}
def KersetSlicerAspectGenerator(arg:_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerAspectGenerator)={ this.slicerAspectGenerator = arg}
def ScalaslicerAspectGenerator : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerAspectGenerator={this.KergetSlicerAspectGenerator().asInstanceOf[_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerAspectGenerator]}
def ScalaslicerAspectGenerator_=(`~value` : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerAspectGenerator):Unit={this.KersetSlicerAspectGenerator(`~value`)}
var slicerClassGenerator : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerClassGenerator= _
def KergetSlicerClassGenerator() : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerClassGenerator={this.slicerClassGenerator}
def KersetSlicerClassGenerator(arg:_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerClassGenerator)={ this.slicerClassGenerator = arg}
def ScalaslicerClassGenerator : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerClassGenerator={this.KergetSlicerClassGenerator().asInstanceOf[_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerClassGenerator]}
def ScalaslicerClassGenerator_=(`~value` : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerClassGenerator):Unit={this.KersetSlicerClassGenerator(`~value`)}
var hasOpposite : _root_.java.lang.Boolean= _
def KergetHasOpposite() : _root_.java.lang.Boolean={this.hasOpposite}
def KersetHasOpposite(arg:_root_.java.lang.Boolean)={ this.hasOpposite = arg}
def ScalahasOpposite : _root_.java.lang.Boolean={this.KergetHasOpposite().asInstanceOf[_root_.java.lang.Boolean]}
def ScalahasOpposite_=(`~value` : _root_.java.lang.Boolean):Unit={this.KersetHasOpposite(`~value`)}
var allClasses : _root_.k2.standard.KermetaBag[_root_.org.eclipse.emf.ecore.EClass]= _
def KergetAllClasses() : _root_.k2.standard.KermetaBag[_root_.org.eclipse.emf.ecore.EClass]={this.allClasses}
def KersetAllClasses(arg:_root_.k2.standard.KermetaBag[_root_.org.eclipse.emf.ecore.EClass])={ this.allClasses = arg}
def ScalaallClasses : _root_.k2.standard.KermetaBag[_root_.org.eclipse.emf.ecore.EClass]={this.KergetAllClasses().asInstanceOf[_root_.k2.standard.KermetaBag[_root_.org.eclipse.emf.ecore.EClass]]}
def ScalaallClasses_=(`~value` : _root_.k2.standard.KermetaBag[_root_.org.eclipse.emf.ecore.EClass]):Unit={this.KersetAllClasses(`~value`)}
var rootClass : _root_.org.eclipse.emf.ecore.EClass= _
def KergetRootClass() : _root_.org.eclipse.emf.ecore.EClass={this.rootClass}
def KersetRootClass(arg:_root_.org.eclipse.emf.ecore.EClass)={ this.rootClass = arg}
def ScalarootClass : _root_.org.eclipse.emf.ecore.EClass={this.KergetRootClass().asInstanceOf[_root_.org.eclipse.emf.ecore.EClass]}
def ScalarootClass_=(`~value` : _root_.org.eclipse.emf.ecore.EClass):Unit={this.KersetRootClass(`~value`)}

    def initialise(slicerModel : _root_.org2.kermeta.kompren.slicer.Slicer, metamodel : _root_.org.eclipse.emf.ecore.EPackage, modelURI : _root_.java.lang.String):_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator = {
var `~result` : _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator = null.asInstanceOf[_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator]; 
  { 


{
`~result` = (this).asInstanceOf[_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerGenerator];
(this).ScalahasOpposite = (false).asInstanceOf[_root_.java.lang.Boolean];
(this).ScalarequiredAspectFiles = (_root_.k2.utils.KerRichFactory.createHashtable[_root_.java.lang.String,_root_.java.lang.String]).asInstanceOf[_root_.java.util.HashMap[_root_.java.lang.String, _root_.java.lang.String]];
(this).ScalaslicerModel = (slicerModel).asInstanceOf[_root_.org2.kermeta.kompren.slicer.Slicer];
(this).Scalametamodel = (metamodel).asInstanceOf[_root_.org.eclipse.emf.ecore.EPackage];
(this).ScalamodelURI = (modelURI).asInstanceOf[_root_.java.lang.String];
(this).checkClassesToSlice()
(this).updateModelForStrictSlicing()
(this).ScalaslicerAspectGenerator = ((_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.KerRichFactory.createSlicerAspectGenerator).initialise(this)).asInstanceOf[_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerAspectGenerator];
(this).ScalaslicerClassGenerator = ((_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.KerRichFactory.createSlicerClassGenerator).initialise(this)).asInstanceOf[_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.SlicerClassGenerator];
(((this).ScalaslicerModel).ScalaslicedElements).each({(se : _root_.org2.kermeta.kompren.slicer.SlicedElement)=>

{
if ((se).isInstanceOf[_root_.org2.kermeta.kompren.slicer.SlicedProperty])

{
var rel : _root_.org2.kermeta.kompren.slicer.SlicedProperty = (se).asInstanceOf[_root_.org2.kermeta.kompren.slicer.SlicedProperty];
if ((_root_.k2.standard.KerRichFactory.isVoid(((rel).Scalaopposite))).not())

{
(this).ScalahasOpposite = (true).asInstanceOf[_root_.java.lang.Boolean];
var ref : _root_.org.eclipse.emf.ecore.EReference = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.eclipse.emf.ecore.KerRichFactory.createEReference;
var relation : _root_.org2.kermeta.kompren.slicer.SlicedProperty = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.KerRichFactory.createSlicedProperty;
(ref).Scalaname = (((rel).Scalaopposite).Scalaname).asInstanceOf[_root_.java.lang.String];
(ref).ScalaeType = (((rel).Scaladomain).ScalaeContainingClass).asInstanceOf[_root_.org.eclipse.emf.ecore.EClassifier];
(ref).ScalaeOpposite = (((rel).Scaladomain).asInstanceOf[_root_.org.eclipse.emf.ecore.EReference]).asInstanceOf[_root_.org.eclipse.emf.ecore.EReference];
(((((rel).Scaladomain).ScalaeType).asInstanceOf[_root_.org.eclipse.emf.ecore.EClass]).ScalaeStructuralFeatures).add(ref)
(ref).ScalalowerBound = (0).asInstanceOf[_root_.java.lang.Integer];
(ref).ScalaupperBound = ((1).uminus()).asInstanceOf[_root_.java.lang.Integer];
(ref).Scalacontainment = (false).asInstanceOf[_root_.java.lang.Boolean];
(relation).Scaladomain = (ref).asInstanceOf[_root_.org.eclipse.emf.ecore.EStructuralFeature];
(relation).Scalaopposite = (null).asInstanceOf[_root_.org2.kermeta.kompren.slicer.OppositeCreation];
(relation).ScalaisOption = (false).asInstanceOf[_root_.java.lang.Boolean];
(((ref).ScalaeContainingClass).ScalaoutputFocusedRelations).add(relation)
(rel).Scaladomain = (ref).asInstanceOf[_root_.org.eclipse.emf.ecore.EStructuralFeature];}
else 


{
((((rel).Scaladomain).ScalaeContainingClass).ScalaoutputFocusedRelations).add(rel)}
}
}
})
(this).defineClassesToAspectise()
if ((this).ScalahasOpposite)

{
if (_root_.k2.standard.KerRichFactory.isVoid(((this).ScalaallClasses)))

{
(this).ScalaallClasses = ((metamodel).getAllClasses()).asInstanceOf[_root_.k2.standard.KermetaBag[_root_.org.eclipse.emf.ecore.EClass]];}

(this).ScalarootClass = ((this).computeRootClass()).asInstanceOf[_root_.org.eclipse.emf.ecore.EClass];}
}
        }
 return `~result`
}

    def updateModelForStrictSlicing():_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
if (((this).ScalaslicerModel).Scalastrict)

{
((this).ScalaslicerModel).ScalaonEnd = ((("\t\tvar repository : ResourceSet init ResourceSet.new\n\t\tvar resource : Resource \n\t\t//TODO: replace ./slice.xmi by a valid path, as platform:/project/slice.xmi\n \t\tresource ?= repository.createResource(\"./slice.xmi\", \"").plus(((this).ScalaslicerModel).ScalauriMetamodel)).plus("\")\n \t\t\n \t\tvar elts : OrderedSet<Object> init OrderedSet<Object>.new \n \t\tsliceRoots.each{elt |\n \t\t \tvar cont : Object init elt.container\n \t\t\tif(cont.isVoid.orElse{b | cont.asType(SlicerVisitor).sliced.isVoid.orElse{b2 | not cont.asType(SlicerVisitor).sliced}}) then\n \t\t\t\telts.add(elt.dup)\n \t\t\tend\n \t\t}\n \t\tresource.getContents.addAll(sliceRoots)\n \t\tresource.save(void)")).asInstanceOf[_root_.java.lang.String];
((this).ScalaslicerModel).Scalahelper = ("\toperation addToRoot(obj : Object) is do\n\t\tvar cont : Object init obj.container\n\t\tif(cont.isVoid.orElse{b | cont.isInstanceOf(SlicerVisitor)}) then\n\t\t\tsliceRoots.add(obj)\n\t\tend").asInstanceOf[_root_.java.lang.String];}
}
        }
 
}

    def checkClassesToSlice():_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
var size : _root_.java.lang.Integer = (((this).ScalaslicerModel).ScalaslicedElements).size();
var coll : _root_.k2.standard.KermetaBag[_root_.org2.kermeta.kompren.slicer.SlicedClass] = _root_.k2.standard.KerRichFactory.createBag[_root_.org2.kermeta.kompren.slicer.SlicedClass];
var slicedClassesToRemove : _root_.k2.standard.KermetaSequence[_root_.org2.kermeta.kompren.slicer.SlicedClass] = _root_.k2.standard.KerRichFactory.createSequence[_root_.org2.kermeta.kompren.slicer.SlicedClass];
if (((this).ScalaslicerModel).Scalastrict)

{
var newSlicedClass : _root_.org2.kermeta.kompren.slicer.SlicedClass = null.asInstanceOf[_root_.org2.kermeta.kompren.slicer.SlicedClass];
var ref : _root_.org.eclipse.emf.ecore.EReference = null.asInstanceOf[_root_.org.eclipse.emf.ecore.EReference];
(((this).ScalaslicerModel).ScalaslicedClasses).each({(sc : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
(((sc).Scaladomain).ScalaeStructuralFeatures).each({(sf : _root_.org.eclipse.emf.ecore.EStructuralFeature)=>

{
if ((sf).isInstanceOf[_root_.org.eclipse.emf.ecore.EReference])

{
ref = ((sf).asInstanceOf[_root_.org.eclipse.emf.ecore.EReference]).asInstanceOf[_root_.org.eclipse.emf.ecore.EReference];
var condi : _root_.java.lang.Boolean = (((((ref).ScalalowerBound) == (1))).andThen({(b : _root_.java.lang.Boolean)=>

{
((((this).ScalaslicerModel).ScalaslicedClasses).exists({(cl : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
((((cl).Scaladomain).getQualifiedName()) == (((ref).ScalaeType).getQualifiedName()))}
})).not()}
})).andThen({(b2 : _root_.java.lang.Boolean)=>

{
((coll).exists({(cl2 : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
((((cl2).Scaladomain).getQualifiedName()) == (((ref).ScalaeType).getQualifiedName()))}
})).not()}
});
if (condi)

{
newSlicedClass = (_root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.KerRichFactory.createSlicedClass).asInstanceOf[_root_.org2.kermeta.kompren.slicer.SlicedClass];
(newSlicedClass).Scaladomain = (((ref).ScalaeType).asInstanceOf[_root_.org.eclipse.emf.ecore.EClass]).asInstanceOf[_root_.org.eclipse.emf.ecore.EClass];
(coll).add(newSlicedClass)}
}
}
})}
})}

(coll).each({(sc : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
(((this).ScalaslicerModel).ScalaslicedElements).addAt(0, sc)}
})
(coll).clear()
(((this).ScalaslicerModel).ScalaslicedClasses).each({(sc : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
if (_root_.k2.standard.KerRichFactory.isVoid(((this).ScalaallClasses)))

{
(this).ScalaallClasses = (((this).Scalametamodel).getAllClasses()).asInstanceOf[_root_.k2.standard.KermetaBag[_root_.org.eclipse.emf.ecore.EClass]];}

if (((sc).Scaladomain).Scalaabstract)

{
(slicedClassesToRemove).add(sc)}

var sub : _root_.k2.standard.KermetaSequence[_root_.org.eclipse.emf.ecore.EClass] = ((sc).Scaladomain).getConcreteSubClasses((this).ScalaallClasses);
(sub).each({(subClass : _root_.org.eclipse.emf.ecore.EClass)=>

{
if ((((((this).ScalaslicerModel).ScalaslicedClasses).exists({(sc2 : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
((((sc2).Scaladomain).getQualifiedName()) == ((subClass).getQualifiedName()))}
})).not()).andThen({(b2 : _root_.java.lang.Boolean)=>

{
((coll).exists({(cl2 : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
((((cl2).Scaladomain).getQualifiedName()) == ((subClass).getQualifiedName()))}
})).not()}
}))

{
var slicedClass : _root_.org2.kermeta.kompren.slicer.SlicedClass = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org2.kermeta.kompren.slicer.KerRichFactory.createSlicedClass;
(slicedClass).Scaladomain = (subClass).asInstanceOf[_root_.org.eclipse.emf.ecore.EClass];
(coll).add(slicedClass)}
}
})}
})
(slicedClassesToRemove).each({(cl : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
(((this).ScalaslicerModel).ScalaslicedElements).remove(cl)}
})
(coll).each({(sc : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
(((this).ScalaslicerModel).ScalaslicedElements).addAt(0, sc)}
})
if (_root_.k2.utils.UTilScala.isNotEqual((size),(((this).ScalaslicerModel).ScalaslicedElements).size()))

{
(this).checkClassesToSlice()}
}
        }
 
}

    def computeRootClass():_root_.org.eclipse.emf.ecore.EClass = {
var `~result` : _root_.org.eclipse.emf.ecore.EClass = null.asInstanceOf[_root_.org.eclipse.emf.ecore.EClass]; 
  { 


{
var roots : _root_.k2.standard.KermetaSequence[_root_.org.eclipse.emf.ecore.EClass] = ((this).ScalaallClasses).select({(clazz : _root_.org.eclipse.emf.ecore.EClass)=>

{
(clazz).canBeRootClass((this).ScalaallClasses)}
});
if ((roots).isEmpty())

{
`~result` = (null).asInstanceOf[_root_.org.eclipse.emf.ecore.EClass];
(_root_.k2.io.StdIO).writeln("ERROR: NO ROOT CLASS DETECTED!")}
else 


{
if (((roots).size()).isGreater(1))

{
(_root_.k2.io.StdIO).writeln("ERROR: SEVERAL POSSIBLE ROOT CLASS DETECTED!")
(roots).each({(clazz : _root_.org.eclipse.emf.ecore.EClass)=>

{
(_root_.k2.io.StdIO).writeln((clazz).Scalaname)}
})}

`~result` = ((roots).one()).asInstanceOf[_root_.org.eclipse.emf.ecore.EClass];}
}
        }
 return `~result`
}

    def defineClassesToAspectise():_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
(((this).ScalaslicerModel).ScalaslicedProperties).each({(rel : _root_.org2.kermeta.kompren.slicer.SlicedProperty)=>

{
if ((((this).ScalaaspectisedClasses).exists({(cl : _root_.org.eclipse.emf.ecore.EClass)=>

{
(((cl).getQualifiedName()) == ((((rel).Scaladomain).ScalaeContainingClass).getQualifiedName()))}
})).not())

{
((this).ScalaaspectisedClasses).add(((rel).Scaladomain).ScalaeContainingClass)}

if ((((rel).Scaladomain).ScalaeType).isInstanceOf[_root_.org.eclipse.emf.ecore.EClass])

{
var eclass : _root_.org.eclipse.emf.ecore.EClass = (((rel).Scaladomain).ScalaeType).asInstanceOf[_root_.org.eclipse.emf.ecore.EClass];
if ((((this).ScalaaspectisedClasses).exists({(cl : _root_.org.eclipse.emf.ecore.EClass)=>

{
(((cl).getQualifiedName()) == ((eclass).getQualifiedName()))}
})).not())

{
((this).ScalaaspectisedClasses).add(eclass)}
}
}
})
(((this).ScalaslicerModel).ScalainputClasses).each({(eclass : _root_.org.eclipse.emf.ecore.EClass)=>

{
if ((((this).ScalaaspectisedClasses).exists({(cl : _root_.org.eclipse.emf.ecore.EClass)=>

{
(((cl).getQualifiedName()) == ((eclass).getQualifiedName()))}
})).not())

{
((this).ScalaaspectisedClasses).add(eclass)}
}
})
(((this).ScalaslicerModel).ScalaslicedClasses).each({(clazz : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
if ((((this).ScalaaspectisedClasses).exists({(cl : _root_.org.eclipse.emf.ecore.EClass)=>

{
(((cl).getQualifiedName()) == (((clazz).Scaladomain).getQualifiedName()))}
})).not())

{
((this).ScalaaspectisedClasses).add((clazz).Scaladomain)}
}
})
((this).ScalaaspectisedClasses).each({(eclass : _root_.org.eclipse.emf.ecore.EClass)=>

{
if (((((((((eclass).ScalaoutputFocusedRelations).empty())).and(((this).ScalaaspectisedClasses).exists({(eclass2 : _root_.org.eclipse.emf.ecore.EClass)=>

{
(eclass2).isSuperTypeOfBis(eclass)}
})))).and(((((this).ScalaslicerModel).ScalainputClasses).contains(eclass)).not()))).and(((((this).ScalaslicerModel).ScalaslicedClasses).exists({(sc : _root_.org2.kermeta.kompren.slicer.SlicedClass)=>

{
((((sc).Scaladomain).getQualifiedName()) == ((eclass).getQualifiedName()))}
})).not()))

{
((this).ScalaaspectisedClasses).remove(eclass)}
}
})}
        }
 
}

    def generateSlicer():_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
((this).ScalaslicerAspectGenerator).generateCode()
((this).ScalaslicerClassGenerator).generateCode()}
        }
 
}

    def getRequiresFromClasses(classes : org.eclipse.emf.common.util.EList[_root_.org.eclipse.emf.ecore.EClass]):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ("").asInstanceOf[_root_.java.lang.String];
if (((classes).size()).isGreater(1))

{
var packagesName : _root_.k2.standard.KermetaBag[_root_.java.lang.String] = _root_.k2.standard.KerRichFactory.createBag[_root_.java.lang.String];
(packagesName).add((((classes).last()).ScalaePackage).getQualifiedName())


{var i : _root_.java.lang.Integer = ((classes).size()).minus(2);
while (!((i).isLower(0)))


{
var name : _root_.java.lang.String = (((classes).at(i)).ScalaePackage).getQualifiedName();
if (((packagesName).contains(name)).not())

{
(packagesName).add(name)
`~result` = ((((`~result`).plus("require \"")).plus((((classes).at(i)).ScalaePackage).Scalaname)).plus("SlicingAspect.kmt\"\n")).asInstanceOf[_root_.java.lang.String];}

i = ((i).minus(1)).asInstanceOf[_root_.java.lang.Integer];}
}}
}
        }
 return `~result`
}

    def getUsingsFromClasses(classes : org.eclipse.emf.common.util.EList[_root_.org.eclipse.emf.ecore.EClass]):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
`~result` = ("").asInstanceOf[_root_.java.lang.String];
if (((classes).size()).isGreater(1))

{
var packagesName : _root_.k2.standard.KermetaBag[_root_.java.lang.String] = _root_.k2.standard.KerRichFactory.createBag[_root_.java.lang.String];
(packagesName).add((((classes).last()).ScalaePackage).getQualifiedName())


{var i : _root_.java.lang.Integer = ((classes).size()).minus(2);
while (!((i).isLower(0)))


{
var name : _root_.java.lang.String = (((classes).at(i)).ScalaePackage).getQualifiedName();
if (((packagesName).contains(name)).not())

{
(packagesName).add(name)
`~result` = ((((`~result`).plus("using ")).plus(name)).plus("\n")).asInstanceOf[_root_.java.lang.String];}

i = ((i).minus(1)).asInstanceOf[_root_.java.lang.Integer];}
}}
}
        }
 return `~result`
}

    def getPackageFromClasses(classes : org.eclipse.emf.common.util.EList[_root_.org.eclipse.emf.ecore.EClass]):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
if ((classes).empty())

{
`~result` = ("").asInstanceOf[_root_.java.lang.String];}
else 


{
`~result` = ((("package ").plus((((classes).last()).ScalaePackage).getQualifiedName())).plus(";\n")).asInstanceOf[_root_.java.lang.String];}
}
        }
 return `~result`
}

    def generateCodeKP(modelAspectFileName : _root_.java.lang.String, slicerFileName : _root_.java.lang.String, requiredAspectFileNames : _root_.k2.standard.KermetaBag[_root_.java.lang.String]):_root_.java.lang.String = {
var `~result` : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 
  { 


{
var metamodelName : _root_.java.lang.String = ((((this).ScalaslicerModel).ScalauriMetamodel).ksplit("/")).last();
var pkgName : _root_.java.lang.String = (((this).getPackageFromClasses((this).ScalaaspectisedClasses)).replaceAll(";\n", ("::").plus(((this).ScalaslicerModel).Scalaname))).replaceAll("package ", "");
`~result` = ((((((((((((("KermetaProject \"").plus(((this).ScalaslicerModel).Scalaname)).plus("\"\n\tgroupId = \"my.group\"\n\t")).plus("defaultMainClass =\"")).plus(pkgName)).plus("\"\n\t")).plus("defaultMainOperation = \"launch\"\n\tsources = {\n\t\t")).plus("require \"${project.baseUri}/")).plus(modelAspectFileName)).plus("\"\n\t\t")).plus("require \"${project.baseUri}/")).plus(slicerFileName)).plus("\"\n\t\t")).asInstanceOf[_root_.java.lang.String];
(requiredAspectFileNames).each({(name : _root_.java.lang.String)=>

{
`~result` = ((((`~result`).plus("require \"${project.baseUri}/")).plus(name)).plus("\"\n\t\t")).asInstanceOf[_root_.java.lang.String];}
})
`~result` = (((((`~result`).plus("require \"${project.baseUri}/")).plus(metamodelName)).plus("\"\n\t}\n\tdependencies = {\n\t\t")).plus("dependency \"library.core\" =\t\"platform:/plugin/org.kermeta.language.library.core\", \"mvn:org.kermeta.language/language.library.core/2.0.2\"\n\t}\n")).asInstanceOf[_root_.java.lang.String];}
        }
 return `~result`
}

    def copyMetamodel():_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
var metamodelName : _root_.java.lang.String = ((((this).ScalaslicerModel).ScalauriMetamodel).ksplit("/")).last();
(_root_.k2.io.FileIO).writeTextFile((((("platform:/resource/").plus(((this).ScalaslicerModel).Scalaname)).plus("/")).plus(metamodelName)).toURI(), (_root_.k2.io.FileIO).readTextFile((((this).ScalaslicerModel).ScalauriMetamodel).toURI()))}
        }
 
}

    def saveCode():_root_.scala.Unit = {
var `~result` : _root_.scala.Unit = null.asInstanceOf[_root_.scala.Unit]; 
  { 


{
var aspectFileNames : _root_.k2.standard.KermetaBag[_root_.java.lang.String] = _root_.k2.standard.KerRichFactory.createBag[_root_.java.lang.String];
(((this).ScalarequiredAspectFiles).keySet()).each({(key : _root_.java.lang.String)=>

{
(aspectFileNames).add((((key).ksplit("::")).last()).plus("SlicingAspect.kmt"))}
})
(_root_.k2.io.FileIO).writeTextFile(((((("platform:/resource/").plus(((this).ScalaslicerModel).Scalaname)).plus("/")).plus(((this).ScalaslicerModel).Scalaname)).plus(".kp")).toURI(), (this).generateCodeKP((((this).ScalaslicerModel).Scalaname).plus("Aspect.kmt"), (((this).ScalaslicerModel).Scalaname).plus(".kmt"), aspectFileNames))
(_root_.k2.io.FileIO).writeTextFile(((((("platform:/resource/").plus(((this).ScalaslicerModel).Scalaname)).plus("/")).plus(((this).ScalaslicerModel).Scalaname)).plus("Aspect.kmt")).toURI(), ((this).ScalaslicerAspectGenerator).ScalageneratedCode)
(_root_.k2.io.FileIO).writeTextFile(((((("platform:/resource/").plus(((this).ScalaslicerModel).Scalaname)).plus("/")).plus(((this).ScalaslicerModel).Scalaname)).plus(".kmt")).toURI(), ((this).ScalaslicerClassGenerator).ScalageneratedCode)
(this).copyMetamodel()
(((this).ScalarequiredAspectFiles).keySet()).each({(key : _root_.java.lang.String)=>

{
var subPkgs : _root_.k2.standard.KermetaSequence[_root_.java.lang.String] = (key).ksplit("::");
(_root_.k2.io.FileIO).writeTextFile(((((("platform:/resource/").plus(((this).ScalaslicerModel).Scalaname)).plus("/")).plus((subPkgs).last())).plus("SlicingAspect.kmt")).toURI(), ((this).ScalarequiredAspectFiles).get(key))}
})}
        }
 
}
override def getMetaClass():_root_.org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org2.kermeta.kompren.slicer.SlicerGenerator"); 
         if (cd !=null){ 
 var cl = _root_.org.kermeta.kompren.org.kermeta.kompren.slicer.compiler.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

