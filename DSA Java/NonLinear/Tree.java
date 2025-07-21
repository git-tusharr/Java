// class Timpl{
//     int data;
//     Timpl left;
//     Timpl right;

//     Timpl(int data){
//         this.data=data;
//         left=null;
//         right=null;
//     }

// }

// public class Tree{
//     public static void main(String args[]){
//         Timpl obj=new Timpl(10);
//         obj.left =new Timpl(20);
//         obj.right =new Timpl(30);
//         obj.left.right =new Timpl(30);

//         System.out.println("obj root data "+obj.data);
//         System.out.println("obj left  "+obj.left.data);
//         System.out.println("obj right "+obj.right.data);
//         System.out.println("obj left right "+obj.left.right.data);
//     }
// }




class Timpl{
    int data; //root data
    Timpl left; // Root ka child (left)
    Timpl right; // Root ka child (right)

    Timpl(int data){
        this.data=data;
        right=null;
        left=null;
    }
}

class Tree{

    public static void main(String args []){
    Timpl obj=new Timpl(10);
    obj.left=new Timpl(20);
    obj.right=new Timpl(30);

    System.out.println(obj.data);
    System.out.println(obj.left.data);
    System.out.println(obj.right.data);
    }


}