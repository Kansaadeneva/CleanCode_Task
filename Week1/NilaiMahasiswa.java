/**
 * Class untuk menghitung nilai akhir mahasiswa berdasarkan 3 komponen.
 */
class NilaiMahasiswa {
    private int nilaiTugas;
    private int nilaiUts;

    /**
     * Konstruktor NilaiMahasiswa.
     *
     * @param nilaiTugas nilai tugas mahasiswa
     * @param nilaiUts nilai UTS mahasiswa
     */
    public NilaiMahasiswa(int nilaiTugas, int nilaiUts) {
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
    }

    /**
     * Menghitung nilai akhir berdasarkan nilai tugas, UTS, dan UAS.
     *
     * @param nilaiUas nilai UAS mahasiswa
     * @return nilai akhir mahasiswa
     */
    public int hitungNilaiAkhir(int nilaiUas) {
        return (nilaiTugas + nilaiUts + nilaiUas) / 3;
    }
}

public class Main {
    public static void main(String[] args) {
        NilaiMahasiswa mahasiswa = new NilaiMahasiswa(80, 70);
        int nilaiAkhir = mahasiswa.hitungNilaiAkhir(90);

        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}