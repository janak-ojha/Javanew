package OOPS;
class Shape{
    public void area()
    {
        System.out.println("diaplay area");
    }
    
}
//single level inheritance
class Triangle extends Shape
{
    public void area(int l,int b)
    {
        System.out.println((1.0/2)*l*b);
    }
}
//MUltilevel Inheritance in different level like shape inherit by triangle and triangle inherit by equilateral triangle
class Equilateral_trinagle extends Triangle
{
    public void area(int l,int b)
    {
        System.out.println((1.0/2)*l*b);
    }
}
//hierarcial inheritance means equilateral triangle and isoceles triangle extend same base class traingle
class Isocles_triangel extends Triangle
{
    public static void premeter(int a,int b)
    {
        System.out.println(a+b+b);
    }
}
public class Single_inheritance {
    public static void main(String[] args) {
        
    
    Triangle jk=new Triangle();
    int l=5;
    int b=6;
    jk.area();
    
    
}
}
