package Revision;

import java.util.ArrayList;
import java.util.Scanner;

public class Subarray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int j=0;
        ArrayList<String>arrayList=new ArrayList<>();
        subarray(arr,j,arrayList);
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }

    private static ArrayList<String> subarray(int[] arr,int j,ArrayList<String>arrayList) {
        String s="";
        if (j==arr.length) return arrayList;

        for (int i=j;i<arr.length;i++){
            s+=arr[i]+" ";
          arrayList.add(s);
        }
      return   subarray(arr, j+1,arrayList);
    }
}
