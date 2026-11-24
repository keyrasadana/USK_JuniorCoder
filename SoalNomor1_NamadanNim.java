public class SoalNomor1_NamadanNim {
    public static void main(String[] args) {

            int nim = 30082021;
            
            String nama = "Adelia Sumampouw";

            System.out.println("NIM: " + nim);
            System.out.println("Nama: " + nama);

            String potong = String.valueOf(nama.substring(3, 7));
            System.out.println("Potong: " + potong);
        }
    }
