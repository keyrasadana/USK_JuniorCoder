import javax.swing.JOptionPane;

public class TarifParkir {
    public static void main(String[] args) {
        try {
            // Meminta lama parkir dalam satuan jam
            String masukan = JOptionPane.showInputDialog(
                    null, "Masukkan lama parkir (jam):", "Input Parkir",
                    JOptionPane.QUESTION_MESSAGE);

            // Menghentikan program jika tombol Cancel ditekan
            if (masukan == null) {
                return;
            }

            int lamaParkir = Integer.parseInt(masukan.trim());

            // Memastikan lama parkir minimal satu jam
            if (lamaParkir <= 0) {
            }

            // Jam pertama Rp3.000, setiap jam berikutnya Rp2.000
            int totalBayar = 3000;
            if (lamaParkir > 1) {
                totalBayar += (lamaParkir - 1) * 2000;
            }

            // Menampilkan rincian biaya parkir
            String hasil = "Lama parkir: " + lamaParkir + " jam"
                    + "\nJam pertama: Rp3.000"
                    + "\nJam berikutnya: " + (lamaParkir - 1) + " jam"
                    + "\nTotal bayar: Rp" + String.format("%,d", totalBayar);

            JOptionPane.showMessageDialog(null, hasil,
                    "Rincian Biaya Parkir", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            // Menangani masukan yang bukan bilangan bulat
            JOptionPane.showMessageDialog(null,
                    "Masukkan lama parkir berupa bilangan bulat.",
                    "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
        }
    }
}
