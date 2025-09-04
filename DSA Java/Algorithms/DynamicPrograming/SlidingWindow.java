public class SlidingWindow{

    static int SubMaxSum(int arr[],int size){
        if(arr.length<size) return -1;
        int windowSum=0;
        for(int i=0;i<size;++i){
            windowSum=windowSum+arr[i];
        }
        int maxSum=windowSum;
        for(int i=size;i<arr.length;++i){
            windowSum=windowSum+arr[i]-arr[i-size];
            maxSum=Math.max(windowSum,maxSum);

        }
        return maxSum;
    }

    public static void main(String args[]){

        int size=3;

        int arr[]={7,6,5,4,3,2,1};

        System.out.println(SubMaxSum(arr,size));
    }
}