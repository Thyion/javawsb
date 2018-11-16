package pl.java.course.wsb.lesson1;

public class Exercise4 {
    public static void main(String[] args) {

        double a = 20;
        double b = 80;
        double c = (a+b)*25;
        System.out.println(c);
        if(c/40<=20) System.out.println("Total was over the limit");
        else System.out.println("Total wasn't over the limit");
    }
}
