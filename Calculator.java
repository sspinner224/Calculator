import java.util.Scanner;

public class Calculator{
    
    public static void main(String[] args) {
        int num1;
        int num2;
        char operation;
        int res;

        System.out.println("Please enter two whole numbers");
        Scanner scanner = new Scanner(System.in);

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.println("Would you like to add or subtract?");

        scanner = new Scanner(System.in);
        operation = scanner.next().charAt(0);

        if(operation == '+') {
            res = num1+num2;  
            System.out.println(res);  
        } else if (operation == '-'){
            res = num1-num2;
            System.out.println(res);
        } else {
            System.out.println("Please type '+' or '-'");
        }
        
            
        


    }

   

}
