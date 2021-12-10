package Revision;

import java.util.Scanner;
import java.util.Stack;

public class Smaller_Neighbour_Element {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        Stack<Integer>stack=new Stack<>();
        stack.push(arr[0]);
        int ans[]=new int[n];
        ans[0]=-1;
        for (int i=1;i<n;i++){
            while (!stack.isEmpty() && arr[i]<=stack.peek()){
                stack.pop();
            }
            if (stack.isEmpty()){
                ans[i]=-1;
            }else {
                ans[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        for (int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}
