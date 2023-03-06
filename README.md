# Description du projet: 
Le projet est un système de portefeuille permettant de gérer une liste d'actions et d'obligations, de les ajouter ou de les supprimer et de calculer la valeur actuelle du portefeuille.

# Choix:
Pour stocker la liste d'actions et d'obligations, nous avons utilisé la classe ArrayList.
Nous avons créé deux classes pour les produits d'investissement: Action et Obligation. Ces classes sont des sous-classes de la classe abstraite Produit qui contient les attributs et méthodes communs à toutes les classes de produits.
Nous avons utilisé la méthode de calcul du prix actuel pour les obligations pour calculer la valeur actuelle du portefeuille.

# Diagramme UML
```
+----------------+                   +--------------------+
|   Portefeuille  |<>----------      |        Action      |
+----------------+                   +--------------------+
| - actions       |                  | - name             |
| - obligations   |                  | - description      |
| + ajouterAction |                  | - price            |
| + supprimerAction |                | + getName()        |
| + getActions()  |                  | + setName()        |
| + ajouterObligation |              | + getDescription() |
| + supprimerObligation |            | + setDescription() |
| + getObligations() |               | + getPrice()       |
| + calculerValeurPortefeuille()     |                    |
+----------------+                   +--------------------+
                                  ^
                                  |
                                  |
                                  |
                             +---------+--------------+
                             |       Obligation       |
                             +---------+--------------+
                             | - nom                  |
                             | - taux                 |
                             | - prix                 |
                             | - duree                |
                             | + getNom()             |
                             | + setNom()             |
                             | + getTaux()            |
                             | + setTaux()            |
                             | + getPrix()            |
                             | + setPrix()            |
                             | + getDuree()           |
                             | + setDuree()           |
                             | + calculerPrixActuel() |
                             +---------+---------------
                                       ^
                                       |
                                       |
                                       |
                                 +----------------------+
                                 |       Produit        |
                                 +----------------------+
                                 | - valeurNominal      |
                                 | - tauxRendement      |
                                 | + getValeurNominal() |
                                 | + getTauxRendement() |
                                 | + getValeurActuelle()|
                                 +----------------------+
```

#Reste à faire éventuel:
Il pourrait être utile d'ajouter des méthodes pour modifier les attributs des obligations, comme pour les actions.

Points de blocage:
Le projet ne présente pas de points de blocage majeurs. Cependant, pour un projet plus complexe, il pourrait être nécessaire de
