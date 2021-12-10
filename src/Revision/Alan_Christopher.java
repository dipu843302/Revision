package Revision;

import java.util.Scanner;
import java.util.Stack;

public class Alan_Christopher {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            String str=scanner.next();
            Stack<Character>stack=new Stack<>();

         //   System.out.println(str.length());

           for (int i=0;i<str.length();i++){
               if (str.charAt(i)=='#' && !stack.isEmpty()){
                   stack.pop();
               }
               if (str.charAt(i)!='#'){
                   stack.push(str.charAt(i));
               }
           }
        //    System.out.println(stack.size());
           String ans="";
          while (!stack.isEmpty()){
              ans+=stack.pop();
          }
          //  System.out.println(ans);
           for (int i=ans.length()-1;i>=0;i--){
               System.out.print(ans.charAt(i));
           }
            System.out.println();

        }
    }
}
