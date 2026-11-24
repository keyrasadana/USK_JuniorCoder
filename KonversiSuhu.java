import java.util.Locale;
import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.US);

            // Meminta suhu dalam Celsius
            System.out.print("Masukkan suhu dalam Celsius: ");
            double celsius = input.nextDouble();

            // Mengonversi Celsius ke Fahrenheit, Reamur, dan Kelvin
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;
            double reamur = celsius * 4.0 / 5.0;
            double kelvin = celsius + 273.15;

            // Menampilkan hasil dengan dua angka di belakang koma
            System.out.println("\n--- HASIL KONVERSI ---");
            System.out.printf(Locale.US, "Fahrenheit : %.2f °F%n", fahrenheit);
            System.out.printf(Locale.US, "Reamur     : %.2f °R%n", reamur);
            System.out.printf(Locale.US, "Kelvin     : %.2f K%n", kelvin);
        }
    }
}
