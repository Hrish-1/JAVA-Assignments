package Assignments;
class Person{
    String name;
    int age;
    Person(){
        this.age = 18; 
    }
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
    }
}
class PersonDemo{
    public static void main(String[] args){
         Person p = new Person();
         Person p1 = new Person("zen",108);
         p.display();
         p1.display();
    }
}
