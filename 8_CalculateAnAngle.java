
import java.util.Scanner;

// 8 WAP to calculate an angle between hour and minute hand. (Hours and minutes should be
// taken from user)
class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter Hours: ");
        int h = sc.nextInt();

        System.err.print("Enter Minutes: ");
        int m = sc.nextInt();

        if (h >= 12) {
            h = h % 12;
        }

        double hour_angle = 30 * h + 0.5 * m;
        double minute_angle = 6 * m;

        double angle = Math.abs(hour_angle - minute_angle);
        if (angle > 180) {
            angle = 360 - angle;
        }

        System.out.println("Angle between hour and minute hand: " + angle + " degrees");

    }
}
