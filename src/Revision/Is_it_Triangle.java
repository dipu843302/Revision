package Revision;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Is_it_Triangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();


            if (a+b>c && a+c>b && b+c>a){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
