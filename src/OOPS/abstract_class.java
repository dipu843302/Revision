package OOPS;

abstract class abstract_class {

    abstract void start();
    abstract void light();

    public void Break() {

    }

}
 class Car extends abstract_class{

    @Override
    void start() {
        System.out.println("car start with key");
    }

     @Override
     void light() {

     }
 }

class Bike extends abstract_class{

    @Override
    void start() {
        System.out.println("bike start with kick");
    }

    @Override
    void light() {

    }

    public static void main(String[] args) {
        Bike bike=new Bike();
        bike.start();
    }
}
