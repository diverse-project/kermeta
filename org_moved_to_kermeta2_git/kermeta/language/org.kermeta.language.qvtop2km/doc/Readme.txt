Qvt operational to kermeta
date : 31/05/12
author : Xavier Dolques

1) install configuration  

The transformation QVT 2 KM uses as input qvt models produced with smartqvt. It requires the last version of kermeta 2 to work.
 Smartqvt is only needed to produce qvt models.
 Among the tests used for the transformation, there are qvt models from the topcased project, the sam metamodel is needed to be able to launch them.
 
 
topcased (only the simulation part is needed) :
	http://gforge.enseeiht.fr/projects/topcased-sam/
	http://gforge.enseeiht.fr/projects/topcased-ms/
smartqvt : http://sourceforge.net/projects/smartqvt/
spec QVT : http://www.omg.org/spec/QVT/1.1/
spec OCL : http://www.omg.org/spec/OCL/
spec MOF : http://www.omg.org/spec/MOF/


You may find all of the resources above on the team harddrive in the folder "qvt2kmdata"
dropins-qvt-topcased.tar.gz : contains the jar that you need to put in your dropins to install smartqvt, the metamodels used by smartqvt examples and the metamodels used by the topcased examples. You just have to uncompress all the content of the archive in your eclipse/dropins folder et voilà.
 
mof-06-01-01.pdf : spécification of MOF, as EMOF is part of qvtop
ocl-10-02-01.pdf : specification of OCL, as EOCL is part of qvtop
qvt-11-01-01.pdf : specification of QVT
smartqvt-svn.tar.gz : copy of smartqvt svn files just in case
topcased-cvs.tar.gz : copy of topcased cvs files just in case

2) what works and what does not (when this document has been written)

several bugs in kermeta are blocking to make the tests work. the bug tracker at bugzilla.inria.fr will track the status of these bugs
- http://bugzilla.inria.fr/show_bug.cgi?id=1903 :  what is the type of a Conditionnal returning 2 different Types in then and else

- http://bugzilla.inria.fr/show_bug.cgi?id=2149 : calling an operation to a primitive type makes the compiler crash

- http://bugzilla.inria.fr/show_bug.cgi?id=2158 : parameters types should not be expected as being equals to the inferred type of a typeparameter
needed for ecore2emof

-  http://bugzilla.inria.fr/show_bug.cgi?id=2110 : Generic parameter of a function is not compiled to scala
needed to uncomment the method in element_extension.kmt

- http://bugzilla.inria.fr/show_bug.cgi?id=2154 : call to the sum method on a collection of integer returns an error
needed for Book2Publication

several things are also not yet implemented

main things to do : 
CollectionRange (a kind of collection)
LetExp (a kind of block with variable definitions)
DictLiteral (hashtables)
OrderedTuple (special kind of tuples)
WhileExp 


3) testing the transformation on the available examples

several examples of qvt transformation are available : from smartqvt and from topcased. They are located in the qvtop2km project. 

 1-They require for the involved metamodels to be deployed in the current eclipse environment (they are if you used the files from 1) )
 
If you want to test while working on the transformation
 2-you need to put the operation "main2" as main operation in the kp of qvtop2km (be careful to not commit this change, as the "main" operation is used for the require of qvtoperational files)
 3-you need to change the references for the source and target models in the method main2 of qvt2kermeta.kmt 
 4-you can either require the km generated directly or generate the .kmt before. The latter solution is better to see the error raised by the resolver or the checker
 5-to launch the transformation you need to create a kermeta project, and you can launch the transformation by calling this operation
 root_package::TransformationContext.kermetaInit(<source Model>,<source metamodel>,<target model>,<target metamodel>)
 the kermeta project also need to require the following resources : 
		require "${qvt2km.baseUri}/src/main/kmt/runtime_context/TransfoContext.kmt"
		require "${qvt2km.baseUri}/src/main/kmt/runtime_context/Behavior_org.kermeta.traceability.model_aspect.kmt"
		require "${qvt2km.baseUri}/src/main/kmt/runtime_context/collection_extension.kmt"
		require "${qvt2km.baseUri}/src/main/kmt/runtime_context/element_extension.kmt"
		require "${qvt2km.baseUri}/src/main/kmt/runtime_context/TraceRegistry_org.kermeta.traceability.mdk.kmt"
		require "${qvt2km.baseUri}/resources/Traceability.ecore"
 with the dependency : 
		dependency "qvt2km"="platform:/resource/org.kermeta.language.qvtop2km"


