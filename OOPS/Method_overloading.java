package OOPS;

class Students {
    

    public void Printinfo(int age) {
        System.out.println(age);
    }

    public void Printinfo(String name) {
        System.out.println(name);
    }

    public void Printinfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class Method_overloading {
    public static void main(String[] args) {
        Students jk = new Students();
        String name = "janak";
        int age = 20;

        // Since you have a 'name' variable, use that instead of jk.name
        jk.Printinfo(name);

        // You can also call other overloaded methods
        jk.Printinfo(age);
        jk.Printinfo(name, age);
    }
}
