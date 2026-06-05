package tugas;

public class MainTugas {
    public static void main(String[] args) {
         // Array mata kuliah
        String[] mataKuliah = {
                "Pemrograman Java",
                "Struktur Data",
                "Basis Data"
        };

        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }

        System.out.println();

        // Membuat objek KelasKuliah
        KelasKuliah kelas = new KelasKuliah();

        // Menambah 5 mahasiswa
        kelas.tambahMahasiswa(
                new Mahasiswa("Arifin", "2410010106", 80));

        kelas.tambahMahasiswa(
                new Mahasiswa("Budi", "2410014531", 55));

        kelas.tambahMahasiswa(
                new Mahasiswa("Najwa", "2410010358", 90));

        kelas.tambahMahasiswa(
                new Mahasiswa("Dina", "2410011243", 70));

        kelas.tambahMahasiswa(
                new Mahasiswa("Eko", "2410011234", 50));

        kelas.tampilkanSemua();

        System.out.println();
        System.out.println("Rata-rata Nilai : "
                + kelas.hitungRataRata());

        System.out.println("Jumlah Lulus : "
                + kelas.jumlahLulus());

        System.out.println("Jumlah Mahasiswa : "
                + kelas.jumlahMahasiswa());

        // Menambahkan 1 mahasiswa baru
        kelas.tambahMahasiswa(
                new Mahasiswa("Fajar", "2410012211", 85));

        System.out.println();
        System.out.println("=== SETELAH MENAMBAH DATA BARU ===");
        System.out.println("Jumlah Mahasiswa Terbaru : "
                + kelas.jumlahMahasiswa());
    }
}
