package OOPS;
abstract class Animal{
    abstract void walk();


}
class Horse extends Animal
{
    public void walk()
    {
        System.out.println("walk on 4 leg");
    }
}
class Chicken extends Animal
{
    public void walk(){
        System.out.println("wlak om 2 leg");
    }
}


    


public class Abstract {
    public static void main(String[] args) {
        Horse horse= new Horse();
        horse.walk();
        
    }
    
}
