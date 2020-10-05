package Assignments;
import java.util.Scanner;
public class q58_WeekDays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] week = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        try{
            System.out.println("Enter a number");
            System.out.println(week[sc.nextInt()]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bound");
        }
        sc.close();
    }
}