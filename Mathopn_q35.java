class Mathopn{
    static int add(int a,int b){
        return a + b;
    }
    static int subtract(int a,int b){
        return a - b;
    }
    static int multiply(int a,int b){
        return a * b;
    }
    static int power(int a,int b){
        return (int)Math.pow(a, b);
    }
    static void show(int a,int b,int c,int d){
        System.out.println("sum: "+a);
        System.out.println("difference: "+b);
        System.out.println("product: "+c);
        System.out.println("power: "+d);
    }
    public static void main(String[] args){
        int x = Mathopn.add(8,6);
        int y = Mathopn.subtract(9,3);
        int z = Mathopn.multiply(3,3);
        int p = Mathopn.power(2,3);
        Mathopn.show(x,y,z,p);
    }
}