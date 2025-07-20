class Shape{
    
    
    public void area (){
        System.out.println("Displays AREA OF TRIANGLE");


    }

    }

   class  triangle extends Shape{
    int l;
    int b;
    public void area(int l , int b){
    System.out.println(0.5*l*b);

    }
}



public class inheritance {
    public static void main(String[] args){
    triangle t1 = new triangle();
    t1.l=2;
    t1.b=5;

    t1.area();
    t1.area(t1.l, t1.b);
    
}
}
