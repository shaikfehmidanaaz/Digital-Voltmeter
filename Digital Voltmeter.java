import java.util.Scanner;

public class DigitalVoltmeter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("         DIGITAL VOLTMETER");
        System.out.println("=================================");

        System.out.print("Enter measured voltage (V): ");
        double voltage = sc.nextDouble();

        if (voltage < 0) {
            System.out.println("Invalid voltage!");
            sc.close();
            return;
        }

        System.out.println("\n----------- RESULTS -----------");
        System.out.printf("Voltage : %.2f V%n", voltage);
        System.out.println("-------------------------------");

        if (voltage == 0) {
            System.out.println("Status  : NO VOLTAGE");
        }
        else if (voltage < 5) {
            System.out.println("Status  : LOW VOLTAGE");
        }
        else if (voltage <= 230) {
            System.out.println("Status  : NORMAL VOLTAGE");
        }
        else {
            System.out.println("Status  : HIGH VOLTAGE");
            System.out.println("Warning : Check the supply!");
        }

        System.out.println("=================================");

        sc.close();
    }
}
