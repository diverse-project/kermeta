org.kermeta.registration
Version bundled on @BUILD.DATE@

This plugin is under development.

TODO: improving the scope of this registration and we should choose between 
ModelingUnit and MDK registration or the both in two Eclipse extensions.

An example below:

  <extension
        point="org.kermeta.registration.kermetaModelingUnit">
     <kermetaModelingUnit
           DSL-in-ecore-file="dist/kermeta/Standard.ecore"
           category="model simulation"
           description="Standard package of Kermeta"
           kmt-or-km-as-Modeling-Unit-root="dist/kermeta/Standard.km"
           name="Kermeta Standard">
        <related-Kermeta-resource
              description="io resource"
              kmt-or-km-file="dist/kermeta/io/file_io.km">
        </related-Kermeta-resource>
        <related-Kermeta-resource
              description="collections definition"
              kmt-or-km-file="dist/kermeta/standard/collections.km">
        </related-Kermeta-resource>
        <related-Kermeta-resource
              description="primitive types definition"
              kmt-or-km-file="dist/kermeta/standard/primitive_types.km">
        </related-Kermeta-resource>
     </kermetaModelingUnit><kermetaModelingUnit
                                 DSL-in-ecore-file="dist/kermeta/Standard.ecore"
                                 category="model checking"
                                 description="Standard package of Kermeta"
                                 kmt-or-km-as-Modeling-Unit-root="dist/kermeta/Standard.km"
                                 name="Standard 2">
        <related-Kermeta-resource
              description="collections definition"
              kmt-or-km-file="dist/kermeta/standard/collections.km">
        </related-Kermeta-resource>
        <related-Kermeta-resource
              description="primitive types definition"
              kmt-or-km-file="dist/kermeta/standard/primitive_types.km">
        </related-Kermeta-resource>
     </kermetaModelingUnit>
  </extension>