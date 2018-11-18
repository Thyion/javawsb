package pl.java.course.wsb.lesson2;

import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        System.out.println("Podaj rok: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (((a%4==0)&&(a%100!=0))||a%400==0)
            System.out.println("Rok jest przestępny");
        else
            System.out.println("Rok nie jest przestępny");
    }
}
