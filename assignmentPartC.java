import java.util.Scanner;
public class assignmentPartC {
    public static String integertobinarysString(int num){
        if(num == 0){
            return "0";
        }

        String binary = "";

        while(num > 0){
            int remainder = num % 2;
            binary = remainder + binary;
            num = num / 2;
        }
        return binary;
    }

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        String result = integertobinarysString(num);

        System.out.println("Binary: " + result);
    }
}
