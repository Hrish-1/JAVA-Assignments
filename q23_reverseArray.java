package Assignments;
import java.util.Scanner;
class reverseArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int arr[] = new int[n];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}