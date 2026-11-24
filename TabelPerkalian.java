public class TabelPerkalian {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((j * i) + " \t");
            }
            System.out.println();

        }

        System.out.println("=== BINTANG SEGITIGA TERBALIK ===");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
}
}