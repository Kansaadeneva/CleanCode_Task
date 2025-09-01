public class PenghitungNilai {
    private String namaMahasiswa;
    private int nilaiTugas;
    private int nilaiUts;
    private int nilaiUas;

    private static final double TUGAS_WEIGHT = 0.3;
    private static final double UTS_WEIGHT = 0.3;
    private static final double UAS_WEIGHT = 0.4;

    public PenghitungNilai(String nama, int tugas, int uts, int uas) {
        this.namaMahasiswa = nama;
        this.nilaiTugas = tugas;
        this.nilaiUts = uts;
        this.nilaiUas = uas;
    }

    public double hitungNilaiAkhir() {
        return nilaiTugas * TUGAS_WEIGHT + nilaiUts * UTS_WEIGHT + nilaiUas * UAS_WEIGHT;
    }

    public String hitungGrade() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 85) return "A";
        else if (nilaiAkhir >= 70) return "B";
        else if (nilaiAkhir >= 55) return "C";
        else if (nilaiAkhir >= 40) return "D";
        else return "E";
    }

    public void tampilkanHasil() {
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Nilai Tugas   : " + nilaiTugas);
        System.out.println("Nilai UTS     : " + nilaiUts);
        System.out.println("Nilai UAS     : " + nilaiUas);
        System.out.printf("Nilai Akhir   : %.2f\n", hitungNilaiAkhir());
        System.out.println("Grade         : " + hitungGrade());
    }
}
