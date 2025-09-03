package OOPS.polymorphism;
//static or early binding-compile time polymorphism
//ek method ke multiple forms hai i.e name same but different parameters

// does not depend upon return type i.e agar retrun type alag ho and method ka name same ho to arror aayega
public class Cpoly1 {
    public static void main(String[] args) {
        System.out.println("A");
    }
    void m1(){
        System.out.println("B");
    }
}
