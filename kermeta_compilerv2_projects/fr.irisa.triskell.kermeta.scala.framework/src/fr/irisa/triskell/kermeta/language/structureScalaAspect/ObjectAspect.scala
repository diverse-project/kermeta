package fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
trait ObjectAspect with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect with fr.irisa.triskell.scala.generated.fw.ImplicitConversion with fr.irisa.triskell.kermeta.scala.framework.language.structure.Object{
def Scalatag : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Tag]={this.getTag()}
def Scalatag_=(arg : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Tag])={this.getTag().clear
this.getTag().addAll(arg)
}
def ScalaownedTags : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Tag]={this.getOwnedTags()}
def ScalaownedTags_=(arg : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Tag])={this.getOwnedTags().clear
this.getOwnedTags().addAll(arg)
}

    def checkInvariant(invariant : fr.irisa.triskell.kermeta.scala.framework.language.structure.Constraint):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
var minusOne : java.lang.Object = 1.uminus();
var cd : fr.irisa.triskell.kermeta.scala.framework.language.structure.ClassDefinition = this.getMetaClass().ScalaclassDefinition;
if (invariant.isInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.PropertyConstraint]){
var prop : fr.irisa.triskell.kermeta.scala.framework.language.structure.Property = invariant.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.PropertyConstraint].Scalaproperty;
var v : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object = this.get(prop);
if (v.isVoid()){
if (prop.Scalalower.equals(1)){
var e : kermeta.exceptions.ConstraintViolatedInv = kermeta.exceptions.RichFactory.createConstraintViolatedInv;
e.ScalaconstraintAppliedTo = this;
e.Scalamessage = "Invariant lower bound of ".plus(cd.Scalaname).plus("_").plus(prop.Scalaname).plus("_").plus((prop.Scalatype+"")).plus(" violated on ").plus((this+""));
e.ScalafailedConstraint = invariant;
throw e}
}
else 
{
if (v.isInstanceOf[java.util.List[_]]){
var coll : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Object] = v.asInstanceOf[java.util.List[_]];
if (prop.Scalaupper != (minusOne).and(coll.size().isGreater(prop.Scalaupper))){
var e : kermeta.exceptions.ConstraintViolatedInv = kermeta.exceptions.RichFactory.createConstraintViolatedInv;
e.ScalaconstraintAppliedTo = this;
e.Scalamessage = "Invariant upper bound of ".plus(cd.Scalaname).plus("_").plus(prop.Scalaname).plus("_").plus((prop.Scalatype+"")).plus(" violated on ").plus((this+""));
e.ScalafailedConstraint = invariant;
throw e}

if (coll.size().isLower(prop.Scalalower)){
var e : kermeta.exceptions.ConstraintViolatedInv = kermeta.exceptions.RichFactory.createConstraintViolatedInv;
e.ScalaconstraintAppliedTo = this;
e.Scalamessage = "Invariant lower bound of ".plus(cd.Scalaname).plus("_").plus(prop.Scalaname).plus("_").plus((prop.Scalatype+"")).plus(" violated on ").plus((this+""));
e.ScalafailedConstraint = invariant;
throw e}
}
}
}
else 
{
try {
 /*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */ 
} catch {
 case error:kermeta.exceptions.RuntimeError => {var e : kermeta.exceptions.ConstraintViolatedInv = kermeta.exceptions.RichFactory.createConstraintViolatedInv;
 e.ScalaconstraintAppliedTo = this;
 e.Scalamessage = "Invariant violated on ".plus((this+"")).plus("runtime error (probably due to another failed constraint or an error in the code of the constraint)");
 e.ScalafailedConstraint = invariant;
 e.ScalanestedException = error;
 throw e
 }
 }
}
}
 return result
}

    def isSet(property : fr.irisa.triskell.kermeta.scala.framework.language.structure.Property):java.lang.Object = {
var result : java.lang.Object = null.asInstanceOf[java.lang.Object]; 
{
try{
result = /*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */.asInstanceOf[Boolean];
}catch { case e:ClassCastException => {}}
}
 return result
}

    def get(property : fr.irisa.triskell.kermeta.scala.framework.language.structure.Property):fr.irisa.triskell.kermeta.scala.framework.language.structure.Object = {
var result : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object = null.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.Object]; 
{
result = /*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */;}
 return result
}

    def isKindOf(cl : fr.irisa.triskell.kermeta.scala.framework.language.structure.Class):java.lang.Object = {
var result : java.lang.Object = null.asInstanceOf[java.lang.Object]; 
{
result = this.getMetaClass().equals(cl);}
 return result
}

    def getMetaClass():fr.irisa.triskell.kermeta.scala.framework.language.structure.Class = {
var result : fr.irisa.triskell.kermeta.scala.framework.language.structure.Class = null.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.Class]; 
{
try{
result = /*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.Class];
}catch { case e:ClassCastException => {}}
}
 return result
}

    def equals(element : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object):java.lang.Object = {
var result : java.lang.Object = null.asInstanceOf[java.lang.Object]; 
{
try{
result = /*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */.asInstanceOf[Boolean];
}catch { case e:ClassCastException => {}}
}
 return result
}

    def set(property : fr.irisa.triskell.kermeta.scala.framework.language.structure.Property, element : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
if (element.isInstanceOf[property.Scalatype]){
/*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */}
else 
{
var v : fr.irisa.triskell.kermeta.scala.framework.language.structure.EnumerationLiteral = null.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.EnumerationLiteral];
try{
v = element.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.EnumerationLiteral];
}catch { case e:ClassCastException => {}}

