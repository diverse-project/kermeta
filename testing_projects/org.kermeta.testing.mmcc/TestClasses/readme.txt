Mise à jour du projet le 6/12/2007 par JMM et Gilles

Le fichier de test TestCheckInpoutModels renvoie des erreurs.

Les tests font appel à la méthode getObjectsInModel(...) qui devrait renvoyer l'ensemble des objets d'un modèles.

Cette méthode utilise la méthode getObjects qui doit renvoyer les éléments contenu par un objet. L'erreur semble être: le parcours des relations se fait sans vérifier si une relation est un containment. A corriger!