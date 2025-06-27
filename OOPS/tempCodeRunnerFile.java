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


class One{

    int []b;
    One(int b[]){
        this.b=b;
        System.out.println("Parameterized constructor"+" "+this.b);
    }
 
    One(One obj1){
        this.b=obj1.b;
        System.out.println("copy constructor"+" "+this.b);
    }

    
public static void main(String args[]){
    int arr[]={15};

    One obj1=new One(arr);
