package Assignments;
class Overload{
    int multiply(int a,int b){
        return a * b;
    }
    float multiply(float x,float y,float z){
        return x * y * z;
    }
    int multiply(int[] arr){
         int x = 1;
        for(int i = 0; i < arr.length; i++){
            x *= arr[i];
        }
        return x;
    }
    double multiply(double x,int y){
        return x * y;
    }
    void show(int x,int y,double z,float p){
        System.out.println("Two int: "+x);
        System.out.println("Array: "+y);
        System.out.println("double & int: "+z);
        System.out.println("Three floats:"+p);
    }
    public static void main(String[] args){
        Overload o = new Overload();
        int[] arr = {5,6,7,8};
        int x = o.multiply(4,3);
        int y = o.multiply(arr);
        double z = o.multiply(6.7,4);
        float p = o.multiply(3.1f,6.3f,7.3f);
        o.show(x,y,z,p);
    }
}