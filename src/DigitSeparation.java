import java.util.Scanner;
public class DigitSeparation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int number = scanner.nextInt();
        String numberString = Integer.toString(number);
        System.out.println("Individual digits:");
        for (int i=0; i<numberString.length(); i++) {
            System.out.println(numberString.charAt(i));
        }

        scanner.close();
    }
}
