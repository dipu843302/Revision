package Revision;

import java.util.Scanner;
import java.util.Stack;

public class Strings_with_Parenthesis {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next().trim();
        Stack<Character>stack=new Stack<>();
        boolean bln=true;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }
            if (s.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    bln = false;
                    break;
                }
            }
            if (s.charAt(i) == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    bln = false;
                    break;
                }
            }
            if (s.charAt(i) == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    bln = false;
                    break;
                }
            }
        }
            if ( bln){
                System.out.println("balanced");
            }else {
                System.out.println("unbalanced");
            }

    }
}
