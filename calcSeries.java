import java.util.Scanner;
class calcSeries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = x * 10 + 2;
        int sum = 0;
        if(n > 12){
            for(int i = 12; i <= n; i=i+10){
                sum += i;
               }
            System.out.println(sum);   
        }else{
            System.out.println(n);
        }
    }
}