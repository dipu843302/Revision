package Revision;

import java.util.Scanner;

public class Buggy_Update {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {


            String a = scanner.next();
            String b = scanner.next();
            boolean bln = true;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != 46) {
                    int x = Character.getNumericValue(a.charAt(i));
                    int y = Character.getNumericValue(b.charAt(i));
                    if (x >y) {
                        bln = false;
                        break;
                    }else if (x<y){
                        break;
                    }
                }

            }
            if (bln) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
//int a=Character.getNumericValue(c);