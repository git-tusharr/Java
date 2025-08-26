// class Recursion{
 

//     static int fact(int number)
//     {
//         if(number==1) return 1;

//         return number+fact(number-1);
//     }
//     public static void main(String arge []){
//         int number=5;
//         int result=fact(number);

//         System.out.println(result);
//     }
// }




// Fibonacci series by recursion


// class Recursion{
//     static int fibonacci(int n){
//         if(n==0) return 0;
//         if(n==1) return 1;

//         return fibonacci(n-1)+fibonacci(n-2);
//     }
//     public static void main(String arge []){
//         int number =10;
//         System.out.println("Fibonacci Series using recursion:");

//         for (int i = 0; i < number; i++) {
//         System.out.println(fibonacci(i)); 
//         }
//     }
// }







class Recursion{
    static void divide(int arr[]){
        if (arr.length<=1) return;
        int mid = arr.length/2;

        int left[] = new int[mid];
        int right[] = new int[arr.length-mid];

        for (int i=0;i<mid;i++){
            left[i]=arr[i];
        }
        for (int i=mid;i<arr.length;i++){
            right[i-mid]=arr[i];
        }

        divide(left);
        divide(right);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
            System.out.println();

    }
    public static void main(String arge []){

        int arr[] = {12,7,5,4,3,2};

        divide(arr);
        
        }
    }
