package Assignments;
class This{
     int year;
     String brand;
     String model;

    void setData(int year,String brand,String model){
        this.year = year;
        this.brand = brand;
        this.model = model;
    }
    void showData(){
        System.out.println("year: "+year+"\n"+"brand: "+brand+"\n"+"model: "+model);
    }
    public static void main(String[] args) {
       This t = new This();
       t.setData(1992,"Alfa Romeo","Spider");
       t.setData(1992,"Alfa Romeo","164");
       t.showData();
       t.showData(); 
    }
}