import java.util.Scanner;
public class Arrays {

    public static void main(String[] args) {
        
        // // Array

        // // to store multiple elements of same data types
        // // array are stored in heep = object
        // // array -declareation,instantization,initialisation,destruction

        // // declaration

        // int arr1[]; // c++ style
        // int[] arr2;
        // int []arr3;

        // // invalid way -
        // // int arr[3];


        // // instance -

        // int [] arr4=new int[20];

        // // invalid way -
        // // int[] arr=new int[];

        // // initialization

        // int arr5[]={1,2,3,4};
        // int arr[]=new int[]{1,2,3,4};

        // invalid way -
        // int arr11[]=new int[7]{1,2,3,4,5,6,7};
        // int arr[3]={1,2,3};


        // dynamic initialization

        // Scanner obj = new Scanner(System.in);

        // System.out.println("enter the size of array");
        // int size=obj.nextInt();

        // System.out.println("enter the value of array");
        // int arr[] = new int[size];
        
        // for(int i=0;i<arr.length;++i)
        // {
        //     arr[i]=obj.nextInt();
        // }
        // for(int arr1:arr)
        // {
        //     System.out.println(arr1);
        // }
        // obj.close();



        // Scanner obj = new Scanner(System.in);

        // System.out.println("enter the size of array");
        // int size=obj.nextInt();

        // System.out.println("enter the value of array");
        // int arr[] = new int[size];
        
        // for(int i=0;i<arr.length;++i)
        // {
        //     arr[i]=obj.nextInt();
        // }
        // for(int k=0;k<size;k++)
        // {
        //     System.out.println(arr[k]);
        // }
        // obj.close();



        // An array of marks in 3 subject


        // int marks[]=new int[3];
        // marks[0]=97;
        // marks[1]=96;
        // marks[2]=90;
        // // System.out.println(marks[0]);
        // // System.out.println(marks[1]);
        // // System.out.println(marks[2]);
        // for(int i=0;i<3;i++)
        // {
        //     System.out.println(marks[i]);
        // }



    // Scanner obj = new Scanner(System.in);
    // System.out.println("Enter size of array");
    // int size = obj.nextInt();
    // System.out.println("Enter values of array");
    // int arr[]=new int[size];

    // for(int i=0;i<arr.length;i++)
    // {
    //     arr[i]=obj.nextInt();
    // }

    // for(int arr1:arr)
    // {
    //     System.err.println(arr1);
    // }


    // Sum of values inside an array



    // Scanner obj = new Scanner(System.in);
    // System.out.println("Enter size of array");
    // int size = obj.nextInt();
    // System.out.println("Enter values of array");
    // int arr[]=new int[size];

    // for(int i=0;i<arr.length;i++)
    // {
    //     arr[i]=obj.nextInt();
    // }

    // int sum=0;
    //  for(int i=0;i<arr.length;i++)
    // {
    //     sum=sum+arr[i];
    // }
    // System.out.println("Sum of values of array = "+sum);

    // Scanner obj=new Scanner(System.in);
    // System.out.println("Enter the size of array");
    // int size=obj.nextInt();
    // int arr[]=new int[size];
    // System.out.println("enter the values of array");
    // for(int i=0;i<size;i++)
    // {
    //     arr[i]=obj.nextInt();
    // }
    // int sum=0;
    // for(int i=0;i<arr.length;i++)
    // {
    //     sum=sum=arr[i];
    // }
    // System.out.println("Sum of values of array = "+sum);




    // Reverse the numbers of an array


//   Scanner obj = new Scanner(System.in);
//     System.out.println("Enter size of array");
//     int size = obj.nextInt();
//      int arr[]=new int[size];
//     System.out.println("Enter values of array");
//     for(int i=0;i<arr.length;i++)
//     {
//         arr[i]=obj.nextInt();
//     }

//     for(int i=0;i<arr.length/2;i++) 
//     {
//         int temp=arr[size-i-1];
//         arr[size-i-1]=arr[i];
//         arr[i]=temp;
//     }

//     for(int i:arr)
//     {
//         System.out.println(i);
//     }

Scanner obj =new Scanner(System.in);
System.out.println("enter size of array");
int size=obj.nextInt();
int[] arr=new int[size];

System.out.println("enter value of array");

for(int i=0;i<size;i++)
{
    arr[i] = obj.nextInt();
}

for(int i=0;i<arr.length/2;i++)
{
    int temporary=arr[size-i-1];
    arr[size-i-1]=arr[i];
    arr[i]= temporary;
}

for(int i:arr)
{
    System.out.println(i);
}

































    }

        
}
