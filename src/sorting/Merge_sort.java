package sorting;

import java.util.Scanner;

public class Merge_sort {
    int[] array;
    int []tempmergearray;
    int len;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int Inputarr[] = new int[n];
            for (int i = 0; i < n; i++) {
                Inputarr[i] = scanner.nextInt();
            }
            Merge_sort merge_sort = new Merge_sort();
            merge_sort.sort(Inputarr);
            for (int i = 0; i < n; i++) {
                System.out.print(Inputarr[i] + " ");
            }
            System.out.println();
        }
    }

    private void sort(int[] Inputarr) {
        this.array=Inputarr;
        this.len=Inputarr.length;
        this.tempmergearray=new int[len];
        divideArray(0,len-1);
    }

    private void divideArray(int lowerIndex, int HigherIndex) {
        if (lowerIndex<HigherIndex){

            int middle=lowerIndex+(HigherIndex-lowerIndex)/2;
            divideArray(lowerIndex,middle);
            divideArray(middle+1,HigherIndex);
            mergeArray(lowerIndex,middle,HigherIndex);
        }
    }

    private void mergeArray(int lowerIndex, int middle, int higherIndex) {
        for (int i=lowerIndex;i<=higherIndex;i++){
            tempmergearray[i]=array[i];
        }
        int i=lowerIndex;
        int j=middle+1;
        int k=lowerIndex;
        while (i<=middle && j<=higherIndex){
            if (tempmergearray[i]<=tempmergearray[j]){
                array[k]=tempmergearray[i];
                i++;
            }else {
                array[k]=tempmergearray[j];
                j++;
            }
            k++;
        }
        while (i<=middle){
            array[k]=tempmergearray[i];
            i++;
            k++;
        }
    }
}