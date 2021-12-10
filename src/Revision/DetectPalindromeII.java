package Revision;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DetectPalindromeII {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            String str=scanner.next();
            HashMap<Character,Integer>hashMap=new HashMap<>();
            for (int i=0;i<n;i++){
                if (hashMap.containsKey(str.charAt(i))){
                    hashMap.put(str.charAt(i),hashMap.get(str.charAt(i))+1);
                }else {
                    hashMap.put(str.charAt(i),1);
                }
            }
            int coutn=0;
            for (Map.Entry<Character,Integer>map:hashMap.entrySet()){
                if (map.getValue()%2==1){
                    coutn++;
                }
            }
            if (coutn>1){
                System.out.println("Not possible");
            }else {
                System.out.println("Possible");
            }
        }
    }
}
