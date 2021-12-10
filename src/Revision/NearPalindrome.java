package Revision;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NearPalindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int k=scanner.nextInt();
           String s=scanner.next();
            HashMap<Character,Integer>hashMap=new HashMap<>();
            for (int i=0;i<n;i++){
                if (hashMap.containsKey(s.charAt(i))){
                    hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
                }else {
                    hashMap.put(s.charAt(i),1);
                }
            }
            int count=0;
            for (Map.Entry<Character,Integer>map:hashMap.entrySet()){
                if (map.getValue()%2==1){
                    count++;
                }
            }
            if (count/2<=k){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
    }
}
