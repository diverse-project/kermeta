Mise � jour du projet le 6/12/2007 par JMM et Gilles

Le fichier de test TestCheckInpoutModels renvoie des erreurs.

Les tests font appel � la m�thode getObjectsInModel(...) qui devrait renvoyer l'ensemble des objets d'un mod�les.

Cette m�thode utilise la m�thode getObjects qui doit renvoyer les �l�ments contenu par un objet. L'erreur semble �tre: le parcours des relations se fait sans v�rifier si une relation est un containment. A corriger!