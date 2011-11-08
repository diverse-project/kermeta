Building this project
---------------------
This project is partly generated.
The generator is called from /src/main/kmt/org/kermeta/binarymerger/generator/kermeta2_BinaryMergerGenerator.kmt
	The generator depends on org.kermeta.ecore.binarymergergenerator

Some of the generated files have been customized and moved to 
	/src/main/kmt/org/kermeta/language/merger/binarymerger
	
	In case of changes in org.kermeta.ecore.binarymergergenerator, we need to check if the changes have significant impact on the customized
	files and manually repodruce them in the customized files. (I usually do the reverse : reapply customization in regenerated files)
	
	
Merger design
-------------------

The merger works in 2 main phases:
- Phase 1 : follow the containment graph and select/merge the element that match. 
	It works by moving elements of the aspect model to the merge model.
	In addition, this phase prepares the next phase by : 
		collecting elements that may need to merge non containment properties
		collecting elements that have been moved
-Phase 2 : 
	merge the non containment properties (ie. references not involved in a containment association)
 	fix references of moved elements (since they may have kept a reference to the original aspect model)