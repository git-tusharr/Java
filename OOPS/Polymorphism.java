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



interface Animal{
    void sound();
}

class cat implements Animal{
    public void sound(){
        System.out.println("Cat Sound");
    }
}

class dog implements Animal{
    public void sound(){
        System.out.println("dog Sound");
    }
}

class Polymorphism{
    public static void main (String []args){
        Animal obj =new cat();
        obj.sound();

        Animal obj1 =new dog();
        obj1.sound();
    }
}