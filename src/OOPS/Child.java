package OOPS;

public class Child extends Parent {

    public void name(){
        System.out.println("Child");
    }
    public static void main(String[] args) {
        Parent p=new Parent();
       Child c=new Child();
       c.name();
       p.name();
    }
}
