package Assignment;

public class CompileTime {
    void divide(int a,int b){
        System.out.println(a/b);
    }
    void divide(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        CompileTime compileTime=new CompileTime();
        compileTime.divide(5,5);
    }
}
