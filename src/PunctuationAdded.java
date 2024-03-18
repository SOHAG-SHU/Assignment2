import java.util.Scanner;
public class PunctuationAdded{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number without comma:");
        String input = scanner.nextLine();

        int len = input.length();
        String firstSome = input.substring(0,len-3);
        String lastThree = input.substring(len-3);
        System.out.println("Number with comma: " + firstSome + "," + lastThree);
        scanner.close();
    }
}
