Kermeta samples # class2RDBMS
Version bundled on @BUILD.DATE@

Before to launch the comparisons:

1. The metamodel: ClassMM.ecore must be registered.
To do it, right-click on the file ClassMM.ecore in the folder metamodels and
in "EPackages registration" category select "Register EPackages into repository"
or follow the instruction given at: http://kermeta.org/sintaks/RegisteringEPackagesMetamodel

2. It is necessary to fix the user libraries into the "Run Configuration" form or directly the *.launch files.
Thus you must redirect the paths to target the following plugins:
~/plugins/org.kermeta.emfcompare
~/plugins/org.eclipse.emf.compare.diff
~/plugins/org.eclipse.emf.compare.match
~/plugins/org.eclipse.emf.compare