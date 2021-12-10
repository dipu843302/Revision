package InterView_Practice;

import java.util.Scanner;

public class check_odd_or_even {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if ((n&1)==0){
            System.out.printf("Even");
        }else {
            System.out.printf("Odd");
        }
    }
}
