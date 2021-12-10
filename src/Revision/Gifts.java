package Revision;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Gifts {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
          Queue<Integer>queue=new LinkedList<>();
            int siz=0;
            for (int i=0;i<n;i++){
                if (queue.contains(arr[i])){
                    while (queue.peek()!=arr[i]){
                        queue.remove();
                    }

                    queue.remove();
                    queue.add(arr[i]);
                    siz=Math.max(siz,queue.size());

                }else {
                    queue.add(arr[i]);
                    siz=Math.max(siz,queue.size());
                }
            }
            System.out.println(siz);

        }

    }
}
