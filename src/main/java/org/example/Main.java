package org.example;


import org.example.ihm.Ihm;
import org.example.service.TodoService;
import org.example.service.TodoServiceImpl;


public class Main {
    public static void main(String[] args) {
        TodoService service = new TodoServiceImpl(); // remplacer null par une instanciation d'une classe respectant l'interface TodoService
        Ihm ihm = new Ihm(service);
        ihm.start();

        // Mon todoservice = null, il me faut faire une classe pour remplir le  to do service. Donc il faut surtout travailler sur T odo et Todoserviceimpl
    }
}

