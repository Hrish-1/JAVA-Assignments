import java.util.*; 
public class sortExample 
{ 
    public static void main(String[] args) 
    { 
        int n = 5; 
        ArrayList<Integer> arr = new ArrayList<Integer>(n); 
         for(int i = 0; i < n; i++){
             arr.add(i);
         }
        // Sorts arr[] in descending order 
        Collections.sort(arr, Collections.reverseOrder()); 
  
        // for (int i = 0; i < arr.size(); i++) 
        //     System.out.print(arr.get(i) + " "); 
        // } 
         for(int a : arr){
             System.out.print(a+" ");
         } 
}
} 