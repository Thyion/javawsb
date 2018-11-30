package pl.java.course.wsb.lesson3;

public class PrimitiveWrappersDemo {

    public static void main(String[] args){
        int number = 10;
        Integer aa = 10;
        Integer bb = new Integer(10);
        System.out.println(aa==bb);
        System.out.println(number==aa);

        //Autoboxing

        Integer k = 3;
        System.out.println(k);

        // Unboxing

        int k2 = k;
        Double d1 = 3.4;
        //Double d3 = 2; - nie da sie bo Object Double nie moze być bez przecinka
        double d2 = 2; // działa bo prymitywny typ moze przyjac bez przecinka
    }
}
