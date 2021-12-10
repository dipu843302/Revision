package Recursion_DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            int n = scanner.nextInt();
            int num = scanner.nextInt();
            String str = Integer.toString(num);
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (hashMap.containsKey(str.charAt(i))) {
                    hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
                } else {
                    hashMap.put(str.charAt(i), 1);
                }
            }
            for (int i=48;i<58;i++){
                if (hashMap.get(i)!=null){
                    System.out.print(hashMap.get(i)+" ");
                }else {
                    System.out.print(0+" ");
                }
            }
        }

    }
}
