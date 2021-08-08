public class AgeStatement {
    public static void main(String[] args) {
        int humanAge = 0;

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
