package org.example.service;

import org.example.model.Todo;

import java.util.ArrayList;
import java.util.List;

public class TodoServiceImpl implements TodoService{
    // J'aurais pu mettre la todolist ici plutot que dans le model To do, ca me fera eviter de faire les .getTodolist() à chaque fois.

    // private List<To-do> todos = new ArrayList<>()
    // private int compteurId = 1

    @Override
    public List<Todo> getAll() {


        return Todo.getTodolist();
    }

    @Override
    public Todo getById(int id) {
        // To-do todoSearch = null;
        //for (To-do t: todos){
        //   if(t.getId()=id){
        //        todoSearch = t;

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


