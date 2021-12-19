package OOPS;

public class Over extends Overriding{
    @Override
    public int add(int a, int b) {
        return 1;
    }

    public static void main(String[] args) {
        Overriding over=new Over2();
      int c=  over.add(10,20);
        System.out.println(c);
    }
}
