package com.sdajava.if_lekcja2;

import com.sdajava.if_lekcja2.Model.Human;

public class Chef extends Human {
    public String ultraLevel;
    public int ultraSalary;

    public Chef(){

    }

    public Chef(String name, String lastName, int age, String city, String ultraLevel, int ultraSalary){
        super(name, lastName, age, city);
        this.ultraLevel = ultraLevel;
        this.ultraSalary = ultraSalary;
    }

}
