package Revision;

import java.util.HashMap;
import java.util.Scanner;

public class Maximum_value {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }

            HashMap<Integer,Integer>hashMap=new HashMap<>();
            int max=0;
            for (int i=0;i<n;i++){
                if (hashMap.containsKey(arr[i])){
                    int temp=Math.abs(i-hashMap.get(arr[i]));
                    max=Math.max(max,temp);
                }else {
                    hashMap.put(arr[i],i);
                }
            }
            System.out.println(max);

        }
    }
}
