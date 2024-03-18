import java.util.Scanner;
public class MilitaryFormatTime{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first time:");
        String time1 = scanner.nextLine();
        System.out.print("Enter the second time:");
        String time2 = scanner.nextLine();

        int hours1 = Integer.parseInt(time1.substring(0, 2));
        int minutes1 = Integer.parseInt(time1.substring(2));
        int hours2 = Integer.parseInt(time2.substring(0, 2));
        int minutes2 = Integer.parseInt(time2.substring(2));

        int totalMinutes1 = hours1 * 60 + minutes1;
        int totalMinutes2 = hours2 * 60 + minutes2;
        int differenceInMinutes = Math.abs(totalMinutes2 - totalMinutes1);
        int differenceHours = differenceInMinutes / 60;
        int differenceMinutes = differenceInMinutes % 60;
        System.out.println(differenceHours + " hours " + differenceMinutes + " minutes");

        scanner.close();
    }
}
