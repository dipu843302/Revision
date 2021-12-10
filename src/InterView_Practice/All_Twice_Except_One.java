package InterView_Practice;

        import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;

public class All_Twice_Except_One {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n=scanner.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            int sum=arr[0];
            for (int i=1;i<n;i++){
                sum=sum^arr[i];
            }
            System.out.println(sum);

//            HashMap<Integer,Integer>hashMap=new HashMap<>();
//            for (int i=0;i<n;i++){
//                if (hashMap.containsKey(arr[i])){
//                    hashMap.put(arr[i],hashMap.get(arr[i])+1);
//                }else {
//                    hashMap.put(arr[i],1);
//                }
//            }
//            for (Map.Entry<Integer,Integer>map:hashMap.entrySet()){
//                if (map.getValue()==1){
//                    System.out.println(map.getKey());
//                    break;
//                }
//            }
        }
    }
}
