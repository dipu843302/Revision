package Recursion_DSA;

import java.util.*;

public class MakeitUnique {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        s.replace(" ","");

//        HashMap<Character,Integer> hashMap=new HashMap<>();
//        for (int i=0;i<s.length();i++){
//            hashMap.put(s.charAt(i),1);
//        }
//        for (Map.Entry<Character,Integer>map:hashMap.entrySet()){
//            System.out.print(map.getKey());
//        }
        HashSet<Character>hashSet=new HashSet<>();
        for (int i=0;i<s.length();i++){
            hashSet.add(s.charAt(i));
        }
       // for (int i=0;i< )
        
    }

   
}
