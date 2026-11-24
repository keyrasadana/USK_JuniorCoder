import java.util.Scanner;
public class ProgramKata {

    public static void main(String[] args) {

    // Meminta buat memasukkan kata
    try (Scanner input = new Scanner(System.in)) {
    System.out.print("Masukkan sebuah kata: ");
    String kata = input.nextLine();

    // Membalik urutan karakter pake StringBuilder
    String terbalik = new StringBuilder(kata).reverse().toString();
    // kata yg diinput diubah jadi objek dulu biar bisa dibalik (reverse), pake StringBuilder, 
    // terus diubah lagi ke String biar bisa ditampilin (toString)

    // Menghitung jumlah huruf dan huruf vokal
        int jumlahHuruf = kata.length();
        int jumlahVokal = 0;

        for (int i = 0; i < kata.length(); i++) {
            char huruf = Character.toLowerCase(kata.charAt(i));
            // ngubah huruf jadi huruf kecil
        // ngambil 1 huruf dari kata pake charAt, huruf ke-i

        // huruf vokal
            if (huruf == 'a' || huruf == 'i' || huruf == 'u'
                    || huruf == 'e' || huruf == 'o') {
                jumlahVokal++;
            }
        }

          // Menampilkan hasil
        System.out.println("\n--- HASIL ---");
        System.out.println("Kata asli       : " + kata);
        System.out.println("Kata terbalik   : " + terbalik);
        System.out.println("Jumlah huruf    : " + jumlahHuruf);
        System.out.println("Jumlah huruf vokal: " + jumlahVokal);

        input.close();
    }
  }
}
