import java.util.Scanner;
class SumRowEle{
    public static void main(String[] args) {
            int arr[][] = new int[5][17];
            int sum = 0;
            Scanner sc = new Scanner(System.in);
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    arr[i][j] = sc.nextInt();
                    sum += arr[i][j];
                }
            }
            System.out.println(sum);
    }
}