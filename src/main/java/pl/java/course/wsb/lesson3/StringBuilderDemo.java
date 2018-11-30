package pl.java.course.wsb.lesson3;

public class StringBuilderDemo {



    public static void main(String[] args){


        String name = "Krzysztof";
        StringBuilder name2 = new StringBuilder(name);
        name2.append(" Programista");
        System.out.println(name2);
        name2.reverse();
        System.out.println(name2);
    }
}
