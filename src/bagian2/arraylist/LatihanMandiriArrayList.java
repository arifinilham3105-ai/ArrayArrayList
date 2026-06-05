package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList {
    public static void main(String[] args) {
        //  Buat ArrayList<String> daftar belanja. 
        //  Tambah 4 item, lalu hapus item ke-2, 
        //  lalu tampilkan isi list beserta jumlah akhirnya. 
        System.out.println("=== Latihan Mandiri ArrayList 1 ===");

        ArrayList<String> daftarBelanja = new ArrayList<>();

        daftarBelanja.add("Beras");
        daftarBelanja.add("Gula");
        daftarBelanja.add("Minyak");
        daftarBelanja.add("Telur");

        daftarBelanja.remove(1);

        System.out.println("Daftar Belanja:");
        for (String item : daftarBelanja) {
            System.out.println(item);
        }

        System.out.println("Jumlah item akhir: " + daftarBelanja.size());

        // Buat ArrayList<Integer> berisi 5 angka. 
        // Tampilkan nilai terbesar dengan menelusuri seluruh elemen.
        System.out.println("\n=== Latihan Mandiri ArrayList 2 ===");

        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(12);
        angka.add(45);
        angka.add(8);
        angka.add(67);
        angka.add(30);

        int terbesar = angka.get(0);

        for (int i = 1; i < angka.size(); i++) {
            if (angka.get(i) > terbesar) {
                terbesar = angka.get(i);
            }
        }

        System.out.println("Isi ArrayList Angka: " + angka);
        System.out.println("Nilai terbesar: " + terbesar);

        //  Buat program yang menambah 6 nama ke dalam ArrayList, 
        //  lalu cetak hanya nama yang diawali huruf A (gunakan method startsWith pada String).
        System.out.println("\n=== Latihan Mandiri ArrayList 3 ===");

        ArrayList<String> nama = new ArrayList<>();

        nama.add("Arifin");
        nama.add("Budi");
        nama.add("Ayu");
        nama.add("Najwa");
        nama.add("Ahmad");
        nama.add("Doni");

        System.out.println("Nama yang diawali huruf A:");

        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}
