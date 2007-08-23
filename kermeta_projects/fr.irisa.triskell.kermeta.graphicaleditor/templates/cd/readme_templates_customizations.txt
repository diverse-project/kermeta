---------------------
 Motivation: Adding a first Package element into the ModelingUnit instance
 and setting a name and a default uri to the new package:

in %name%.km, we have to add the following into the ModelingUnit XML tag:
<packages name="%name%" uri="http://%name%"/>

Along the model file creation, %name% will be replaced by the model name choosen into the wizard. 
---------------------

---------------------
 Motivation: Pointing directly the diagram on a Package (default
 is ModelingUnit), the 2 changes below are required

in %name%.kmdi, modification of 2 hrefs:

1. from <model href="%name%.km#/"/>
to <model href="%name%.km#//@packages.0"/>

2. from <element href="%name%.km#/"/>
to <element href="%name%.km#//@packages.0"/>
---------------------