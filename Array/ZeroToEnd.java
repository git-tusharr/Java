public class ZeroToEnd {
    public static void main(String[] args) {
         // Move zeros to the end of the array

        int[] arr={3,8,4,0,9,0};
        int size=arr.length;
        int j=0;
        for(int i=0;i<size;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
            
        }
        for(int i=j;i<size;i++){
            arr[i]=0;
        }

        for(int i:arr)
        {
            System.out.println(i);
        }

    }
}
