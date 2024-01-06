package OOPS;
interface Animals{
    public void run();
}
class Horses implements Animals{
    public void run()
    {
        System.out.println("walk on 4 legs");
    }

}

public class Abstraction_interface {
    public static void main(String[] args) {
        
    
    Horses horse =new Horses();
    horse.run();
    }
    
}
