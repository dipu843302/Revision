package Revision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//char tempArray[] = inputString.toCharArray();
public class Pasha_and_Shasha_and_valid_anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-- > 0) {
            String a = scanner.next();
            String b = scanner.next();

            boolean bln=true;
            if (a.length()!=b.length()){
                bln=false;

            }else {


                char arr[] = a.toCharArray();
                char arr2[] = b.toCharArray();

                Arrays.sort(arr);
                Arrays.sort(arr2);

                for (int i = 0; i < a.length(); i++) {
                   if (arr[i]!=arr2[i]){
                       bln=false;
                       break;
                   }

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
