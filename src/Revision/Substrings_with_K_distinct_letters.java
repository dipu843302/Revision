package Revision;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Substrings_with_K_distinct_letters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        String str=scanner.next();
        int count=0;

        for (int i=0;i<n-k;i++){
            HashSet<Character>hashSet=new HashSet<>();
            for (int j=i;j<i+k;j++){
                hashSet.add(str.charAt(j));
            }
            if (hashSet.size()>=k){
                count++;
            }
        }

        System.out.println(count);

    }
}
