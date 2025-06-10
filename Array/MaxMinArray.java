import java.util.Scanner;
public class MaxMinArray{
    public static void main(String []args){
        // int[] arr={80,20,30,40,50,60,70};
        // int size=arr.length;
        // int max =arr[0];
        // for(int i=0;i<size;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        // }
        
        
        
        
        
        
        // System.out.println(max);

        // maximum value
        // int[] arr={8,2,3,4,5,6,7};
        // int size=arr.length;
        // int max=arr[0];
         
        // for(int i=0;i<size;i++){
        //     if (arr[i]>max) {
        //         max=arr[i];

        //     }
        // }
        // System.out.println(max);






        // Minimum value

        // int[] arr={50,40,30,20,10};
        // int size=arr.length;
        // int min=arr[0];

        // for(int i=0;i<size;i++)
        // {
        //     if(arr[i]<min)
        //     {
        //         min=arr[i];
        //     }
        // }
        // System.out.println("Minimum value in the array" +" is "+min);

        Scanner obj=new Scanner(System.in);
        System.err.println("enter size of the array :");
        int size=obj.nextInt();
        System.out.println("enter an array");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }

        int min=arr[0];
        for(int i=0;i<size;i++){
            if (min>arr[i]) {
                min=arr[i];
            }
        }
       System.out.println("Minimum value in the array is : "+min);



        



    
    
    
   











    



    // Duplicate in an array

    //  int[] arr={1,0,3,0,1};
    //  int size=arr.length;

    //  for(int i=0;i<size-1;i++){
    //     for(int j=i+1;j<size-1;j++){
    //         if (arr[i]==arr[j]) {
    //             System.out.println(arr[i]);
    //         }
    //     } 
    //  }



    }
}


