package Inheritance;
public class Person {
    String name;
    int id;
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println(name + " is cooking food.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}

class RestaurantSystem {
    public static void main(String[] args) {
        Chef c = new Chef("Arjun", 1);
        Waiter w = new Waiter("Ramesh", 2);
        c.performDuties();
        w.performDuties();
    }
}
