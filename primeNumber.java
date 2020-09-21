import java.util.Scanner;
import java.lang.Math;
class primeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int flag = 0;
        for(int i = 2; i < Math.sqrt(x);i++){
            if(x % i == 0){
                 flag = 1;
            }
        }
        if(x >= 2 && flag == 0){
            System.out.println(x+" is a prime number");  
        }else{
            System.out.println(x+" is not a prime number");
        }
    }
}