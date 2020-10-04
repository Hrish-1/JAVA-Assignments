package Assignments;
import java.util.Scanner;

/*
50.	Explain the importance of toString() and equals() method of the Object class and override them on class 
Employee(empId,name,salary).
a. Create class for main method(say XYZ),and accept five employees information and store in an array.
Also ensure if entered empId already exist or not (use equals method).
b. Display all employee info using toString method.
*/
public class q50_EmpInfo{
     int empId;
    String name;
    double salary;
    q50_EmpInfo(){}
    q50_EmpInfo(int empId,String name,double salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    boolean equals (q50_EmpInfo E){
        if(E.empId == this.empId){
            return true;
        }else return false;
    }
    // void show(q50_EmpInfo[] q){
    //     for(q50_EmpInfo a : q){
    //         System.out.println("id :"+a.empId+" "+"name :"+a.name+" "+"salary: "+a.salary);
    //     }
    // }
        public String toString(){
            String str = "id : "+this.empId+" "+"name :"+this.name+" "+"salary: "+this.salary;
            return str;
        }
public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      q50_EmpInfo[] arr = new q50_EmpInfo[5];
      for(int i = 0; i < arr.length; i++){
         int empId = sc.nextInt();
         String name = sc.next();
         double salary = sc.nextDouble();
            arr[i] = new q50_EmpInfo(empId, name, salary);
         for(int j = 0; j < i; j++){
         if(arr[i].equals(arr[j])){
            i--;
            System.out.println("Enter value again!!!");
            break;
         }
         }
      }
    for(q50_EmpInfo x : arr){
        System.out.println(x.toString());
    }
    sc.close();
}
}