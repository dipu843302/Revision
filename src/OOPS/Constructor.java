package OOPS;

public class Constructor {
}
class vehical{
    int wheels;
    String name;
    vehical(int wheels,String name){  // this is constructor.
        this.wheels=wheels;
        this.name=name;
    }
}
class car{
    public static void main(String[] args) {
        vehical a=new vehical(4,"Car");

        System.out.println(a.wheels+" "+a.name);
    }
}
