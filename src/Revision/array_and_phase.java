package Revision;

import java.util.Scanner;

public class array_and_phase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        char arr[][]=new char[n][m];

        for (int i=0;i<n;i++ ){
            String s=scanner.next();
            for (int j=0;j<m;j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        int count=0;
        String match="saba";

        for (int i=0;i<n;i++ ){
            String str="";
            for (int j=0;j<m;j++) {
                str+=arr[i][j];
                if (str.equals(match)){
                    count++;
                }
            }
        }
        for (int i=0;i<n;i++ ){
            String str="";
            for (int j=0;j<m;j++) {
                str+=arr[j][i];
                if (str.equals(match)){
                    count++;
                }
            }
        }
        for (int i=0;i<n;i++ ){
            String str="";
            for (int j=0;j<m;j++) {
                if(i==j){
                    str+=arr[i][j];

                }
                if (str.equals(match)){
                    count++;
                }
            }
        }
        String str="";

        for (int i=n-1;i>=0;i--){
            for (int j=0;j<m;j++){
                if (i+j==m-1){
                    str+=arr[i][j];
                }
                if (str.equals(match)){
                    count++;
                     str="";
                }
            }
        }
        System.out.println(count);
    }
}
