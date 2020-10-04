package Assignments;
import java.util.Scanner;
class Employee{
    static int empNo = 0;
    int salary;
    static int totalSalary = 0;

    Employee(int salary){
        empNo++;
        this.salary = salary;
        totalSalary += salary;
    }
    void display(){
        System.out.println("Empno: "+empNo);
        System.out.println("salary: "+salary);
        System.out.println("totalSalary: "+totalSalary);
    }
    public static void main(String[] args){
        // Employee e = new Employee(25000);
        Scanner sc = new Scanner(System.in);
        Employee e[] = new Employee[3];
        for(int i = 0; i < 3; i++){
            int x = sc.nextInt();
             e[i] = new Employee(x);
             e[i].display();
        }
        sc.close();
    }
}