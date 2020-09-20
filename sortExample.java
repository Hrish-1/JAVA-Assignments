import java.util.Arrays; 
import java.util.Collections;
import java.util.Scanner; 
  
public class sortExample 
{ 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        Array arr = new int[5]; 
         for(int i = 0; i < arr.length; i++){
             arr[i] = sc.nextInt();
         }
        // Sorts arr[] in descending order 
        Arrays.sort(arr, Collections.reverseOrder()); 
  
        System.out.printf("Modified arr[] : %s", 
                          Arrays.toString(arr)); 
    } 
}