package Assignment;

public interface interfaceA {
    void print();
}
class a implements interfaceA {


    @Override
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        a ab=new a();
        ab.print();
    }
}