package Assignments;

import java.util.Scanner;

/*
60.	Create Interface StudentFee and declare following method.  getFee() throws InvalidFeeException.
 This method ask fees from user and throws exception if user enters invalid or negative fees 
 Create class Student with members (name, fees) and implement the StudentFee Interface.
*/
interface StudentFee{
    void getFee();
}
class Student6 implements StudentFee{
    String name;
    int fees;
    Student6(String name,int fees){
        this.name = name;
        this.fees = fees;
    }
    public void getFee(){
        try{
            if(this.fees <= 0) throw new Exception("Invalid Fees");
            else{
                System.out.println("Name :"+name);
                System.out.println("fees :"+fees);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class q60_StudentFee {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    int fees = sc.nextInt();
    StudentFee f = new Student6(name,fees);
    f.getFee();
    sc.close();
   }
}
