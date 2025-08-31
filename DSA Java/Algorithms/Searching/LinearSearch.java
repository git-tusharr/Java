class LinearSearch{

    static int Ls(int arr[],int target)
    {
        for(int i=0;i<arr.length;++i)
        {
            if(arr[i]==target)
            {
                return 1;
            } 
        }
        return -1;
    }
    public static void main(String str[])
 {
    int arr[]={1,2,3,4,5,6,7,8,9};
    int target=5;

    if(Ls(arr,target)==1)
    {
        System.out.println("Yes");
    }
    else
    {
        System.out.println("No");
    }
 }
}   