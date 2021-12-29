package Revision;

import java.util.Scanner;

public class D_Array_and_Phrase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        char arr[][]=new char[n][m];

        for (int i=0;i<n;i++){
            String s=scanner.next();
            for (int j=0;j<m;j++){
                arr[i][j]=s.charAt(j);
            }
        }

        int coutn=0;
        String s="saba";
        for (int i=0;i<n;i++){

            for (int j=0;j<m;j++){
                String check="";
                if (j < m - 3) {
                    check = check + arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i][j + 3];
                    if (check.equals(s))
                        coutn++;
                }
            }
        }

        for (int i=0;i<n;i++){

            for (int j=0;j<m;j++){

                if (i < n - 3) {
                    String check="";
                    check = check + arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 3][j];
                    if (check.equals(s))
                        coutn++;
                }

            }
        }
        String check="";

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (i < n - 3 && j < m - 3) {
                    check = "";
                    check = check + arr[i][j] + arr[i + 1][j + 1] + arr[i + 2][j + 2] + arr[i + 3][j + 3];
                    if (check.equals(s))
                        coutn++;
                }
            }

        }
        String ch="";

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (i >= 3 && j < m - 3) {
                    ch = "";
                    ch = ch + arr[i][j] + arr[i - 1][j + 1] + arr[i - 2][j + 2] + arr[i - 3][j + 3];
                    if (ch.equals(s))
                        coutn++;
                }
            }

        }

        System.out.println(coutn);
    }
}
