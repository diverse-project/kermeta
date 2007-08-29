org.kermeta.registration
Version bundled on @BUILD.DATE@

This plugin is under development.

The scope of this registration tool is the Kermeta Modeling Unit concept and differs 
with the MDK (Model Development Kit), i.e.: a MDK description that will be more or less like a plugin feature.
=> a plugin that declares the plugins participating to a MDK. 

An example below:

  <extension
        point="org.kermeta.registration.kermetaModelingUnit">
     <kermetaModelingUnit
           DSL-in-ecore-file="dist/kermeta/Standard.ecore"
           category="model simulation"
           description="Standard package of Kermeta"
           kmt-or-km-as-Modeling-Unit-root="dist/kermeta/Standard.km"
           name="Kermeta Standard">
        <related-resource
              description="io resource"
              file="dist/kermeta/io/file_io.km">
        </related-resource>
        <related-resource
              description="collections definition"
              file="dist/kermeta/standard/collections.km">
        </related-resource>
        <related-resource
              description="primitive types definition"
              file="dist/kermeta/standard/primitive_types.km">
        </related-resource>
     </kermetaModelingUnit><kermetaModelingUnit
                                 DSL-in-ecore-file="dist/kermeta/Standard.ecore"
                                 category="model checking"
                                 description="Standard package of Kermeta"
                                 kmt-or-km-as-Modeling-Unit-root="dist/kermeta/Standard.km"
                                 name="Standard 2">
        <related-resource
              description="collections definition"
              file="dist/kermeta/standard/collections.km">
        </related-resource>
        <related-resource
              description="primitive types definition"
              file="dist/kermeta/standard/primitive_types.km">
        </related-resource>
     </kermetaModelingUnit>
  </extension>