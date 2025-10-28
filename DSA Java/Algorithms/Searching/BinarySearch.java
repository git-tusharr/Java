// class BinarySearch{
//     static int Bs(int target,int arr[]){
//         int low=0;
//         int high=arr.length-1;
//         while(high>=low){
//             int mid=(high+low)/2;
//             if(arr[mid]==target) return mid;
//             else if(arr[mid]>target) low=mid+1;
//             else high=mid-1;

//         }
//         return -1;
//     }
//      public static void main(String args[]){
//         int arr[]={10,20,30,40,50,60};
//         int target=30;
//         System.out.println(Bs(target,arr));
//      }
// }


class BinarySearch{
    static int Bs(int target,int arr[]){
        int low=0;
        int high=arr.length-1;
        while(high>=low){
            int mid=(high+low)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) low=mid+1;
            else high=mid-1;

        }
        return -1;








        
    }
     public static void main(String args[]){
        int arr[]={10,20,30,40,50,60};
        int target=30;
        System.out.println(Bs(target,arr));
     }
}