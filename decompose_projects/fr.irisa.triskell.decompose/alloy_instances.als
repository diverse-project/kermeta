
module tmp/simpleUMLCD
open util/boolean as Bool

sig ClassModel {
	classifier: set Classifier,
	name: Int,
	association: set Association
}

abstract sig Classifier {
      name :  Int
	
	}

sig PrimitiveDataType extends Classifier {}

sig Class extends Classifier {
	is_persistent: one Bool,
	parent : lone Class,
	attrs : some Attribute //atleast one attribute, chnqge to set if not necessary
}

sig Association {
	name: Int,
	upper: Int,
	lower: Int,
	dest: one Class,
	src: one Class
}


sig Attribute {
	name: Int,
	is_primary : Bool,
	upper: Int,
	lower: Int,
	type: one Classifier
}


//Meta-model constraints//

//There must be no cyclic inheritance in the generated UML class diagram
fact noCyclicInheritance {
	no c: Class | c in c.^parent
}

//All the attributes in a Class must have unique attribute names
fact uniqueAttributeNames {
all c:Class |  all a1:  c.attrs , a2 : c.attrs |a1.name==a2.name => a1 = a2  
}

//An attribute object can be contained by only one class
fact attributeContainment {
all c1:Class, c2:Class | all a1:c1.attrs, a2:c2.attrs | a1==a2 => c1=c2
}

//There is exactly one ClassModel object
fact oneClassModel {
 one ClassModel
}

//All Classifier objects are contained in a ClassModel
fact classifierContainment {
all c:Classifier | c in ClassModel.classifier
}

//All Association objects are contained in a ClassModel
fact associationContainment {
all a:Association | a in ClassModel.association
}



//A Classifier must have a unique name in the class diagram
fact uniqueClassifierName {
all c1:Classifier, c2:Classifier | c1.name==c2.name => c1=c2
}



//An associations have the same name either they are the same association or they have different sources
fact uniqeNameAssocSrc {
all a1:Association, a2:Association | a1.name == a2.name => (a1 = a2 or a1.src != a2.src)
}


//Model Transformation UMLCD to RDBMS Pre-condition
fact atleastOnePrimaryAttribute {
    all c:Class| one a:c.attrs | a.is_primary==True
}


//Improved Model Transformation pre-conditions
fact no4CyclicClassAttribute{
	all a:Attribute | a.type in Class => all a1:a.type.attrs|a1.type in Class => all a2:a.type.attrs|a2.type in Class => all a3:a.type.attrs|a3.type in Class => all a4:a.type.attrs|a4.type in PrimitiveDataType
}

//A Class cannot have an association and an attribute of the same name 
fact noAttribAndAssocSameName{
	all c:Class, assoc:Association | all a : c.attrs | (assoc.src == c) => a.name != assoc.name
}


//No cycles between non-persistent classes



fact no1CycleNonPersistent
{
      all a: Association | (a.dest == a.src) => a.dest.is_persistent= True 
}



fact no2CycleNonPersistent
{
      all a1: Association, a2:Association | (a1.dest == a2.src and a2.dest==a1.src) => a1.src.is_persistent= True or a2.src.is_persistent=True  
}
/*
fact noCeroUpperAss{
	all a:Association| a.upper>0
}
fact noCeroLowerAss{
	all a:Association| a.lower>=0
}
fact noCeroUpperAttr{
	all a:Attribute| a.upper>0
}
fact noCeroLowerAttr{
	all a:Attribute| a.lower>=0
}
*/

/*
fact no3CycleNonPersistent
{
      all a1: Association, a2:Association, a3:Association | (a1.dest == a2.src and a2.dest==a3.src and a3.dest==a1.src) => a1.src.is_persistent= True or a2.src.is_persistent=True  or a3.src.is_persistent=True
}

fact no4CycleNonPersistent
{
      all a1: Association, a2:Association, a3:Association, a4:Association | (a1.dest == a2.src and a2.dest==a3.src and a3.dest == a4.src and a4.dest==a1.src ) => a1.src.is_persistent= True or a2.src.is_persistent=True  or a3.src.is_persistent=True or a4.src.is_persistent=True
}

*/



//Model Fragments


pred partition1()
{
 some c:Classifier|c.name=0
}

pred partition2()
{
 some c:Classifier|c.name>=0
}


pred partition3()
{
some c:Class |c.is_persistent=True
}

