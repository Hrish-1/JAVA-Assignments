package Assignments;
import java.io.*; 

public class q63_CountChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader f = new FileReader("D:\\JAVA\\Input.txt");
		int ch = -1;
		int count = 0;
		while((ch = f.read()) != -1) {
			if((char)ch == 't') count++;
		}
		System.out.println(count);
		f.close();
	}

}
