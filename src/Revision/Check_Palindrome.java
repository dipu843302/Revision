package Revision;

import java.util.Scanner;

public class Check_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();

        int left = 0;
        int right = n - 1;
        boolean bln = true;

        while (left != right) {
            if (str.charAt(left) != str.charAt(right)) {
                bln = false;
                break;
            }
            left++;
            right--;
        }
        if (bln) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
