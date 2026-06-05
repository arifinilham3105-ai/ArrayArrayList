package bagian3.perpustakaan;

public class LatihanMainPerpustakaan {
    public static void main(String[] args) {
        LatihanPerpustakaan perpus = new LatihanPerpustakaan();

        perpus.tambahBuku(
                new LatihanBuku("Laskar Pelangi", "Andrea Hirata", 2005));

        perpus.tambahBuku(
                new LatihanBuku("Bumi Manusia", "Pramoedya", 1980));

        perpus.tambahBuku(
                new LatihanBuku("Negeri 5 Menara", "Ahmad Fuadi", 2009));

        perpus.tampilkanKoleksi();

        System.out.println();

        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia");

        System.out.println();

        perpus.kembalikanBuku("Bumi Manusia");

        System.out.println();

        perpus.cariPenulis("Pramoedya");

        System.out.println();

        perpus.tampilkanKoleksi();

        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
    }
}
