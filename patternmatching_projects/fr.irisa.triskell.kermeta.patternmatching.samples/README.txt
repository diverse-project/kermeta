Organization

This project is aimed to store demos of the pattern-matching library. 

#############
# Organization of the project
############
The demos are organized in the following way in this project:

  +  [Name_of_the_Domain] (A meaningful name)
       = metamodels (meta-models used by the demo )
            Obs.: It usually contains two meta-models:  one for models in this 
                    domain, and another for patterns (suffixed with *Pattern.ecore)                        
       = models (model and patterns used by the demo)
            Obs.: All patterns files ends with “Pattern[N]_frame.xmi” or 
            “Pattern[N]_structure.xmi”. The former contains the whole pattern, 
             and the latter just a model-snippet within the pattern.
       =  Kermeta (kermeta files used in the demo)
                - createMMPattern (kermeta file used to create the pattern meta-model)
                - createModels (kermeta files used to create the model or patterns used 
                     in this demo)
                -  execPatternMatching  (kermeta files that perform the pattern 
                     matching)
  

 #############
# Perform Pattern Matching
############
1) Identify the pattern meta-model 