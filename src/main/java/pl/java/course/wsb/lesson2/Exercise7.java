package pl.java.course.wsb.lesson2;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Tworzymy prostokąt :) \nPodaj 1 bok: ");
        int bok1 = in.nextInt();
        System.out.println("Teraz podaj 2 bok: ");
        int bok2 = in.nextInt();
        System.out.println("Obwód podanego prtostokąta to: " + obliczObwod(bok1,bok2));
        System.out.println("Pole podanego prtostokąta to: " + obliczPole(bok1, bok2));

    }

    public static int obliczPole(int a, int b) {
        return a*b;
    }
    public static int obliczObwod(int a, int b) {
        return 2*a+2*b;
    }
}
