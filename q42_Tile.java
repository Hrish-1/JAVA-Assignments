package Assignments;
class Tile{
    float edgeLength;
    Tile(){}
    Tile(float edgeLength){
        this.edgeLength = edgeLength;
    }
}
class Floor extends Tile{
    float length,width;
    Floor(float length,float width){
        this.length = length;
        this.width = width;
    }
    float totalTiles(Tile t1){
        float res;
        res = length/t1.edgeLength * width/t1.edgeLength;
        return res; 
    }
    void show(float x){
        System.out.println("Total tile req: "+x);
    }
}
class FloorDemo{
    public static void main(String[] args){
        Tile t = new Tile(5.0f);
        Floor f = new Floor(60.0f,40.0f);
        float x = f.totalTiles(t);
        f.show(x);
    }
}