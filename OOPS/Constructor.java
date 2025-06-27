
// Constructor overloading

class Constructor{

    String a;
    int b;
    Constructor(){
        System.out.println("Default constructor");
    }

    Constructor(int a){
        System.out.println("Overloaded constructor");
    }

    
public static void main(String srgs[]){

    Constructor obj=new Constructor(10);
}

}