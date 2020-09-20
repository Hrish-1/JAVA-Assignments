import java.util.Scanner;
public class printTable{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      for(int i = 1; i <=10; i++){
          System.out.println(x+" X "+i+" = "+x*i);
      }  
    }
}