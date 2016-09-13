package burns.chrisSumProduct;
import java.util.Scanner;

public class SumProduct {

    public static int sum(int user){
        for (int i = 0; i < user; i++) {
            System.out.println(user + 2);
            user += i; // x += y -> x = x + y
        }
        return user;
    }
    public static int factorial(int user2){
        for (int j = 0; j < user2; j++) {
            System.out.println(user2 * 2);
        }
        return user2;
    }
    public static void main(String[] args) {
        Scanner select = new Scanner(System.in);

        System.out.println("sum or factorial? ");
        String func = select.nextLine();
// func not checked before next input is requested
        System.out.println("Enter a number");
        int number = select.nextInt();


        if (func.equals("sum")) {
            int total = sum(number);
            System.out.println(total);
        }
        else if (func.equals("factorial"))

            System.out.println(factorial(number));



    }
}



