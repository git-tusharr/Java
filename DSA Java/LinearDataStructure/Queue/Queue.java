class implementation{
    int arr[];
    int front;
    int rear;

    implementation(int n){
        arr=new int[n];
        front=0;
        rear=-1;
    }
}

class Queue{
    public static void main(String args[]){
        implementation impl1=new implementation(3);
        impl1.arr[++impl1.rear]=11;
        impl1.arr[++impl1.rear]=12;
        impl1.arr[++impl1.rear]=13;

        for(int i=impl1.front;i<=impl1.rear;i++){
            System.out.println(impl1.arr[i]);
        }
    }
}