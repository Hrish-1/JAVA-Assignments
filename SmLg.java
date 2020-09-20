import java.util.Scanner;
class SmLg{
        void sort(int[] arr){
            int n = arr.length;
            for(int i = 0; i < n - 1; i++){
                int min_index = i;
                for(int j = i+1; j < n; j++){
                    if(arr[j] < arr[min_index]){
                        min_index = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }
        public static void main(String[] args) {
            int arr[] = new int[5];
            int n = arr.length;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array elements");
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            SmLg x = new SmLg();
            x.sort(arr);
            System.out.print("min element : "+arr[0]+"\nmax element : "+arr[n-1]+"\n");
        }
}