Generator project
-------------------
This project is a base for generating BinaryMerger for any ecore model.
It takes as input an ecore model and produces the code of a binary merger written in Kermeta 1.

It is very similar to Kompose since it reuses many of its ideas.
The main difference is that the merger is generated and thus doesn't use reflexivity. 

Generated merger design
-------------------
The generated merger works in 2 main phases:
- Phase 1 : follow the containment graph and select/merge the element that match. 
	It works by moving elements of the aspect model to the merge model.
	In addition, this phase prepares the next phase by : 
		collecting elements that may need to merge non containment properties
		collecting elements that have been moved
-Phase 2 : 
	merge the non containment properties (ie. references not involved in a containment association)
 	fix references of moved elements (since they may have kept a reference to the original aspect model)
 		
 The 2 phases are connected thanks to the use of an internal bidirectional mapping (directly woven on the model elements)
 that keeps a trace of matched elements.