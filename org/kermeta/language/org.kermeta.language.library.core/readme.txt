This project contains the kmt definitions of the minimal (core) k2 framework. More complex framework is provided in another project : org.k2.language.library.extended
Ie. element needed for basic interactions and primitives types.
As they are primitives they implementation are provided as scala code (ie. not generated from the k2)


The resulting jar will provide :
- the bytecode of the core framework (compiled from scala) fully exported and visible from other bundle
- the kmt files that declares the definitions
- the merged km file (for use in project dependencies between k2 projects)

This jar should be deployable as a simple jar and as an OSGI bundle, so other bundle could depend on it.