package OOPS;
interface Animalse{
    public void eat();
}
interface Hervivore{
    public void eat();
}
class Cow implements Animalse,Hervivore
{
    public void eat()
    { System.out.println("cow eat grass");

    }
}

public class Multipleinhet_using_interface {
    public static void main(String[] args) {
        Cow nr=new Cow();
        nr.eat();
    }
    
}
