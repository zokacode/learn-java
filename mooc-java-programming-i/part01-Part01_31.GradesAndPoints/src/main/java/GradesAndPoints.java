
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Give points [0-100]:");
        int num = Integer.valueOf(scan.nextLine());
        String status = "";
        if (num < 0) {
            status = "impossible";
        } else if (num >= 0 && num <= 49) {
            status = "failed";
        } else if (num >= 50 && num <= 59) {
            status = "1";
        } else if (num >= 60 && num <= 69) {
            status = "2";
        } else if (num >= 70 && num <= 79) {
            status = "3";
        } else if (num >= 80 && num <= 89) {
            status = "4";
        } else if (num >= 90 && num <= 100) {
            status = "5";
        } else {
            status = "incredible!";
        }
        System.out.println("Grade:" + status);
    }
}
