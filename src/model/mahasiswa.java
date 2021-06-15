package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class mahasiswa {
   private String npm;
   private String nama;
   private Date tangallahir;

    public String getNpm() {
        return npm;
    }

    public String getNama(){
        return nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTangallahir() {
        return tangallahir;
    }

    public void setTangallahir(Date tangallahir) {
        this.tangallahir = tangallahir;
    }

    void tampilkanAtribut(){
        String polatanggal ="dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(polatanggal);

            System.out.println("NPM \t\t\t : " + this.npm);
            System.out.println("Nama \t\t\t : " + this.nama);
            System.out.println("Tanggal Lahir \t : " + sdf.format(this.tangallahir));
        System.out.println("usia \t\t\t : " + hitungUsia());

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

    public mahasiswa() {
        System.out.println("ini dari constructor");
    }
}