if (v != (null).andThen({(e)=>{
property.Scalatype.equals(v.Scalaenumeration)}
})){
/*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */}
else 
{
var e : kermeta.exceptions.IncompatibleTypeError = kermeta.exceptions.RichFactory.createIncompatibleTypeError;
e.Scalamessage = "IncompatibleTypeError : Cannot set property ".plus(property.Scalaname).plus(" of object ").plus((this+"")).plus(" to ").plus((element+"")).plus(".");
throw e}
}
}
 return result
}

    def isFrozen():java.lang.Object = {
var result : java.lang.Object = null.asInstanceOf[java.lang.Object]; 
{
try{
result = /*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */.asInstanceOf[Boolean];
}catch { case e:ClassCastException => {}}
}
 return result
}

    def checkInvariants():Void = {
var result : Void = null.asInstanceOf[Void]; 
{
var cd : fr.irisa.triskell.kermeta.scala.framework.language.structure.ClassDefinition = this.getMetaClass().ScalaclassDefinition;
if (cd.isVoid().not()){
cd.ScalaeAllAttributes.each({(p)=>{
if (p.Scalatag.exists({(t)=>{
t.Scalaname.equals("ecore.isTransient")}
}).not().and(p.ScalaisDerived.not())){
var v : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object = this.get(p);
if (v.isVoid().not().andThen({(f)=>{
v.isInstanceOf[java.util.List[_]]}
})){
var c : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Object] = v.asInstanceOf[java.util.List[_]];
if (p.Scalaupper != (1.uminus()).and(c.size().isGreater(p.Scalaupper))){
var e : kermeta.exceptions.ConstraintViolatedInv = kermeta.exceptions.RichFactory.createConstraintViolatedInv;
e.ScalaconstraintAppliedTo = this;
e.Scalamessage = "Inv upper bound of ".plus(cd.Scalaname).plus(".").plus(p.Scalaname).plus(" violated on ").plus((this+""));
throw e}

if (c.size().isLower(p.Scalalower)){
var e : kermeta.exceptions.ConstraintViolatedInv = kermeta.exceptions.RichFactory.createConstraintViolatedInv;
e.ScalaconstraintAppliedTo = this;
e.Scalamessage = "Inv lower bound of ".plus(cd.Scalaname).plus(".").plus(p.Scalaname).plus(" violated on ").plus((this+""));
throw e}
}
else 
{
if (p.Scalalower.equals(1).and(v.isVoid())){
var e : kermeta.exceptions.ConstraintViolatedInv = kermeta.exceptions.RichFactory.createConstraintViolatedInv;
e.ScalaconstraintAppliedTo = this;
e.Scalamessage = "Inv lower bound of ".plus(cd.Scalaname).plus(".").plus(p.Scalaname).plus(" violated on ").plus((this+""));
throw e}
}
}
}
})}

/*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */}
 return result
}

    def hashcode():java.lang.Object = {
var result : java.lang.Object = null.asInstanceOf[java.lang.Object]; 
{
try{
result = /*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */.asInstanceOf[Int];
}catch { case e:ClassCastException => {}}
}
 return result
}

    def getViolatedConstraints():kermeta.exceptions.ConstraintsDiagnostic = {
var result : kermeta.exceptions.ConstraintsDiagnostic = null.asInstanceOf[kermeta.exceptions.ConstraintsDiagnostic]; 
{
var contraintes : kermeta.exceptions.ConstraintsDiagnostic = kermeta.exceptions.RichFactory.createConstraintsDiagnostic.initialize();
var cd : fr.irisa.triskell.kermeta.scala.framework.language.structure.ClassDefinition = null.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.ClassDefinition];
cd = this.getMetaClass().ScalaclassDefinition;
if (cd.isVoid().not()){
cd.Scalainv.each({(invariant)=>try {
 checkInvariant(invariant) 
} catch {
 case e:kermeta.exceptions.ConstraintViolatedInv => {stdio.writeln("    ".plus(e.Scalamessage))
 contraintes.add(e)
 }
 }
})
cd.getCachedAllAttribute().each({(prop)=>{
if (prop.Scalatag.exists({(t)=>{
t.Scalaname.equals("ecore.isTransient")}
}).not().and(prop.ScalaisDerived.not())){
var constraint : fr.irisa.triskell.kermeta.scala.framework.language.structure.PropertyConstraint = prop.ScalapropertyConstraint;
if (constraint.isVoid()){
constraint = fr.irisa.triskell.kermeta.scala.framework.language.structureScalaAspect.RichFactory.createPropertyConstraint;
if (prop.Scalatype.isInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.ParameterizedType]){
constraint.Scalaname = cd.Scalaname.plus("_").plus(prop.Scalaname).plus("_").plus(prop.Scalatype.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.ParameterizedType].ScalatypeDefinition.Scalaname);}
else 
{
constraint.Scalaname = cd.Scalaname.plus("_").plus(prop.Scalaname).plus("_").plus((prop.Scalatype+""));}

constraint.Scalaproperty = prop;}

try {
 checkInvariant(constraint) 
} catch {
 case e:kermeta.exceptions.ConstraintViolatedInv => {contraintes.add(e)
 }
 }

if (prop.ScalaisComposite.and(prop.getViolatedConstraintsMustDrillDown())){
var propValue : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object = this.get(prop);
if (propValue.isVoid().not()){
if (prop.Scalaupper.equals(1)){
if (propValue.isInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.EnumerationLiteral].not()){
propValue.getViolatedConstraints().ScalasetConstraints.each({(v)=>{
stdio.writeln("    ".plus(v.Scalamessage))
contraintes.add(v)}
})}
}
else 
{
var subObjInstances : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Object] = null.asInstanceOf[java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Object]];
try{
subObjInstances = propValue.asInstanceOf[java.util.List];
}catch { case e:ClassCastException => {}}

subObjInstances.each({(aSubObjInstance)=>{
if (aSubObjInstance.isInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.EnumerationLiteral].not()){
aSubObjInstance.getViolatedConstraints().ScalasetConstraints.each({(v)=>{
stdio.writeln("    ".plus(v.Scalamessage))
contraintes.add(v)}
})}
}
})}
}
}
}
}
})}

