import java.util.Scanner;

public class Main {

    // Method to calculate LMTD for Parallel Flow
    public static double LMTD_Parallel(double hotInlet, double hotOutlet, double coldInlet, double coldOutlet) {
        double tempDiff1 = Math.abs(hotInlet - coldInlet);
        double tempDiff2 = Math.abs(hotOutlet - coldOutlet);
        return (tempDiff1 - tempDiff2) / Math.log(tempDiff1 / tempDiff2);
    }

    // Method to calculate LMTD for Counter Flow
    public static double LMTD_Counter(double hotInlet, double hotOutlet, double coldInlet, double coldOutlet) {
        double tempDiff1 = Math.abs(hotInlet - coldOutlet);
        double tempDiff2 = Math.abs(hotOutlet - coldInlet);
        return (tempDiff1 - tempDiff2) / Math.log(tempDiff1 / tempDiff2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("#METHODS\n1) LMTD Method (returns LMTD value for Parallel or Counter flow in °C)");
        System.out.println("\n#Type of Heat Exchanger.");
        System.out.println("1) Parallel Flow\n2) Counter Flow\n");
        System.out.print("Enter option number: ");
        int option = scanner.nextInt();

        if (option == 1 || option == 2) {
            System.out.print("Enter the inlet temperature of the hot fluid (°C): ");
            double hotInlet = scanner.nextDouble();

            System.out.print("Enter the outlet temperature of the hot fluid (°C): ");
            double hotOutlet = scanner.nextDouble();

            System.out.print("Enter the inlet temperature of the cold fluid (°C): ");
            double coldInlet = scanner.nextDouble();

            System.out.print("Enter the outlet temperature of the cold fluid (°C): ");
            double coldOutlet = scanner.nextDouble();

            if (option == 1) {
                double lmtd = LMTD_Parallel(hotInlet, hotOutlet, coldInlet, coldOutlet);
                System.out.printf("\nLMTD value for parallel flow: %.3f °C\n", lmtd);
            } else {
                double lmtd = LMTD_Counter(hotInlet, hotOutlet, coldInlet, coldOutlet);
                System.out.printf("\nLMTD value for counter flow: %.3f °C\n", lmtd);
            }
        } else {
            System.out.println("Enter correct option number!");
        }

        scanner.close();
    }
}
