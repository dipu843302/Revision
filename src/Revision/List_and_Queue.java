package Revision;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class List_and_Queue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        Queue<Integer>queue=new LinkedList<>();
        while (t-->0){
            String a=scanner.next();
            if (a.equals("E")){
              int b=scanner.nextInt();
              queue.add(b);
            }else {
                if (!queue.isEmpty()){
                    System.out.println(queue.remove());
                }else {
                    System.out.println("Empty");
                }
            }
        }
    }
}
