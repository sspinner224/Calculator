import java.util.Scanner;

public class Calculator{
    
    public static void main(String[] args) {
        float num1;
        float num2;
        char operation;
        float res;

        System.out.println("Please enter two numbers");
        Scanner scanner = new Scanner(System.in);

        num1 = scanner.nextFloat();
        num2 = scanner.nextFloat();

        System.out.println("Choose which operation you would like to perform: +, -, *, /");

        scanner = new Scanner(System.in);
        operation = scanner.next().charAt(0);

        if(operation == '+') {
            res = num1+num2;  
            System.out.println(res);  
        } else if (operation == '-'){
            res = num1-num2;
            System.out.println(res);
        } else if (operation == '*'){
            res = num1*num2;
            System.out.println(res);
        } else if (operation == '/') {
            res = num1/num2;
            System.out.println(res);
        } else {
            System.out.println("Please type '+', '-', '*', or '/'");
        }
        
            
       


    }

   

}
