package Assignments;
import java.util.Scanner;
class Product{
    int pid;
    int price;
    int quantity;
    Product(){}
    Product(int pid,int price,int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    static void calculate(Product[] a){
        int res = 0;
        for(Product p : a){
            res += p.price*p.quantity;
        }
        System.out.print("Total amount spent on all products "+res+"\n");
    }
    public static void main(String[] args){
        Product[] p = new Product[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < p.length; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            p[i] = new Product(x,y,z);
        }
        sc.close();
        int max = p[0].price;
        Product pr = new Product();
        for(Product a : p){
            if(a.price > max){
                max = a.price;
                pr = a;
            }
        }
        System.out.println("Product with pid "+pr.pid+" has max price: "+pr.price);
        Product.calculate(p);
    }
}