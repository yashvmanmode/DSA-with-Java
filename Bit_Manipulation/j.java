public class j {
    public static void main(String[] args) {
        Horse h = new Horse();
    }
}

class Animal { 

    Animal() { 
        System.out.println("animal is called");
    }
}
 class Horse extends Animal {

    Horse() {
        super();
        System.out.println("Horse is called");
    }
 }
