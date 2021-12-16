package OOPS;

abstract class abstract_class {

    abstract void start();
   abstract void light();

    public static void main(String[] args) {
        abstract_class a= new abstract_class() {
            @Override
            void start() {

            }

            @Override
            void light() {

            }
        } ;

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
}
