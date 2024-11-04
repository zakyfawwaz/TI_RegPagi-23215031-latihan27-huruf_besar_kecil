import java.util.Scanner;

public class Latihan_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        // Menampilkan kalimat dalam huruf besar
        System.out.println("Kalimat dalam huruf besar: " + kalimat.toUpperCase());

        // Menampilkan kalimat dalam huruf kecil
        System.out.println("Kalimat dalam huruf kecil: " + kalimat.toLowerCase());

        scanner.close();
    }
}