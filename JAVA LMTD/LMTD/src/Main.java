import java.util.Scanner;

public class Main {

    // Method to calculate LMTD for Parallel Flow
    public static double LMTD_Parallel(double hotInlet, double hotOutlet, double coldInlet, double coldOutlet) {
        double tempDiff1 = Math.abs(hotInlet - coldInlet);
        double tempDiff2 = Math.abs(hotOutlet - coldOutlet);
        return (tempDiff1 - tempDiff2) / Math.log(tempDiff1 / tempDiff2);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the inlet temperature of the hot fluid (°C): ");
        double hotInlet = scanner.nextDouble();

        System.out.print("Enter the outlet temperature of the hot fluid (°C): ");
        double hotOutlet = scanner.nextDouble();

        System.out.print("Enter the inlet temperature of the cold fluid (°C): ");
        double coldInlet = scanner.nextDouble();

        System.out.print("Enter the outlet temperature of the cold fluid (°C): ");
        double coldOutlet = scanner.nextDouble();

            
        double lmtd = LMTD_Parallel(hotInlet, hotOutlet, coldInlet, coldOutlet);
        System.out.println(lmtd);  
        scanner.close();
    }
}
