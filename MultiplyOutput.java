import java.util.Scanner;
public class MultiplyOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        System.out.println("The number " + first + " was entered.");
        int second = in.nextInt();
        System.out.println("The number " + second + " was entered.");
        int product = first * second;
        System.out.println(first + " multiplied by " + second + " equals " + product + ".");
    }
}