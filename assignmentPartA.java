import java.util.Scanner;

public class assignmentPartA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer number: ");
        int num = input.nextInt();

        String binary = "";

        while (num > 0) {
            int remainder = num % 2; // gives remainder in 0 or 1
            binary = remainder + binary; // remainder we got from above will be added to the binary in the last
            num = num / 2; // resets num for the next loop
        }
        System.out.println("Binary: " + binary);
    }
}