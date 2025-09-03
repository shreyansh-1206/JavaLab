package OOPS.interfaces;
// agar interface me ek bhi method na ho to marker interace/tagline
// agar interface me ek hi method ho to fuctional interface
interface Inter1{
    int x=112;
    void method1();
}

public class test1 {
    public static void main(String[] args) {
        System.out.println("Main entry point");
        System.out.println(Inter1.x);
        int x=113;
        System.out.println(x);

    }
    public void method1(){
        System.out.println("This is my method");

    }
}
