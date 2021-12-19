package OOPS;

import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args) {
        int a=10;
        int b=0;

        try {
            int c=10/2;
        System.out.println(c);
       }catch (ArithmeticException e){
            System.out.println("Invalid "+e);
        }
        finally {
            System.out.println("cleanup");
        }
    }
}
