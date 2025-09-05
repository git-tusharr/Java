// Jab ek class jyada dependent ho jati h ek dusri class pe to usko tight coupling kehte h
//


class Engine {
    void start() {              // yaha engine class ke ek method banaya h
        System.out.println("Engine Started"); 
    }
}

class Car {
    Engine obj=new Engine(); // engine class ka object banaya h car class ke ander

    void startCar(){ // ek function h jo car class ka h lekin uske ander engne class ka method call ho rha h
        obj.start();
    }
}
public class TightCoupling {
    public static void main(String[] args) {
        Car obj1 = new Car();
        obj1.startCar();

    }
}


//Tight coupling ki problems :-
//Flexibility kam ho jati h jyada dependency ki wajah se ek me change kare to dusri class me bhi chnage krna padega
