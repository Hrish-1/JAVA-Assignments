class OneBHK{
    float roomArea;
    float hallArea;
    int price;

    OneBHK(){
        this.roomArea = 100.0f;
        this.hallArea = 50.0f;
        this.price = 150;
    }
    OneBHK(float roomArea,float hallArea,int price){
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }
    void show(){
        System.out.println("roomArea "+roomArea);
        System.out.println("hallArea "+hallArea);
        System.out.println("price "+(roomArea + hallArea)*price);
    }
}
class TwoBHK extends OneBHK{
     float room2Area;

     TwoBHK(){
         super();
         this.room2Area = 150.0f;
     }
     TwoBHK(float roomArea,float hallArea,int price,float room2Area){
         super(roomArea,hallArea,price);
         this.room2Area = room2Area;
     }
     double calculate(){
        return (room2Area + roomArea + hallArea)*price;
     }
     void show(){
        System.out.println("roomArea "+roomArea);
        System.out.println("hallArea "+hallArea);
        System.out.println("room2Area"+room2Area);
        System.out.println("price "+calculate());
     }
}
class Demo{
    public static void main(String[] args) {
        // OneBHK t = new TwoBHK();
        // OneBHK t1 = new TwoBHK();
        OneBHK t2 = new TwoBHK();
        OneBHK t1 = new OneBHK();
        // t.show();
        // t1.show();
        t2.show();
        t1.show();
    }
}