import java.util.Scanner;

public class ArrayPalindrome {
    public static void main(String []args)
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=obj.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the values of array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextInt();
        }


        boolean palindrome=true;
        int n=arr.length;

        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[n-i-1])
            {
                palindrome=false;
                break;
            }
        }
        if(palindrome)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
        obj.close();
    }
}
