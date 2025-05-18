import java.util.Scanner;

public class ArithmeticOperations
{

    public static void main(String[] args)
    {

        public static void main(String[] args)
    {
        // Addition of two numbers


        // Scanner input = new Scanner(System.in);

        
        //  System.out.println("enter your first number");
        //  int num1 = input.nextInt();

        //  System.out.println("enter your second number");
        //  int num2 = input.nextInt();

        // int sum = num1+num2;

        // System.out.println("Sum of two number = " + sum);
        // input.close();


        // difference in two numbers

    // Scanner input = new Scanner(System.in);

    // System.out.println("enter num1");
    // int num1 = input.nextInt();

    // System.out.println("enter num2");
    // int num2 = input.nextInt();

    // int difference = num1-num2;
    // System.out.println("Difference = "+difference);
    // input.close();



    // Multiplication of two number

    Scanner in =new Scanner (System.in);

    System.out.println("enter first number");
    int number1 = in.nextInt();

    System.out.println("enter second number");
    int number2 = in.nextInt();

    System.out.println("Multiplication of "+number1+" and "+number2+" is "+ number1*number2);
    in.close();

        // Area Of Square
        // Scanner input =new Scanner(System.in);

        // System.out.println("Enter side of square");
        // int side = input.nextInt();

        // System.out.println("Area of square of side "+side+" is "+side*side);
        // input.close();


        // Area of circle

        // Scanner sc=new Scanner(System.in);

        // System.out.println("Enter radius of circle");
        // int radius=sc.nextInt();

        // double area = 3.14*radius*radius;
        // System.err.println(area);

        // sc.close();

        // Percentage Calculator

        Scanner input=new Scanner(System.in);

        int totalMarks=300;

        System.out.println("enter marks of Hindi");
        double hindi=input.nextDouble();

        System.out.println("Enter marks of Englis");
        double english = input.nextDouble();

        System.out.println("Enter marks of Java");
        double java = input.nextDouble();

        double totalMarksObtained=english+hindi+java;
        System.out.println("percentage = "+((totalMarksObtained)*100)/totalMarks);

        input.close();

    }
    
}
