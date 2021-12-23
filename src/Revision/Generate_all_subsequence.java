package Revision;

import java.util.Scanner;

public class Generate_all_subsequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String str=scanner.next();
        String res="";
        int index=0;
        int len=str.length();

        sub(res,index,len,str);
    }

    private static String sub(String res, int index, int len, String str) {
        if (index==len){
           return res;
        }else {
     return sub(res, index + 1, len, str);
           // res+=str.charAt(index);
          //  return sub(res, index + 1, len, str);
        }
    }
}
