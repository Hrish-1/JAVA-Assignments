class This{
    This(){
        this(69);
    }
    This(int i){
        System.out.println("Value of i is "+i);
    }
    public static void main(String[] args){
        This t = new This();
    }
}