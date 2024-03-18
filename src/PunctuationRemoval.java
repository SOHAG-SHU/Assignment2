import java.util.Scanner;
public class PunctuationRemoval{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1,000 and 999,999 (with a comma): ");
        String input = scanner.nextLine();

      int len = input.length();
      String firstSome = input.substring(0,len-4);
      String lastThree = input.substring(len-3);
      System.out.println("Number without comma: " + firstSome + lastThree);
        scanner.close();
    }
}
