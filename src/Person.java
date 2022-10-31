public class Person {
    public void features(){
        int x;
        x = 5;
        System.out.println("Saman's height "+ x + " ft");
    }
}
class Person2 extends Person{
    public void features(){
        int y;
        y = 60;
        System.out.println("Amara's weight " + y + " KG");
    }
}

class Person3 extends Person{
    public void features(){
        String b;
        b = "Dissanayake";
        System.out.println("Kamal's surname is " + b);
    }
}

class TestMain{
    public static void main(String[] args) {
        Person a = new Person();
        Person2 c = new Person2();
        Person3 d = new Person3();
        a.features();
        c.features();
        d.features();
    }
}