package OOPS;

public class Overloading {
    public int multi(int a,int b){
        return a*b;
    }
    public int multi(int a,int b,int c){
        return a*b*c;
    }
    public static void main(String[] args) {
        Overloading overloading=new Overloading();
       int ans= overloading.multi(2,5);
        System.out.println(ans);
    }
}
