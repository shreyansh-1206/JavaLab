package OOPS.ExceptionHandling;

public class Excpt {
    //Exception- recoverable,raised by programmer,
    // compile time pe check hota h
    //is of two types- checked and unchecked
    //ERROR-non recoverable,raised by system, unchecked always, found on runtime
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("H");
        try {
            System.out.println(200/0);
        }
        catch (Exception e ){
//            e.printStackTrace();
            System.out.println(e.toString()); // java.lang.ArithmeticException: / by zero
           // System.out.println(e.getMessage()); ;/// by zero
        }
        System.out.println("H");
        System.out.println("a");
        System.out.println("h");


    }
}
