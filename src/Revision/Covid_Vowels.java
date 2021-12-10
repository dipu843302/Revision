package Revision;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Covid_Vowels {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        int count=0;

        for (int i=0;i<str.length();i++){

            HashSet<Character>hashSet=new HashSet<>();
            for (int j=i;j<str.length();j++){
                hashSet.add(str.charAt(j));
                if (hashSet.contains('a') && hashSet.contains('e')&& hashSet.contains('i')&&
                hashSet.contains('o')&& hashSet.contains('u')){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
