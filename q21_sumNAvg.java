import java.util.Scanner;
class q21_sumNAvg{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;
        double avg;
        for(int i = 0; i < arr.length; i++){
           arr[i] = sc.nextInt();
           sum += arr[i];    
        }
        sc.close();
        avg = sum/arr.length;
        System.out.println(avg);
    } 
}