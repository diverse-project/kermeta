

Model for docbook

The editor must be deployed in the environment in order to be 
able to load docbook files that were not created with EMF
This is because the reflective editor doesn't work on those files 
(normal since the namespaces are genreally not correctly set)

It is based on an inference of an existing sample file.
Please use an input file that is representative of docbook format and the way you want to use it.

Actually, very few files are not generated.

How to regenerate :

- run the xs_inference_build.xml ant script
- create a new EMF model from the xsd file (select "create xsd2ecore mapping)
- change the base package of Docbook package to "fr.irisa.triskell.kermeta"
- generate model, edit and editor plugins.
- adapt the plugin version number