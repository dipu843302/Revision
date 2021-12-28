package Assignment;

abstract class Abstract {
    abstract void sum();
    void print(){
        System.out.println("non abstract method");
    }
}
class ab extends Abstract{

    @Override
    void sum() {
        System.out.println("Abstract method");
    }

    public static void main(String[] args) {
        ab ab=new ab();
        ab.sum();
    }
}