result = contraintes;}
 return result
}

    def isVoid():java.lang.Object = {
var result : java.lang.Object = null.asInstanceOf[java.lang.Object]; 
{
result = false;}
 return result
}

    def isNotEqual(element : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object):java.lang.Object = {
var result : java.lang.Object = null.asInstanceOf[java.lang.Object]; 
{
result = equals(element).not();}
 return result
}

    def freeze():Void = {
var result : Void = null.asInstanceOf[Void]; 
{
/*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */}
 return result
}

    def unset(property : fr.irisa.triskell.kermeta.scala.framework.language.structure.Property):Void = {
var result : Void = null.asInstanceOf[Void]; 
{
/*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */}
 return result
}

    def oid():java.lang.Object = {
var result : java.lang.Object = null.asInstanceOf[java.lang.Object]; 
{
try{
result = /*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */.asInstanceOf[Int];
}catch { case e:ClassCastException => {}}
}
 return result
}

    def container():fr.irisa.triskell.kermeta.scala.framework.language.structure.Object = {
var result : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object = null.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.Object]; 
{
result = /*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */;}
 return result
}

    def containingResource():kermeta.persistence.Resource = {
var result : kermeta.persistence.Resource = null.asInstanceOf[kermeta.persistence.Resource]; 
{
try{
result = /*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */.asInstanceOf[kermeta.persistence.Resource];
}catch { case e:ClassCastException => {}}
}
 return result
}

    def isInstanceOf(`type` : fr.irisa.triskell.kermeta.scala.framework.language.structure.Type):java.lang.Object = {
var result : java.lang.Object = null.asInstanceOf[java.lang.Object]; 
{
try{
result = /*TODO GenScalaCode class fr.irisa.triskell.kermeta.compilo.scala.rich.RichBehaviorFactoryImpl$$anon$13 */.asInstanceOf[Boolean];
}catch { case e:ClassCastException => {}}
}
 return result
}

    def checkAllInvariants():Void = {
var result : Void = null.asInstanceOf[Void]; 
{
if (this != (null)){
this.checkInvariants()
var cd : fr.irisa.triskell.kermeta.scala.framework.language.structure.ClassDefinition = null.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.ClassDefinition];
try{
cd = this.getMetaClass().ScalatypeDefinition.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.ClassDefinition];
}catch { case e:ClassCastException => {}}

cd.ScalaeAllAttributes.each({(prop)=>{
if (prop.ScalaisComposite.and(prop.ScalaisDerived.not())){
if (this.get(prop).isVoid().not()){
if (this.get(prop).getMetaClass().ScalatypeDefinition.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.ClassDefinition].allSuperTypes().exists({(t)=>{
if (t.isInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.ParameterizedType]){
t.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.ParameterizedType].ScalatypeDefinition.qualifiedName().equals("kermeta::standard::Collection")}
else 
{
false}
}
})){
var subObjInstances : java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Object] = null.asInstanceOf[java.util.List[fr.irisa.triskell.kermeta.scala.framework.language.structure.Object]];
try{
subObjInstances = this.get(prop).asInstanceOf[java.util.List];
}catch { case e:ClassCastException => {}}

subObjInstances.each({(aSubObjInstances)=>{
aSubObjInstances.checkAllInvariants()}
})}
else 
{
this.get(prop).checkAllInvariants()}
}
}
}
})}
}
 return result
}

    def asType(`type` : fr.irisa.triskell.kermeta.scala.framework.language.structure.Class):fr.irisa.triskell.kermeta.scala.framework.language.structure.Object = {
var result : fr.irisa.triskell.kermeta.scala.framework.language.structure.Object = null.asInstanceOf[fr.irisa.triskell.kermeta.scala.framework.language.structure.Object]; 
{
if (.isInstanceOf[`type`]){
result = this;}
else 
{
throw kermeta.exceptions.RichFactory.createTypeCastError}
}
 return result
}

    def toString():java.lang.Object = {
var result : java.lang.Object = null.asInstanceOf[java.lang.Object]; 
{
result = "[".plus(this.getMetaClass().ScalatypeDefinition.qualifiedName()).plus(":").plus((oid()+"")).plus("]");}
 return result
}
}

