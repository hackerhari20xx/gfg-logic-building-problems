import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static double findDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coordinates of first point (x1, y1): " );
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.print("Enter the coordinates of first point (x1, y1): " );
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.println("Distance = " + Math.round(findDistance(x1, y1, x2, y2) * 100000.0) / 100000.0);

        scanner.close();
    }
}
