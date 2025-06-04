public class AcendingDecendingArray {
    public static void main(String[] args)
    {
        int arr[]={5,2,9,1,7};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    //Swap
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Ascending Order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

    }
}
}
