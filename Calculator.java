import java.util.Scanner;

public class Calculator{
    
    public static void main(String[] args) {
        int num1;
        int num2;
        int sum;

        System.out.println("Please enter two whole numbers");
        Scanner scanner = new Scanner(System.in);

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1+num2;

        System.out.println(sum);


    }  

}
