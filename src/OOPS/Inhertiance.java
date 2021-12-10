package OOPS;

public class Inhertiance {
     void showIntherit(){
         System.out.println("inhertance class");
     }
}
class A extends Inhertiance{

    void showA(){
        System.out.println("OOPS.A class method");
    }
}
class B extends A{
    void showB(){
        System.out.println("OOPS.B class method");
    }

    public static void main(String[] args) {
        Inhertiance ob1=new Inhertiance();
        ob1.showIntherit();

        System.out.println("_____________");

        A ob2=new A();
        ob2.showA();
        ob2.showIntherit();

        System.out.println("________________");

        B ob3=new B();
        ob3.showIntherit();
        ob3.showA();
        ob3.showB();
    }
}
