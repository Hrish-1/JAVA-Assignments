package Assignments;
interface Taxable{
    double salesTax = 0.7;
    double incomeTax = 0.105;

    void calcTax();
}
class Employee4 implements Taxable{
    int empid;
    int salary;
    String name;

    Employee4(){}

    Employee4(int empid,int salary,String name){
        this.empid = empid;
        this.salary = salary;
        this.name = name;
    }

    public void calcTax(){
        double incomeTax1 = salary * incomeTax;
        System.out.println("income tax "+incomeTax1); 
    }
}
class Product4 implements Taxable{
    int pid;
    int price;
    int quantity;

    Product4(){}

    Product4(int pid,int price,int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    public void calcTax(){
        double salesTax1 = (price * quantity) * salesTax;
        System.out.println("sales tax "+salesTax1); 
    }
}
class Main{
    public static void main(String[] args){
        Taxable t = new Employee4(1,25000,"Rex");
        Taxable t1 = new Product4(101,5600,4);
        t.calcTax();
        t1.calcTax();
    }
}