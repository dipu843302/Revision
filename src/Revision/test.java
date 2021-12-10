package Revision;

public class test {
    public static void main(String[] args) {
        String a = "ABC";
        String b = new String("ABC");
        String c = b.intern();
        System.out.println(a == c);
        System.out.println (b==c);
    }
}
