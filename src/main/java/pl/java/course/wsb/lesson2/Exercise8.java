package pl.java.course.wsb.lesson2;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args){
        System.out.println("Podaj 2 liczby:");
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        int a = in.nextInt();
        System.out.println("Podaj drugą liczbę:");
        int b = in.nextInt();
        System.out.println("Ich suma to: " + suma(a,b));
        System.out.println("Ich roznica to: " + roznica(a,b));
        System.out.println("Ich iloczyn to: " + iloczyn(a,b));
        System.out.println("Ich iloraz to: " + iloraz(a,b));


    }

    public static int suma (int a, int b) {
        return a + b;
    }
    public static int roznica  (int a, int b) {
        return a - b;
    }
    public static int iloczyn (int a, int b) {
        return a * b;
    }
    public static double iloraz (int a, int b) {
        return (double)a / (double)b;
    }

}
