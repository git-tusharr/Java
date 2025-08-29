class QuickSort{

    static void qs(int arr[],int low,int high){
        if(low<high){
            int pivotIndex=partion(arr,low,high);
            qs(arr,low,pivotIndex-1);
            qs(arr,pivotIndex+1,high);
        }
    }

    static int partion(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low;
        for(int j=low;j<high;++j){
            if(arr[j]<pivot){

                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                ++i;
                
            }
        }
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }


    public static void main(String args[]){
        int arr[]={10,7,8,9,1,5};
        int low=0;
        int n=arr.length;
        qs(arr,low,n-1);

        for(int i:arr){
            System.out.println(i);
        }

        }
}