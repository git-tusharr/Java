public class PalindromeInFunction {

   static boolean Palindrome(int arr[]) { 
    
        int n=arr.length;

        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[n-i-1])
            {
                return false;
            }
        }
            return true;
        } 

    public static void main(String[] args) {
        int arr[]={1,2,3,2,1};

        if(Palindrome(arr))
        {
            System.out.println("pallindrome");
        }
        else
        {
            System.out.println("not pallindrome");
        }
    }
}
