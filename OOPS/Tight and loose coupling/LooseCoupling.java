// Loose coupling :- 
// Ek class doosri class ke behaviour pe dependent hoti hai 
// (na ki doosri class ke puri implementation pe) 
// to usko loose coupling bolte hain.

interface Engine {
    void start();  // Abstraction (only behavior)
}

// Concrete implementations of Engine
class ElectricEngine implements Engine {
    public void start() {
        System.out.println("Electric Engine Started");
    }
}

class DieselEngine implements Engine {
    public void start() {
        System.out.println("Diesel Engine Started");
    }
}

// Car class depends on Engine interface, not on specific engine
class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    void startCar() {
        engine.start();  // Calls the start() method of whichever engine is passed
    }
}

public class LooseCoupling {
    public static void main(String[] args) {

        Engine dieselEngine = new DieselEngine();
        Car car1 = new Car(dieselEngine);
        car1.startCar();  // Output: Diesel Engine Started

        Engine electricEngine = new ElectricEngine();
        Car car2 = new Car(electricEngine);
        car2.startCar();  // Output: Electric Engine Started
    }
}
