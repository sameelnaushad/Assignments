import java.util.Scanner;
public class assignmentPartB {
    public static int[] integertobinary(int num){
    // counting digits for array
    int temporaryNum = num;
    int count = 0;
    if(num == 0){
        count = 1;
    }
    while(temporaryNum > 0){
        temporaryNum = temporaryNum / 2;
        count++;
    }
    // creating array
    int[] binaryArr = new int[count];
    // filling array
    int index = count - 1;
    if(num == 0){
        binaryArr[0] = 0;
    }
    while(num > 0){
        binaryArr[index] = num % 2;
        num = num / 2;
        index--;
    }
    return binaryArr;
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scan.nextInt();

        int[] result = integertobinary(num);

        System.out.print("Binary digits: ");
        for(int i = 0 ; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    
}

