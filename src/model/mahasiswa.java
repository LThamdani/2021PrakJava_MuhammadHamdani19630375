package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class mahasiswa {
    String npm;
    String nama;
    Date tangallahir;

    void tampilkanAtribut(){
        String polatanggal ="dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(polatanggal);

            System.out.println("NPM \t\t\t : " + this.npm);
            System.out.println("Nama \t\t\t : " + this.nama);
            System.out.println("Tanggal Lahir \t : " + sdf.format(this.tangallahir));

    }
}
