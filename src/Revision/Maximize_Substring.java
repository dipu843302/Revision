package Revision;

import java.util.Scanner;

public class Maximize_Substring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String str=scanner.next();
        String lexo = "";
        for (int i = 0; i < str.length(); ++i) {
            if (lexo.compareTo(str.substring(i)) <= 0) {
                lexo = str.substring(i);
            }
        }
        System.out.println(lexo);
    }
}

