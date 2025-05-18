import java.util.Scanner;


public class IfElse {

    // public static void main(String[] args)
    // {
    // int age=10;

    // if(age>=18)
    // {
    //     System.out.println("You are eligible to vote");
    // }
    // else
    // {
    //     System.out.println("you are not eligible to vote");
    // }
    // }


    // public static void main(String[] args)
    // {
    //     Scanner input=new Scanner(System.in);

    //     System.out.println("Enter your age");
    //     int age=input.nextInt();

    //     if(age>=18)
    //     {
    //         System.out.println("You are elegible to vote");
    //     }
    //     else
    //     {
    //         System.err.println("You are not eligible to vote");
    //     }

    //     input.close();

    // }




    // program to fint number is even or odd

    // public static void main(String[] args)
    // {
    //     Scanner input=new Scanner(System.in);

    //     System.out.println("Enter a Number");
    //     int number=input.nextInt();
    
    //     if(number%2==0)
    //     {
    //         System.out.println(number+" is a even number"); 
    //     }
    //     else if (number==0) 
    //     {
    //         System.out.println("number is zero");   
    //     }
    //     else
    //     {
    //         System.out.println(number+" is a Odd number");
    //     }
    //     input.close();
    // }


    // write a program to check wheater number is -ve,+ve or zero

    // public static void main(String[] args)
    // {
    //     Scanner input=new Scanner(System.in);

    //     System.out.println("enter a number");
    //     int number = input.nextInt();

    //     if(number>0)
    //     {
    //       System.out.println(number+" is positive number");  
    //     }
    //     else if(number<0)
    //     {
    //        System.out.println(number+" is negative number");  
    //     }
        // else
        // {
        //     System.out.println(number+" is zero"); 
        // }




    // Grading system based on user input


    // public static void main(String[] args)
    //  {
    // Scanner input=new Scanner(System.in);

    

    // System.out.println("enter percentage");
    // int percentage =input.nextInt();

    //     if(percentage>=0 && percentage<=40)
    //     {
    //         System.out.println("Your Grade is 'D' ");
    //     }
    //     else if(percentage>=40 && percentage<=60)
    //     {
    //         System.out.println("Your Grade is 'C' ");
    //     }
    //     else if(percentage>=60 && percentage<=80)
    //     {
    //         System.out.println("Your Grade is 'B' ");
    //     }
    //     else if(percentage>=80 && percentage<=100)
    //     {
    //         System.out.println("Your Grade is 'A' ");
    //     }
    //     else
    //     {
    //         System.out.println("Invalid ");
    //     }

    //  }



    // Program to find largest of three number

    // public static void main(String[] args)
    // {
    //     Scanner input=new Scanner(System.in);

    //     System.out.println("Enter first number");
    //     int num1 = input.nextInt();

    //     System.out.println("Enter second number");
    //     int num2 = input.nextInt();

    //     System.out.println("Enter third number");
    //     int num3 = input.nextInt();

    //     if(num1>num2 && num1>num3)
    //     {
    //         System.out.println(num1+" is the greatest");
    //     }
    //     else if(num2>num1 && num2>num3)
    //     {
    //         System.out.println(num2+" is the greatest");
    //     }
    //     else if(num3>num1 && num3>num2)
    //     {
    //         System.err.println(num3+" is greatest");

    //     }
    //     else
    //     {
    //         System.out.println("invalid");
    //     }

    // }


    // Program to check if a year is leap year or not


    // public static void main(String[] args)
    // {
    //     Scanner input=new Scanner(System.in);

    //     System.out.println("enter year");
    //     int year=input.nextInt();

    //     if((year%4==0) ||(year%100==0))
    //     {
    //         System.out.println(year+" is a leap year");
    //     }
    //     else
    //     {
    //         System.out.println(year+" is not a leap year");
    //     }
    // }



    // program to check if a chareacter is consonent or vowel


    public static void main (String[] args)
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a single alphabet: ");
        char alphabet=input.next().charAt(0);

        if (alphabet >= 'a' && alphabet <= 'z') 
        {
            // Check for vowels
            if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') 
            {
                System.out.println(alphabet + " is a Vowel.");
            } 
            else
             {
                System.out.println(alphabet + " is a Consonant.");
             }

         }
         else if (alphabet >= 'A' && alphabet <= 'B') 
         {
           if (alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') 
            {
                System.out.println(alphabet + " is a Vowel.");
            } 
            else
             {
                System.out.println(alphabet + " is a Consonant.");
             } 
         }
         else
         {
            System.out.println("Invalid input. Please enter a letter (A-Z or a-z).");
        }
    }









    }


     



    

