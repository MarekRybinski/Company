package com.sdajava.if_lekcja2.Model;


import com.sdajava.if_lekcja2.Model.Human;

public class Worker extends Human {
   // public String name;
   // public String lastName;
   // public int age;
   // public String city;
    public String level;
    public int salary;

    public Worker(){

    }

    public Worker(String name, String lastName, int age, String city, String level, int salary){
        super(name, lastName, age, city);

        this.salary = salary;
        this.level = level;
    }


}
