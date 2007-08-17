===========================================================
====== Instructions to run the model merging project ======
===========================================================

pre-requisites:

1. provide all both match and merge rules available in the "rules" folder. If 
   wanted, the location and name of the files can be changed in the RuleLoader 
   class. 6 files are needed, that is, one merge and one match rule file for 
   each metaclass (class, property, operation).

2. provide 2 .km files to be merged. as default, the files LeftInputModel.km and 
   RightInputModel.km are used. the files which are going to be merged can be 
   modified in the file LoadKM.kmt -> class ModelLoader.

3. register ecore file. before running, it has been noticed the need to register
   2 ecore files: MatchRulesMetaModel.ecore and MergeRulesMetaModel.ecore. i 
   believe there is a way to avoid it, probably changing their uri somewhere. 
   i've done it once, but i don't remember how (i believe cyril does).


running the merging:

1. right click loadKM.kmt and run it as a kermeta app.
   - mainClass "modelmerging::ModelLoader"
   - mainOperation "main"
   this method loads two models, calls the merge method in the merger to
   merge them and saves the resulting merged model in a .km file.
   
Issues:

the current version isn't stable yet. problems have been noticed mostly when
changing references to types. a robust way of revising types to be coherent with
the new model hasn't yet been devised.

