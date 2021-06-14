package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
        System.out.println("usia \t\t\t : " + hitungUsia());

    }
    String getNama(){
        return nama;
    }
    int hitungUsia() {
        Calendar tanggallahir = Calendar.getInstance();
        tanggallahir.setTime(this.tangallahir);
        Calendar tanggalIni = Calendar.getInstance();
        int tahunLahir = tanggallahir.get(Calendar.YEAR);
        int tahunIni = tanggalIni.get(Calendar.YEAR);
        int selisihTahun = tahunIni - tahunLahir;
        int bulanLahir = tanggallahir.get(Calendar.MONTH);
        int bulanIni = tanggalIni.get(Calendar.MONTH);

        if(bulanIni<bulanLahir){
            selisihTahun--;
        }else{
            int tanggalTanggallahir = tanggallahir.get(Calendar.DAY_OF_MONTH);
            int tanggalTanggalIni = tanggalIni.get(Calendar.DAY_OF_MONTH);
            if(bulanIni == bulanLahir){
                if(tanggalTanggalIni < tanggalTanggallahir){
                    selisihTahun--;
                }
            }
        }

        return selisihTahun;
    }
}
