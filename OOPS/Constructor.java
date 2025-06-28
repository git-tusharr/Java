
// Constructor overloading

// class Constructor{

//     String a;
//     int b;
//     Constructor(){
//         System.out.println("Default constructor");
//     }

//     Constructor(int a){
//         System.out.println("Overloaded constructor");
//     }

    
// public static void main(String srgs[]){

//     Constructor obj=new Constructor(10);
// }

// }







//   Shallow copy / Deep copy

// Shallow copy constructor - shared memory


// class Constructor{

//     int []b;
//     Constructor(int b[]){
//         this.b=b;
//         System.out.println("Parameterized constructor"+" "+this.b[0]);
//     }
 
//     Constructor(Constructor obj1){
//         this.b=obj1.b;
//         System.out.println("copy constructor"+" "+this.b[0]);
//     }

    
// public static void main(String args[]){
//     int arr[]={15};

//     Constructor obj1=new Constructor(arr);

//     Constructor obj2=new Constructor(obj1);
// }

// }







// // Deep copy constructor

// class Constructor{

//     int []b;
//     Constructor(int b[]){
//         this.b=b;
//     }
 
//     Constructor(Constructor obj){

//         this.b=new int [obj.b.length];
//         this.b[0]=obj.b[0];
//     }

// public static void main(String args[]){
//     int arr[]={10};

//     Constructor obj1=new Constructor(arr);
//     Constructor obj2=new Constructor(obj1);

//     obj1.b[0]=29;

//     System.out.println(obj1.b[0]);
//     System.out.println(obj2.b[0]);
// }

// }









// Encapulation


