class Circle{
    int radius;
    int area;

    Circle(){
        this.radius = 0;
    }
    Circle(int radius){
        System.out.println("this: "+this);
        this.radius = radius;       
    }
    int init(){
       return radius;
    }
    int calculateArea(){
        int a = init();
        area = (int)(3.14 * a * a);
        return area;
    }
    void display(){
        System.out.print("Area of circle with radius "+radius+" is "+calculateArea());
    }
    public static void main(String[] args) {
        Circle c = new Circle(25);
        System.out.println("obj "+c);
        c.init();
        c.calculateArea();
        c.display();
    }
}