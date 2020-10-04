package Assignments;

import java.util.Scanner;

interface Prime{
    boolean checkPrime(int n);
}
public class q62_CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        MyRunnable1 m = new MyRunnable1(sc.nextInt());
        sc.close();
        Thread th1 = new Thread(m);
        th1.start();
    }
}
class MyRunnable1 implements Runnable{
    int n;
    MyRunnable1(int n){
        this.n = n;
    }
    void checkP(Prime p){
        if(p.checkPrime(n)){
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }
    }
    @Override
    public void run(){
        checkP(n -> {
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0) return false;
            }
            return true;
        });
    }
}
