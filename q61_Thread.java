package Assignments;

import java.util.Scanner;

public class q61_Thread{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MyRunnable m = new MyRunnable(sc.nextInt());
        sc.close();
        Thread th = new Thread(m);
        th.start();
    }
}
class MyRunnable implements Runnable{
    int n;
    MyRunnable(int n){
        this.n = n;
    }
    @Override
    public void run(){
            try{
                for(int i = 0; i < n; i++){
                    for(int j = 0; j <= i; j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                    Thread.sleep(500);
                }
            }catch(InterruptedException e){

            }
    }
}