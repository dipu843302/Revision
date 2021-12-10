package Revision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Anagram_Pairs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
             int count=0;
            HashMap<String,Integer>hashMap=new HashMap<>();
            while (n-->0){
                String str=scanner.next();
                char arr[]=str.toCharArray();
                Arrays.sort(arr);
                String string = new String(arr);
                if (hashMap.containsKey(string)){
                    hashMap.put(string,hashMap.get(string)+1);
                    count++;
                }else {
                    hashMap.put(string,1);
                }
            }
            System.out.println(count);
        }
    }
}
