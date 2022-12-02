import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        printDayOfWeek();
        printDayOfWeek2(2);

    }



    public static void printDayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for corresponding day: ");
        int day = scanner.nextInt();

        if (day >= 0 && day <= 6) {
            String dayOfWeek = switch (day) {
                case 0 -> "Sunday";
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                default -> "invalid Number";
            };
            System.out.println(day + " stands for the day of " + dayOfWeek);
        } else {
            System.out.println("Invalid Number");
        }
    }

    public static void printDayOfWeek2(int day) {

        String dayOfWeek = switch (day) {
            case 0 -> { yield  "Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";

        };
        System.out.println(day + " stands for the day of " + dayOfWeek);
    }
}
