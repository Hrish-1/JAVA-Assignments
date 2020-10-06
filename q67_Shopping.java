package Assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class q67_Shopping {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("D:\\JAVA\\src\\FileHandling\\Shopping.dat");
		ObjectInputStream o = new ObjectInputStream(f);
		
		ArrayList<Item> a = new ArrayList<>();
		Object obj = null;
		boolean flag = true;
		while(flag) {
			if(f.available() != 0) {
				obj = (Item)o.readObject();
				a.add((Item) obj);
			}else {
				flag = false;
			}
	    }
		for(Item x : a) {
			System.out.println(x);
		}

		o.close();
}
}
