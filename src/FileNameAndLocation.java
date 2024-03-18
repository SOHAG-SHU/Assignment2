import java.util.Scanner;
public class FileNameAndLocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the drive letter: ");
        String drive = scanner.nextLine();
        System.out.print("Enter the path: ");
        String path = scanner.nextLine();
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        System.out.print("Enter the extension: ");
        String extension = scanner.nextLine();

        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            System.out.println("The complete file name is: " + drive + ":\\" + path + "\\" + fileName + "." + extension);
        } else {
            System.out.println("The complete file name is: /" + path + "/" + fileName + "." + extension);
        }
        scanner.close();
    }
}
