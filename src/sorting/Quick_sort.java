package sorting;

import java.util.Scanner;

public class Quick_sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Quick_sort sort=new Quick_sort();
        sort.quickSortRecursion(arr,0,n-1);
        sort.printArray(arr);

    }
    int partion(int arr[],int low,int high){
        int pivot=arr[(low+high)/2];
        while (low<=high){
            while (arr[low]<pivot){
                low++;
            }
            while (arr[high]>pivot){
                high--;
            }
            if (low<=high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        return low;
    }
    void quickSortRecursion(int arr[],int low,int high){
        int pi=partion(arr,low,high);
        if (low<pi-1){
            quickSortRecursion(arr,low,pi-1);
        }
        if (pi<high){
            quickSortRecursion(arr,pi,high);
        }
    }
    void  printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
