package org.example.service;

import org.example.model.Todo;

import java.util.List;

public class TodoServiceImpl implements TodoService{
    @Override //TODO à moi de remplir toutes les methodes... stocker les todo dans qlq chose, à moi de voir où les mettre
    public List<Todo> getAll() {
        return List.of();
    }

    @Override
    public Todo getById(int id) {
        return null;
    }

    @Override
    public void add(String name, String description) {

    }

    @Override
    public void update(int id, String name, String description, boolean done) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void toggleDone(int id) {

    }
}
