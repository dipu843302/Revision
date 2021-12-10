package Revision;

import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_Element {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int arr[]=new  int[n];
            for (int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            Stack<Integer>stack=new Stack<>();
            int ans[]=new int[n];
            ans[n-1]=-1;
            stack.push(arr[n-1]);
            for (int i=n-2;i>=0;i--){
                while (!stack.isEmpty() && arr[i]>stack.peek()){
                    stack.pop();
                }
                if (!stack.isEmpty()){
                    ans[i]=stack.peek();
                }else {
                    ans[i]=-1;
                }
                stack.push(arr[i]);
            }
            for (int i=0;i<n;i++){
                System.out.print(ans[i]+" ");
            }
        }
    }
}
