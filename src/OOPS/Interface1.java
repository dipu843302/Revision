package OOPS;

public interface Interface1 {
    void print();
}
class apple implements Interface1 {

    @Override
    public void print() {
        System.out.println("Two apple");
    }

    public static void main(String[] args) {
        apple apple=new apple();
        apple.print();
    }
}