// class One{

// int a;

// void set(int a){
//     this.a=a;
// }

// void get(){
//     System.out.println(a);
// }

// public static void main(String srgs[]){
//     One obj=new One();
//     obj.set(10);
//     obj.get();
// }

// }



// Constructor overloading

// class One{

//     String a;
//     int b;
//     One(){
//         System.out.println("Default constructor");
//     }

//     One(int a){
//         System.out.println("Overloaded constructor");
//     }

    
// public static void main(String srgs[]){

//     One obj=new One(10);
// }

// }



// Copy Constructor 


// class One{

//     int b;
//     One(int b){
//         System.out.println("Parameterized constructor"+" "+this.b);
//     }

//     One(One obj){
//         System.out.println("copy constructor"+" "+this.b);
//     }

    
// public static void main(String srgs[]){

//     One obj=new One(10);
//     One obj1=new One(obj);
// }

// }


//   Shallow copy / Deep copy

// Shallow copy constructor


// class One{

//     int []b={0};
//     One(int b[]){
//         this.b[0]=b[0];
//         System.out.println("Parameterized constructor"+" "+this.b[0]);
//     }

//     One(One obj){
//         this.b[0]=obj.b[0];
//         System.out.println("copy constructor"+" "+this.b[0]);
//     }

    
// public static void main(String srgs[]){
//     int arr[]={15};

//     One obj=new One(arr);

//     One obj1=new One(obj);
// }

// }







//Deep copy constructor

class One{

    int []b;

    One(int b[]){
        this.b=new int[obj.b.length]; 
        System.out.println("Parameterized constructor"+" "+this.b[0]);
    }

    One(One obj){
        this.b[0]=new int[obj.b.length];
        this.b[0]=obj.b[0];
        System.out.println("copy constructor"+" "+this.b[0]);
    }

    
public static void main(String srgs[]){
    int arr[]={15};

    One obj=new One(arr);

    One obj1=new One(obj);

    obj.b[0]=23;

    
}

}