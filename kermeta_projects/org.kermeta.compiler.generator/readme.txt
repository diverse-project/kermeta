This plugin is used for generating the missing parts of the compiled code that are not taking into account by EMF.

Available resources:
- JET skeletons: in /org.kermeta.compiler.generator/skeleton
- JET templates: in /org.kermeta.compiler.generator/templateHelper, /org.kermeta.compiler.generator/templateHelper/helper, /org.kermeta.compiler.generator/templateHelper/runner
- Externs dedicated to the framework and utils in /org.kermeta.compiler.generator/templateHelper/util

The utils are deployed for each compilation, this is done via an unzipping of the /org.kermeta.compiler.generator/baseTypesUtil.zip file directly in the generated plugin.
The baseTypesUtil.zip file is built with the ANT file: /org.kermeta.compiler.generator/zip_build.xml, please refresh the project after the execution.
The baseTypesUtil.zip must be rebuilt after any modifications into the /org.kermeta.compiler.generator/templateHelper/util folder.