//   Shallow copy / Deep copy

// Shallow copy constructor - shared memory


class Constructor{

    int []b;
    Constructor(int b[]){
        this.b=b;
        System.out.println("Parameterized constructor"+" "+this.b[0]);
    }
 
    Constructor(Constructor obj1){
        this.b=obj1.b;
        System.out.println("copy constructor"+" "+this.b[0]);
    }

    
public static void main(String args[]){
    int arr[]={15};

    Constructor obj1=new Constructor(arr);

    Constructor obj2=new Constructor(obj1);
}

}