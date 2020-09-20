import java.util.Scanner;
class searchElement{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int[] arr = new int[5];
       int flag = 0;
       int pos = 0;
       for(int i = 0; i < arr.length; i++){
           arr[i] = sc.nextInt();
       }
       System.out.println("Enter number to be searched");
       int x = sc.nextInt();
       for(int i = 0; i < arr.length; i++){
           if(arr[i] == x){
               flag = 1;
               pos = i;
               break;
           }
       }
       if(flag == 1){
           System.out.println("Number is found at "+pos);
       }else{
        System.out.println("Number not found");
       } 
    }
}