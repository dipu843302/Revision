package Assignment;

public class RunTime {
    void car(){
        System.out.println("Car has four wheels");
    }
}
class Abc extends RunTime{
//    void car(){
//        System.out.println("Child class");
//    }

    public static void main(String[] args) {
        Abc abc=new Abc();
        abc.car();

        RunTime runTime=new RunTime();
        runTime.car();
    }
}