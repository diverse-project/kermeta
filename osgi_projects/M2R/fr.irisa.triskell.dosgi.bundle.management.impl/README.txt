Ce bundle nécessite l'installation du ou des bundles dOSGi permettant de gérer les remote-service (ou un autre framework similaire mais cela n'a pas été testé).

Pour cela, vous pouvez télécharger ces bundles à l'adresse :

	http://cxf.apache.org/dosgi-releases.html
	
Il est nécessaire de prendre la version nommé 1.1.SNAPSHOT car la version 1.0 est obsolète par rapport à la spécification OSGi R4.2

Utilisation :
Il faut installer les bundles permettant d'utiliser des remote-services
Ensuite, il est nécessaire d'enregistrer chaque service par l'intermédiaire du ServiceManagement (cf registerService(...))

Il existe deux fonctions (une pour de la migration et une pour la réplication):
	moveService(...)
	duplicateService(...)
Ces deux fonctions peuvent être utilisées au niveau bundle en passant par le BundleManagement ou au niveau service en passant par le ServiceManagement.
 