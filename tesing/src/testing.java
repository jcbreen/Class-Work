import java.util.*;
import java.io.*;

public class testing {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();
        cin.close();
        if(num == 0 || num == 1)
            System.out.println(num +" Factorial is 1");
        else
            System.out.println(num + " factoral is " + findFac(num));
    }
    static int findFac (int number){
        if (number <= 1)
            return 1;
        else
            return number * findFac(number-1);

    }
}
