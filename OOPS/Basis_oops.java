package OOPS;
class Student{
    String name;
    int age;
    public void Printinfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Basis_oops {
    public static void main(String[] args) {
        Student jk=new Student();
        jk.name="janak";
        jk.age=23;
        jk.Printinfo();
        
    }
    
}
