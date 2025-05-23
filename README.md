# Application de gestion de tâches Taskflow
  * Le contexte du projet
  * Les instructions de compilation et d’exécution
  * Ce que vous avez implémenté

## Contexte du projet
Pour une mieux organiser d'autres projets en entreprise, ce Todoapp permettra, via une interface intéractive,
d'établir et remplir de façon graduelle les différentes tâches qui seront à faire par les différents membres tout en
gardant une trace et l'état de celles-ci.

## Instructions de compilation et d'execution
L'application doit comprendre une classe IHM permettant d'ouvrir l'interface pour gérer la todolist, avec des méthodes de
TodoService/TodoServiceImpl & un modèle Todo qui va stocker les attributs de la Todolist. Cet IHM sera lancé par le main
qui lance l'application accessible au personnel.

Afin d'executer le programme qui va lancer l'IHM, il s'agira juste de lancer le main et suivre les instructions du
programme.

## Implémentation de LUONG Tony
Là où l'IHM et le main ont été fait, je me suis occupé du **TodoServiceImpl** qui contient les méthodes qu'appellera l'ihm.
Cette classe contient les méthodes suivantes : 

- **add** (choix 1) : Permet de rajouter une nouvelle tâche.
- **getByID** : Méthode qui va permettre de chercher l'ID (si existant) qui sera mis par l'utilisateur, afin qu'une fonction choisie s'applique sur la tâche associé à cet ID (non implémenté encore)
- **getAll** (choix 2): Permet de voir la liste des tâches.
- **update** (choix 3) : Permet de modifier une tâche existante. Appel
- **remove** (choix 4): Permet d'enlever une tâche existante
- **toggleDone** (choix 5): Permet d'inverser l'état de complétion (fait, pas fait) d'une tâche



Je me suis aussi occupé du **modèle "Todo"**, contenant les attributs d'une Todo-list :
- L'**ID** (entier) : Identifiant unique de chaque tâche.
- **name** (chaine de caractère) : Nom de la personne en charge de la tâche
- **description** (chaine de caractère) : Descriptif de la tâche à faire
- **done** (booléen) : Etat de la tâche si elle est faite ou pas encore
- **Todolist** (Liste d'objet Todo) : Liste qui contiendra toutes les Todo.


![img.png](img.png)