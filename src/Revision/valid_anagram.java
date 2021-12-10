package Revision;

import java.util.Arrays;
import java.util.Scanner;

public class valid_anagram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0)
        {
            String str=scanner.next();
            String str2=scanner.next();
            boolean bln=true;
            if (str.length()!=str2.length()){
                System.out.println("false");
            }else {
                char arr[]=str.toCharArray();
                char arr2[]=str2.toCharArray();
                Arrays.sort(arr2);
                Arrays.sort(arr);
                for (int i=0;i<arr.length;i++){
                    if (arr[i]!=arr2[i]){
                        bln=false;
                    }
                }
                if (bln){
                    System.out.println("true");
                }else {
                    System.out.println("false");
                }
            }
        }
    }
}
