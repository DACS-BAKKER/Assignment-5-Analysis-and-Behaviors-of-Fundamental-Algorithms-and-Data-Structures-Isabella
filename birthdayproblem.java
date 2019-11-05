//Birthday Problem by Isabella Rolfe
//11/05/19
import java.util.Random;
import java.util.Scanner;
public class birthdayproblem {

    public static void main(String[] args) {
        System.out.println("Welcome to an implementation of the Birthday problem!");
        Scanner scan = new Scanner(System.in);
        System.out.println("how many options do you want?");
        int N = scan.nextInt();
        System.out.println("how many times would you like to test it?");
        int exp = scan.nextInt();
        int[] tracker = new int[exp];
        double average = 0;
        for (int c = 0; c < exp; c++) {
            Random ran = new Random();
            boolean test = false;
            int[] arr = new int[N];
            int count = 0;
            int x;
            for (x = 0; x < N; x++) {
                arr[x] = ran.nextInt(N);
                for (int y = 0; y < x; y++) {
                    if (arr[y] == arr[x]) {
                        test = true;
                    }
                }
                if (test) {
                    tracker[c] = x;
                    break;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < tracker.length; i++) {
            sum += tracker[i];
        }
        average = sum / tracker.length;
        System.out.println("Average number until repeat: " + average);
        Double theoretical = Math.sqrt(3.14159265358979 * N / 2);
        System.out.println("Theoretical number until repeat: " + theoretical);
        System.out.println("How far off was I?: " + (average - theoretical) / theoretical * 100 + " %");
    }
}
