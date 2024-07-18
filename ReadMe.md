# Le jeu de la vie

Le Jeu de la Vie est un automate cellulaire inventé par le mathématicien britannique John Horton Conway en 1970. Il est joué sur une grille bidimensionnelle infinie de cellules carrées, chacune étant dans l'un des deux états possibles : vivante ou morte. Chaque cellule interagit avec ses huit voisines, qui sont les cellules directement adjacentes horizontalement, verticalement ou en diagonale.

Les règles du Jeu de la Vie sont les suivantes :

1. **Naissance** : Une cellule morte avec exactement trois voisines vivantes devient une cellule vivante (elle naît).
2. **Survie** : Une cellule vivante avec deux ou trois voisines vivantes reste vivante (elle survit).
3. **Mort par isolement** : Une cellule vivante avec moins de deux voisines vivantes meurt (elle est isolée).
4. **Mort par surpopulation** : Une cellule vivante avec plus de trois voisines vivantes meurt (elle est surpeuplée).

Ces règles sont appliquées simultanément à toutes les cellules de la grille pour produire la génération suivante. Le Jeu de la Vie est connu pour sa capacité à générer une grande variété de comportements à partir d'un ensemble de règles relativement simple.

## Description

Ce projet est un boilerplate pour l'exercice du Jeu de la Vie. Il fournit une structure de base pour commencer à développer votre propre implémentation du Jeu de la Vie, un automate cellulaire conçu par le mathématicien britannique John Horton Conway.

## Structure du Projet

Le projet est structuré comme suit :

- `org.carbon` : Le package racine du projet.
- `org.carbon.model` : Contient les classes qui représentent le modèle de données de l'application, comme `GameState`.
- `org.carbon.configurations` : Contient les classes qui fournissent différentes configurations pour le jeu, comme `InitialConfigurations`.
- `org.carbon.service` : Contient les classes qui gèrent la logique du jeu, comme `GameService`.
- `org.carbon.utils` : Contient les classes utilitaires, comme `ConsolePrinter`.

## Comment Utiliser

Pour utiliser ce projet, suivez les étapes ci-dessous :

1. Clonez ce dépôt sur votre machine locale.
2. Ouvrez le projet dans votre IDE préféré (ce projet est configuré pour IntelliJ IDEA).
3. Exécutez la classe `Main` pour démarrer le jeu avec une configuration initiale.

## Configuration Initiale

Le jeu commence avec une configuration initiale, qui est définie dans la classe `InitialConfigurations`. Vous pouvez choisir parmi plusieurs configurations initiales, comme `getBlinker()`, `getToad()`, `getBeacon()`, `getGlider()`, et `getLWSS()`.

## But de l'exercice

Le but de l'exercice est d'implémenter le GameService pour gérer la logique du jeu.
Vous pouvez utiliser les classes `GameState` pour représenter l'état du jeu
Chaque cellule est représentée par un booléen, où `true` signifie que la cellule est vivante et `false` signifie que la cellule est morte.

Vous êtes libre de modifier la structure du projet, d'ajouter de nouvelles classes et de personnaliser le jeu selon vos besoins.