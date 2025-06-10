public class SecondHighest{
    public static void main (String []args){
         // Second highest number in the array

       int arr[]={8,7,9,5,6};
       int size=arr.length;
       int k=2;
       for(int i=0;i<k;i++)
       {
        for(int j=i+1;j<size;j++)
        {
            if(arr[j]>arr[i])
            {
                //Swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
       }
       for(int i:arr)
       {
        System.out.println(i);
       }
       System.out.println("2nd highest="+arr[k-1]);
    }
}