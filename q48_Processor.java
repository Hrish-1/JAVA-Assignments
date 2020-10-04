package Assignments;
import java.util.Scanner;
abstract class Processor{
    int data;
    void showdata(){
        System.out.println(data);
    }
    abstract void process(int x); 
}
class Factorial extends Processor{
   
    void process(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
    System.out.println("Factorial :"+fact);
    }
   
}
class Circle1 extends Processor{
    void process(int r){
        double area  = 3.14 * r * r;
        System.out.println("Area "+area);
    }
}
class Demo2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int ch = sc.nextInt();
        switch(ch){
            case 1 : Processor p = new Factorial();
                     p.process(5);
                     break;
            case 2 : Processor c = new Circle1();
                     c.process(4);
                     break;
            default : System.out.println("Invalid choice");
                       //break; 
        }
        sc.close();
    }
}