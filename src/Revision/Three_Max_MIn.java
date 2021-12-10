package Revision;

import java.util.*;

public class Three_Max_MIn {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        HashMap<Integer,Integer>hashMap=new HashMap<>();
        for (int i=0;i<n;i++){
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], hashMap.get(arr[i])+1);
            }else {
                hashMap.put(arr[i],1 );
            }
        }
        if (hashMap.size()<3){
            System.out.println("Not Possible");
            System.out.println("Not Possible");
        }else {

            int count=0;
            int arr2[]=new int[hashMap.size()];
            int i=0;

            for (Map.Entry<Integer,Integer>map:hashMap.entrySet()){
                arr2[i]=map.getKey();
                i++;

            }
            Arrays.sort(arr2);
            for (int k=0;k<3;k++){
                System.out.print(arr2[k]+" ");
            }
            System.out.println();
            count=0;
            for (int j= arr2.length-3;j<arr2.length;j++){
                if (count<3){
                    System.out.print(arr2[j]+" ");
                    count++;
                }
            }
        }
    }
}
