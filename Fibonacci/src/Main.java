import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();
        cin.close();
        if (num < 0)
            System.out.println("invalid input");
        else
            System.out.println(num + " Fib number is: " + fib(num));
    }
    static int fib(int number){
        if (number <= 1)
            return number;
        return fib(number-1) + fib(number - 2);
    }
}
