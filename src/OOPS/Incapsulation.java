package OOPS;

public class Incapsulation {
    private int age;
    private String name;

    public void getAge(int i) {
       if (age>20){
           System.out.println("You are too old");
       }else {
           System.out.println("correct");
       }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Incapsulation ob1=new Incapsulation();
       ob1.getAge(10);
       ob1.setName("Hey");

    }
}
