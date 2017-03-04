package com.sdajava.if_lekcja2.Controller;

import com.sdajava.if_lekcja2.Model.Worker;

import java.util.ArrayList;
import java.util.List;
public class Controller {

    public List<Worker> workerList = new ArrayList<>();

    public void addWorker() {


        System.out.println("Dodaje pracownika!!!");
        UserInput userInput = new UserInput();
        userInput.populateWorker();
    }

    public void addChef() {
        System.out.println("Dodaje szefa!!!");
        UserInput userInput = new UserInput();
        userInput.populateChef();
    }

    public void showChef() {
        System.out.println("Pokaz szefa!!!");
        UserInput userInput = new UserInput();
        userInput.ultralevelChef();
    }

    public void showWorkers() {
        for (Worker w : workerList) {
            System.out.println("Imie: "+ w.name + "Nazwisko: "+ w.lastName);
           // UserInput userInput = new UserInput();
          //  userInput.salaryWorker();
        }


    }
}