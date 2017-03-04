package com.sdajava.if_lekcja2.Controller;

import com.sdajava.if_lekcja2.Chef;
import com.sdajava.if_lekcja2.Model.Worker;

import java.util.Scanner;

public class UserInput {
    public Worker populateWorker() {

        Worker worker = new Worker();

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj imie pracownika: ");
        worker.name = in.nextLine();

        return worker;
    }

    public Chef populateChef() {
        Chef chef = new Chef();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj imie szefa: ");
        chef.name = in.nextLine();

        return chef;
    }

    public Worker ageWorker() {
        Worker worker = new Worker();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wiek pracownika: ");
        worker.age = in.nextInt();

        return worker;
    }

    public Chef ageChef() {
        Chef chef = new Chef();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wiek szefa: ");
        chef.age = in.nextInt();

        return chef;
    }

    public Chef cityChef() {
        Chef chef = new Chef();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj miasto: ");
        chef.city = in.nextLine();

        return chef;
    }

    public Worker cityWorker() {
        Worker worker = new Worker();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj miasto: ");
        worker.city = in.nextLine();

        return worker;
    }
    public Worker salaryWorker(){
        Worker worker = new Worker();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wysokosc pensji: ");
        worker.salary = in.nextInt();

        System.out.println("Tyle hajsu: " + worker.salary);

        return worker;

    }

    public Chef ultrasalaryChef(){
        Chef chef = new Chef();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wysokosc pensji: ");
        chef.ultraSalary = in.nextInt();

        return chef;
    }

    public Worker levelWorker() {
        Worker worker = new Worker();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj poziom: ");
        worker.level = in.nextLine();

        return worker;
    }

    public Chef ultralevelChef(){
        Chef chef = new Chef();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj poziom: ");
        chef.ultraLevel = in.nextLine();

        return chef;
    }
}
