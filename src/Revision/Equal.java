package Revision;

import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            String a=scanner.next();
            String b=scanner.next();
            boolean bool=true;
            for (int i=0;i<n;i++){
                String bln="";

                for (int j=i;j<n;j++){
                    bln+=a.charAt(j);
                   for (int k=0;k<bln.length();k++){
                       if (b.charAt(k)!=bln.charAt(k)){
                           bool=true;
                           break;
                       }
                   }
                }
            }
            if (bool){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
