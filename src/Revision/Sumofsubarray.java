package Revision;

import java.util.HashSet;
import java.util.Scanner;

public class Sumofsubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            Long arr[] = new Long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextLong();
            }
            HashSet<Long>hashSet=new HashSet<>();
            hashSet.add(0L);
            boolean bln=false;
            Long count=0L;
          for (int i=0;i<n;i++){
             count+=arr[i];
             hashSet.add(count);
             if (hashSet.contains(count-k)){
                 bln=true;
                 break;
             }


          }
          if (bln){
              System.out.println("Yes");
          }else {
              System.out.println("No");
          }
        }
    }
}
