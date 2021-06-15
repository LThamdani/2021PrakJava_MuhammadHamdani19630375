package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args)  {
        String polatanggal ="dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(polatanggal);
        mahasiswa mahasiswa = new mahasiswa();
        mahasiswa.setNpm ("19630375");
        mahasiswa.setNama("hamdani >///<");
        try {
        mahasiswa.setTangallahir(sdf.parse("28-10-2001"));
        mahasiswa.tampilkanAtribut();
    } catch (ParseException e) {
} System.err.println("Format tanggal tidak sesuai");
        }
}
