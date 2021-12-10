package Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SeparationofOddEven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            ArrayList<Integer>arrayList=new ArrayList<>();
            int n=scanner.nextInt();
          //  int arr[]=new int[n];
            for (int i=0;i<n;i++){
                int a=scanner.nextInt();
                arrayList.add(a);
            }
            int type=scanner.nextInt();
            if (type==1){
                int cout=0;

                for (int i=0;i<n;i++){
                    if (arrayList.get(i)%2==0){
                        cout++;
                    }
                }
                int ans[]=new int[cout];
                for (int i=0;i<n;i++){
                    if (arrayList.get(i)%2==0){
                        ans[i]=arrayList.remove(i);
                    }
                }
                Arrays.sort(ans);
                int arr[]=new int[arrayList.size()];
                for (int i=0;i<arrayList.size();i++){
                    arr[i]=arrayList.get(i);
                }
                Arrays.sort(arr);
                 for (int i=0;i<ans.length;i++){
                     System.out.print(ans[i]+" ");
                 }
                for (int i=0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }

            }else {
                int cout=0;

                for (int i=0;i<n;i++){
                    if (arrayList.get(i)%2==0){
                        cout++;
                    }
                }
                int ans[]=new int[cout];
                for (int i=0;i<n;i++){
                    if (arrayList.get(i)%2==1){
                        ans[i]=arrayList.remove(i);
                    }
                }
                Arrays.sort(ans);
                int arr[]=new int[arrayList.size()];
                for (int i=0;i<arrayList.size();i++){
                    arr[i]=arrayList.get(i);
                }
                Arrays.sort(arr);
                for (int i=0;i<ans.length;i++){
                    System.out.print(ans[i]+" ");
                }
                for (int i=0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }

            }
        }
    }
}
