package Revision;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count_Chars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        int count=1;
        for (int i=0;i<str.length()-1;i++){
            if (str.charAt(i)==str.charAt(i+1)){
                count++;
            }else {
                System.out.print(str.charAt(i)+""+count);
                count=1;
            }
        }
        System.out.print(str.charAt(str.length()-1)+""+count);
    }
}
