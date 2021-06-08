import java.util.Locale;

public class main {
    public static void main(String[] args) {
        String namaDepan = "Letnan";
        String namaTengah = "Muhammad";
        String namaBelakang = "Hamdani";

        int usia = 18;
        int targetTahunKuliah = 4;
        double ipk = 3.8889;
        char nilaiAbjad = 'A';
        boolean tampan = true;

        System.out.println(namaDepan+namaTengah+namaBelakang);
        char[] uniskaChar = {'U', 'N', 'I', 'S', 'K', 'A'};
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaChar);
        System.out.println(uniskaString);

        String namaLengkap = namaDepan + " " + namaTengah + " " + namaBelakang;
        System.out.println(namaLengkap.length());
        System.out.println(namaLengkap.indexOf("nia"));
        System.out.println(namaLengkap.substring(8));
        System.out.println(namaLengkap.substring(8,13));
        System.out.println(namaLengkap.replace("Letnan","LT"));
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.charAt(8));

        String[] namaArray = namaLengkap.split(" ");
        for(String nama : namaArray)
            System.out.println(nama);


    }
}
