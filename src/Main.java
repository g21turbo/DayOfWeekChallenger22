import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        printDayOfWeek();

    }



    public static void printDayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for corresponding day: ");
        int day = scanner.nextInt();

        if (day >= 0 && day <= 6) {

            switch (day) {
                case 0 -> System.out.println("Sunday");
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
            }
        }else {
            System.out.println("Invalid Number");
        }
    }
}
