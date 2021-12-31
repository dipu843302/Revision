package Revision;


import java.util.Scanner;

public class String_Power {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            String s=scanner.next();
            int len=0;
            int count=1;
            for (int i=0;i<s.length()-1;i++){
               if (s.charAt(i)==s.charAt(i+1)){
                   count++;
               }else {
                   len=Math.max(count,len);
                   count=1;
               }

            }
            len=Math.max(len,count);

            System.out.println(len);
        }
    }
}
