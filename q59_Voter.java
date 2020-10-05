package Assignments;
import java.util.Scanner;

/*
59.	Create a class Voter(voterId, name, age) with parameterized constructor. 
 The parameterized constructor should throw a checked exception if age is less than 18.
 The message of exception is “invalid age for voter ” 
*/
public class q59_Voter{
    int voterId;
    String name;
    int age;
    q59_Voter(int voterId,String name,int age){
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "voterID : "+voterId+"\n"+"Name : "+name+"\n"+"Age : "+age;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter voterID");
        int vid = sc.nextInt();
        System.out.println("Enter name");
        String nm = sc.next();
        System.out.println("Enter Age");
        int a = sc.nextInt();
        sc.close();
        try{
            if(a < 18) throw new Exception("Invalid Age");
            q59_Voter q = new q59_Voter(vid,nm,a);
            System.out.println(q);

        }catch(Exception e){
            System.out.print(e);
        }   
    }
}