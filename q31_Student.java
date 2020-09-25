class Student{
    private String name;
    private int rno;

    void setData(String n, int r){
        name = n;
        rno = r;
    }
    void showData(){
        System.out.println("name : "+name);
        System.out.println("rollno : "+rno);
    }
    public static void main(String[] args){
        Student s = new Student();
        s.setData("zack",69);
        s.showData();
    }
}