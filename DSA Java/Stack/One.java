// stack - lifo ,linked list of array based

// class Stack{
//     int arr[];
//     int top;
//     Stack (int n){
//         arr=new int[n];
//         top=-1;
//     }
// }
// class One{
//     public static void main(String args[]){
//         Stack s=new Stack(3);
//         s.arr[++s.top]=11;
//         s.arr[++s.top]=12;
//         s.arr[++s.top]=13;

//         for(int i=s.top;i>=0;i--){
//             System.out.println(s.arr[i]);
//         }

//     }
// }






class Stack{
    int arr[];
    int top;

    Stack(int n){
        arr= new int[n];
        top=-1;
    }

}
class One{
    public static void main(String args[]){
        Stack stack1=new Stack(3);
        stack1.arr[++stack1.top]=12;
        stack1.arr[++stack1.top]=13;
        stack1.arr[++stack1.top]=14;

        for(int i=stack1.top;i>=0;--i){
            System.out.println(stack1.arr[i]);
        }
    }
}
