package pl.java.course.wsb.lesson1;

public class Exercise1 {
    public static void main(String[] args){
        byte a = 2;
        short b = 23;
        int c = 534;
        long d = 50000 + 10*a+b+c;
        double e = 200;
        System.out.println(d);
        System.out.println(convertPoundsToKilograms(e));
    }

    public static double convertPoundsToKilograms(double pounds) {

        return pounds*POUNDINKILOGRAMS;

            }



    final static double POUNDINKILOGRAMS = 0.45359237;
}
