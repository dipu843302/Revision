package Revision;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Row_Game {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {

            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int arr[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }

           HashMap<Integer,Integer>hashMap=new HashMap<>();
            for (int i=0;i<m;i++){
                hashMap.put(arr[0][i],1);
            }
           int r=1;
            while (r<n){
                boolean bln=false;
                for (Map.Entry<Integer,Integer>map:hashMap.entrySet()){
                    int a=map.getKey();
                    for (int i=0;i<m;i++){
                        if (arr[r][i]==a){
                            bln=true;
                            break;
                        }
                    }
                    if (bln==false){
                        hashMap.remove(a);
                    }
                }
                r++;
            }
            System.out.println(hashMap.size()-1);

        }
    }
}
