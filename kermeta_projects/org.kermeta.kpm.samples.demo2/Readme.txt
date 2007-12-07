- Demo of Kermeta Project Manager
author : François Tanguy (ftanguy@irisa.fr)

Here are the specific rules for this project : 
	- 	for any ecore file which name matches the regular expression .+MM.ecore 
		and which location is the ecore folder, a visitable model is generated in the same
		directory. Those visitable models' name ends with .+MM.visitable.ecore
	
	-	for any ecore file which name matches the regular expression .+MM.visitable.ecore
		and which location is the ecore folder, a kmt translation is generated in the
		kermeta folder with a name that matches .+MM.visitable.kmt
		
		
What to do ?
	copy or move the ecore file located in the playZone directory and past it into the
	ecore folder and see what happens !