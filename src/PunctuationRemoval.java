import java.util.Scanner;
public class PunctuationRemoval{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1,000 and 999,999 (with a comma): ");
        String input = scanner.nextLine();
        String numberWithoutComma = input.replace(",", "");
        System.out.println("Number without comma: " + numberWithoutComma);
        scanner.close();
    }
}
