package org.example.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Todo {
    // Moule que je crée => Classe.
    //Chaque tâche (ou "todo") est représentée par un objet Todo et doit obligatoirement contenir les champs suivants :
    //
    //id (entier) : identifiant unique généré automatiquement.
    //name (chaîne de caractères) : le titre de la tâche.
    //description (chaîne de caractères) : une description détaillée de la tâche.
    //done (booléen) : un indicateur qui vaut false par défaut, puis true si la tâche est marquée comme faite.
    //🛠️ Ces champs doivent être encapsulés dans la classe Todo, avec des getters et setters publics.

    // Attributs
    // Va representer ce qu'est une To-do, ce qui va gerer les todos c'est le todoservice impl, pour ça qu'à la correction
    // christophe va mettre la liste et le compteur dans le TodoServiceImpl
    private int id;
    private String name;
    private String description;
    private boolean done;
    private static List<Todo> Todolist = new ArrayList<>();
    private static int count = 0;

    // Constructeur
    //
    public Todo(String name, String description) { // Marche pour la création de tache
        count++;
        this.id = count;
        this.name = name;
        this.description = description;
        this.done = false;
    }


    @Override
    public String toString() {
        String text_done;
        if (done){
            text_done = "Fait";
        }else{
            text_done = "Pas fait";
        }
        return String.format("Tâche id %s de %s : %s. Etat : %s", id, name, description, text_done);

    }

    // Setters & Getters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }


    public void setDone(boolean done) {
        this.done = done;
    }

    public static List<Todo> getTodolist() {
        return Todolist;
    }

    public static void setTodolist(List<Todo> todolist) {
        Todolist = todolist;
    }
    }
    // Méthodes ?


