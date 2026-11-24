import javax.swing.JOptionPane;

public class SoalNomor4_Perkalian {

    public static void main(String[] args) {

        int nilai1, nilai2, hasil;

        nilai1 = Integer.parseInt(
            JOptionPane.showInputDialog("Masukkan Nilai 1:"));

        nilai2 = Integer.parseInt(
            JOptionPane.showInputDialog("Masukkan Nilai 2:"));

        hasil = nilai1 * nilai2;

        JOptionPane.showMessageDialog(null,
            "Nilai 1 : " + nilai1 +
            "\nNilai 2 : " + nilai2 +
            "\nHasil : " + hasil);
    }
}
