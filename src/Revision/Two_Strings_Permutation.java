package Revision;

import java.util.Arrays;
import java.util.Scanner;

public class Two_Strings_Permutation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        String s2=scanner.next();
        char arr[]=s.toCharArray();
        char arr2[]=s2.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);
        if (arr.length!=arr2.length){
            System.out.println("No");
        }else {
            boolean bln=true;
            for (int i=0;i<arr.length;i++){
                if (arr[i]!=arr2[i]){
                    bln=false;
                    break;
                }
            }
            if (bln){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
