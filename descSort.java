import java.util.*; 
class descSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>(5); 
        System.out.print("size of an array : "+arr.size());
        System.out.print("Enter values");
        for(int i = 0; i < 5;i++){
             int a = sc.nextInt();
             arr.add(a);     
        }
        Collections.sort(arr, Collections.reverseOrder());
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}