pred partition4()
{
some c:Class |c.is_persistent=False
}


pred partition5()
{
some c:Class|#c.parent=0 
}

pred partition6()
{
some c:Class|#c.parent=1 
}

pred partition7()
{
some c:Class|#c.attrs=0 
}

pred partition8()
{
some c:Class|#c.attrs=1
}

pred partition9()
{
some c:Class|#c.attrs>1
}

pred partition10()
{
some a:Attribute|a.is_primary=True
}

pred partition11()
{
some a:Attribute|a.is_primary=False
}

pred partition12()
{
some a:Attribute|a.name=0
}

pred partition13()
{
some a:Attribute|a.name!=0
}


pred partition14()
{
some a:Attribute|#a.type=0
}

pred partition15()
{
some a:Attribute|#a.type=1
}


pred partition16()
{
some a:Association|a.name=0 
}

pred partition17()
{
some a:Association|a.name!=0 
}


pred partition18()
{
some a:Association|#a.dest=0 
}

pred partition19()
{
some a:Association|#a.dest=1 
}


pred partition20()
{
some a:Association|#a.src=0 
}

pred partition21()
{
some a:Association|#a.src=1 
}

pred partition22()
{
some c:ClassModel|#c.classifier=0
}

pred partition23()
{
some c:ClassModel|#c.classifier=1
}

pred partition24()
{
some c:ClassModel|#c.classifier>1
}

pred partition25()
{
some c:ClassModel|#c.association=0
}


pred partition26()
{
some c:ClassModel|#c.association=1
}


pred partition27()
{
some c:ClassModel|#c.association>1
}

pred partition28()
{
some a:Association|a.upper=1 
}
pred partition29()
{
some a:Association|a.upper>1 
}

pred partition30()
{
some a:Association|a.lower=0 
}

pred partition31()
{
some a:Association|a.lower=1 
}
pred partition32()
{
some a:Association|a.lower>1 
}
pred partition33()
{
some a:Attribute|a.upper=1 
}
pred partition34()
{
some a:Attribute|a.upper>1 
}
pred partition35()
{
some a:Attribute|a.lower=0
}
pred partition36()
{
some a:Attribute|a.lower=1 
}
pred partition37()
{
some a:Attribute|a.lower>1 
}
//Model Fragments from AllRanges


pred mfAllRanges1a()
{
partition1
}

pred mfAllRanges2a()
{
partition2
}
pred mfAllRanges3a()
{
partition3
}
pred mfAllRanges4a()
{
partition4
}

pred mfAllRanges5a()
{
partition5
}



pred mfAllRanges6a()
{
partition6
}

pred mfAllRanges7a()
{
partition7
}
pred mfAllRanges8a()
{
partition8
}
pred mfAllRanges9a()
{
partition9
}
pred mfAllRanges10a()
{
partition10
}
pred mfAllRanges11a()
{
partition11
}

pred mfAllRanges12a()
{
partition12
}
pred mfAllRanges13a()
{
partition13
}
pred mfAllRanges14a()
{
partition14
}
pred mfAllRanges15a()
{
partition15
}
pred mfAllRanges16a()
{
partition16
}
pred mfAllRanges17a()
{
partition17
}
pred mfAllRanges18a()
{
partition18
}
pred mfAllRanges19a()
{
partition19
}
pred mfAllRanges20a()
{
partition20
}
pred mfAllRanges21a()
{
partition21
}
pred mfAllRanges22a()
{
partition22
}
pred mfAllRanges23a()
{
partition23
}
pred mfAllRanges24a()
{
partition24
}
pred mfAllRanges25a()
{
partition25
}
pred mfAllRanges26a()
{
partition26
}
pred mfAllRanges27a()
{
partition27
}


//Model Fragments from AllPartitions
pred mfAllPartitions1b()
{
partition1 and partition2
}

pred mfAllPartitions2b()
{
partition3 and partition4
}


pred mfAllPartitions3b()
{
partition5 and partition6
}


pred mfAllPartitions4b()
{
partition7 and partition8 and partition9
}


pred mfAllPartitions5b()
{
partition10 and partition11 and partition12
}


pred mfAllPartitions6b()
{
partition13 and partition14
}

pred mfAllPartitions7b()
{
partition15 and partition16
}

pred mfAllPartitions8b()
{
partition17 and partition18
}


pred mfAllPartitions9b()
{
partition19 and partition20
}

pred mfAllPartitions10b()
{
partition21 and partition22
}

