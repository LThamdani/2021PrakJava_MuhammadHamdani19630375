package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args)  {
        String polatanggal ="dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(polatanggal);
        mahasiswa mahasiswa = new mahasiswa();
        mahasiswa.npm = "19630375";
        mahasiswa.nama = "awal";
        try {
        mahasiswa.tangallahir = sdf.parse("28-10-2001");

        System.out.println("NPM \t\t\t : " + mahasiswa.npm);
        System.out.println("Nama \t\t\t : " + mahasiswa.nama);
        System.out.println("Tanggal Lahir \t : " + sdf.format(mahasiswa.tangallahir));
    } catch (ParseException e) {
} System.err.println("Format tanggal tidak sesuai");
        }
}
