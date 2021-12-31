package Revision;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Detector {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine().trim();
        String s2=scanner.nextLine().trim();



        s1 = s1.replaceAll("\\s", "");
        s2 = s2.replaceAll("\\s", "");



        char[] arr =s1.toCharArray();
        char[] arr2 =s2.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);

        if (arr.length!=arr2.length){
            System.out.println("False");
        }else {
            boolean bln=true;
            for (int i=0;i<arr.length;i++){
                if (arr[i]!=arr2[i]){
                   bln=false;
                   break;
                }
            }
            if (bln){
                System.out.println("True");

            }else {
                System.out.println("False");
            }
        }
    }
}
