import java.util.Scanner;
class Student{
    String rollno;
    double percentage;

    Student(){}
    Student(String rollno,double percentage){
        this.rollno = rollno;
        this.percentage = percentage;
    }
    void show(){
        System.out.println("rollno "+rollno);
        System.out.println("percentage "+percentage);
    }
}
class CollegeStudent extends Student{
      int semester;

      CollegeStudent(){}

      CollegeStudent(String rollno,double percentage,int semester){
          super(rollno,percentage);
          this.semester = semester;
      }
      void show(){
        System.out.println("rollno "+rollno);
        System.out.println("percentage "+percentage);
          System.out.println("semester "+semester);
      }
}
class SchoolStudent extends Student{
    String className;

    SchoolStudent(){}

    SchoolStudent(String rollno,double percentage,String className){
        super(rollno,percentage);
        this.className = className;
    }
    void show(){
        System.out.println("rollno "+rollno);
        System.out.println("percentage "+percentage);
        System.out.println("class name "+className);
    }
}
class Demo{
    static void checkrno(String rno,Student[] s){
        int i = 0;
      for(Student x : s){
          if(x.rollno.equals(rno) && i < 2){
              System.out.println(rno+" belongs to CollegeStudent");
          }else if(x.rollno.equals(rno)){
              System.out.println(rno+" belongs to SchoolStudent");
          }
          i++;
      }  
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[5];
        for(int i = 0; i < 5; i++){
            if(i < 2){
                String a = sc.next();
                double b = sc.nextDouble();
                int c = sc.nextInt();
                s[i] = new CollegeStudent(a,b,c);
            }else{
                String a = sc.next();
                double b = sc.nextDouble();
                String s1 = sc.next();
                s[i] = new SchoolStudent(a,b,s1);
            }
        }
        System.out.println("Students having A grade");
        for(Student x : s){
            if(x.percentage > 75){
                System.out.println(x.rollno);
            }
        }
        System.out.println("Enter rollno");
        String rno = sc.next();
        Demo.checkrno(rno,s); 
    }
}