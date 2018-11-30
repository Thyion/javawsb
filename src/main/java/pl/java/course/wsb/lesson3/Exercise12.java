package pl.java.course.wsb.lesson3;

import java.util.ArrayList;

public class Exercise12 {
    public static void main(String[] args){
        int[] numbers = {2,2,5,584,843,55,63};

        System.out.println(Exercise12.maxValue(numbers));

        Ksiazka[] books = new Ksiazka[5];

        ArrayList<Ksiazka> book = new ArrayList();
        book.add(new Ksiazka("aaaa","aaaa",123));
        System.out.println(book);





    }

    public static double maxValue(int[] numbers){
        double s = 0;

        for (double a:numbers) {
            if(a>s){
                s=a;
            }
        }

        return s;
    }
}
