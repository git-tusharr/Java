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
//         this.b=b;
//         System.out.println("Parameterized constructor"+" "+this.b);
//     }

//     One(One obj){
//         this.b=obj.b;
//         System.out.println("copy constructor"+" "+this.b);
//     }

    
// public static void main(String srgs[]){

//     One obj=new One(10);
//     One obj1=new One(obj);
// }

// }





// polymorphism usning interface

// interface is imp bescause it allow us to use abstract function

interface engine{
    void starts(); //abstract function=jiski body nhi hoti hai
}

class ee implements engine{
    public void starts(){
        System.out.println("Electric");
    }
}

 class One{
    public static void main(String []args){
        ee obj=new ee();
        obj.starts();
    }
 }