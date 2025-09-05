//tight coupling

class Rider {
    void start() {
        System.out.println("Ride is stared");
    }
}

class Car {
    Rider obj1 = new Rider();

    void RideCar() {
        obj1.start();
    }
}

public class TightLooseCoupling {
    public static void main(String[] args) {
        Car car = new Car();
        car.RideCar(); 
    }
}





interface Vehicle {
    void start();
}
class Rider implements Vehicle {
    public void start() {
        System.out.println("Ride is stared");
    }
}
class Car {
    Vehicle vehicle;                                                                                                                                                                                                                                                                                                   

    Car(Vehicle vehicle) {  
        this.vehicle = vehicle;
    }

    void RideCar() {
        vehicle.start();  
    }
}
public class TightLooseCoupling {
    public static void main(String[] args) {
        Car car1 = new Car(new Rider());  
        car1.RideCar();   
    }
}
