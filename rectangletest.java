package Oops;

class rectangle{
    private double length;
    private double breadth;


    public double getLength(){
        return length;
    }
    public double getbreadth(){
        return breadth;
    }
     public double setLength(double l){
        return length=l;
    }
    public double setbreadth(double b){
        return breadth=b;
    }
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}
public class rectangletest {
    public static void main(String[] args){
rectangle r1=new rectangle();
r1.setLength( 10.5);
r1.setbreadth(5.5);

System.out.println(r1.area());
    }
    }

 