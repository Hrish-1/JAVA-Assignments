package Assignments;
import java.util.Scanner;
class q17_revNum{
    public static void main(String[] args) {
        int remainder;
        int revnum = 0;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        while(x != 0){
            remainder = x % 10;
            revnum = revnum * 10 + remainder;
            x = x/10;
        }
        System.out.print(revnum);
    }
}