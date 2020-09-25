import java.util.Scanner;
class q26_SumRowEle{
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
            sc.close();
            System.out.println(sum);
    }
}