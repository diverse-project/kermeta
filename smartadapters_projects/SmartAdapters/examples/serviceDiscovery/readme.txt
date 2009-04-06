Service Discovery example
-------------------------

- Structure of the directories
	- /aspect contains the UA and SA aspects (graft model, interface model and composition protocol)
	- /kermeta contains the Kermeta source code to execute
	- /lib contains libraries needed to run the system (fractal)
	- /model contains the base model and the woven models (SA and DA configurations)
	- /model/fromPlatform contains the reference models generated from the running system
	 
- How to run the example ?
	1/ run weavingRoles.kmt: it weaves (successively) SA and UA aspects to produce the SA and DA (SA+UA) configurations
	2/ run dynamicAdaptation.kmt: it runs and adapts the Fractal system at runtime using the generated configurations
