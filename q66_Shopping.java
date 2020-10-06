package Assignments;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;


class Item implements Serializable{
	
	private static final long serialVersionUID = 1L;
	String itemName;
	int price;
	int quantity;
	
	public Item(String itemName, int price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "{\n itemName : "+itemName+",\n"+" price : "+price+",\n"+" quantity : "+quantity+"\n}";
	}
}

public class q66_Shopping {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		FileOutputStream f = new FileOutputStream("D:\\JAVA\\src\\FileHandling\\Shopping.dat");
		ObjectOutputStream o = new ObjectOutputStream(f);
		
		for(int i = 0; i < 3; i++) {
			System.out.println("itemName");
			String itemName = sc.next();
			System.out.println("price");
			int price = sc.nextInt();
			System.out.println("quantity");
			int quantity = sc.nextInt();
			Item j = new Item(itemName,price,quantity);
			o.writeObject(j);
		}
		o.close();
		sc.close();
	}

}
