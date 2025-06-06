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



        // Minimum value

        int[] arr={50,40,30,20,10};
        int size=arr.length;
        int min=arr[0];

        for(int i=0;i<size;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Minimum value in the array" +" is "+min);
    }
}