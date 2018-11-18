package pl.java.course.wsb.lesson2;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args){
        System.out.println("Podaj swoje Imię i Nazwisko :)");
        Scanner in = new Scanner(System.in);
        System.out.println("Imię:");
        String name = in.nextLine();
        System.out.println("Nazwisko:");
        String surName = in.nextLine();
        System.out.println("Twoje dane: \nImię: " + name + "\nNazwisko: " + surName);
    }
}

