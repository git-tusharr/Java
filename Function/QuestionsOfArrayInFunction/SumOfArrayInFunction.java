
public class SumOfArrayInFunction{
    
    static int sumOfArray(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[1];
            
        }
        System.out.println("Sum of numbers in array = "+sum);
        return 0;
    }
    
    public static void main(String[] args){
        int arr[]={6,6,6,6,6,6};
        sumOfArray(arr);
    }
}

