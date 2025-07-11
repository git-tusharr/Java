// Function overLoading Or Compile time polymorphism

// class Polymorphism{

//     void sum(){
//         System.out.println("sum");
//     }

//      void sum(int a){
//         System.out.println("sum"+" "+a);
//     }

//     public static void main(String args[]){
//         Polymorphism obj =new Polymorphism();
//         obj.sum();
//         obj.sum(2);
//     }

// }



// Method Overriding Or Run time polymorphism through classes

// class Animal{
//     void sound(){
//         System.out.println("Animal Sound");
//     }
// }

// class cat extends Animal{
//     void sound(){
//         System.out.println("Cat Sound");
//     }
// }

// class dog extends Animal{
//     void sound(){
//         System.out.println("dog Sound");
//     }
// }

// class Polymorphism{
//     public static void main (String []args){
//         Animal obj =new cat();
//         obj.sound();

//         Animal obj1 =new dog();
//         obj1.sound();
//     }
// }



// Method Overriding Or Run time polymorphism through Interface - have abstract methods (function without body)



// interface Animal{
//     void sound();
// }

// class cat implements Animal{
//     public void sound(){
//         System.out.println("Cat Sound");
//     }
// }

// class dog implements Animal{
//     public void sound(){
//         System.out.println("dog Sound");
//     }
// }

// class Polymorphism{
//     public static void main (String []args){
//         Animal obj =new cat();
//         obj.sound();

//         Animal obj1 =new dog();
//         obj1.sound();
//     }
// }






// // Abstract class
// abstract class Animal {
//     // Abstract method (no body)
//     abstract void Sound();
// }

// // Subclass Lion
// class Lion extends Animal {
//     // Implement abstract method
//     public void Sound() {
//         System.out.println("Lion roars!");
//     }
// }

// // Subclass Tiger
// class Tiger extends Animal {
//     // Implement abstract method
//     public void Sound() {
//         System.out.println("Tiger growls!");
//     }
// }

// // Main class to run the program
// public class Polymorphism {
//     public static void main(String[] args) {
//         Animal lion = new Lion();
//         lion.Sound();

//         Animal tiger = new Tiger();
//         tiger.Sound();
//     }
// }






// Interface declaration
interface Animal {
    void bark();  // method with no parameters, returns void
}

// Dog class implements Animal
class Dog implements Animal {
    // Override the bark method
    public void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class to test the Dog
public class Main {
    public static void main(String[] args) {
        // Create a Dog object using Animal interface
        Animal myDog = new Dog();
        myDog.bark();  // Output: Dog is barking
    }
}