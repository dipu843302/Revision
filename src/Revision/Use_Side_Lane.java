package Revision;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Use_Side_Lane {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean bln2=false;
        while (bln2==false) {


            int n = scanner.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }


            int count = 1;
            Stack<Integer> stack = new Stack<>();
            boolean bln = true;
            for (int i = 0; i < n; i++) {
                if (count == arr[i]) {
                    count++;
                    continue;
                } else {
                    if (stack.isEmpty()) {
                        stack.push(arr[i]);
                    } else if (arr[i] < stack.peek()) {
                        stack.push(arr[i]);
                    } else {
                       while (count== stack.peek()){
                           stack.pop();
                           count++;
                       }
                       if (count==arr[i]){
                           count++;
                       }
                    }
                }
            }
            while (!stack.isEmpty() && count==stack.peek()){
                count++;
                stack.pop();
            }


            if (stack.isEmpty()) {
                System.out.println(bln);
            } else {
                System.out.println(bln);
            }
            int zer = scanner.nextInt();
            if (zer == 0) {
                bln2 = true;
            }

        }
    }
}
