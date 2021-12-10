package Revision;

import java.util.Scanner;
import java.util.Stack;

public class Infix_to_Postfix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        Stack<Character>stack=new Stack<>();
        String ans="";
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='('||s.charAt(i)=='['|| s.charAt(i)=='{' || s.charAt(i)=='+' ||s.charAt(i)=='-'||
                    s.charAt(i)=='*'|| s.charAt(i)=='/'){
                stack.push(s.charAt(i));
            }else
            if (s.charAt(i)==')'||s.charAt(i)==']'|| s.charAt(i)=='}' && !stack.isEmpty()){

                while (!(stack.peek() =='(') &&!(stack.peek() =='{') && !(stack.peek() =='[')){
                    ans+=stack.pop();
                }
                stack.pop();
            }else {
                ans+=s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
