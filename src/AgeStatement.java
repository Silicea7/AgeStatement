import java.util.Scanner;

public class AgeStatement {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int humanAge =0;
        while (humanAge >= 0) {
            System.out.println("enter age");
            humanAge = inputScanner.nextInt();

            if (humanAge < 0 || humanAge > 120) return;
            if (humanAge > 80) {
                System.out.println("człowiek jest stary");
            } else if (humanAge <= 80 && humanAge > 40) {
                System.out.println("człowiek jest w średnim wieku");
            } else if (humanAge <= 40 && humanAge > 15) {
                System.out.println("człowiek jest młody");
            } else {
                System.out.println("człowiek jest w wieku dziecięcym");
            }
        }
    }
}
