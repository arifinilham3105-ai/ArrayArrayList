package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    public void tampilkanSemua() {
        System.out.println("=== DATA MAHASISWA ===");

        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println(mhs.info());
        }
    }

    public double hitungRataRata() {
        double total = 0;

        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }

        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int jumlah = 0;

        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) {
                jumlah++;
            }
        }

        return jumlah;
    }

    public int jumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
}
