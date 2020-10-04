package Assignments;
import java.util.*;
class q25_sumEvenOdd{
    public static void main(String[] args){
        int arr[] = {2,3,4,5,6};
        Scanner sc = new Scanner(System.in);
        int se = 0;
        int so = 0;
        sc.close();
        System.out.println("array length:"+arr.length);
        for(int i : arr){
            if(i % 2 == 0){
                se += i;
            }else{
                so += i;
            }
        }
        System.out.println("sum even "+se);
        System.out.println("sum odd "+so);    
    }
}