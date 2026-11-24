import javax.swing.JOptionPane;

public class PredikatNilai {
    public static void main(String[] args) {
        int nilai = Integer.parseInt(
            JOptionPane.showInputDialog("Nilai : ")
        );
        if (nilai >= 85) {
            JOptionPane.showMessageDialog(null, "Predikat : A");
        } else if (nilai >= 75) {
            JOptionPane.showMessageDialog(null, "Predikat : B");
        } else if (nilai >= 60) {
            JOptionPane.showMessageDialog(null, "Predikat : C");
        } else if (nilai >= 40) {
            JOptionPane.showMessageDialog(null, "Predikat : D");
        } else if (nilai < 0 || nilai > 100) {
            JOptionPane.showMessageDialog(null, "Predikat E : TOLAK");
        }
    }
}
