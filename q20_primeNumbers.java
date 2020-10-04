package Assignments;
import java.util.Scanner;
class q20_primeNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int x = sc.nextInt();
        System.out.println("Enter 2nd number");
        int y = sc.nextInt();
        sc.close();
        for(int i = x; i <= y; i++){
            boolean flag = false;
            for(int j = 2; j < i; j++){
                if(i % j == 0)
                flag = true;
            }
            if(i >= 2 && flag == false){
                System.out.print(i+" ");
            }
        }
    }
}