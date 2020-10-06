package Assignments;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class q64_CountWords {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileReader r = new FileReader("D:\\JAVA\\src\\FileHandling\\abc.txt");
			int ch = -1;
			String s = "";
			while((ch = r.read()) != -1) {
				//System.out.print((char)ch);
				s += (char)ch;
			}
			String[] s1 = s.split(" ");
			
			System.out.println("No of words : "+s1.length);
			 
			int sum = 0;
			for(String x : s1) {
				sum += x.length();
			}
			int avg = sum/s1.length;
			System.out.println("Average word size :"+avg);
			r.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
