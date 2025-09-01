import java.util.Scanner;

public class InputUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistem Penghitungan Nilai Mahasiswa ===");
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = scanner.nextInt();

        System.out.print("Masukkan Nilai UTS: ");
        int uts = scanner.nextInt();

        System.out.print("Masukkan Nilai UAS: ");
        int uas = scanner.nextInt();

        PenghitungNilai mahasiswa = new PenghitungNilai(nama, tugas, uts, uas);
        System.out.println("\n=== Hasil Perhitungan ===");
        mahasiswa.tampilkanHasil();

        scanner.close();
    }
}