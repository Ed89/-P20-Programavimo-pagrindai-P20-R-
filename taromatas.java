import java.util.Scanner;

public class taromatas {
    public static void main(String[] args) {
        int m = 0, s = 0, p = 0, bk = 1;
        System.out.println("Iveskite duomenis (m, s, p): ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < bk; i++) {
            bk++;
            String taromatas = scanner.nextLine();
            switch (taromatas) {
                case "m":
                    m += 1;

                    break;
                case "s":
                    s += 1;

                    break;
                case "p":
                    p += 1;

                    break;
                case "0":
                    bk = 1;
                    printInfo(m, s, p);
                    printTotal(m, s, p);
                    printMax(m, s, p);
                    break;
                default:
                    System.out.println("Ivesta neteisingai ");
                    bk = 1;

                    break;
            }

        }


    }

    private static void printMax(int m, int s, int p) {
        if (m>s && m>p) {
            System.out.println("Metaliniu pakuociu priimta daugiausiai.");
        } else if (s>m && s>p) {
            System.out.println("Stikliniu pakuociu priimta daugiausiai.");
        } else {
            System.out.println("Plastikiniu pakuociu priimta daugiausiai.");
        }

    }

    private static void printTotal(int m, int s, int p) {
        int eu = ((m + s + p) * 10) / 100;
        int ct = ((m + s + p) * 10) % 100;
        System.out.println("Grąžinamas užstatas: " + eu + " Eu " + ct + " ct");
    }

    private static void printInfo(int m, int s, int p) {
        System.out.println("Metaliniu: " + m + ". Stikliniu " + s + ". Plastikiniu " + p);
    }
}
