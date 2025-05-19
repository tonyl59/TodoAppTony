package org.example.service;

import org.example.model.Todo;

import java.util.ArrayList;
import java.util.List;

public class TodoServiceImpl implements TodoService{
    @Override //TODO à moi de remplir toutes les methodes... stocker les todo dans qlq chose, à moi de voir où les mettre
    public List<Todo> getAll() {


        return Todo.getTodolist();
    }

    @Override
    public Todo getById(int id) {
        return null;
    }

    @Override
    public void add(String name, String description) {
        Todo todo = new Todo(name, description);
        Todo.getTodolist().add(todo);

    }

    @Override
    public void update(int id, String name, String description, boolean done) {
        for (Todo todo : Todo.getTodolist()){
            if (todo.getId() == id){
                todo.setName(name);
                todo.setDescription(description);
                todo.setDone(done);
            }
        }

        //Todo.getTodolist().set(id-1, new Todo(id, name,description,done)); // Manière de faire plus propre que ecraser et refaire

        //recuperer la todo qu'on veut modifier... envoyer l'id donc recuperer l'element que je veux modifier

    }

    @Override
    public void remove(int id) {
        int count = 0;
        for (Todo todo : Todo.getTodolist()){
            if (todo.getId() == id){
                Todo.getTodolist().remove(count);
                break;
            }
            count ++;
            }
    }

    @Override
    public void toggleDone(int id) {
        for (Todo todo : Todo.getTodolist()){
            if (todo.getId() == id){
                todo.setDone(!todo.isDone());

            }
        }
    }
}


