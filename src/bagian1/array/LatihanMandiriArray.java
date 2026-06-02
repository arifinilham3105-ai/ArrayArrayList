package bagian1.array;

public class LatihanMandiriArray {
    public static void main(String[] args) {
        
        // Buat array berisi 6 suhu harian (bertipe double). 
        // Tampilkan suhu tertinggi dan terendah.
        double[] suhu = new double[6];
        suhu[0] = 30.5;
        suhu[1] = 31.2;
        suhu[2] = 27.5;
        suhu[3] = 21.3;
        suhu[4] = 40.1;
        suhu[5] = 35.2;
        
        double tertinggi = suhu[0];
        double terendah = suhu[0];
        
        for (int i = 1; i < suhu.length; i++) {
           if (suhu[i] > tertinggi) {
                tertinggi = suhu[i];
            }
           if (suhu[i] < terendah) {
                terendah = suhu[i];
            }
        }
        System.out.println("Suhu Tertinggi     : " + tertinggi + "C");
        System.out.println("Suhu Terendah      : " + terendah + "C");
        
        // Buat array String berisi 5 nama hari. Cetak hanya nama hari yang memiliki 
        // lebih dari 5 huruf (gunakan .length() pada String).
        String[] hari = new String[5];
        hari[0] = "Senin";
        hari[1] = "Selasa";
        hari[2] = "Rabu";
        hari[3] = "Kamis";
        hari[4] = "Jumat";

        System.out.println("Nama hari yang memiliki lebih dari 5 huruf:");

        for (String hari1 : hari) {
            if (hari1.length() > 5) {
                System.out.println(hari1);
            }
        }
        
        // Diberikan int[] angka = {4, 8, 15, 16, 23, 42}; 
        // hitung dan tampilkan berapa banyak angka genap di dalamnya.
        
        int[] angka = {4, 8, 15, 16, 23, 42};
        int jumlahGenap = 0;
        
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 == 0) {
                jumlahGenap++;
            }
        }
        System.out.println("Jumlah Angka Genap = " + jumlahGenap);
    }
}
