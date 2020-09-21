class Student{
    private String name;
    private int rno;
    static int count;

    Student(){
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
        Student s = new Student();
        Student s1 = new Student();
        s.setData("Zack",69);
        s1.setData("Harold",420);
        s.showData();
        s1.showData();
    }
}