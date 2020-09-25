import java.util.Scanner;
class Student{
    String name;
    int rno;
    int age;
    int[] scores = new int[5];

    Student(String name,int rno,int age){
        this.name = name;
        this.rno = rno;
        this.age = age;
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < scores.length; i++){
           scores[i] = sc.nextInt();
        }
    }
    int calculateScore(){
        int total = 0;
        int n = scores.length;
        for(int i : scores){
            total += i;
        }
        return total/n;
    }
    public static void main(String[] args) {
        Student[] s = new Student[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < s.length; i++){
            String x = sc.next();
            int y = sc.nextInt();
            int z = sc.nextInt();
            s[i] = new Student(x,y,z);
            s[i].input();
        }
        System.out.println("Students between [0-50]");
        for(Student x : s){
            if (x.calculateScore() >= 0 && x.calculateScore() < 50){
                System.out.println("Name "+x.name+" Roll no "+x.rno);
            }   
        }
        System.out.println("Students between [50-65]");
        for(Student x : s){
            if (x.calculateScore() >= 50 && x.calculateScore() <= 65){
                System.out.println("Name "+x.name+" Roll no "+x.rno);
            }   
        }
        System.out.println("Students between [65-100]");
        for(Student x : s){
            if (x.calculateScore() > 65 && x.calculateScore() < 100){
                System.out.println("Name "+x.name+" Roll no "+x.rno);
            }   
        }
    }
}