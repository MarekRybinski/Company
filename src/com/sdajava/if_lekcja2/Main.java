package com.sdajava.if_lekcja2;

import com.sdajava.if_lekcja2.Controller.Controller;
import com.sdajava.if_lekcja2.Model.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Worker> workers = new ArrayList<>();


        Worker worker1 = new Worker();

        worker1.level = "Master";
        worker1.salary = 2323233;
        worker1.city = "Torun";
        worker1.lastName = "Rybicki";
        worker1.name = "Lukasz";

        Worker worker2 = new Worker();

        worker2.level = "Junior";
        worker2.salary = 13;
        worker2.city = "Bydgoszcz";
        worker2.lastName = "Kowalski";
        worker2.name = "Jan";

        Worker worker3 = new Worker();

        worker3.level = "Senior";
        worker3.salary = 131212;
        worker3.city = "Warszawa";
        worker3.lastName = "Rowalski";
        worker3.name = "Janusz";

        Worker worker4 = new Worker("Jan", "Paweł", 23, "Torun", "Senior", 2300);


        Chef chef1 = new Chef("Janek", "Pawełek", 29, "Torun", "UltraSenior", 2300000);
        Chef chef2 = new Chef("Januszek", "Paw", 24, "Torun", "HiperSenior", 100000);

        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(worker4);

        System.out.println("Mamy " + workers.size() + "  pracownikow!!!");

        for (Worker w : workers) {
            System.out.println("Pracownika: " + w.name + " " + w.lastName + " " + w.city + " " + w.level);
        }

        String login = "Lukasz";
        String password = "1234";
        String userLogin;
        String userPassword;
        boolean flag = true;
        boolean optionFlag = true;
        int option;
   /*
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj login: ");
        userLogin = in.nextLine();
        System.out.println("Podaj hasło");
        userPassword = in.nextLine();



             while(flag) {
                    if (userLogin.equals(login) && password.equals(userPassword)) ;
                    {
                        System.out.println("Potwierdzam!!!");
                        flag = false;
                    }
                    if (!(userLogin.equals(login) && password.equals(userPassword))) {
                        System.out.println("Podałeś złe dane!!!");
                        flag = false;
                    }
                    else {

                        flag = true;
                    }

                }
*/
        Controller controller = new Controller();
   while(optionFlag) {
       Scanner in = new Scanner(System.in);
       System.out.println("Witaj w naszym systemie!\n" + "1. Dodaj nowego pracownika\n" +
               "2. Dodaj nowego szefa \n" + "3. Pokaż wszystkich pracowników\n" + "4. Pokaz wszystkich szefów\n0. Zakończ!!!");
       option = in.nextInt();
       //Obiekt klasy kontroller



       switch (option) {
           case 1:
               //dodawanie pracownika
               controller.addWorker();
               break;
           case 2:
               controller.addChef();
               break;
           case 3:
               controller.showChef();
               break;
           case 4:
               controller.showWorkers();
               break;
           case 5:
               default:
                   optionFlag = false;
       }
   }
    }
}
