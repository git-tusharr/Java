public class AcendingDecendingArray 
{
    public static void main(String[] args)
    {
        // int arr[]={5,8,7,2,9,51,88,95,1,7};
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=i+1;j<arr.length;j++)
        //     {
        //         if(arr[i]>arr[j])
        //         {
        //             int temp =arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }
        // for (int i :arr) {
        //     System.out.println(i);
    // }

        
       int arr[]={8,7,9,5,6};

       int n=arr.length;
       for(int i=0;i<n-1;i++)
       {
        for(int j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                //Swap
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
        }
       }
       for(int i:arr)
       {
        System.out.println(i);
       }
    }
}



