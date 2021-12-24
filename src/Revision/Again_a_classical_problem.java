package Revision;

import java.util.Scanner;
import java.util.Stack;

public class Again_a_classical_problem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            String s=scanner.next();
            Stack<Character>stack=new Stack<>();
            boolean bln=true;
            for (int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if (c=='[' || c=='{' || c=='('){
                    stack.push(c);
                }
                if (c==']'){
                    if (stack.isEmpty() || stack.peek()!='['){
                        bln=false;
                        break;
                    }else {
                        stack.pop();
                    }
                }
                if (c=='}'){
                    if (stack.isEmpty() || stack.peek()!='{'){
                        bln=false;
                        break;
                    }else {
                        stack.pop();
                    }
                }
                if (c==')'){
                    if (stack.isEmpty() || stack.peek()!='('){
                        bln=false;
                        break;
                    }else {
                        stack.pop();
                    }
                }
            }
            if (bln && stack.isEmpty()){
                System.out.println("balanced");
            }else {
                System.out.println("not balanced");

            }
        }
    }
}
