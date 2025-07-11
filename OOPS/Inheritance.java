// Inheritance Example

// single level

// class One{

//     public int a;
//     public String b;

// }

// class Inheritance extends One{
//     public static void main(String args[]){
//         Inheritance obj = new Inheritance();
//         obj.a=10;
//         obj.b="tushar";
//         System.out.println(obj.a+" "+obj.b);
//     }
// }




// multi level


// class One{

//     public int a;
//     public String b;

// }

// class Two extends One{

// }

// class Inheritance extends Two{
//     public static void main(String args[]){
//         Inheritance obj = new Inheritance();
//         obj.a=10;
//         obj.b="tushar";
//         System.out.println(obj.a+" "+obj.b);
//     }
// }





// Base class
class Vehicle {
    void SpeedUp() {
        System.out.println("Vehicle speed increased");
    }
}

// Subclass: Car
class Car extends Vehicle { 
    void SpeedUp() {
        System.out.println("Car speed increased");
    }
}

// Subclass: Bicycle
class Bicycle extends Vehicle {
    @Override
    void SpeedUp() {
        System.out.println("Bicycle speed increased");
    }
}

// Main class
public class Inheritance {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.SpeedUp();  // Output: Car speed increased

        Vehicle bicycle = new Bicycle();
        bicycle.SpeedUp();  // Output: Bicycle speed increased
    }
}
