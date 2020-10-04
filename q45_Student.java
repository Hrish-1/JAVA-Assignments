package Assignments;
import java.util.Scanner;
class q45_Student{
    String rollno;
    double percentage;

    q45_Student(){}
    q45_Student(String rollno,double percentage){
        this.rollno = rollno;
        this.percentage = percentage;
    }
    void show(){
        System.out.println("rollno "+rollno);
        System.out.println("percentage "+percentage);
    }
}
class Collegeq45_Student extends q45_Student{
      int semester;

      Collegeq45_Student(){}

      Collegeq45_Student(String rollno,double percentage,int semester){
          super(rollno,percentage);
          this.semester = semester;
      }
      void show(){
        System.out.println("rollno "+rollno);
        System.out.println("percentage "+percentage);
          System.out.println("semester "+semester);
      }
}
class Schoolq45_Student extends q45_Student{
    String className;

    Schoolq45_Student(){}

    Schoolq45_Student(String rollno,double percentage,String className){
        super(rollno,percentage);
        this.className = className;
    }
    void show(){
        System.out.println("rollno "+rollno);
        System.out.println("percentage "+percentage);
        System.out.println("class name "+className);
    }
}
class Demo1{
    static void checkrno(String rno,q45_Student[] s){
        int i = 0;
      for(q45_Student x : s){
          if(x.rollno.equals(rno) && i < 2){
              System.out.println(rno+" belongs to Collegeq45_Student");
          }else if(x.rollno.equals(rno)){
              System.out.println(rno+" belongs to Schoolq45_Student");
          }
          i++;
      }  
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        q45_Student[] s = new q45_Student[5];
        for(int i = 0; i < 5; i++){
            if(i < 2){
                String a = sc.next();
                double b = sc.nextDouble();
                int c = sc.nextInt();
                s[i] = new Collegeq45_Student(a,b,c);
            }else{
                String a = sc.next();
                double b = sc.nextDouble();
                String s1 = sc.next();
                s[i] = new Schoolq45_Student(a,b,s1);
            }
        }
        System.out.println("q45_Students having A grade");
        for(q45_Student x : s){
            if(x.percentage > 75){
                System.out.println(x.rollno);
            }
        }
        System.out.println("Enter rollno");
        String rno = sc.next();
        Demo1.checkrno(rno,s); 
        sc.close();
    }
}