pred mfAllPartitions11b()
{
partition23 and partition24
}

pred mfAllPartitions12b()
{
partition25 and partition26 and partition27
}

pred mfAllPartitions13b()
{
partition25 and partition26 and partition27
}

pred mfAllPartitionsAssLow()
{
	partition30 and partition31 and partition32
}
pred mfAllPartitionsAssUp()
{
	partition28 and partition29
}
pred mfAllPartitionsAttrLow()
{
	partition35 and partition36 and partition37
}
pred mfAllPartitionsAttrUp()
{
	partition33 and partition34
}

pred allFragments
{
		 mfAllRanges1a and
            mfAllRanges2a and
            mfAllRanges3a and
            mfAllRanges4a and
            mfAllRanges5a and
            mfAllRanges6a and
            mfAllRanges8a and
            mfAllRanges10a and
            mfAllRanges12a and
            mfAllRanges13a and
            mfAllRanges15a and
            mfAllRanges16a and
            mfAllRanges17a and
            mfAllRanges19a and
            mfAllRanges21a and
		 mfAllPartitions1b and
            mfAllPartitions2b and
            mfAllPartitions3b and
            mfAllPartitions5b and
            mfAllPartitions7b and
		 mfAllPartitionsAssLow and
		 mfAllPartitionsAssUp and
		 mfAllPartitionsAttrLow and
		 mfAllPartitionsAttrUp
}



//run allFragments for 1 ClassModel,5 int,exactly 25 Class,exactly 40 Attribute,exactly 4 PrimitiveDataType,exactly 25 Association

//Synthesized run statements for experiments ..

 //Synthesized run statements for experiments ..
/*
run allFragments for 1 ClassModel,5 int,exactly 5 Class,exactly 25 Attribute,exactly 4 PrimitiveDataType,exactly 5 Association
run allFragments for 1 ClassModel,5 int,exactly 5 Class,exactly 25 Attribute,exactly 4 PrimitiveDataType,exactly 25 Association
run allFragments for 1 ClassModel,5 int,exactly 5 Class,exactly 40 Attribute,exactly 4 PrimitiveDataType,exactly 5 Association
*/

//run allFragments for 1 ClassModel,5 int,exactly 5 Class,exactly 40 Attribute,exactly 4 PrimitiveDataType,exactly 25 Association

run mfAllRanges1a 
run mfAllRanges2a 
run mfAllRanges3a 
run mfAllRanges4a 
run mfAllRanges5a
run mfAllRanges6a 
run mfAllRanges7a 
run mfAllRanges8a 
run mfAllRanges9a 
run mfAllRanges10a 
run mfAllRanges11a 
run mfAllRanges12a 
run mfAllRanges13a 
run mfAllRanges14a 
run mfAllRanges15a 
run mfAllRanges16a 
run mfAllRanges17a 
run mfAllRanges18a 
run mfAllRanges19a 
run mfAllRanges20a 
run mfAllRanges21a 
run mfAllRanges22a 
run mfAllRanges23a 
run mfAllRanges24a 
run mfAllRanges25a 
run mfAllRanges26a 
run mfAllRanges27a 
run mfAllPartitions1b
run mfAllPartitions2b
run mfAllPartitions3b 
run mfAllPartitions4b 
run mfAllPartitions5b
run mfAllPartitions6b 
run mfAllPartitions7b 
run mfAllPartitions8b 
run mfAllPartitions9b 
run mfAllPartitions10b 
run mfAllPartitions11b 
run mfAllPartitions12b 
run mfAllPartitions13b 
run mfAllPartitionsAssLow
run mfAllPartitionsAssUp
run mfAllPartitionsAttrLow
run mfAllPartitionsAttrUp

//No
//run allFragments for 1 ClassModel,5 int,exactly 25 Class,exactly 25 Attribute,exactly 4 PrimitiveDataType,exactly 5 Association
//No
//run allFragments for 1 ClassModel,5 int,exactly 25 Class,exactly 25 Attribute,exactly 4 PrimitiveDataType,exactly 25 Association

//run allFragments for 1 ClassModel,5 int,exactly 25 Class,exactly 40 Attribute,exactly 4 PrimitiveDataType,exactly 5 Association
//run allFragments for 1 ClassModel,5 int,exactly 25 Class,exactly 40 Attribute,exactly 4 PrimitiveDataType,exactly 25 Association
	
