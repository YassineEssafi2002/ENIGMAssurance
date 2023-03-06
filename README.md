# Description du projet: 
Le projet est un système de portefeuille permettant de gérer une liste d'actions et d'obligations, de les ajouter ou de les supprimer et de calculer la valeur actuelle du portefeuille.

# Choix:
Pour stocker la liste d'actions et d'obligations, nous avons utilisé la classe ArrayList.
Nous avons créé deux classes pour les produits d'investissement: Action et Obligation. Ces classes sont des sous-classes de la classe abstraite Produit qui contient les attributs et méthodes communs à toutes les classes de produits.
Nous avons utilisé la méthode de calcul du prix actuel pour les obligations pour calculer la valeur actuelle du portefeuille.

# Diagramme UML
```
+--------------------------------+    +--------------------+
|   Portefeuille                  |<-|        Action      |
+---------------------------------+   +--------------------+
| - actions                       |   | - name             |
| - obligations                   |   | - description      |
| + ajouterAction                 |   | - price            |
| + supprimerAction               |   | + getName()        |
| + getActions()                  |   | + setName()        |
| + ajouterObligation             |   | + getDescription() |
| + supprimerObligation           |   | + setDescription() |
| + getObligations()              |   | + getPrice()       |
| + calculerValeurPortefeuille()  |   |                    |
+---------------------------------+   +--------------------+
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

# Reste à faire éventuel:
Il pourrait être utile d'ajouter des méthodes pour modifier les attributs des obligations, comme pour les actions.

# Points de blocage:
Le projet ne présente pas de points de blocage majeurs. Cependant, pour un projet plus complexe, il pourrait être nécessaire d'identifier les points de blocage potentiels et de les gérer pour assurer la réussite du projet.

# Points d’amélioration:
-Établir un système de gestion de la qualité pour s'assurer que le code est testé et validé à chaque étape du développement. Cela me permettra également de détecter les erreurs et les problèmes dès le début et de les corriger rapidement.
-Utiliser des outils de gestion de projet pour suivre les progrès, gérer les tâches et les dépendances, et faciliter la communication au sein de l'équipe.

# Cycle de développement :
Le projet est un exemple de code Java qui utilise des classes et des objets pour gérer un portefeuille d'actions et d'obligations. Le cycle de développement suit le processus classique de développement de logiciels, qui comprend les étapes suivantes :
Analyse des exigences : l'objectif de ce projet est de créer un système de portefeuille qui peut gérer des actions et des obligations.
Conception : La conception de classes est effectuée pour créer une structure de portefeuille qui peut stocker les objets Action et Obligation et les gérer efficacement. La conception des classes est réalisée en utilisant des diagrammes UML.
Codage : Le code Java est écrit pour implémenter la structure de classes conçue et la logique métier pour ajouter, supprimer et calculer la valeur du portefeuille.
Test : Des tests unitaires et d'intégration sont effectués pour s'assurer que le code fonctionne comme prévu.

# Resumer des classes:
La classe Portefeuille est utilisée pour représenter un portefeuille d'investissement. Elle possède deux listes, une pour les actions et une pour les obligations. La classe fournit des méthodes pour ajouter et supprimer des actions et des obligations, ainsi qu'une méthode pour calculer la valeur totale du portefeuille.

La classe Produit est une classe abstraite qui représente un produit financier générique. Elle possède une valeur nominale et un taux de rendement, et une méthode abstraite pour calculer la valeur actuelle.

La classe Action représente une action avec un nom, une description et un prix. Elle possède des méthodes pour obtenir et modifier ces attributs.

La classe Obligation représente une obligation avec un nom, un taux d'intérêt, un prix initial et une durée en années. Elle possède des méthodes pour obtenir et modifier ces attributs, ainsi qu'une méthode pour calculer le prix actuel de l'obligation.

La classe Main est utilisée pour tester les autres classes. Elle crée des objets de type Action, Obligation et Portefeuille, ajoute des actifs au portefeuille, et affiche la liste des actifs dans le portefeuille avec leurs prix.
