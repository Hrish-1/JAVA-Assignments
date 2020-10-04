package Assignments;
class q32_Student{
    private String name;
    private int rno;
    static int count;

    q32_Student(){
        count++;
    }

     void setData(String n, int r){
        name = n;
        rno = r;
    }
    void showData(){
        System.out.println("name : "+name);
        System.out.println("rollno : "+rno);
        System.out.println("no of objects : "+count);
    }
    public static void main(String[] args){
        q32_Student s = new q32_Student();
        q32_Student s1 = new q32_Student();
        s.setData("Zack",69);
        s1.setData("Harold",420);
        s.showData();
        s1.showData();
    }
}