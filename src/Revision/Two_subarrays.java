package Revision;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Two_subarrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            String str=scanner.next();
            int count=0;
            boolean bln=true;
            for (int i=0;i<n;i++){
                HashMap<Character,Integer>hashMap=new HashMap<>();
                for (int j=i;j<n;j++){
                    if (hashMap.containsKey(str.charAt(j))){
                        hashMap.put(str.charAt(j),hashMap.get(str.charAt(j))+1);
                    }else {
                        hashMap.put(str.charAt(j),1);
                    }
                    for (Map.Entry<Character,Integer>map:hashMap.entrySet()){
                        if (map.getValue()>3){
                            bln=false;
                            break;

                        }
                    }
                    if (bln)
                        count++;
                }


            }
            System.out.println(count);
        }
    }
}
