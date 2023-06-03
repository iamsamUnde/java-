import java.util.Scanner;

class FirstClass{
    public static void main(String[] args) {
        //add two numbers
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two number u are adding > ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= a+b;
        System.out.println("result="+c);
    }   
} 